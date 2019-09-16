package com.studerw.tda.client;

import com.studerw.tda.model.auth.AuthToken;
import com.studerw.tda.parse.DefaultMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Any response of <em>401 Unauthorized</em> needs to take the refresh token and generate a new auth
 * token.
 */
class OauthInterceptor implements Interceptor {

  public static final int UNAUTHORIZED = 401;
  public static final String GRANT_TYPE_AUTH = "authorization_code";
  public static final String GRANT_TYPE_REFRESH = "refresh_token";
  private static final Logger LOGGER = LoggerFactory.getLogger(OauthInterceptor.class);
  final protected HttpTdaClient client;
  final protected Properties properties;

  //This gets updated using the refresh code - the first call will always fail, forcing a
  //new access_token to be set.
  private String accessToken = "UNSET";

  public OauthInterceptor(HttpTdaClient client, Properties properties) {
    this.client = client;
    this.properties = properties;
  }

  @Override
  public Response intercept(Chain chain) throws IOException {

    Request authorizedRequest = chain.request().newBuilder()
        .addHeader("Authorization", "Bearer " + this.accessToken)
        .build();
    Response origResponse = chain.proceed(authorizedRequest);

    //no token needed, just return original response
    if (origResponse.code() != UNAUTHORIZED) {
      LOGGER.trace("no auth token needed: {}", authorizedRequest.url());
      return origResponse;
    }

    // we do need a new auth token.
    String bodyStr = origResponse.peekBody(500).string();
    LOGGER.debug("TDA Not Logged In: {}", bodyStr);

    boolean isAuthenticated = setAuthToken(chain);
    if (!isAuthenticated) {
      throw new IllegalStateException("Failed to get auth token using current refresh token");
    }

    authorizedRequest = authorizedRequest.newBuilder().removeHeader("Authorization")
        .addHeader("Authorization", "Bearer " + this.accessToken)
        .build();
    final Response retryResponse = chain.proceed(authorizedRequest);
    //even though we got a new auth token, it still doesn't work.
    if (retryResponse.code() == UNAUTHORIZED) {
      throw new IllegalStateException(
          "New auth token is still not working. This is strange is you're seeing this...");
    }
    //success and any other error codes pass back to the caller to deal with
    return retryResponse;
  }

  /**
   * @param chain use the chain to forward the new OAuth Refresh request to avoid recursing this
   * interceptor
   * @return true if a new auth token was successfully set, false if not.
   */
  private boolean setAuthToken(Chain chain) {
    RequestBody formBody = new FormBody.Builder()
        .add(AuthToken.GRANT_TYPE_PARAM, AuthToken.GRANT_TYPE_REFRESH)
        .add(AuthToken.REFRESH_TOKEN_PARAM, this.properties.getProperty("tda.token.refresh"))
//        .add(AuthToken.ACCESS_TYPE_PARAM, "offline")
        .add(AuthToken.CLIENT_ID_PARAM, this.properties.getProperty("tda.client_id"))
        .build();

    HttpUrl url = this.client.baseUrl()
        .addPathSegments("oauth2/token")
        .build();

    LOGGER.debug("Attempting to obtain new authentication token using refresh token at {}",
        url.toString());

    Request authRequest = new Request.Builder()
        .url(url)
        .header("Content-Type", "application/x-www-form-urlencoded")
        .header("Accept", "application/json")
        .post(formBody)
        .build();

    try (Response authResponse = chain.proceed(authRequest)) {
      //if the auth failed again, we can't get a new auth token so we're screwed.
      if (!authResponse.isSuccessful()) {
        LOGGER.error("Failed to get auth token using refresh token: {} {}",
            authResponse.code(),
            authResponse.body());
        return false;
      }
      InputStream in = authResponse.body().byteStream();
      AuthToken authToken = DefaultMapper.fromJson(in, AuthToken.class);
      LOGGER.info("new authToken received: {}", authToken);
      String _accessToken = authToken.getAccessToken();
      if (StringUtils.isBlank(_accessToken)) {
        LOGGER.warn("Got successful OAuth response, but access token is missing");
        return false;
      }
      this.accessToken = _accessToken;
      return true;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

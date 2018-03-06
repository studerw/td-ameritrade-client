package com.studerw.tda.client;

import com.studerw.tda.model.Login;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Any responses that contain the following need to be re-authenticated (either XML or just plain
 * text): <p> <amtd><result>FAIL</result> <error>Invalid Session</error></amtd> INVALID SESSION
 * </p>
 */
class TdaLoginInterceptor implements Interceptor {

  public static final String RESULT_FAIL = "<result>FAIL</result>";
  private static final Logger LOGGER = LoggerFactory.getLogger(TdaLoginInterceptor.class);
  HttpTdaClient client;
  Properties properties;

  public TdaLoginInterceptor(HttpTdaClient httpTdaClient, Properties properties) {
    this.client = httpTdaClient;
    this.properties = properties;
  }

  @Override
  public Response intercept(Chain chain) throws IOException {
    Request origRequest = chain.request();
    Response origResponse = chain.proceed(origRequest);

    //if we've got an invalid session we need to try again
    if (origResponse.code() == 200) {
      String bodyStr = origResponse.peekBody(500).string();
      if (isFailedLogin(bodyStr) || isNeedsLogin(bodyStr)) {
        LOGGER.debug("TDA Not Logged In: {}", bodyStr);
        boolean isAuthenticated = doLogin(chain, origResponse);
        if (isAuthenticated) {
          final Request retryRequest = origRequest.newBuilder().build();
          final Response retryResponse = chain.proceed(retryRequest);
          LOGGER.debug("retryResponse: {}", retryResponse.code());
          return retryResponse;
        } else {
          throw new IllegalStateException("Cannot login with current credentials");
        }
      }
    }

    //no login needed, just return original response
    return origResponse;
  }

  /**
   * This assumes that the response body contains the /login page
   */
  private boolean doLogin(Chain chain, Response response) throws IOException {
    RequestBody formBody = new FormBody.Builder()
        .add("userid", this.client.user)
        .add("password", new String(this.client.password))
        .add("source", properties.getProperty("ameritrade.source"))
        .add("version", properties.getProperty("ameritrade.version"))
        .build();

    HttpUrl url = this.client.baseUrl().newBuilder().
        addPathSegments("300/LogIn").
        addQueryParameter("source", properties.getProperty("ameritrade.source"))
        .addQueryParameter("version", properties.getProperty("ameritrade.version"))
        .build();

    LOGGER.debug("Attempting login to TD Ameritrade at {}", url.toString());

    Request authRequest = new Request.Builder()
        .url(url)
        .header("Content-Type", "application/x-www-form-urlencoded")
        .post(formBody)
        .build();

    try (Response authResponse = chain.proceed(authRequest)) {

      //if the auth failed, we would have yet another 'fail'
      String loginXml = authResponse.body().string();
      if (isFailedLogin(loginXml)) {
        LOGGER.error("Login Attempt Failed: {}", loginXml);
        return false;
      } else {
        Login login = this.parseLoginXml(loginXml);
        this.client.currentLogin = login;
        return true;

      }
    }
  }

  private boolean isNeedsLogin(String text) {
    return (StringUtils.equalsIgnoreCase("InvalidSession", text));
  }

  private boolean isFailedLogin(String xml) {
    return (StringUtils.containsIgnoreCase(xml, RESULT_FAIL)
        && StringUtils.containsIgnoreCase(xml, "<error>Invalid Session</error>"));
  }

  private Login parseLoginXml(String xml) {
    try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)) {
      JAXBContext context = JAXBContext.newInstance(Login.class);
      Unmarshaller um = context.createUnmarshaller();
      Login login = (Login) um.unmarshal(in);
      login.setOriginalXml(xml);
      this.client.currentLogin = login;
      if (login.getResult().equalsIgnoreCase("FAIL")) {
        login.setTdaError(true);
      }
      return login;
    } catch (Exception e) {
      e.printStackTrace();
      throw new IllegalStateException("Error parsing login");
    }
  }
}

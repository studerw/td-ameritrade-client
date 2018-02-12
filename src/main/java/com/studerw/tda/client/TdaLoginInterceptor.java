package com.studerw.tda.client;

import okhttp3.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Any responses that contain the following need to be re-authenticated (either XML or just plain text):
 * <p>
 * <amtd><result>FAIL</result>
 * <error>Invalid Session</error></amtd>
 * INVALID SESSION
 * </p>
 *
 */
class TdaLoginInterceptor implements Interceptor {
    public static final String RESULT_FAIL = "<result>FAIL</result>";
    private static final Logger LOGGER = LoggerFactory.getLogger(TdaLoginInterceptor.class);
    HttpTdaClient client;
    Properties properties;

    public TdaLoginInterceptor(HttpTdaClient httpTdaClient, Properties properties) {
        this.client = httpTdaClient;
        this.properties= properties;
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
                }
                else {
                    throw new IllegalStateException("Cannot login with current credentials");
                }
            }
        }

        //no login needed, just return original response
        return origResponse;
    }

    /**
     * This assumes that the response body contains the /login page
     *
     * @param chain
     * @param response
     * @return
     * @throws IOException
     */
    private boolean doLogin(Chain chain, Response response) throws IOException {
        RequestBody formBody = new FormBody.Builder()
                .add("userid", properties.getProperty("ameritrade.user"))
                .add("password", properties.getProperty("ameritrade.password"))
                .add("source", properties.getProperty("ameritrade.source"))
                .add("version", properties.getProperty("ameritrade.version"))
                .build();

        HttpUrl url = HttpTdaClient.baseUrl().newBuilder().
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
            }
        }
        return true;
    }

    private boolean isNeedsLogin(String text) {
        return (StringUtils.equalsIgnoreCase("InvalidSession", text));
    }

    private boolean isFailedLogin(String xml) {
        return (StringUtils.containsIgnoreCase(xml, RESULT_FAIL)
                && StringUtils.containsIgnoreCase( xml, "<error>Invalid Session</error>"));
    }
}

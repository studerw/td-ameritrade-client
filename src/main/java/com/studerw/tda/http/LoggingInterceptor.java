package com.studerw.tda.http;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * This class will log all HTTP activity to the <em>logname</em>
 * passed in the constructor.
 *
 * This is currently set as <em>TDA_HTTP</em>.
 */
public class LoggingInterceptor implements Interceptor {
    private final Logger LOGGER;
    private final int byteCount;

    public LoggingInterceptor(String logName){
        this(logName, -1);
    }

    public LoggingInterceptor(String logName, int byteCount) {
        this.byteCount = byteCount == -1 ? Integer.MAX_VALUE : byteCount;
        LOGGER = LoggerFactory.getLogger(logName);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        long t1 = System.nanoTime();
        LOGGER.info(String.format("Sending request %s on %s%n%s",
                request.url(), chain.connection(), request.headers()));

        Response response = chain.proceed(request);

        long t2 = System.nanoTime();
        if (LOGGER.isDebugEnabled()) {
            //don't debug binary data
            final String contentType = response.header("content-type");
            if (StringUtils.equalsIgnoreCase(contentType,"application/octet-stream")){
                LOGGER.debug("Body[Binary]: {} bytes", response.header("content-length"));
            }
            else {
                LOGGER.debug("Body: {}", response.peekBody(byteCount).string());
            }
        }
        LOGGER.info(String.format("Response[%d - %s]:  %s in %.1fms%n%s",
                response.code(), response.message(),response.request().url(), (t2 - t1) / 1e6d, response.headers()));

        return response;
    }


}
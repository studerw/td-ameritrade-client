package com.studerw.http;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * This
 */
public class LoggingInterceptor implements Interceptor {
    private final Logger LOGGER;

    public LoggingInterceptor(String logName){
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
            LOGGER.debug("Body: {}", response.peekBody(Long.MAX_VALUE).string());
        }
        LOGGER.info(String.format("Response[%d - %s]:  %s in %.1fms%n%s",
                response.code(), response.message(),response.request().url(), (t2 - t1) / 1e6d, response.headers()));

        return response;
    }
}
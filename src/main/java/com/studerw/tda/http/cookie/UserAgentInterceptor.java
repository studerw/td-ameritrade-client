package com.studerw.tda.http.cookie;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class UserAgentInterceptor implements Interceptor {

    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request userAgentReq = chain.request()
                .newBuilder()
                .header("User-Agent", UA)
                .build();
        return chain.proceed(userAgentReq);
    }
}
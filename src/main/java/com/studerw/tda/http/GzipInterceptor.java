package com.studerw.tda.http;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealResponseBody;
import okio.GzipSource;
import okio.Okio;

public class GzipInterceptor implements Interceptor {

  @Override
  public Response intercept(Chain chain) throws IOException {
    Response response = chain.proceed(chain.request());
    return unzip(response);
  }

  // copied from okhttp3.internal.http.HttpEngine (because is private)
  private Response unzip(final Response response) {
    if (response.body() == null) {
      return response;
    }

    //check if we have gzip response
    String contentEncoding = response.headers().get("Content-Encoding");

    //this is used to decompress gzipped responses
    if (contentEncoding != null && contentEncoding.equals("gzip")) {
      long contentLength = response.body().contentLength();
      GzipSource responseBody = new GzipSource(response.body().source());
      Headers strippedHeaders = response.headers().newBuilder().build();
      return response.newBuilder().headers(strippedHeaders)
          .body(new RealResponseBody(response.body().contentType().toString(), contentLength,
              Okio.buffer(responseBody)))
          .build();
    } else {
      return response;
    }
  }
}

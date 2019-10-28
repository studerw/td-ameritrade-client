package com.studerw.tda.http;

import com.studerw.tda.parse.Utils;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class will log all HTTP activity to the <em>logname</em> passed in the constructor.
 *
 * This is currently set as <em>TDA_HTTP</em>.
 */
public class LoggingInterceptor implements Interceptor {

  private final Logger LOGGER;
  private final int byteCount;

  public LoggingInterceptor(String logName) {
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
    LOGGER.info(String.format("REQUEST %s: %s", request.method(), request.url()));

    if (LOGGER.isDebugEnabled()) {

      LOGGER.debug("REQUEST Headers:\n {}", request.headers());

      //write body if it exists
      if (request.body() != null) {
        //don't debug binary data
        final String contentType = request.header("content-type");
        if (StringUtils.equalsIgnoreCase(contentType, "application/octet-stream")) {
          LOGGER.debug("REQUEST Body[Binary]: {} bytes", request.header("content-length"));
        } else {
          Buffer requestBuffer = new Buffer();
          request.body().writeTo(requestBuffer);
          LOGGER.debug("REQUEST body: \n{}", requestBuffer.readUtf8());
        }
      }
    }

    Response response = chain.proceed(request);

    long t2 = System.nanoTime();
    LOGGER.info(String.format("RESPONSE [%d - %s]: %s in %.1f ms",
        response.code(), response.message(), response.request().url(), (t2 - t1) / 1e6d));
    if (LOGGER.isDebugEnabled()) {

      LOGGER.debug("RESPONSE Headers:\n {}", response.headers());

      if (response.body() != null) {
        //don't debug binary data
        final String contentType = response.header("content-type");
        if (StringUtils.equalsIgnoreCase(contentType, "application/octet-stream")) {
          LOGGER.debug("RESPONSE Body[Binary]: {} bytes", response.header("content-length"));
        } else {
          String bodyStr = response.peekBody(byteCount).string();
          if (byteCount == -1 && response.header("content-type").contains("json")) {
            bodyStr = Utils.prettyFormat(bodyStr);
          }
          LOGGER.debug("RESPONSE Body: \n{}", bodyStr);
        }
      }
    }

    return response;
  }
}
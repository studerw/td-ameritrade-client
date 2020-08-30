package com.studerw.tda.client;

import com.studerw.tda.http.LoggingInterceptor;
import com.studerw.tda.http.cookie.CookieJarImpl;
import com.studerw.tda.http.cookie.store.MemoryCookieStore;
import com.studerw.tda.model.quote.Quote;
import com.studerw.tda.parse.TdaJsonParser;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HTTP implementation of {@link TdaQuoteClient} which uses OKHttp3 under the hood.
 * <strong>This is a thread safe class.</strong>
 *
 * @see <a href="https://square.github.io/okhttp/3.x/okhttp/">OKHttp3 from Square</a>
 */
public class HttpTdaQuoteClient implements TdaQuoteClient {

  protected static final int LOGGING_BYTES = -1;
  protected static final DateTimeFormatter ISO_FORMATTER = DateTimeFormatter.BASIC_ISO_DATE;
  protected static final String DEFAULT_PATH = "https://api.tdameritrade.com/v1";
  private static final Logger LOGGER = LoggerFactory.getLogger(HttpTdaQuoteClient.class);

  final private TdaJsonParser tdaJsonParser = new TdaJsonParser();
  final private OkHttpClient httpClient;
  final private String clientId;
  private final HttpUrl httpUrl;

  /**
   * Create a client using the default base URL: https://api.tdameritrade.com/v1
   * @param clientId a non-blank client id (customer key).
   */
  public HttpTdaQuoteClient(String clientId) {
    this(clientId, DEFAULT_PATH);
  }

  /**
   *
   * @param clientId a non-blank client id (customer key).
   * @param baseUrl override the TDA base url. Currently, the default is "https://api.tdameritrade.com/v1"
   */
  public HttpTdaQuoteClient(String clientId, String baseUrl){
    LOGGER.info("Instantiating new client with client id: {}, baseURL: {}", clientId, baseUrl);

    if (StringUtils.isBlank(clientId)) {
      throw new IllegalArgumentException("A valid TDA API Client ID (consumer key) is required.");
    }

    if (StringUtils.isBlank(baseUrl)) {
      throw new IllegalArgumentException("A base URL to the TDA API is required.");
    }
    this.clientId = clientId;
    this.httpUrl = HttpUrl.parse(baseUrl);

    this.httpClient = new OkHttpClient.Builder().
        cookieJar(new CookieJarImpl(new MemoryCookieStore())).
        addInterceptor(new LoggingInterceptor("TDA_HTTP",-1)).
        build();
  }


  @Override
  public List<Quote> fetchQuotes(List<String> symbols) {
    LOGGER.info("Fetching quotes: {}", symbols);
    HttpUrl url = baseUrl("marketdata", "quotes")
        .addQueryParameter("apikey", this.clientId)
        .addQueryParameter("symbol", String.join(",", symbols))
        .build();

    Request request = new Request.Builder().url(url)
        .headers(defaultHeaders())
        .build();

    try (Response response = this.httpClient.newCall(request).execute()) {
      checkResponse(response, false);
      return tdaJsonParser.parseQuotes(response.body().byteStream());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Quote fetchQuote(String symbol) {
    List<Quote> quotes = fetchQuotes(Collections.singletonList(symbol));
    return quotes.get(0);
  }


  /**
   * @param response the tda response
   * @param emptyJsonOk is an empty JSON object or array actually OK (e.g. fetchMovers)?
   */
  private void checkResponse(Response response, boolean emptyJsonOk) {
    if (!response.isSuccessful()) {
      String errorMsg = response.message();
      if (StringUtils.isBlank(errorMsg)) {
        try {
          errorMsg = response.body().string();
        } catch (Exception e) {
          LOGGER.warn("No error message nor error body");
          errorMsg = "UNKNOWN";
        }
      }
      String msg = String
          .format("Non 200 response:  [%d - %s] - %s", response.code(), errorMsg,
              response.request().url());
      throw new RuntimeException(msg);
    }
    if (!emptyJsonOk) {
      try {
        String json = response.peekBody(100).string();
        if ("{}".equals(json) || "[]".equals(json)) {
          String msg = String
              .format("Empty json body:  [%d - %s] - %s", response.code(), response.message(),
                  response.request().url());
          throw new RuntimeException(msg);
        }
      } catch (IOException e) {
        throw new RuntimeException("Error checking for JSON empty body on response");
      }
    }
  }

  private Headers defaultHeaders() {
    Map<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Accept", "application/json");
//    defaultHeaders.put("Accept-Encoding", "gzip");
//    defaultHeaders.put("Accept-Language", "en-US");
    return Headers.of(defaultHeaders);
  }

  protected Builder baseUrl(String... pathSegments) {
    Builder builder = httpUrl.newBuilder();
    for (String segment : pathSegments) {
      builder.addPathSegment(segment);
    }
    return builder;
  }
}

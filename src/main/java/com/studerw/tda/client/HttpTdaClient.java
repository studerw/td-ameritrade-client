package com.studerw.tda.client;

import com.studerw.tda.http.LoggingInterceptor;
import com.studerw.tda.http.cookie.CookieJarImpl;
import com.studerw.tda.http.cookie.store.MemoryCookieStore;
import com.studerw.tda.model.quote.Quote;
import com.studerw.tda.parse.TdaJsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HTTP implementation of {@link TdaClient} which uses OKHttp3 under the hood and uses the new OAuth
 * based security.
 * <strong>This is a thread safe class.</strong>
 *
 * @see <a href="https://square.github.io/okhttp/3.x/okhttp/">OKHttp3 from Square</a>
 */
public class HttpTdaClient implements TdaClient {

  protected static final DateTimeFormatter ISO_FORMATTER = DateTimeFormatter.BASIC_ISO_DATE;
  private static final Logger LOGGER = LoggerFactory.getLogger(HttpTdaClient.class);
  protected final TdaJsonParser tdaJsonParser = new TdaJsonParser();
  protected final OkHttpClient httpClient;
  protected Properties tdaProps;

  /**
   * Passing in no props will lead to using the properties found at {@code
   * /src/main/resources/tda-api.properties}) will be used.
   */
  public HttpTdaClient() {
    this(null);
  }

  /**
   * To override the default properties file, you must define everything that is currently in {@code
   * tda-api.properties} file. This includes:
   * <ul>
   *   <li>tda.token.refresh</li>
   *   <li>tda.client_id</li>
   *   <li>tda.http.path=https://apis.tdameritrade.com/v1</li>
   *   <li>tda.debug.bytes.length=-1 (How many bytes of logging interceptor debug to print, -1 is unlimited)</li>
   * </ul>
   */
  public HttpTdaClient(Properties props) {
    LOGGER.info("Initiating OauthTdaClient...");
    this.tdaProps = (props == null) ? initTdaProps() : props;
    this.httpClient = new OkHttpClient.Builder().
        cookieJar(new CookieJarImpl(new MemoryCookieStore())).
        addInterceptor(new OauthInterceptor(this, tdaProps)).
        addInterceptor(new LoggingInterceptor("TDA_HTTP",
            Integer.parseInt(tdaProps.getProperty("tda.debug.bytes.length")))).
        build();
  }

  protected static Properties initTdaProps() {
    try (InputStream in = HttpTdaClient.class.getClassLoader()
        .getResourceAsStream("tda-api.properties")) {
      Properties tdProperties = new Properties();
      tdProperties.load(in);
      return tdProperties;
    } catch (IOException e) {
      throw new IllegalStateException(
          "Could not load default properties from com.studerw.tda.tda-api.properties in classpath");
    }
  }


  @Override
  public List<Quote> fetchQuotes(List<String> symbols) {
    LOGGER.debug("Fetching quotes: {}", symbols);
    HttpUrl url = baseUrl("marketdata", "quotes")
        .addQueryParameter("symbol", String.join(",", symbols))
        .addQueryParameter("apikey", this.tdaProps.getProperty("tda.client_id"))
        .build();
    Request request = new Request.Builder().url(url).headers(defaultHeaders())
        .build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      checkResponse(response);
      return tdaJsonParser.parseQuotes(response.body().byteStream());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Quote fetchQuote(String symbol) {
    List<Quote> quotes = fetchQuotes(Arrays.asList(symbol));
    return quotes.get(0);
  }

  private boolean checkResponse(Response response) {
    if (!response.isSuccessful()) {
      StringBuilder bldr = new StringBuilder(response.code()).append(" ")
          .append(response.message());
      throw new RuntimeException(bldr.toString());
    }
    return true;
  }

  private Headers defaultHeaders() {
    Map<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Accept", "application/json");
//    defaultHeaders.put("Accept-Encoding", "gzip");
//    defaultHeaders.put("Accept-Language", "en-US");
    return Headers.of(defaultHeaders);
  }

  protected HttpUrl.Builder baseUrl(String... pathSegments) {
    Builder builder = new Builder()
        .scheme(tdaProps.getProperty("tda.http.schema"))
        .host(tdaProps.getProperty("tda.http.host"))
        .addPathSegment(tdaProps.getProperty("tda.http.path"));
    for (String segment : pathSegments) {
      builder.addPathSegment(segment);
    }
    return builder;
  }

//  private void printEqViolations(Set<ConstraintViolation<EquityOrder>> violations) {
//    Iterator<ConstraintViolation<EquityOrder>> iter = violations.iterator();
//    while (iter.hasNext()) {
//      ConstraintViolation next = iter.next();
//      LOGGER.error("Order error: {}", next.getMessage());
//    }
//  }
//
//  private void printOpViolations(Set<ConstraintViolation<OptionOrder>> violations) {
//    Iterator<ConstraintViolation<OptionOrder>> iter = violations.iterator();
//    while (iter.hasNext()) {
//      ConstraintViolation next = iter.next();
//      LOGGER.error("Order error: {}", next.getMessage());
//    }
//  }
}

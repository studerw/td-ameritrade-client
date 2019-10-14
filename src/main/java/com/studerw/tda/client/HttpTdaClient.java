package com.studerw.tda.client;

import com.studerw.tda.http.LoggingInterceptor;
import com.studerw.tda.http.cookie.CookieJarImpl;
import com.studerw.tda.http.cookie.store.MemoryCookieStore;
import com.studerw.tda.model.account.SecuritiesAccount;
import com.studerw.tda.model.history.PriceHistReq;
import com.studerw.tda.model.history.PriceHistReqValidator;
import com.studerw.tda.model.history.PriceHistory;
import com.studerw.tda.model.quote.Quote;
import com.studerw.tda.parse.TdaJsonParser;
import com.studerw.tda.parse.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
import org.apache.commons.lang3.StringUtils;
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

  protected static final String DEFAULT_PATH = "https://apis.tdameritrade.com/v1";
  protected static final int LOGGING_BYTES = -1;
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
   * @param props required properties
   * <p>
   * To override the default properties file, you must define everything that is currently in {@code
   * tda-api.properties} file. This includes:
   * </p>
   * <ul>
   *   <li>tda.token.refresh</li>
   *   <li>tda.client_id</li>
   *   <li>tda.http.path=https://apis.tdameritrade.com/v1</li>
   *   <li>tda.debug.bytes.length=-1 (How many bytes of logging interceptor debug to print, -1 is unlimited)</li>
   * </ul>
   */
  public HttpTdaClient(Properties props) {
    LOGGER.info("Initiating HttpTdaClient with props passed in...");

    this.tdaProps = (props == null) ? initTdaProps() : props;
    validateProps(this.tdaProps);

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

      String clientId = tdProperties.getProperty("tda.client_id");
      if (StringUtils.isBlank(clientId)) {
        throw new IllegalArgumentException(
            "Missing tda.client_id property. This is obtained from TDA developer API when registering an app");
      }
      return tdProperties;
    } catch (IOException e) {
      throw new IllegalArgumentException(
          "Could not load default properties from com.studerw.tda.tda-api.properties in classpath");
    }
  }

  /**
   * validates the necessary props like refresh token and client id. If others are missing, just use
   * friendly defaults.
   *
   * @param tdaProps the required props to validate
   */
  protected static void validateProps(Properties tdaProps) {
    LOGGER.trace("Validating props: {}", tdaProps.toString());
    String clientId = tdaProps.getProperty("tda.client_id");
    if (StringUtils.isBlank(clientId)) {
      throw new IllegalArgumentException(
          "Missing tda.client_id property. This is obtained from TDA developer API when registering an app");
    }

    String refreshToken = tdaProps.getProperty("tda.token.refresh");
    if (StringUtils.isBlank(refreshToken)) {
      throw new IllegalArgumentException(
          "Missing tda.token.refresh property. This is obtained from the TDA developer API page when creating a temporary authentication token");
    }

    String path = tdaProps.getProperty("tda.http.path");
    if (StringUtils.isBlank(refreshToken)) {
      tdaProps.setProperty("tda.http.path", DEFAULT_PATH);
    }

    if (tdaProps.get("tda.debug.bytes.length") == null) {
      tdaProps.setProperty("tda.debug.bytes.length", "-1");
    }
  }

  @Override
  public PriceHistory priceHistory(String symbol) {
    symbol = StringUtils.upperCase(symbol);
    LOGGER.info("price history for symbol: {}", symbol);
    if (StringUtils.isBlank(symbol)) {
      throw new IllegalArgumentException("symbol cannot be empty");
    }

    HttpUrl url = baseUrl("marketdata", symbol, "pricehistory").build();
    Request request = new Request.Builder().url(url).headers(defaultHeaders()).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      checkResponse(response);
      return tdaJsonParser.parsePriceHistory(response.body().byteStream());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public PriceHistory priceHistory(PriceHistReq priceHistReq) {
    LOGGER.info("PriceHistory: {}", priceHistReq);
    List<String> violations = PriceHistReqValidator.validate(priceHistReq);
    if (violations.size() > 0) {
      throw new IllegalArgumentException(violations.toString());
    }

    Builder urlBuilder = baseUrl("marketdata", priceHistReq.getSymbol(), "pricehistory")
        .addQueryParameter("apikey", this.tdaProps.getProperty("tda.client_id"));
    if (priceHistReq.getStartDate() != null) {
      urlBuilder.addQueryParameter("startDate", String.valueOf(priceHistReq.getStartDate()));
    }
    if (priceHistReq.getEndDate() != null) {
      urlBuilder.addQueryParameter("endDate", String.valueOf(priceHistReq.getEndDate()));
    }
    if (priceHistReq.getPeriod() != null) {
      urlBuilder.addQueryParameter("period", String.valueOf(priceHistReq.getPeriod()));
    }
    if (priceHistReq.getFrequency() != null) {
      urlBuilder.addQueryParameter("frequency", String.valueOf(priceHistReq.getFrequency()));
    }
    if (priceHistReq.getFrequencyType() != null) {
      urlBuilder.addQueryParameter("frequencyType", priceHistReq.getFrequencyType().name());
    }
    if (priceHistReq.getPeriodType() != null) {
      urlBuilder.addQueryParameter("periodType", priceHistReq.getFrequencyType().name());
    }
    if (priceHistReq.getExtendedHours() != null) {
      urlBuilder.addQueryParameter("needExtendedHoursData",
          String.valueOf(priceHistReq.getExtendedHours()));
    }

    Request request = new Request.Builder().url(urlBuilder.build()).headers(defaultHeaders())
        .build();

    try (Response response = this.httpClient.newCall(request).execute()) {
      checkResponse(response);
      return tdaJsonParser.parsePriceHistory(response.body().byteStream());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<Quote> fetchQuotes(List<String> symbols) {
    LOGGER.info("Fetching quotes: {}", symbols);
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

  @Override
  public SecuritiesAccount getAccount(String accountId, boolean positions, boolean orders) {
    LOGGER.info("GetAccount[id={}], positions={}, orders={}", accountId, positions, orders);
    if (StringUtils.isBlank(accountId)) {
      throw new IllegalArgumentException("accountId cannot be blank.");
    }
    List<String> args = new ArrayList<>();
    if (positions) {
      args.add("positions");
    }
    if (orders) {
      args.add("orders");
    }

    final Builder accountsBldr = baseUrl("accounts", accountId);
    if (!Utils.isNullOrEmpty(args)) {
      accountsBldr.addQueryParameter("fields", String.join(",", args));
    }
    final URL url = accountsBldr.build().url();
    final Request request = new Request.Builder().url(url).headers(defaultHeaders())
        .build();

    try (Response response = this.httpClient.newCall(request).execute()) {
      checkResponse(response);
      return tdaJsonParser.parseAccount(response.body().byteStream());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<SecuritiesAccount> getAccounts(boolean positions, boolean orders) {
    LOGGER.info("GetAccount positions={}, orders={}", positions, orders);
    List<String> args = new ArrayList<>();
    if (positions) {
      args.add("positions");
    }
    if (orders) {
      args.add("orders");
    }

    final Builder accountsBldr = baseUrl("accounts");
    if (!Utils.isNullOrEmpty(args)) {
      accountsBldr.addQueryParameter("fields", String.join(",", args));
    }
    final URL url = accountsBldr.build().url();
    final Request request = new Request.Builder().url(url).headers(defaultHeaders())
        .build();

    try (Response response = this.httpClient.newCall(request).execute()) {
      checkResponse(response);
      return tdaJsonParser.parseAccounts(response.body().byteStream());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

  /**
   * @param response the tda response
   * @return if it's a 200 response with a valid looking body, the method returns okay. Otherwise an
   * unchecked exception is thrown.
   */
  private void checkResponse(Response response) {
    if (!response.isSuccessful()) {
      String msg = String
          .format("Non 200 response:  [%d - %s] - %s", response.code(), response.message(),
              response.request().url());
      throw new RuntimeException(msg);
    }
    try {
      String json = response.peekBody(1000000).string();
      if ("{}".equals(json)) {
        String msg = String
            .format("Empty json body:  [%d - %s] - %s", response.code(), response.message(),
                response.request().url());
        throw new RuntimeException(msg);
      }
    } catch (IOException e) {
      throw new RuntimeException("Error checking for JSON empty body on response");
    }
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

  protected String longToTimeStr(Long epoch) {
    ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(epoch),
        ZoneId.systemDefault());
    return zdt.toString();
  }
}

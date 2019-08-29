package com.studerw.tda.client;

import com.studerw.tda.http.LoggingInterceptor;
import com.studerw.tda.http.cookie.CookieJarImpl;
import com.studerw.tda.http.cookie.store.MemoryCookieStore;
import com.studerw.tda.model.BalancesAndPositions;
import com.studerw.tda.model.LastOrderStatus;
import com.studerw.tda.model.Login;
import com.studerw.tda.model.Logout;
import com.studerw.tda.model.MarketSnapshot;
import com.studerw.tda.model.OptionChain;
import com.studerw.tda.model.OrderStatus;
import com.studerw.tda.model.PriceHistory;
import com.studerw.tda.model.QuoteResponse;
import com.studerw.tda.model.SymbolLookup;
import com.studerw.tda.model.history.IntervalType;
import com.studerw.tda.model.history.PeriodType;
import com.studerw.tda.model.trade.CancelOrder;
import com.studerw.tda.model.trade.EquityOrder;
import com.studerw.tda.model.trade.EquityOrderValidator;
import com.studerw.tda.model.trade.EquityTrade;
import com.studerw.tda.model.trade.OptionOrder;
import com.studerw.tda.model.trade.OptionOrderValidator;
import com.studerw.tda.model.trade.OptionTrade;
import com.studerw.tda.parse.TdaBinaryParser;
import com.studerw.tda.parse.TdaXmlParser;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HTTP implementation of {@link com.studerw.tda.client.TdaClient} which uses OKHttp3 under the hood.
 * <strong>This is a thread safe class.</strong>
 *
 * @see <a href="https://square.github.io/okhttp/3.x/okhttp/">OKHttp3 from Square</a>
 */
public class HttpTdaClient implements TdaClient {

  private static final Logger LOGGER = LoggerFactory.getLogger(HttpTdaClient.class);
  protected static final DateTimeFormatter ISO_FORMATTER = DateTimeFormatter.BASIC_ISO_DATE;

  protected final OkHttpClient httpClient;
  protected final String user;
  protected final byte[] password;
  protected final TdaXmlParser tdaXmlParser = new TdaXmlParser();
  protected final TdaBinaryParser tdaBinaryParser = new TdaBinaryParser();
  protected Properties tdProperties;
  protected Login currentLogin;


  /**
   * Create a new client explicitly setting the source which is obtained from TDA apparently.
   *
   * @param user TDA user account name
   * @param password TDA user account password
   * @param source given out by TDA. If null the 'tda.source' property from
   * <em>tda-api.properties</em> file will used.
   */
  public HttpTdaClient(String user, byte[] password, String source) {
    this(user, password, source, null);
  }

  /**
   * Create a new client using default version, source, etc.
   *
   * @param user TDA user account name
   * @param password TDA user account password
   */
  public HttpTdaClient(String user, byte[] password) {
    this(user, password, null, null);
  }

  /**
   * To use custom properties, you must define everything that is currently in {@code
   * tda-api.properties} file. This includes:
   * <ul>
   *   <li>tda.version=2.0</li>
   *   <li>tda.source=DEMO</li>
   *   <li>tda.http.schema=https | http</li>
   *   <li>tda.http.host=apis.tdameritrade.com</li>
   *   <li>tda.http.path=apps</li>
   *   <li>tda.debug.bytes.length=-1 (How many bytes of logging interceptor debug to print, -1 is unlimited)</li>
   * </ul>
   *
   * @param user TDA user account name
   * @param password TDA user account password
   * @param properties properties
   */
  public HttpTdaClient(String user, byte[] password, Properties properties) {
    this(user, password, null, properties);
  }

  private HttpTdaClient(String user, byte[] password, String source, Properties props) {
    LOGGER.info("Initiating HttpTdaClient for user: ...", user);
    if (StringUtils.isEmpty(user) || password == null || password.length == 0) {
      throw new IllegalArgumentException("Constructor requires valid user and password");
    }

    Properties newProps = new Properties();
    if (props == null) {
      newProps = initTdaProps();
    } else {
      newProps.putAll(props);
    }
    this.tdProperties = newProps;

    if (!StringUtils.isEmpty(source)) {
      this.tdProperties.setProperty("tda.source", source);
    }
    this.user = user;
    this.password = password;

    this.httpClient = new OkHttpClient.Builder().
        cookieJar(new CookieJarImpl(new MemoryCookieStore())).
        addInterceptor(new TdaLoginInterceptor(this, tdProperties)).
        addInterceptor(new LoggingInterceptor("TDA_HTTP",
            Integer.parseInt(tdProperties.getProperty("tda.debug.bytes.length")))).
        //connectTimeout(15, TimeUnit.SECONDS).
        //readTimeout(15, TimeUnit.SECONDS).    // socket timeout
            build();
  }

  protected static Properties initTdaProps() {
    try (InputStream in = HttpTdaClient.class.getClassLoader()
        .getResourceAsStream("com/studerw/tda/tda-api.properties")) {
      Properties tdProperties = new Properties();
      tdProperties.load(in);
      return tdProperties;
    } catch (IOException e) {
      throw new IllegalStateException(
          "Could not load default properties from com.studerw.tda.tda-api.properties in classpath");
    }
  }

  @Override
  public QuoteResponse fetchQuotes(List<String> symbols) {
    LOGGER.debug("Fetching quotes: {}", symbols);
    Builder builder = baseUrl().newBuilder();
    builder.addPathSegments("100/Quote");
    builder.addQueryParameter("source", tdProperties.getProperty("tda.source"));
    builder.addQueryParameter("symbol", StringUtils.join(symbols, " "));
    HttpUrl url = builder.build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseQuoteResponse(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String getDefaultAcctId() {
    return getCurrentLogin().getXmlLogIn().getAssociatedAccountId();
  }

  @Override
  public Logout logout() {
    LOGGER.debug("Logging out...");
    HttpUrl url = baseUrl().newBuilder().addPathSegments("100/LogOut")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseLogout(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public BalancesAndPositions fetchBalancesAndPositions() {
    return this.fetchBalancesAndPositions(getDefaultAcctId());
  }

  @Override
  public BalancesAndPositions fetchBalancesAndPositions(String accountId) {
    LOGGER.debug("Fetching account balance for ID: {}", accountId);
    HttpUrl url = baseUrl().newBuilder().addPathSegments("100/BalancesAndPositions")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .addQueryParameter("accountid", accountId)
        .build();

    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseBalancesAndPositions(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public CancelOrder cancelTrade(List<String> orderIds) {
    return this.cancelTrade(null,orderIds);
  }

  @Override
  public CancelOrder cancelTrade(String accountId, List<String> orderIds) {
    LOGGER.debug("Cancelling orderId(s): {} with account: {}", orderIds, accountId);
    Builder builder = baseUrl().newBuilder().addPathSegments("100/OrderCancel")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"));

    if (StringUtils.isNotBlank(accountId)) {
      builder.addQueryParameter("accountid", accountId);
    }
    orderIds.stream().forEach(id -> builder.addQueryParameter("orderid", id));

    HttpUrl url = builder.build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseCancelOrder(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public OrderStatus fetchOrderStatus(List<String> orderIds) {
    return this.fetchOrderStatus(orderIds, null);
  }

  @Override
  public OrderStatus fetchOrderStatus(List<String> orderIds, String accountId) {
    LOGGER.debug("Fetching order status: {}", orderIds);
    final HttpUrl.Builder urlBuilder = baseUrl().newBuilder().addPathSegments("100/OrderStatus")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"));

    if (StringUtils.isNotBlank(accountId)) {
      urlBuilder.addQueryParameter("accountid", accountId);
    }

    for (String orderId : orderIds) {
      urlBuilder.addQueryParameter("orderid", orderId);
    }
    final HttpUrl url = urlBuilder.build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseOrderStatus(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public OptionChain fetchOptionChain(String symbol) {
    LOGGER.debug("Fetching optionChain: {}", symbol);
    HttpUrl url = baseUrl().newBuilder().addPathSegments("200/OptionChain")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .addQueryParameter("symbol", symbol)
        .build();

    Request request = new Request.Builder().url(url).build();

    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseOptionChain(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public SymbolLookup symbolLookup(String matchStr) {
    HttpUrl url = baseUrl().newBuilder().addPathSegments("100/SymbolLookup")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .addQueryParameter("matchstring", matchStr)
        .build();

    Request request = new Request.Builder().url(url).build();

    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseSymbolLookup(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public MarketSnapshot fetchMarketSnapshot() {
    HttpUrl url = baseUrl().newBuilder().addPathSegments("100/MarketOverview")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .build();

    Request request = new Request.Builder().url(url).build();

    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseMarketSnapshot(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public MarketSnapshot fetchMarketOverview() {
    return this.fetchMarketSnapshot();
  }

  @Override
  public EquityTrade tradeEquity(EquityOrder equityOrder) {
    Set<ConstraintViolation<EquityOrder>> violations = EquityOrderValidator.validate(equityOrder);
    if (!violations.isEmpty()) {
      printEqViolations(violations);
      throw new ValidationException("EquityOrder has validation errors");
    }
    final String ORDER_STRING = "orderstring";
    HttpUrl url = baseUrl().newBuilder().addPathSegments("100/EquityTrade")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .addQueryParameter(ORDER_STRING, equityOrder.toQueryString(ORDER_STRING))
        .build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseEquityTrade(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public OptionTrade tradeOption(OptionOrder optionOrder) {
    Set<ConstraintViolation<OptionOrder>> violations = OptionOrderValidator.validate(optionOrder);
    if (!violations.isEmpty()) {
      printOpViolations(violations);
      throw new ValidationException("OptionOrder has validation errors");
    }
    final String ORDER_STRING = "orderstring";
    HttpUrl url = baseUrl().newBuilder().addPathSegments("100/OptionTrade")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .addQueryParameter(ORDER_STRING, optionOrder.toQueryString(ORDER_STRING))
        .build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseOptionTrade(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public OrderStatus fetchAllOrderStatuses() {
    HttpUrl url = baseUrl().newBuilder().addPathSegments("100/OrderStatus")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseOrderStatus(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public LastOrderStatus fetchLastOrderStatus() {
    HttpUrl url = baseUrl().newBuilder().addPathSegments("100/LastOrderStatus")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return tdaXmlParser.parseLastOrderStatus(response.body().string());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String keepAlive() {
    HttpUrl url = baseUrl().newBuilder().addPathSegment("KeepAlive")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return response.body().string();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  //if the currentLogin is null, let's just make a simple call to force a login.
  @Override
  public Login getCurrentLogin() {
    if (this.currentLogin == null) {
      final String keepAlive = this.keepAlive();
      LOGGER.debug("keep-alive: {}", keepAlive);
    }
    return this.currentLogin;
  }

  @Override
  public PriceHistory priceHistory(List<String> symbols, IntervalType intervalType,
      Integer intervalDuration, PeriodType periodType, Integer period, LocalDate startDate,
      LocalDate endDate, Boolean extended) {
    LOGGER.debug("Fetching priceHistory: {}", symbols);
    Builder builder = baseUrl().newBuilder().addPathSegments("100/PriceHistory")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .addQueryParameter("requestidentifiertype", "SYMBOL")
        .addQueryParameter("requestvalue", StringUtils.join(symbols, ", "))
        .addQueryParameter("intervaltype", intervalType.name())
        .addQueryParameter("intervalduration", String.valueOf(intervalDuration))
        .addQueryParameter("extended",
            extended == null ? Boolean.FALSE.toString() : String.valueOf(extended));

    if (period != null) {
      builder.addQueryParameter("period", period.toString());
    }
    if (periodType != null) {
      builder.addQueryParameter("periodtype", periodType.name());
    }
    if (startDate != null) {
      builder.addQueryParameter("startdate", startDate.format(ISO_FORMATTER));
    }
    if (endDate != null) {
      builder.addQueryParameter("enddate", endDate.format(ISO_FORMATTER));
    }

    HttpUrl url = builder.build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      if (!response.isSuccessful()) {
        return new PriceHistory(response.body().string().substring(1));
      } else {
        return tdaBinaryParser.parsePriceHistory(response.body().bytes());
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public byte[] priceHistoryBytes(List<String> symbols, IntervalType intervalType,
      Integer intervalDuration, PeriodType periodType, Integer period, LocalDate startDate,
      LocalDate endDate, Boolean extended) {
    LOGGER.debug("Fetching priceHistoryBytes: {}", symbols);
    Builder builder = baseUrl().newBuilder().addPathSegments("100/PriceHistory")
        .addQueryParameter("source", tdProperties.getProperty("tda.source"))
        .addQueryParameter("requestidentifiertype", "SYMBOL")
        .addQueryParameter("requestvalue", StringUtils.join(symbols, ", "))
        .addQueryParameter("intervaltype", intervalType.name())
        .addQueryParameter("intervalduration", String.valueOf(intervalDuration))
        .addQueryParameter("extended",
            extended == null ? Boolean.FALSE.toString() : String.valueOf(extended));

    if (period != null) {
      builder.addQueryParameter("period", period.toString());
    }
    if (periodType != null) {
      builder.addQueryParameter("periodtype", periodType.name());
    }
    if (startDate != null) {
      builder.addQueryParameter("startdate", startDate.format(ISO_FORMATTER));
    }
    if (endDate != null) {
      builder.addQueryParameter("enddate", endDate.format(ISO_FORMATTER));
    }

    HttpUrl url = builder.build();
    Request request = new Request.Builder().url(url).build();
    try (Response response = this.httpClient.newCall(request).execute()) {
      return response.body().bytes();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

  protected HttpUrl baseUrl() {
    return new HttpUrl.Builder()
        .scheme(tdProperties.getProperty("tda.http.schema"))
        .host(tdProperties.getProperty("tda.http.host"))
        .addPathSegment(tdProperties.getProperty("tda.http.path"))
        .build();
  }

  private void printEqViolations(Set<ConstraintViolation<EquityOrder>> violations) {
    Iterator<ConstraintViolation<EquityOrder>> iter = violations.iterator();
    while (iter.hasNext()) {
      ConstraintViolation next = iter.next();
      LOGGER.error("Order error: {}", next.getMessage());
    }
  }

  private void printOpViolations(Set<ConstraintViolation<OptionOrder>> violations) {
    Iterator<ConstraintViolation<OptionOrder>> iter = violations.iterator();
    while (iter.hasNext()) {
      ConstraintViolation next = iter.next();
      LOGGER.error("Order error: {}", next.getMessage());
    }
  }
}

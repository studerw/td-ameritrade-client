package com.studerw.tda.client;

import com.studerw.tda.http.LoggingInterceptor;
import com.studerw.tda.http.cookie.CookieJarImpl;
import com.studerw.tda.http.cookie.store.MemoryCookieStore;
import com.studerw.tda.model.account.Order;
import com.studerw.tda.model.account.OrderRequest;
import com.studerw.tda.model.account.OrderRequestValidator;
import com.studerw.tda.model.account.SecuritiesAccount;
import com.studerw.tda.model.auth.AuthToken;
import com.studerw.tda.model.history.PriceHistReq;
import com.studerw.tda.model.history.PriceHistReqValidator;
import com.studerw.tda.model.history.PriceHistory;
import com.studerw.tda.model.instrument.FullInstrument;
import com.studerw.tda.model.instrument.Instrument;
import com.studerw.tda.model.instrument.Query;
import com.studerw.tda.model.marketdata.Mover;
import com.studerw.tda.model.marketdata.MoversReq;
import com.studerw.tda.model.markethours.Hours;
import com.studerw.tda.model.option.OptionChain;
import com.studerw.tda.model.option.OptionChainReq;
import com.studerw.tda.model.quote.Quote;
import com.studerw.tda.model.transaction.Transaction;
import com.studerw.tda.model.transaction.TransactionRequest;
import com.studerw.tda.model.transaction.TransactionRequestValidator;
import com.studerw.tda.model.user.Preferences;
import com.studerw.tda.model.user.StreamerSubscriptionKeys;
import com.studerw.tda.model.user.UserPrincipals;
import com.studerw.tda.model.user.UserPrincipals.Field;
import com.studerw.tda.parse.DefaultMapper;
import com.studerw.tda.parse.TdaJsonParser;
import com.studerw.tda.parse.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import okhttp3.*;
import okhttp3.HttpUrl.Builder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.studerw.tda.client.TdaClientProperty.*;

/**
 * HTTP implementation of {@link TdaClient} which uses OKHttp3 under the hood and uses the new OAuth
 * based security.
 * <strong>This is a thread safe class.</strong>
 *
 * @see <a href="https://square.github.io/okhttp/3.x/okhttp/">OKHttp3 from Square</a>
 */
public class HttpTdaClient implements TdaClient {

  protected static final int LOGGING_BYTES = -1;
  protected static final DateTimeFormatter ISO_FORMATTER = DateTimeFormatter.BASIC_ISO_DATE;
  protected static final String DEFAULT_PATH = "https://api.tdameritrade.com/v1";
  private static final Logger LOGGER = LoggerFactory.getLogger(HttpTdaClient.class);
  private static final String AUTHORIZATION_HEADER = "Authorization";
  private static final String LOCATION_HEADER = "location";

  final TdaJsonParser tdaJsonParser = new TdaJsonParser();
  final OkHttpClient httpClient;

  Properties tdaProps;
  private HttpUrl httpUrl;

  /**
   * Using this constructor will assume there are properties found at {@code
   * classpath:/tda-api.properties}. This props file can include:
   * <ul>
   *   <li>tda.token.refresh</li>
   *   <li>tda.token.access (optional, it will be automatically retrieved using refresh token if not specified or expired)</li>
   *   <li>tda.client_id (or sometimes referenced as <em>Consumer Key</em> and it should not have <em>@AMER.OAUTHAP</em> appended</li>
   *   <li>tda.url=<em>https://api.tdameritrade.com/v1</em></li>
   *   <li>tda.debug.bytes.length=<em>-1</em> (How many bytes of logging interceptor debug to print, -1 is unlimited)</li>
   * </ul>
   *
   * <p>There are no defaults for the <em>tda.token.refresh</em> and <em>tda.client_id</em> (your consumer key).
   * If they are not set, an exception will be thrown
   * Note that the client id should not have appended the <em>@AMER.OAUTHAP</em> part
   * that is used when refreshing your OAuth token.
   * </p>
   */
  public HttpTdaClient() {
    this(null, null);
  }

  /**
   * <p>
   * To avoid using a properties file, you can define anything that would be in {@code
   * tda-api.properties} file. This includes:
   * </p>
   *
   * <ul>
   *   <li>tda.token.refresh</li>
   *   <li>tda.client_id</li>
   *   <li>tda.url=<em>https://api.tdameritrade.com/v1</em></li>
   *   <li>tda.debug.bytes.length=<em>-1</em> (How many bytes of logging interceptor debug to print, -1 is unlimited)</li>
   * </ul>
   *
   * <p>There are no defaults for <em>tda.token.refresh</em> and <em>tda.client_id</em> (<em>consumer key)</em>. If they
   * are not set, an exception will be thrown. Note that sometimes TDA uses <em>Consumer Key</em>
   * instead of the term <em>client id</em>. They are the same.
   * The client id should not have appended the <em>@AMER.OAUTHAP</em> part that is used when refreshing your OAuth token</p>
   *
   * @param props required properties
   */
  public HttpTdaClient(Properties props) {
    this(null, props);
  }

  /**
   * Using this constructor allows to supply own instance of http client.
   * It's useful for connecting to multiple TDA accounts and re-using single shared http client.
   *
   * @param httpClient http client to use
   * @param props required properties
   */
  public HttpTdaClient(OkHttpClient httpClient, Properties props) {
    LOGGER.info("Initiating HttpTdaClient...");

    this.tdaProps = (props == null) ? initTdaProps() : props;
    validateProps(this.tdaProps);
    this.httpClient = (httpClient == null) ? initHttpClient() : httpClient;
  }

  protected static Properties initTdaProps() {
    try (InputStream in = HttpTdaClient.class.getClassLoader()
        .getResourceAsStream("tda-api.properties")) {
      Properties tdProperties = new Properties();
      tdProperties.load(in);
      return tdProperties;
    } catch (IOException e) {
      throw new IllegalArgumentException(
          "Could not load default properties from com.studerw.tda.tda-api.properties in classpath", e);
    }
  }

  private OkHttpClient initHttpClient() {
    return new OkHttpClient.Builder().
            cookieJar(new CookieJarImpl(new MemoryCookieStore())).
            addInterceptor(new LoggingInterceptor("TDA_HTTP",
                    Integer.parseInt(tdaProps.getProperty(DEBUG_BYTES_LENGTH)))).
            build();
  }

  /**
   * validates the necessary props like access token, refresh token and client id (consumer key). If others are missing, just use
   * friendly defaults.
   *
   * @param tdaProps the required props to validate
   */
  protected static void validateProps(Properties tdaProps) {
    LOGGER.trace("Validating props: {}", tdaProps.toString());
    String clientId = tdaProps.getProperty(CLIENT_ID);
    if (StringUtils.isBlank(clientId)) {
      throw new IllegalArgumentException(
          "Missing tda.client_id property. This is obtained from TDA developer API when registering an app");
    }

    String refreshToken = tdaProps.getProperty(REFRESH_TOKEN);
    if (StringUtils.isBlank(refreshToken)) {
      throw new IllegalArgumentException(
          "Missing tda.token.refresh property. This is obtained from the TDA developer API page when creating a temporary authentication token");
    }

    String accessToken = tdaProps.getProperty(ACCESS_TOKEN);
    if (StringUtils.isBlank(accessToken)) {
      // This gets updated using the refresh code - the first call will always fail, forcing a
      // new access_token to be set.
      tdaProps.setProperty(ACCESS_TOKEN, "UNSET");
    }

    String url = tdaProps.getProperty(TDA_URL);
    if (StringUtils.isBlank(url)) {
      tdaProps.setProperty(TDA_URL, DEFAULT_PATH);
    }

    if (tdaProps.get(DEBUG_BYTES_LENGTH) == null) {
      tdaProps.setProperty(DEBUG_BYTES_LENGTH, "-1");
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
    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parsePriceHistory(response.body().byteStream());
    }
  }

  @Override
  public PriceHistory priceHistory(PriceHistReq priceHistReq) {
    LOGGER.info("PriceHistory: {}", priceHistReq);
    List<String> violations = PriceHistReqValidator.validate(priceHistReq);
    if (violations.size() > 0) {
      throw new IllegalArgumentException(violations.toString());
    }

    Builder urlBuilder = baseUrl("marketdata", priceHistReq.getSymbol(), "pricehistory");
    if (priceHistReq.getStartDate() != null) {
      urlBuilder.addQueryParameter("startDate", String.valueOf(priceHistReq.getStartDate()));
    }
    if (priceHistReq.getEndDate() != null) {
      urlBuilder.addQueryParameter("endDate", String.valueOf(priceHistReq.getEndDate()));
    }
    if (priceHistReq.getFrequency() != null) {
      urlBuilder.addQueryParameter("frequency", String.valueOf(priceHistReq.getFrequency()));
    }
    if (priceHistReq.getFrequencyType() != null) {
      urlBuilder.addQueryParameter("frequencyType", priceHistReq.getFrequencyType().name());
    }
    if (priceHistReq.getPeriod() != null) {
      urlBuilder.addQueryParameter("period", String.valueOf(priceHistReq.getPeriod()));
    }
    if (priceHistReq.getPeriodType() != null) {
      urlBuilder.addQueryParameter("periodType", priceHistReq.getPeriodType().name());
    }
    if (priceHistReq.getExtendedHours() != null) {
      urlBuilder.addQueryParameter("needExtendedHoursData",
          String.valueOf(priceHistReq.getExtendedHours()));
    }

    Request request = new Request.Builder().url(urlBuilder.build()).
        headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parsePriceHistory(response.body().byteStream());
    }
  }

  @Override
  public List<Quote> fetchQuotes(List<String> symbols) {
    LOGGER.info("Fetching quotes: {}", symbols);
    HttpUrl url = baseUrl("marketdata", "quotes")
        .addQueryParameter("symbol", String.join(",", symbols))
        .build();

    Request request = new Request.Builder().url(url)
        .headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseQuotes(response.body().byteStream());
    }
  }

  @Override
  public Quote fetchQuote(String symbol) {
    List<Quote> quotes = fetchQuotes(Collections.singletonList(symbol));
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
    final Request request = new Request.Builder().url(url)
        .headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseAccount(response.body().byteStream());
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
    final Request request = new Request.Builder().url(url)
        .headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseAccounts(response.body().byteStream());
    }

  }

  @Override
  public List<Hours> getMarketHours(List<Hours.MarketType> marketTypes) {
    return getMarketHours(marketTypes, null);
  }

  @Override
  public List<Hours> getMarketHours(List<Hours.MarketType> marketTypes, LocalDateTime date) {
    if(marketTypes == null || (marketTypes != null && marketTypes.size() == 0)) {
      throw new IllegalArgumentException("One or more Hours.MarketType(s) are required");
    }
    if(date != null && date.isBefore(LocalDateTime.now())) {
      throw new IllegalArgumentException("Date must be a future date.");
    }
    String stringMarketTypes = "";
    for(Hours.MarketType mt: marketTypes) {
      if(stringMarketTypes.length() > 0) {
        stringMarketTypes += ",";
      }
      stringMarketTypes += mt.toString();
    }
    LOGGER.info("GetMarketHours[marketType={}]", stringMarketTypes);
    List<String> args = new ArrayList<>();

    final Builder hoursBldr = baseUrl("marketdata", "hours");
    if(stringMarketTypes.length() > 0) {
      hoursBldr.addQueryParameter("markets", stringMarketTypes);
    } else {
      throw new IllegalArgumentException("One or more Hours.MarketType(s) are required");
    }
    if(date != null) {
      hoursBldr.addQueryParameter("date", date.format(DateTimeFormatter.ISO_DATE_TIME));
    }
    final URL url = hoursBldr.build().url();
    final Request request = new Request.Builder().url(url)
            .headers(defaultHeaders())
            .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseMarketHours(response.body().byteStream());
    } catch (IOException e) {
      throw new TdaClientException(e);
    }
  }

  @Override
  public Long placeOrder(String accountId, Order order) {
    LOGGER.info("Placing Order for account[{}] -> {}", accountId, order);
    if (StringUtils.isBlank(accountId)) {
      throw new IllegalArgumentException("accountId cannot be blank.");
    }

    HttpUrl url = baseUrl("accounts", accountId, "orders")
        .build();

    String json = DefaultMapper.toJson(order);
    RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
    Request request = new Request.Builder().url(url).
        headers(defaultHeaders())
        .post(body)
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      if (response.code() != 201) {
        LOGGER.warn("Expected 201 response, but received " + response.code());
      }
      String location = response.header(LOCATION_HEADER);
      if (null == location) {
        throw new TdaClientException("No location header found. Can't get order id.");
      }
      return Long.valueOf(location.substring(location.lastIndexOf("/") + 1));
    }

  }

  @Override
  public List<Order> fetchOrders(String accountId, OrderRequest orderRequest) {
    LOGGER.info("FetchOrders for account[{}] with request: {}", accountId, orderRequest);

    if (StringUtils.isBlank(accountId)) {
      throw new IllegalArgumentException("accountId cannot be blank.");
    }

    List<String> violations = OrderRequestValidator.validate(orderRequest);
    if (violations.size() > 0) {
      throw new IllegalArgumentException(violations.toString());
    }

    Builder urlBuilder = baseUrl("accounts", accountId, "orders");
    if (orderRequest.getMaxResults() != null) {
      urlBuilder.addQueryParameter("maxResults", String.valueOf(orderRequest.getMaxResults()));
    }
    if (orderRequest.getToEnteredTime() != null) {
      urlBuilder
          .addQueryParameter("toEnteredTime", Utils.toTdaISO8601(orderRequest.getToEnteredTime()));
    }
    if (orderRequest.getFromEnteredTime() != null) {
      urlBuilder.addQueryParameter("fromEnteredTime",
          Utils.toTdaISO8601(orderRequest.getFromEnteredTime()));
    }
    if (orderRequest.getStatus() != null) {
      urlBuilder.addQueryParameter("status", orderRequest.getStatus().name());
    }

    Request request = new Request.Builder().url(urlBuilder.build())
        .headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseOrders(response.body().byteStream());
    }
  }

  @Override
  public List<Order> fetchOrders(OrderRequest orderRequest) {
    LOGGER.info("FetchOrders all orders with request: {}", orderRequest);

    List<String> violations = OrderRequestValidator.validate(orderRequest);
    if (violations.size() > 0) {
      throw new IllegalArgumentException(violations.toString());
    }

    Builder urlBuilder = baseUrl("orders");
    if (orderRequest.getMaxResults() != null) {
      urlBuilder.addQueryParameter("maxResults", String.valueOf(orderRequest.getMaxResults()));
    }
    if (orderRequest.getToEnteredTime() != null) {
      urlBuilder
          .addQueryParameter("toEnteredTime", Utils.toTdaISO8601(orderRequest.getToEnteredTime()));
    }
    if (orderRequest.getFromEnteredTime() != null) {
      urlBuilder.addQueryParameter("fromEnteredTime",
          Utils.toTdaISO8601(orderRequest.getFromEnteredTime()));
    }
    if (orderRequest.getStatus() != null) {
      urlBuilder.addQueryParameter("status", orderRequest.getStatus().name());
    }

    Request request = new Request.Builder().url(urlBuilder.build())
        .headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseOrders(response.body().byteStream());
    }
  }

  @Override
  public List<Order> fetchOrders() {
    LOGGER.info("FetchOrders all orders.");

    Builder urlBuilder = baseUrl("orders");
    Request request = new Request.Builder().url(urlBuilder.build())
        .headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseOrders(response.body().byteStream());
    }
  }

  @Override
  public Order fetchOrder(String accountId, Long orderId) {
    LOGGER.info("Fetching for account[{}] order[{}]", accountId, orderId);

    if (StringUtils.isBlank(accountId)) {
      throw new IllegalArgumentException("accountId cannot be blank.");
    }

    if (orderId == null) {
      throw new IllegalArgumentException("orderId cannot be blank.");
    }

    Builder urlBuilder = baseUrl("accounts", accountId, "orders", String.valueOf(orderId));
    Request request = new Request.Builder().url(urlBuilder.build()).headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseOrder(response.body().byteStream());
    }

  }

  @Override
  public void cancelOrder(String accountId, String orderId) {
    LOGGER.info("Cancelling order: {} for account[{}].", orderId, accountId);
    if (StringUtils.isBlank(accountId)) {
      throw new IllegalArgumentException("accountId cannot be blank.");
    }
    if (StringUtils.isBlank(orderId)) {
      throw new IllegalArgumentException("orderId cannot be blank.");
    }

    HttpUrl url = baseUrl("accounts", accountId, "orders", orderId).build();

    Request request = new Request.Builder().url(url).
        headers(defaultHeaders())
        .delete()
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
    }
  }


  @Override
  public Instrument getBond(String cusip) {
    return this.getInstrumentByCUSIP(cusip);
  }

  @Override
  public List<Instrument> queryInstruments(Query query) {
    LOGGER.info("Querying for Instruments with query: {}", query);
    if (query == null || StringUtils.isEmpty(query.getSearchStr())
        || query.getQueryType() == null) {
      throw new IllegalArgumentException(
          "The instrument query must have both a searchStr and QueryType set.");
    }
    HttpUrl url = baseUrl("instruments")
        .addQueryParameter("symbol", query.getSearchStr())
        .addQueryParameter("projection", query.getQueryType().getQueryType())
        .build();

    Request request = new Request.Builder().url(url).headers(defaultHeaders()).build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseInstrumentMap(response.body().byteStream());
    }
  }

  @Override
  public FullInstrument getFundamentalData(String id) {
    LOGGER.info("Fetching Fundamental Instrument data with id: {}", id);
    if (StringUtils.isBlank(id)) {
      throw new IllegalArgumentException("Id cannot be blank.");
    }
    HttpUrl url = baseUrl("instruments")
        .addQueryParameter("symbol", id)
        .addQueryParameter("projection", "fundamental")
        .build();

    Request request = new Request.Builder().url(url).headers(defaultHeaders()).build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      final List<FullInstrument> fullInstruments = tdaJsonParser
          .parseFullInstrumentMap(response.body().byteStream());
      if (fullInstruments.size() != 1) {
        throw new TdaClientException(
            "Expecting a single instrument but received: " + fullInstruments.size());
      }
      return fullInstruments.get(0);
    }
  }

  @Override
  public List<Mover> fetchMovers(MoversReq moversReq) {
    LOGGER.info("Fetching Movers with req: {}", moversReq);
    if (moversReq.getIndex() == null) {
      throw new IllegalArgumentException("The index cannot be empty.");
    }

    Builder urlBuilder = baseUrl("marketdata", moversReq.getIndex().getIndex(), "movers");
    if (moversReq.getChange() != null) {
      urlBuilder.addQueryParameter("change", moversReq.getChange().getChange());
    }
    if (moversReq.getDirection() != null) {
      urlBuilder.addQueryParameter("direction", moversReq.getDirection().name());
    }

    Request request = new Request.Builder().url(urlBuilder.build()).headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, true);
      return tdaJsonParser.parseMovers(response.body().byteStream());
    }
  }

  @Override
  public OptionChain getOptionChain(OptionChainReq chainRequest) {
    LOGGER.info("get option chain for: {}", chainRequest.toString());

    if (StringUtils.isBlank(chainRequest.getSymbol())) {
      throw new IllegalArgumentException("Symbol cannot be blank.");
    }

    Builder urlBuilder = baseUrl("marketdata", "chains")
            .addQueryParameter("symbol", chainRequest.getSymbol().toUpperCase())
            .addQueryParameter("contractType", chainRequest.getContractType().toString())
            .addQueryParameter("strategy", chainRequest.getStrategy().toString())
            .addQueryParameter("range", chainRequest.getRange().toString())
            .addQueryParameter("optionType", chainRequest.getOptionType().toString());
    if(chainRequest.getStrikeCount() != null && chainRequest.getStrikeCount() > 0) {
      urlBuilder.addQueryParameter("strikeCount", chainRequest.getStrikeCount().toString());
    }
    if(chainRequest.getIncludeQuotes() != null) {
      urlBuilder.addQueryParameter("includeQuotes", chainRequest.getIncludeQuotes().toString());
    }
    if(chainRequest.getInterval() != null) {
      urlBuilder.addQueryParameter("interval", chainRequest.getInterval().toString());
    }
    if(chainRequest.getStrike() != null) {
      urlBuilder.addQueryParameter("strike", chainRequest.getStrike().toString());
    }
    if(chainRequest.getFromDate() != null) {
      urlBuilder.addQueryParameter("fromDate", chainRequest.getFromDate().format(DateTimeFormatter.ISO_DATE_TIME));
    }
    if(chainRequest.getToDate() != null) {
      urlBuilder.addQueryParameter("toDate", chainRequest.getToDate().format(DateTimeFormatter.ISO_DATE_TIME));
    }
    if(chainRequest.getVolatility() != null) {
      urlBuilder.addQueryParameter("volatility", chainRequest.getVolatility().toString());
    }
    if(chainRequest.getUnderlyingPrice() != null) {
      urlBuilder.addQueryParameter("underlyingPrice", chainRequest.getUnderlyingPrice().toString());
    }
    if(chainRequest.getInterestRate() != null) {
      urlBuilder.addQueryParameter("interestRate", chainRequest.getInterestRate().toString());
    }
    if(chainRequest.getDaysToExpiration() != null) {
      urlBuilder.addQueryParameter("daysToExpiration", chainRequest.getDaysToExpiration().toString());
    }
    if(chainRequest.getMonth() != null) {
      urlBuilder.addQueryParameter("month", chainRequest.getMonth().toString().substring(0, 3).toUpperCase());
    }

    Request request = new Request.Builder().url(urlBuilder.build()).headers(defaultHeaders())
            .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseOptionChain(response.body().byteStream());
    }

  }

  @Override
  public OptionChain getOptionChain(String symbol) {
    LOGGER.info("get option chain for symbol: {}", symbol);

    if (StringUtils.isBlank(symbol)) {
      throw new IllegalArgumentException("Symbol cannot be blank.");
    }

    OptionChainReq request = OptionChainReq.Builder.optionChainReq()
            .withSymbol(symbol).build();
    return getOptionChain(request);
  }

  @Override
  public List<Transaction> fetchTransactions(String accountId, TransactionRequest request) {
    LOGGER.info("FetchTransactions for account[{}]", accountId);

    if (StringUtils.isBlank(accountId)) {
      throw new IllegalArgumentException("accountId cannot be blank.");
    }

    if (request == null) {
      request = new TransactionRequest();
    }

    List<String> violations = TransactionRequestValidator.validate(request);
    if (violations.size() > 0) {
      throw new IllegalArgumentException(violations.toString());
    }

    Builder urlBuilder = baseUrl("accounts", accountId, "transactions");

    if (StringUtils.isNotEmpty(request.getSymbol())) {
      urlBuilder.addQueryParameter("symbol", StringUtils.upperCase(request.getSymbol()));
    }
    if (request.getStartDate() != null) {
      urlBuilder.addQueryParameter("startDate", Utils.toTdaYMD(request.getStartDate()));
    }
    if (request.getEndDate() != null) {
      urlBuilder.addQueryParameter("endDate", Utils.toTdaYMD(request.getEndDate()));
    }
    if (request.getType() != null) {
      urlBuilder.addQueryParameter("type", request.getType().name());
    }

    Request httpReq = new Request.Builder()
        .url(urlBuilder.build()).headers(defaultHeaders())
        .build();

    try (Response response = this.call(httpReq)) {
      checkResponse(response, true);
      return tdaJsonParser.parseTransactions(response.body().byteStream());
    }

  }

  @Override
  public Transaction getTransaction(String accountId, Long transactionId) {
    LOGGER.info("getTransaction by id: {} for account[{}]", transactionId, accountId);

    if (StringUtils.isBlank(accountId)) {
      throw new IllegalArgumentException("accountId cannot be blank.");
    }

    if (transactionId == null) {
      throw new IllegalArgumentException("transaction id cannot be null.");
    }

    Builder urlBuilder = baseUrl("accounts",
        accountId,
        "transactions",
        String.valueOf(transactionId));

    Request request = new Request.Builder().url(urlBuilder.build()).headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseTransaction(response.body().byteStream());
    }
  }

  @Override
  public Preferences getPreferences(String accountId) {
    LOGGER.info("getPreferences for account[{}]", accountId);

    if (StringUtils.isBlank(accountId)) {
      throw new IllegalArgumentException("accountId cannot be blank.");
    }

    Builder urlBuilder = baseUrl("accounts", accountId, "preferences");

    Request request = new Request.Builder()
        .url(urlBuilder.build())
        .headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parsePreferences(response.body().byteStream());
    }
  }

  @Override
  public UserPrincipals getUserPrincipals(Field... fields) {
    LOGGER.info("getUserPrincipals with additional fields: {}", fields);

    Builder urlBuilder = baseUrl("userprincipals");

    List<String> fieldsStr = new ArrayList();
    for (Field field : fields) {
      fieldsStr.add(field.toString());
    }

    if (fieldsStr.size() > 0) {
      urlBuilder.addQueryParameter("fields", String.join(",", fieldsStr));
    }

    Request request = new Request.Builder()
        .url(urlBuilder.build())
        .headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseUserPrincipals(response.body().byteStream());
    }
  }

  @Override
  public List<Transaction> fetchTransactions(String accountId) {
    return fetchTransactions(accountId, null);
  }

  @Override
  public Instrument getInstrumentByCUSIP(String id) {
    LOGGER.info("Fetching Instrument with id: {}", id);
    if (StringUtils.isBlank(id)) {
      throw new IllegalArgumentException("Id cannot be blank.");
    }
    HttpUrl url = baseUrl("instruments", id)
        .addQueryParameter("fundamental", "true")
        .build();

    Request request = new Request.Builder().url(url).

        headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseInstrumentArraySingle(response.body().byteStream());
    }
  }

  protected StreamerSubscriptionKeys getSubscriptionKeys(List<String> accountsIds) {
    LOGGER.info("getSubscriptionKeys: {}", accountsIds);
    if(Utils.isNullOrEmpty(accountsIds)){
      throw new IllegalArgumentException("AccountIds list must contain at least one account id");
    }

    Builder urlBuilder = baseUrl("userprincipals", "streamersubscriptionkeys")
        .addQueryParameter("accountIds", String.join(",", accountsIds));

    Request request = new Request.Builder()
        .url(urlBuilder.build())
        .headers(defaultHeaders())
        .build();

    try (Response response = this.call(request)) {
      checkResponse(response, false);
      return tdaJsonParser.parseSubscriptionKeys(response.body().byteStream());
    }
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
          LOGGER.warn("No error message nor error body", e);
          errorMsg = "UNKNOWN";
        }
      }
      String msg = String
          .format("Non 200 response:  [%d - %s] - %s", response.code(), errorMsg,
              response.request().url());
      throw new TdaClientException(msg);
    }
    if (!emptyJsonOk) {
      try {
        String json = response.peekBody(100).string();
        if ("{}".equals(json) || "[]".equals(json)) {
          String msg = String
              .format("Empty json body:  [%d - %s] - %s", response.code(), response.message(),
                  response.request().url());
          throw new TdaClientException(msg);
        }
      } catch (IOException e) {
        throw new TdaClientException("Error checking for JSON empty body on response", e);
      }
    }
  }

  private Headers defaultHeaders() {
    Map<String, String> defaultHeaders = new HashMap<>();
    defaultHeaders.put("Accept", "application/json");
    defaultHeaders.put(AUTHORIZATION_HEADER, "Bearer " + tdaProps.getProperty(ACCESS_TOKEN));
//    defaultHeaders.put("Accept-Language", "en-US");
    return Headers.of(defaultHeaders);
  }

  protected HttpUrl.Builder baseUrl(String... pathSegments) {
    if (this.httpUrl == null) {
      this.httpUrl = HttpUrl.parse(tdaProps.getProperty(TDA_URL));
    }
    Builder builder = httpUrl.newBuilder();
    for (String segment : pathSegments) {
      builder.addPathSegment(segment);
    }
    return builder;
  }

  private Response call(Request request) {
    Response response = null;
    try {
      response = httpClient.newCall(request).execute();
      if (response.code() == 401) {
        String token = request.header(AUTHORIZATION_HEADER).substring(7);
        LOGGER.debug("Unauthorized, trying to refresh token...");
        synchronized (this) {
          String accessToken = tdaProps.getProperty(ACCESS_TOKEN);
          if (token.equals(accessToken)) {
            LOGGER.debug("Refreshing access token...");
            updateAuthToken();
          } else {
            LOGGER.debug("Token has already been refreshed by another thread");
          }
          return httpClient.newCall(request.newBuilder().header(AUTHORIZATION_HEADER, "Bearer " + tdaProps.getProperty(ACCESS_TOKEN)).build()).execute();
        }

      }
      return response;
    } catch (IOException e) {
      throw new TdaClientException(e);
    } finally {
      if (response != null && response.code() == 401) {
        response.close();
      }
    }
  }

  private void updateAuthToken() {
    RequestBody formBody = new FormBody.Builder()
            .add(AuthToken.GRANT_TYPE_PARAM, AuthToken.GRANT_TYPE_REFRESH)
            .add(AuthToken.REFRESH_TOKEN_PARAM, tdaProps.getProperty(REFRESH_TOKEN))
            .add(AuthToken.CLIENT_ID_PARAM, this.tdaProps.getProperty(CLIENT_ID))
            .build();

    HttpUrl url = baseUrl()
            .addPathSegments("oauth2/token")
            .build();

    LOGGER.debug("Attempting to obtain new authentication token using refresh token at {}", url);

    Request authRequest = new Request.Builder()
            .url(url)
            .header("Content-Type", "application/x-www-form-urlencoded")
            .header("Accept", "application/json")
            .post(formBody)
            .build();

    try (Response authResponse = httpClient.newCall(authRequest).execute()) {
      // If the auth failed again, we can't get a new auth token, so we're screwed.
      checkResponse(authResponse, false);
      InputStream in = authResponse.body().byteStream();
      AuthToken authToken = DefaultMapper.fromJson(in, AuthToken.class);
      LOGGER.info("new authToken received: {}", authToken);
      String _accessToken = authToken.getAccessToken();
      if (StringUtils.isBlank(_accessToken)) {
        throw new TdaClientException("Got successful OAuth response, but access token is missing");
      }
      tdaProps.setProperty(ACCESS_TOKEN, _accessToken);
    } catch (IOException e) {
      throw new TdaClientException(e);
    }
  }
}

package com.studerw.tda.client;

import com.studerw.tda.model.account.Order;
import com.studerw.tda.model.account.OrderRequest;
import com.studerw.tda.model.account.SecuritiesAccount;
import com.studerw.tda.model.history.PriceHistReq;
import com.studerw.tda.model.history.PriceHistory;
import com.studerw.tda.model.instrument.FullInstrument;
import com.studerw.tda.model.instrument.Instrument;
import com.studerw.tda.model.instrument.Query;
import com.studerw.tda.model.marketdata.Mover;
import com.studerw.tda.model.marketdata.MoversReq;
import com.studerw.tda.model.option.OptionChain;
import com.studerw.tda.model.quote.Quote;
import com.studerw.tda.model.transaction.Transaction;
import com.studerw.tda.model.transaction.TransactionRequest;
import com.studerw.tda.model.user.Preferences;
import com.studerw.tda.model.user.UserPrincipals;
import java.util.List;

/**
 * Main interface of the TDA Client. Implementations should be thread safe.
 *
 * @see HttpTdaClient
 */
public interface TdaClient {

  /**
   * <p>
   * Retrieve historical intraday and end of day quote data for an equity, index, mutual fund,
   * forex, option chain, etc. See {@link com.studerw.tda.model.AssetType} for possible types,
   * though your account must explicitly have access for some of these. TDA has not implemented all
   * the API calls either (Sep 2019).
   * </p>
   *
   * <ul>
   *   <li>periodType: day</li>
   *   <li>period: 10</li>
   *   <li>frequencyType: minute</li>
   *   <li>frequency: 1</li>
   * </ul>
   *
   * @param symbol uppercase symbol
   * @return PriceHistory using all other TDA default request parameters. This appears to be a quote
   * every minute for 10 days.
   **/
  PriceHistory priceHistory(String symbol);

  /**
   * <p>
   * Retrieve historical intraday and end of day quote data for an equity, index, mutual fund,
   * forex, option chain, etc. See {@link com.studerw.tda.model.AssetType} for possibly types,
   * though your account must explicitly have access for some of these. TDA has not implemented all
   * the API calls either (Sep 2019). Note that some of the parameters within the {@link
   * com.studerw.tda.model.history.PriceHistReq} param be null, and then some of the other arguments
   * will be assumed by the non null parameters.
   * </p>
   *
   * @param priceHistReq validated object of request parameters
   * @return PriceHistory with a list of {@link com.studerw.tda.model.history.Candle} Candles based
   * on the frequency and period / date length.
   */
  PriceHistory priceHistory(PriceHistReq priceHistReq);

  /**
   * <p>
   * Fetch detailed quote information for one or more symbols. Currently the API allows symbol types
   * of Stocks, Options, Mutual Funds Indexes, and ETFs. Quotes are real-time for accounts
   * subscribed to this service; otherwise, quotes are delayed according to exchange and TDA rules.
   * The following types of <em>Quote</em> are actually returned and can be casted:
   * </p>
   *
   * <ul>
   *   <li>{@link com.studerw.tda.model.quote.EquityQuote}</li>
   *   <li>{@link com.studerw.tda.model.quote.EtfQuote}</li>
   *   <li>{@link com.studerw.tda.model.quote.OptionQuote}</li>
   *   <li>{@link com.studerw.tda.model.quote.IndexQuote}</li>
   *   <li>{@link com.studerw.tda.model.quote.MutualFundQuote}</li>
   *   <li>{@link com.studerw.tda.model.quote.ForexQuote}</li>
   * </ul>
   *
   * <pre class="code">
   *  Quote quote = client.fetchQuote("ATD");
   *  EquityQuote equityQuote = (EquityQuote)quote;
   * </pre>
   *
   * @param symbols list of valid symbols. Max of 300 based on TDA docs. Index symbols need to be
   * prefixed with a <em>$</em>, e.g. <em>$INX</em> or <em>$SPX.X</em>. Options are in a format like
   * the following:
   * <em>MSFT_061518P60</em> for a put, or <em>MSFT_061518C60</em> for a call. This is the
   * Microsoft June 15, 2018 Put/Call at $60.
   * @return list of quotes. The {@link Quote} is the base class, but all objects in the list can be
   * cast to their actual types by looking at the {@link com.studerw.tda.model.AssetType} attribute.
   * field.
   */
  List<Quote> fetchQuotes(List<String> symbols);

  /**
   * <p>
   * Fetch Detailed quote information for one or more symbols. Currently the API allows symbol types
   * of Stocks, Options, Mutual Funds and Indexes, and ETFs. Quotes are real-time for accounts
   * subscribed to this service; otherwise, quotes are delayed according to exchange and TDA rules.
   * </p>
   *
   * <pre class="code">
   *  Quote quote = client.fetchQuote("ATD");
   *  EquityQuote equityQuote = (EquityQuote)quote;
   * </pre>
   *
   * <ul>
   *  <li>{@link com.studerw.tda.model.quote.EquityQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.EtfQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.OptionQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.IndexQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.MutualFundQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.ForexQuote}</li>
   * </ul>
   *
   * @param symbol list of valid symbols. Max of 300 based on TDA docs. Index symbols need to be
   * prefixed with a <em>$</em>, e.g. <em>$INX</em> or <em>$SPX.X</em>. Options are in a format like
   * the following:
   * <em>MSFT_061518P60</em> for a put, or <em>MSFT_061518C60</em> for a call. This is the
   * Microsoft June 15, 2018 Put/Call at $60.
   * @return a quote. The {@link Quote} is the base class, but all quotes can be cast to their
   * actual types by looking at the {@code com.studerw.tda.model.quote.Quote.assetType} field.
   */
  Quote fetchQuote(String symbol);

  /**
   * Fetch an account by the id. By default, balances are included. Positions and Orders can also be
   * included based on the parameters.
   *
   * @param accountId the account. Most users only have a single account
   * @param positions whether to include positions
   * @param orders whether to include orders
   * @return {@link SecuritiesAccount} with the passed id.
   */
  SecuritiesAccount getAccount(String accountId, boolean positions, boolean orders);

  /**
   * Fetch all your accounts. By default, balances are included. Positions and Orders can also be
   * included based on the parameters.
   *
   * @param positions whether to include positions
   * @param orders whether to include orders
   * @return List of all the user's {@link SecuritiesAccount}.
   */
  List<SecuritiesAccount> getAccounts(boolean positions, boolean orders);

  /**
   * Partially complete....
   * @param symbol in TDA format (e.g. {@code MSFT_061821C120} which denotes MSFT for June 18, 2021 Call at $120.
   * @return {@link com.studerw.tda.model.OptionChain}
   */
//  OptionChain fetchOptionChain(String symbol);

  /**
   *  A snapshot of the five main indices.
   * @return {@link MarketSnapshot} MarketSnapshot
   */
//  MarketSnapshot fetchMarketSnapshot();

  /**
   * This is just an alias method for {@link TdaClient#fetchMarketOverview()}  due to the way TDA names their services.
   * @return {@link MarketSnapshot} MarketSnapshot
   */
//  MarketSnapshot fetchMarketOverview();

  /**
   * Place an Order.
   *
   * @param accountId the account under which the order is to be placed
   * @param order the order to place
   * @see <a href="https://developer.tdameritrade.com/content/place-order-samples">Place Order
   * Samples</a>
   */
  void placeOrder(String accountId, Order order);

  /**
   * <p>
   * Fetch all orders for a given account using the criteria of the orderRequest. You can just use a
   * blank order to use sane defaults.
   * </p>
   *
   * <pre class="code">
   *   Order order = client.fetchOrders("123456789", new OrderRequest());
   * </pre>
   *
   * @param accountId the orders from only this account
   * @param orderRequest the request.
   * @return list of orders specified by the {@link OrderRequest} param.
   */
  List<Order> fetchOrders(String accountId, OrderRequest orderRequest);

  /**
   * <p>
   * Fetch all orders for all accounts using the criteria of the orderRequest. You can use a blank
   * order to use sane defaults.
   * </p>
   *
   * <pre class="code">
   *   Order order = client.fetchOrders(new OrderRequest());
   * </pre>
   *
   * @param orderRequest the request.
   * @return list of orders specified by the {@link OrderRequest} param.
   */
  List<Order> fetchOrders(OrderRequest orderRequest);

  /**
   * Fetch all orders for all accounts using TDA defaults.
   *
   * @return list of orders for all accounts, using TDA default criteria.
   */
  List<Order> fetchOrders();

  /**
   * This call assumes the order under the given parameters definitely exists. If not, a {@link
   * RuntimeException} is thrown as, behind the scenes, the TDA API will return a 404 response.
   *
   * @param accountId account under which the order was originally placed
   * @param orderId the id of the order
   * @return Order or a RuntimeException if it doesn't exist.
   */
  Order fetchOrder(String accountId, Long orderId);

  /**
   * Cancel an order by account Id and order Id.
   *
   * @param accountId the account under which this order was placed
   * @param orderId the order to cancel
   */
  void cancelOrder(String accountId, String orderId);

  /**
   * Get basic data for an instrument via its CUSIP number. Data includes attributes such as
   * description, possible symbol, exchange, etc.
   *
   * <p>
   * Apparently the following instrument types are able to be looked up: {@link
   * com.studerw.tda.model.instrument.Instrument.AssetType}.
   * </p>
   *
   * @param cusip (committee on uniform securities identification procedures numbers).
   * @return Basic data using a security's CUSIP. The {@link Instrument#getBondPrice()} will return
   * null unless the {@code cusip} parameter references a bond.
   * @see <a href="https://www.sec.gov/answers/cusip.htm">CUSIP Number</a>
   */
  Instrument getInstrumentByCUSIP(String cusip);

  /**
   * Get basic info for a bond via its CUSIP number.
   *
   * @param cusip (committee on uniform securities identification procedures numbers).
   * @return Basic data of the bond including the price.
   * @see <a href="https://www.sec.gov/answers/cusip.htm">CUSIP Number</a>
   */
  Instrument getBond(String cusip);

  /**
   * <p>
   * Query TDA for {@link com.studerw.tda.model.instrument.Instrument Instruments} using symbol,
   * name, description, cusip, etc. Apparently the following instrument types are queryable: {@link
   * com.studerw.tda.model.instrument.Instrument.AssetType}.
   * </p>
   *
   * <p>
   * The following {@link com.studerw.tda.model.instrument.Query.QueryType QueryTypes} can be made:
   * </p>
   *
   * <ul>
   *   <li><em><strong>SYMBOL_SEARCH</strong></em>: retrieve an instrument using the exact symbol name or CUSIP</li>
   *   <li><em><strong>SYMBOL_REGEX</strong></em>: Retrieve instrument data for all symbols matching regex. For example <em>XYZ.*</em> will return all symbols beginning with <em>XYZ</em></li>
   *   <li><em><strong>DESCRIPTION_SEARCH</strong></em>: Retrieve instrument data for instruments whose description contains the word supplied. Example: <em>Bank</em> will return all instruments with <em>Bank</em> in the description.</li>
   *   <li><em><strong>DESCRIPTION_REGEX</strong></em>: Search description with full regex support.
   *   For example <em>XYZ.[A-C]</em> returns all instruments whose descriptions contain a word beginning with <em>XYZ</em> followed by a character <em>A</em> through <em>C</em>.</li>
   * </ul>
   *
   * @param query contains the type of query and the search string.
   * @return List of 0 or more instruments that matched the query. If you want the full data of an
   * instrument, you must use {@link #getFundamentalData} using the exact <em>CUSIP</em> or symbol.
   * Note that {@link com.studerw.tda.model.instrument.Instrument#getBondPrice} will return null for
   * any instruments not of type BOND.
   * @see com.studerw.tda.model.instrument.Query.QueryType
   * @see #getFundamentalData
   */
  List<Instrument> queryInstruments(Query query);

  /**
   * Get full fundamental data for a specific security via its CUSIP number or ticker symbol (e.g.
   * <em>MSFT</em>). Not all CUSIP numbers work, for example those referencing BONDs, at least as
   * of Nov. 2019.
   *
   * @param id CUSIP number or symbol (e.g. <em>MSFT</em>)
   * @return full fundamentals of an instrument using a CUSIP or symbol. The {@link
   * Instrument#getBondPrice()} will be empty unless it is a bond referenced by {@code cusip}.
   * @see <a href="https://www.sec.gov/answers/cusip.htm">CUSIP Number</a>
   */
  FullInstrument getFundamentalData(String id);

  /** Note that this call can return an empty list on days the market is closed.
   * Top 10 (up or down) movers by value or percent for a particular market
   *
   * @param moversReq Index must be set, the other fields can be null which will use TDA defaults.
   * @return List of top 10 market movers defined by the request.
   */
  List<Mover> fetchMovers(MoversReq moversReq);

  /**
   *
   * @param symbol - should be upper case (e.g. <em>MSFT</em>)
   * @return an option chain using all TDA Default parameters
   */
  OptionChain getOptionChain(String symbol);


  /**
   *
   * @param accountId the account under which these transactions occurred
   * @return list of all transactions
   */
  List<Transaction> fetchTransactions(String accountId);

  /**
   *
   * @param accountId the account under which these transactions occurred
   * @param request transaction request which may be empty or using one or more parameters.
   * If you add a <em>startDate</em> then you do need an <em>endDate</em> and vice versa.
   * @return list of all transactions
   */
  List<Transaction> fetchTransactions(String accountId, TransactionRequest request);

  /**
   *
   * @param accountId the account under which this transactions occurred
   * @param transactionId transaction id
   * @return single transaction
   */
  Transaction getTransaction(String accountId, Long transactionId);

  /**
   * Get preferences for a specific account
   * @param accountId user's account id
   * @return user's preferences
   */
  Preferences getPreferences(String accountId);

  /**
   *
   * @return user principals
   */
  UserPrincipals getUserPrincipals();
}

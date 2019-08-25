package com.studerw.tda.client;

import com.studerw.tda.model.BalancesAndPositions;
import com.studerw.tda.model.CancelOrder;
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
import java.time.LocalDate;
import java.util.List;

/**
 * Main interface of the TDA Client. Implementations should be thread safe.
 */
public interface TdaClient {

  /**
   * This call will invalidate the user session. It is a security feature that should be called when
   * the user wants to stop their current session or close the client application.
   */
  Logout logout();

  /**
   * <p> the {@link com.studerw.tda.model.Login} object which will contain your account information,
   * among other information.
   *
   * @return {@link com.studerw.tda.model.Login}
   */
  Login getCurrentLogin();


  /**
   * @see com.studerw.tda.model.history for full validation rules.
   *
   * Retrieve historical intraday and end of day quote data consolidated in OHLC format. This is the
   * most basic form of the method. Default parameters are based on the <em>intervalType</em> and
   * <em>intervalDuration</em> arguments. Note that some of these parameters may be null, and then
   * some of the other arguments will be assumed by the non null parameters.
   *
   * @param symbols list of symbols such as <em>INTC, MSFT</em>
   * @param intervalType
   * @param intervalDuration depending on the {@link IntervalType} parameter. See its docs.
   * @param periodType
   * @param period The number of periods for which the data is returned. For example, if <em>periodtype=DAY</em> and <em>period=10</em>, then the request is for 10 days of data
   * @param startDate The start date of the data being requested (Inclusive). If the <em>startDate</em> is not specified, then it will be (<em>endDate - period</em>) excluding weekends and holidays.  If specified, then <em>period</em> and <em>periodType</em> CANNOT be specified.
   * @param endDate The end date of the data being requested (Inclusive). If NULL, then the default is the previous business day.
   * @param extended Indicates if extended hours data is to be included in the response. FALSE if null. NOTE: Only valid for intraday data requests.
   * @return priceHistory with a result for each symbol
   */
  PriceHistory priceHistory(List<String> symbols, IntervalType intervalType, Integer intervalDuration,
      PeriodType periodType, Integer period, LocalDate startDate, LocalDate endDate, Boolean extended);

  /**
   * @see com.studerw.tda.model.history for full validation rules.
   *
   * Retrieve historical intraday and end of day quote data consolidated in OHLC format. This is the
   * most basic form of the method. Default parameters are based on the <em>intervalType</em> and
   * <em>intervalDuration</em> arguments. Note that some of these parameters may be null, and then
   * some of the other arguments will be assumed by the non null parameters.
   *
   * @param symbols list of symbols such as <em>INTC, MSFT</em>
   * @param intervalType
   * @param intervalDuration depending on the {@link IntervalType} parameter. See its docs.
   * @param periodType
   * @param period The number of periods for which the data is returned. For example, if <em>periodtype=DAY</em> and <em>period=10</em>, then the request is for 10 days of data
   * @param startDate The start date of the data being requested (Inclusive). If the <em>startDate</em> is not specified, then it will be (<em>endDate - period</em>) excluding weekends and holidays.  If specified, then <em>period</em> and <em>periodType</em> CANNOT be specified.
   * @param endDate The end date of the data being requested (Inclusive). If NULL, then the default is the previous business day.
   * @param extended Indicates if extended hours data is to be included in the response. FALSE if null. NOTE: Only valid for intraday data requests.
   * @return priceHistory with a result for each symbol
   */
  byte[] priceHistoryBytes(List<String> symbols, IntervalType intervalType, Integer intervalDuration,
      PeriodType periodType, Integer period, LocalDate startDate, LocalDate endDate, Boolean extended);

  /**
   * If the login user is inactive for more than the timeout period, the session will expire and the
   * client will need to login again. This call is designed to refresh the login user session so
   * that it does not expire.
   *
   * NOTE: The client can set their timeout to different times (i.e. 55-minutues or 2, 4, or 8
   * hours) from the TDA web site "My Profile" page. Therefore, be sure to make a KeepAlive request
   * before the client's timeout elapses."
   *
   * @return The response to the KeepAlive request will be a one world reply. Either "LoggedOn" or
   * "InvalidSession" without html or xml formatting.  The content type is text/plain.
   */
  String keepAlive();

  /**
   * Fetch Detailed quote information for one or more symbols. Currently the API allows symbol types
   * of Stocks, Options, Mutual Funds and Indexes. Quotes are real-time for accounts subscribed to
   * this service; otherwise, quotes are delayed according to exchange rules.
   *
   * @param symbols list of valid symbols. Max of 300 based on TDA docs. Index symbols need to be
   * prefixed with a <em>$</em>, e.g. $inx. Options are in a format like the following:
   * <em>MNST_061518P60</em> for a put, or <em>MNST_061518C60</em> for a call.
   * @return QuoteResponse
   */
  QuoteResponse fetchQuotes(List<String> symbols);

  /**
   * Provides detailed information on positions and balances in the account.
   * Uses the default account of the user, both balances and positions are returned,
   * quotes will not be suppressed, and balances will not be returned in 'alternative format'.
   * @return {@link com.studerw.tda.model.BalancesAndPositions}
   */
  BalancesAndPositions fetchBalancesAndPositions();

  /**
   * Provides detailed information on positions and balances in the account.
   * @param accountId of the associated account. If it is empty or null, the default account will be used.
   * All other parameters are set as default.
   * @return {@link com.studerw.tda.model.BalancesAndPositions}
   */
  BalancesAndPositions fetchBalancesAndPositions(String accountId);

  /**
   * Cancel one or more open orders or the balance of partially filled orders.
   * @param orderId - the id of the order
   * @return {@link com.studerw.tda.model.CancelOrder}
   */
  CancelOrder cancelOrder(String orderId);

  /**
   *  detailed order status for an account, allowing filtering of orders by status, entry date,
   *  order id, and other criteria.  OrderStatus is a synchronous request.
   *  If you need an update, you need to issue the request again.
   *
   * @param orderIds
   * @return {@link com.studerw.tda.model.OrderStatus}
   */
  OrderStatus fetchOrderStatus(String... orderIds);

  /**
   *
   * @return {@link com.studerw.tda.model.OrderStatus}
   */
  OrderStatus fetchAllOrderStatuses();

  /**
   *  returns the date and time of the last order status activity for the primary account associated with the login userID, or the explicitly specified account.
   * @return  {@link com.studerw.tda.model.LastOrderStatus}
   */
  LastOrderStatus fetchLastOrderStatus();

  /**
   * Partially complete....
   * @param symbol e.g. TDA
   * @return {@link com.studerw.tda.model.OptionChain}
   */
  OptionChain fetchOptionChain(String symbol);

  /**
   * Provides the ability to lookup symbols for stocks and ETFs.
   *f
   * @param matchStr The string being searched for. Partial name of the company for example <em>Bank
   * of Amer</em>
   * @return a LookupResponse
   */
  SymbolLookup symbolLookup(String matchStr);

  /**
   *  A snapshot of the five main indices.
   * @return {@link MarketSnapshot} MarketSnapshot
   */
  MarketSnapshot fetchMarketSnapshot();

  /**
   * This is just an alias method for {@link TdaClient#fetchMarketOverview()}  due to the way TDA names their services.
   * @return {@link MarketSnapshot} MarketSnapshot
   */
  MarketSnapshot fetchMarketOverview();
}

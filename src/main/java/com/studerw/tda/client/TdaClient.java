package com.studerw.tda.client;

import com.studerw.tda.model.history.PriceHistReq;
import com.studerw.tda.model.history.PriceHistory;
import com.studerw.tda.model.quote.Quote;
import java.util.List;

/**
 * Main interface of the TDA Client. Implementations should be thread safe.
 */
public interface TdaClient {

  /**
   * <p>
   * Retrieve historical intraday and end of day quote data for an equity, index, mutual fund, forex, option chain, etc. See {@link com.studerw.tda.model.AssetType}
   * for possible types, though your account must explicitly have access for some of these. TDA has not implemented all the API calls either (Sep 2019).
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
   * @return PriceHistory using all other TDA default request parameters. This appears to be a quote every minute for 10 days.
   **/
    PriceHistory priceHistory(String symbol);

  /**
   *
   * <p>
   * Retrieve historical intraday and end of day quote data for an equity, index, mutual fund, forex, option chain, etc. See {@link com.studerw.tda.model.AssetType}
   * for possibly types, though your account must explicitly have access for some of these. TDA has not implemented all the API calls either (Sep 2019).
   * Note that some of the parameters within the {@link com.studerw.tda.model.history.PriceHistReq} param be null, and then
   * some of the other arguments will be assumed by the non null parameters.
   * </p>
   *
   * @param priceHistReq validated object of request parameters
   * @return PriceHistory with a list of {@link com.studerw.tda.model.history.Candle} Candles based on the frequency and period / date length.
   */
  PriceHistory priceHistory(PriceHistReq priceHistReq);


  /**
   * Fetch Detailed quote information for one or more symbols. Currently the API allows symbol types
   * of Stocks, Options, Mutual Funds and Indexes, and ETFs. Quotes are real-time for accounts subscribed to
   * this service; otherwise, quotes are delayed according to exchange and TDA rules. The following
   * types of <em>Quote</em> are actually returned and can be casted:
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
   * prefixed with a <em>$</em>, e.g. <em>$INX</em> or <em>$SPX.X</em>. Options are in a format like the following:
   * <em>MSFT_061518P60</em> for a put, or <em>MSFT_061518C60</em> for a call. This is the
   * Microsoft June 6, 2018 Put/Call at $60.
   * @return list of quotes. The {@link Quote} is the base class, but all objects in the
   * list can be cast to their actual types by looking at the {@link com.studerw.tda.model.AssetType} attribute.
   * field.
   */
  List<Quote> fetchQuotes(List<String> symbols);


  /**
   * Fetch Detailed quote information for one or more symbols. Currently the API allows symbol types
   * of Stocks, Options, Mutual Funds and Indexes, and ETFs. Quotes are real-time for accounts subscribed to
   * this service; otherwise, quotes are delayed according to exchange and TDA rules.
   *
   * @param symbol list of valid symbols. Max of 300 based on TDA docs. Index symbols need to be
   * prefixed with a <em>$</em>, e.g. <em>$INX</em> or <em>$SPX.X</em>. Options are in a format like the following:
   * <em>MSFT_061518P60</em> for a put, or <em>MSFT_061518C60</em> for a call. This is the
   * Microsoft June 6, 2018 Put/Call at $60.
   *
   * @return a quote. The {@link Quote} is the base class, but all quotes can be cast to their
   * actual types by looking at the {@code com.studerw.tda.model.quote.Quote.assetType} field.
   *
   * <pre class="code">
   *  Quote quote = client.fetchQuote("ATD");
   *  EquityQuote equityQuote = (EquityQuote)quote;
   * </pre>
   *
   *<ul>
   *  <li>{@link com.studerw.tda.model.quote.EquityQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.EtfQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.OptionQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.IndexQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.MutualFundQuote}</li>
   *  <li>{@link com.studerw.tda.model.quote.ForexQuote}</li>
   *</ul>
   */
  Quote fetchQuote(String symbol);

  /**
   * Provides detailed information on positions and balances in the account.
   * Uses the default account of the user, both balances and positions are returned,
   * quotes will not be suppressed, and balances will not be returned in 'alternative format'.
   * @return {@link com.studerw.tda.model.BalancesAndPositions}
   */
//  BalancesAndPositions fetchBalancesAndPositions();

  /**
   * Provides detailed information on positions and balances in the account.
   * @param accountId of the associated account. If it is empty or null, the default account will be used.
   * All other parameters are set as default.
   * @return {@link com.studerw.tda.model.BalancesAndPositions}
   */
//  BalancesAndPositions fetchBalancesAndPositions(String accountId);

  /**
   * Cancel an open order or the balance of partially filled orders. The default accountId will
   * be used.
   * @param orderIds - one or more order ids
   * @return {@link CancelOrder}
   */
//  CancelOrder cancelTrade(List<String> orderIds);

  /**
   * Cancel an open order or the balance of partially filled orders. The default accountId will
   * be used.
   * @param accountId the id of the account on which the trade was placed
   * @param orderIds - one or more order ids
   * @return {@link CancelOrder}
   */
//  CancelOrder cancelTrade(String accountId, List<String> orderIds);

  /**
   * Partially complete
   *  Detailed order status for an account, allowing filtering of orders by status, entry date,
   *  order id, and other criteria.  OrderStatus is a synchronous request.
   *  If you need an update, you need to issue the request again.
   *
   * @param orderIds one or more order ids.
   * @return {@link com.studerw.tda.model.OrderStatus}
   */
//  OrderStatus fetchOrderStatus(List<String> orderIds);

  /**
   * Partially complete
   *  Detailed order status for an account, allowing filtering of orders by status, entry date,
   *  order id, and other criteria.  OrderStatus is a synchronous request.
   *  If you need an update, you need to issue the request again.
   *
   * @param orderIds one or more order ids.
   * @param accountId the account on which the orders were placed
   * @return {@link com.studerw.tda.model.OrderStatus}
   */
//  OrderStatus fetchOrderStatus(List<String> orderIds, String accountId);

  /**
   * Fetch a list of all order statuses
   * @return {@link com.studerw.tda.model.OrderStatus}
   */
//  OrderStatus fetchAllOrderStatuses();

  /**
   *  Get the date and time of the last order status activity for the primary account associated with the login userID, or the explicitly specified account.
   * @return  {@link com.studerw.tda.model.LastOrderStatus}
   */
//  LastOrderStatus fetchLastOrderStatus();

  /**
   * Partially complete....
   * @param symbol in TDA format (e.g. {@code MSFT_061821C120} which denotes MSFT for June 18, 2021 Call at $20.
   * @return {@link com.studerw.tda.model.OptionChain}
   */
//  OptionChain fetchOptionChain(String symbol);

  /**
   * Provides the ability to lookup symbols for stocks and ETFs.
   *f
   * @param matchStr The string being searched for. Partial name of the company for example <em>Bank
   * of Amer</em> would return <em>Bank of America</em>. Used, perhaps, for auto select fields.
   * @return a LookupResponse
   */
//  SymbolLookup symbolLookup(String matchStr);

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
   * Trade an equity
   * @param equityOrder, note that this requires a {@link com.studerw.tda.model.trade.EquityOrder.EquityOrderBldr} to create.
   * @return an {@link EquityTrade}
   *
   */
//  EquityTrade tradeEquity(EquityOrder equityOrder);

  /**
   * Trade an option. You must be explicitly approved by TDA for option trading.
   * @param optionOrder, note that this requires a {@link com.studerw.tda.model.trade.OptionOrder.OptionOrderBldr} to create.
   * @return an {@link OptionTrade}
   *
   */
//  OptionTrade tradeOption(OptionOrder optionOrder);

}

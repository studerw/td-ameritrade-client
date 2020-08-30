package com.studerw.tda.client;

import com.studerw.tda.model.quote.Quote;
import java.util.List;

/**
 * This is a simple interface to the few TDA API methods that only require a client id (consumer key).
 * No OAuth tokens are needed.
 * Currently, the API only allows fetching quotes.
 */
public interface TdaQuoteClient {

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

}

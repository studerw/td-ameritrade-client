package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.AssetType;
import com.studerw.tda.model.quote.EquityQuote;
import com.studerw.tda.model.quote.EtfQuote;
import com.studerw.tda.model.quote.ForexQuote;
import com.studerw.tda.model.quote.IndexQuote;
import com.studerw.tda.model.quote.MutualFundQuote;
import com.studerw.tda.model.quote.OptionQuote;
import com.studerw.tda.model.quote.Quote;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SuppressWarnings("ConstantConditions")
public class FetchQuotesTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(FetchQuotesTestIT.class);

  @Test
  public void testStockQuote() {
    final Quote quote = httpTdaClient.fetchQuote("msft");
    assertThat(quote.getAssetType()).isEqualTo(AssetType.EQUITY);
    assertThat(quote).isInstanceOf(EquityQuote.class);
    assertThat(quote.getSymbol()).isEqualToIgnoringCase("msft");
    EquityQuote equityQuote = (EquityQuote) quote;
    assertThat(equityQuote).isNotNull();
    assertThat(equityQuote.getAskPrice()).isGreaterThanOrEqualTo(BigDecimal.ONE);
  }

  @Test
  public void testStockQuotes() {
    List<String> stocks = Arrays.asList("VTSAX", "MSFT", "NOK/JPY", "$SPX.X", "MSFT_061821P65", "SPY");
    final List<Quote> quotes = httpTdaClient.fetchQuotes(stocks);
    assertThat(quotes).size().isEqualTo(6);
    assertThat(quotes.get(0).getAssetType()).isEqualTo(AssetType.MUTUAL_FUND);
    assertThat(quotes.get(0)).isInstanceOf(MutualFundQuote.class);
    assertThat(quotes.get(1).getAssetType()).isEqualTo(AssetType.EQUITY);
    assertThat(quotes.get(1)).isInstanceOf(EquityQuote.class);
    assertThat(quotes.get(2).getSymbol()).isEqualTo("NOK/JPY");
    assertThat(quotes.get(2).getAssetType()).isEqualTo(AssetType.FOREX);
    assertThat(quotes.get(2)).isInstanceOf(ForexQuote.class);
    assertThat(quotes.get(3)).isInstanceOf(IndexQuote.class);
    assertThat(quotes.get(4)).isInstanceOf(OptionQuote.class);
    assertThat(quotes.get(5)).isInstanceOf(EtfQuote.class);
  }

  @Test
  public void testMutualFundQuotes() {
    List<String> mfs = Arrays.asList("VFIAX", "VTSAX");
    final List<Quote> quotes = httpTdaClient.fetchQuotes(mfs);
    assertThat(quotes.size()).isEqualTo(2);

    MutualFundQuote mfq1 = (MutualFundQuote) quotes.get(0);
    assertThat(mfq1.getAssetType()).isEqualTo(AssetType.MUTUAL_FUND);
    assertThat(mfq1.getSymbol()).isEqualTo("VFIAX");
    LOGGER.debug(mfq1.toString());

    MutualFundQuote mfq2 = (MutualFundQuote) quotes.get(1);
    assertThat(mfq2.getAssetType()).isEqualTo(AssetType.MUTUAL_FUND);
    assertThat(mfq2.getSymbol()).isEqualTo("VTSAX");
    LOGGER.debug(mfq2.toString());
  }

  @Test
  public void testIndexQuotes() {
    Quote quote = httpTdaClient.fetchQuote("$SPX.X");
    assertThat(quote instanceof IndexQuote);
    assert quote instanceof IndexQuote;
    IndexQuote indexQuote = (IndexQuote) quote;
    assertThat(indexQuote.getSymbol()).isEqualTo("$SPX.X");
    assertThat(indexQuote.getAssetType()).isEqualTo(AssetType.INDEX);
    LOGGER.debug(indexQuote.toString());
  }

  //These will eventually expire and be invalid
  @Test
  public void testOptionQuote() {
    final Quote quote = httpTdaClient.fetchQuote("MSFT_061821C120");
    assertThat(quote instanceof OptionQuote);
    assert quote instanceof OptionQuote;
    OptionQuote optionQuote = (OptionQuote) quote;
    assertThat(optionQuote.getSymbol()).isEqualTo("MSFT_061821C120");
    assertThat(optionQuote.getAssetType()).isEqualTo(AssetType.OPTION);
    LOGGER.debug(optionQuote.toString());
  }

  @Test
  public void testEtfQuote() {
    final Quote quote = httpTdaClient.fetchQuote("SPY");
    assertThat(quote instanceof EtfQuote);
    assert quote instanceof EtfQuote;
    EtfQuote etfQuote= (EtfQuote) quote;
    assertThat(etfQuote.getSymbol()).isEqualTo("SPY");
    assertThat(etfQuote.getAssetType()).isEqualTo(AssetType.ETF);
    LOGGER.debug(etfQuote.toString());
  }

  @Test
  public void testIssueQuote(){
    final List<Quote> quotes = httpTdaClient.fetchQuotes(Arrays.asList("FNDF", "FNDE"));
    assertThat(quotes).hasSize(2);
    quotes.forEach(q -> LOGGER.debug("{}", q));
  }

  @Test
  @Ignore
  //https://github.com/studerw/td-ameritrade-client/issues/24
  public void testOptionChainMarkVsTov(){
    String chain = "WYNN_080720P73.5";
    final Quote quote = httpTdaClient.fetchQuote(
        chain);
    assertThat(quote instanceof OptionQuote);
    OptionQuote optionQuote = (OptionQuote)quote;

    BigDecimal askPrice = optionQuote.getAskPrice();
    BigDecimal bidPrice = optionQuote.getBidPrice();
    LOGGER.debug("Bid: {}, Ask: {}", bidPrice, askPrice);

    LOGGER.debug("Mark: {}, theoreticalOptionValue: {}", optionQuote.getMark(),
        optionQuote.getTheoreticalOptionValue());
  }

  //We want to make sure a token is generated only once per client
  //Turn on full logging in logback-test.xml set:
  //logger  name="TDA_HTTP" level="debug"
  //logger name="com.studerw.tda.client.OauthInterceptor" level="debug"
  //
  //You will see that the call to get the first quote has a header: Authorization: Bearer UNSET
  //That triggers a 401 resposne from the server which the OAuthInterceptor detects and then makes a call for new auth token.
  //On all subsequent calls, you see that the Bearer header is now using the new auth token, and thus the
  //interceptor is never forced to create a new refresh token.
  @Test
  public void testOAuthCreatedOnlyOnce(){
    List<String> symbols = Arrays
        .asList("AAPL", "MSFT", "AMZN", "FB", "GOOGL", "GOOG", "BRK.B", "JNJ", "V", "PG");

    for (String symbol : symbols) {
      final Quote quote = httpTdaClient.fetchQuote(symbol);
      assertThat(quote).isNotNull();
      assertThat(quote.getSymbol()).isEqualTo(symbol);
      LOGGER.debug("{} - {}", quote.getSymbol(), quote.getDescription());
    }
  }
}
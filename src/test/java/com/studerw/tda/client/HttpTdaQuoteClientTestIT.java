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
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpTdaQuoteClientTestIT {
  private static final Logger LOGGER = LoggerFactory.getLogger(HttpTdaQuoteClientTestIT.class);

  static protected TdaQuoteClient client;
  static protected Properties props = null;

  @BeforeClass
  public static void beforeClass() {
    try (InputStream in = BaseTestIT.class.getClassLoader().
        getResourceAsStream("my-test.properties")) {
      props = new Properties();
      props.load(in);
    } catch (IOException e) {
      throw new IllegalStateException(
          "Could not load default properties from classpath at com.studerw.my-test.properties");
    }

    client = new HttpTdaQuoteClient(props.getProperty("tda.client_id"));

  }


  @Test
  public void testStockQuote() {
    final Quote quote = client.fetchQuote("msft");
    assertThat(quote.getAssetType()).isEqualTo(AssetType.EQUITY);
    assertThat(quote).isInstanceOf(EquityQuote.class);
    assertThat(quote.getSymbol()).isEqualToIgnoringCase("msft");
    EquityQuote equityQuote = (EquityQuote) quote;
    assertThat(equityQuote).isNotNull();
    assertThat(equityQuote.getAskPrice()).isGreaterThanOrEqualTo(BigDecimal.ONE);
  }

  @Test
  public void testStockQuotes() {
    List<String> stocks = Arrays
        .asList("VTSAX", "MSFT", "NOK/JPY", "$SPX.X", "MSFT_061821P65", "SPY");
    final List<Quote> quotes = client.fetchQuotes(stocks);
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
    final List<Quote> quotes = client.fetchQuotes(mfs);
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
    Quote quote = client.fetchQuote("$SPX.X");
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
    final Quote quote = client.fetchQuote("MSFT_061821C120");
    assertThat(quote instanceof OptionQuote);
    assert quote instanceof OptionQuote;
    OptionQuote optionQuote = (OptionQuote) quote;
    assertThat(optionQuote.getSymbol()).isEqualTo("MSFT_061821C120");
    assertThat(optionQuote.getAssetType()).isEqualTo(AssetType.OPTION);
    LOGGER.debug(optionQuote.toString());
  }

  @Test
  public void testEtfQuote() {
    final Quote quote = client.fetchQuote("SPY");
    assertThat(quote instanceof EtfQuote);
    assert quote instanceof EtfQuote;
    EtfQuote etfQuote= (EtfQuote) quote;
    assertThat(etfQuote.getSymbol()).isEqualTo("SPY");
    assertThat(etfQuote.getAssetType()).isEqualTo(AssetType.ETF);
    LOGGER.debug(etfQuote.toString());
  }

  @Test
  public void testIssueQuote(){
    final List<Quote> quotes = client.fetchQuotes(Arrays.asList("FNDF", "FNDE"));
    assertThat(quotes).hasSize(2);
    quotes.forEach(q -> LOGGER.debug("{}", q));
  }

}
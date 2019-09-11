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
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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
    IndexQuote indexQuote = (IndexQuote) quotes.get(3);
    assertThat(quotes.get(4)).isInstanceOf(OptionQuote.class);
    assertThat(quotes.get(5)).isInstanceOf(EtfQuote.class);
  }

  @Test
  public void testStockQuoteBad() {
//    final Quote quote = httpTdaClient.fetchQuote("asdfadsfaff");
//    LOGGER.debug("finish this");
//    assertThat(quote).size().isEqualTo(1);
//    EquityQuote equityQuote = (EquityQuote) quotes.get(0);
//    assertThat(equityQuote).isNotNull();
//    assertThat(equityQuote.getAssetType()).isEqualTo(AssetType.EQUITY);
//    assertThat(equityQuote.getSymbol()).isNotEqualToIgnoringCase("msft");
//    LOGGER.debug(equityQuote.toString());
  }


//  @Test
//  public void testMutualFundQuotes() {
//    List<String> mfs = Arrays.asList("VFIAX", "VTSAX");
//    final QuoteResponse response = httpTdaClient.fetchQuotes(mfs);
//    LOGGER.debug(response.toString());
//    assertThat(response.isTdaError()).isFalse();
//    assertThat(response.getResult().getQuotes().get(0).getAssetType()).isEqualTo("F");
//    assertThat(response.getResult().getQuotes().get(1).getAssetType()).isEqualTo("F");
//  }
//
//  @Test
//  public void testIndexQuotes() {
//    List<String> indexes = Arrays.asList("$inx");
//    final QuoteResponse response = httpTdaClient.fetchQuotes(indexes);
//    LOGGER.debug(response.toString());
//    assertThat(response.isTdaError()).isFalse();
//    assertThat(response.getResult().getQuotes().get(0).getAssetType()).isEqualTo("I");
//  }
//
//  //These will eventually expire and be invalid
//  @Test
//  public void testOptionQuote() {
//    List<String> options = Arrays.asList("MSFT_061821C120", "MNST_011521P45");
//    final QuoteResponse response = httpTdaClient.fetchQuotes(options);
//    LOGGER.debug(response.toString());
//    assertThat(response.isTdaError()).isFalse();
//    assertThat(response.getResult().getQuotes().get(0).getAssetType()).isEqualTo("O");
//    assertThat(response.getResult().getQuotes().get(1).getAssetType()).isEqualTo("O");
//  }
//
//  //Not sure what a valid bond ticker symbol is.
//  @Ignore
//  @Test
//  public void testBondQuote() {
//    List<String> bonds = Arrays.asList("UST10Y");
//    final QuoteResponse response = httpTdaClient.fetchQuotes(bonds);
//    LOGGER.debug(response.toString());
//    assertThat(response.isTdaError()).isFalse();
//  }
//
//  @Test
//  @Ignore
//  public void testAllQuotes() {
//    List<String> bonds = Arrays
//        .asList("XOM", "MNST_061518C60", "MNST_061518P60", "VFIAX", "VTSAX", "MSFT");
//    final QuoteResponse response = httpTdaClient.fetchQuotes(bonds);
//    LOGGER.debug(response.toString());
//    response.getResult().getQuotes().forEach(q -> {
//      LOGGER.debug(q.toString());
//    });
//    assertThat(response.isTdaError()).isFalse();
//    final Optional<Quote> first = response.getResult().getQuotes().stream()
//        .filter(t -> StringUtils.isNotBlank(t.getError())).findFirst();
//    assertThat(!first.isPresent()).isTrue();
//  }
}
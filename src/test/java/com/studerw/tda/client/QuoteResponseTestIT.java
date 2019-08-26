package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;
import com.studerw.tda.model.QuoteResponse;
import com.studerw.tda.model.QuoteResponse.Result.Quote;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class QuoteResponseTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(QuoteResponseTestIT.class);

  @Test
  public void testStockQuote() {
    List<String> stocks = Arrays.asList("msft", "xom");
    final QuoteResponse response = httpTdaClient.fetchQuotes(stocks);
    LOGGER.debug(response.toString());
    assertThat(response.isTdaError()).isFalse();
    assertThat(response.getResult().getQuotes().get(0).getAssetType()).isEqualTo("E");
    assertThat(response.getResult().getQuotes().get(1).getAssetType()).isEqualTo("E");
  }

  @Test
  public void testMutualFundQuotes() {
    List<String> mfs = Arrays.asList("VFIAX", "VTSAX");
    final QuoteResponse response = httpTdaClient.fetchQuotes(mfs);
    LOGGER.debug(response.toString());
    assertThat(response.isTdaError()).isFalse();
    assertThat(response.getResult().getQuotes().get(0).getAssetType()).isEqualTo("F");
    assertThat(response.getResult().getQuotes().get(1).getAssetType()).isEqualTo("F");
  }

  @Test
  public void testIndexQuotes() {
    List<String> indexes = Arrays.asList("$inx");
    final QuoteResponse response = httpTdaClient.fetchQuotes(indexes);
    LOGGER.debug(response.toString());
    assertThat(response.isTdaError()).isFalse();
    assertThat(response.getResult().getQuotes().get(0).getAssetType()).isEqualTo("I");
  }

  //These will eventually expire and be invalid
  @Test
  public void testOptionQuote() {
    List<String> options = Arrays.asList("MSFT_061821C120", "MNST_011521P45");
    final QuoteResponse response = httpTdaClient.fetchQuotes(options);
    LOGGER.debug(response.toString());
    assertThat(response.isTdaError()).isFalse();
    assertThat(response.getResult().getQuotes().get(0).getAssetType()).isEqualTo("O");
    assertThat(response.getResult().getQuotes().get(1).getAssetType()).isEqualTo("O");
  }

  //Not sure what a valid bond ticker symbol is.
  @Ignore
  @Test
  public void testBondQuote() {
    List<String> bonds = Arrays.asList("UST10Y");
    final QuoteResponse response = httpTdaClient.fetchQuotes(bonds);
    LOGGER.debug(response.toString());
    assertThat(response.isTdaError()).isFalse();
  }

  @Test
  @Ignore
  public void testAllQuotes() {
    List<String> bonds = Arrays
        .asList("XOM", "MNST_061518C60", "MNST_061518P60", "VFIAX", "VTSAX", "MSFT");
    final QuoteResponse response = httpTdaClient.fetchQuotes(bonds);
    LOGGER.debug(response.toString());
    response.getResult().getQuotes().forEach(q -> {
      LOGGER.debug(q.toString());
    });
    assertThat(response.isTdaError()).isFalse();
    final Optional<Quote> first = response.getResult().getQuotes().stream()
        .filter(t -> StringUtils.isNotBlank(t.getError())).findFirst();
    assertThat(!first.isPresent()).isTrue();
  }
}

package com.studerw.tda.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.studerw.tda.model.QuoteResponse;
import com.studerw.tda.model.QuoteResponse.Result.Quote;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class QuoteResponseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(QuoteResponseTestIT.class);
  static Properties props = null;
  static HttpTdaClient httpTdaClient;

  @BeforeClass
  public static void beforeClass() {
    try (InputStream in = QuoteResponseTestIT.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/client/my-test.properties")) {
      props = new Properties();
      props.load(in);
    } catch (IOException e) {
      throw new IllegalStateException(
          "Could not load default properties from com.studerw.tda.tda-api.properties in classpath");
    }

    String user = props.getProperty("user");
    byte[] pw = props.getProperty("pw").getBytes(StandardCharsets.UTF_8);
    httpTdaClient = new HttpTdaClient(user, pw);
  }


  @Test
  public void testStockQuote() {
    List<String> stocks = Arrays.asList("msft", "xom");
    final QuoteResponse response = httpTdaClient.fetchQuotesBetter(stocks);
    LOGGER.debug(response.toString());
    assertFalse("should be successful result", response.isTdaError());
    assertEquals(response.getResult().getQuotes().get(0).getAssetType(), "E");
    assertEquals(response.getResult().getQuotes().get(1).getAssetType(), "E");
  }

  @Test
  public void testMutualFundQuotes() {
    List<String> mfs = Arrays.asList("VFIAX", "VTSAX");
    final QuoteResponse response = httpTdaClient.fetchQuotesBetter(mfs);
    LOGGER.debug(response.toString());
    assertFalse("should be successful result", response.isTdaError());
    assertEquals(response.getResult().getQuotes().get(0).getAssetType(), "F");
    assertEquals(response.getResult().getQuotes().get(1).getAssetType(), "F");
  }

  @Test
  public void testIndexQuotes() {
    List<String> indexes = Arrays.asList("$inx");
    final QuoteResponse response = httpTdaClient.fetchQuotesBetter(indexes);
    LOGGER.debug(response.toString());
    assertFalse("should be successful result", response.isTdaError());
    assertEquals(response.getResult().getQuotes().get(0).getAssetType(), "I");
  }

  //These will eventually expire and be invalid
  @Test
  public void testOptionQuote() {
    List<String> options = Arrays.asList("MNST_061518C60", "MNST_061518P60");
    final QuoteResponse response = httpTdaClient.fetchQuotesBetter(options);
    LOGGER.debug(response.toString());
    assertFalse("should be successful result", response.isTdaError());
    assertEquals(response.getResult().getQuotes().get(0).getAssetType(), "O");
    assertEquals(response.getResult().getQuotes().get(1).getAssetType(), "O");
  }

  //Not sure what a valid bond ticker symbol is.
  @Ignore
  @Test
  public void testBondQuote() {
    List<String> bonds = Arrays.asList("UST10Y");
    final QuoteResponse response = httpTdaClient.fetchQuotesBetter(bonds);
    LOGGER.debug(response.toString());
    assertFalse("should be successful result", response.isTdaError());
  }

  @Test
  @Ignore
  public void testAllQuotes() {
    List<String> bonds = Arrays.asList("XOM", "MNST_061518C60", "MNST_061518P60", "VFIAX", "VTSAX", "MSFT");
    final QuoteResponse response = httpTdaClient.fetchQuotesBetter(bonds);
    LOGGER.debug(response.toString());
    response.getResult().getQuotes().forEach(q -> {
      LOGGER.debug(q.toString());
    });
    assertFalse("should be successful result", response.isTdaError());
    final Optional<Quote> first = response.getResult().getQuotes().stream()
        .filter(t -> StringUtils.isNotBlank(t.getError())).findFirst();
    assertTrue("Should have no errors", !first.isPresent());
  }

}

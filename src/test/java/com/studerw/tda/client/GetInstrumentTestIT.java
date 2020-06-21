package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import com.studerw.tda.model.instrument.FullInstrument;
import com.studerw.tda.model.instrument.Fundamental;
import com.studerw.tda.model.instrument.Instrument;
import com.studerw.tda.model.instrument.Instrument.AssetType;
import com.studerw.tda.model.instrument.Query;
import com.studerw.tda.model.instrument.Query.QueryType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GetInstrumentTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(GetInstrumentTestIT.class);

  @Test
  public void testEquityInstrument() {
    Instrument instrument = httpTdaClient.getInstrumentByCUSIP("594918104");
    assertThat(instrument.getAssetType()).isEqualTo(AssetType.EQUITY);
    assertThat(instrument.getSymbol()).isEqualToIgnoringCase("MSFT");
    LOGGER.debug("{}",instrument);

//    assertThat(quote.getAssetType()).isEqualTo(AssetType.EQUITY);
//    assertThat(quote).isInstanceOf(EquityQuote.class);
//    assertThat(quote.getSymbol()).isEqualToIgnoringCase("msft");
//    EquityQuote equityQuote = (EquityQuote) quote;
//    assertThat(equityQuote).isNotNull();
//    assertThat(equityQuote.getAskPrice()).isGreaterThanOrEqualTo(BigDecimal.ONE);
  }

//  @Test
//  public void testBondInstruments() {
//    List<String>  = Arrays.asList("70153RJT6", "33616CGC8", "06405VDP1", "06405VDP1", "61690UNX4", "7954505R2");
//    List<String> mfs = Arrays.asList("VFIAX", "VTSAX");
//    mfs.forEach(symbol -> {
//      String instrument = httpTdaClient.getInstrument(symbol);
//      LOGGER.debug(instrument);
//    });
//    assertThat(quotes).size().isEqualTo(6);
//    assertThat(quotes.get(0).getAssetType()).isEqualTo(AssetType.MUTUAL_FUND);
//    assertThat(quotes.get(0)).isInstanceOf(MutualFundQuote.class);
//    assertThat(quotes.get(1).getAssetType()).isEqualTo(AssetType.EQUITY);
//    assertThat(quotes.get(1)).isInstanceOf(EquityQuote.class);
//    assertThat(quotes.get(2).getSymbol()).isEqualTo("NOK/JPY");
//    assertThat(quotes.get(2).getAssetType()).isEqualTo(AssetType.FOREX);
//    assertThat(quotes.get(2)).isInstanceOf(ForexQuote.class);
//    assertThat(quotes.get(3)).isInstanceOf(IndexQuote.class);
//    IndexQuote indexQuote = (IndexQuote) quotes.get(3);
//    assertThat(quotes.get(4)).isInstanceOf(OptionQuote.class);
//    assertThat(quotes.get(5)).isInstanceOf(EtfQuote.class);
//  }

  @Test
  public void testMutualFundInstruments() {
    List<String> mfs = Arrays.asList("922908728", "922908728");
    mfs.forEach(symbol -> {
      Instrument instrument = httpTdaClient.getInstrumentByCUSIP(symbol);
      assertThat(instrument.getBondPrice()).isNull();
      assertThat(instrument.getAssetType()).isEqualTo(AssetType.MUTUAL_FUND);
      LOGGER.debug("{}",instrument);
    });
  }

  @Test
  public void testBondCusips() {
    List<String> cusips =  Arrays.asList("06747PQK8", "88241THD5", "38149MUF8", "29260MBF1");
    cusips.forEach(cusip -> {
      Instrument instrument = httpTdaClient.getBond(cusip);
      assertThat(instrument.getAssetType()).isEqualTo(AssetType.BOND);
      assertThat(instrument.getBondPrice()).isNotNull();
      LOGGER.debug("{}",instrument);
    });
  }

  @Test
  @Ignore
  public void testUnknownCusips() {
    List<String> mfs = Collections.singletonList("EUR/SEK");
    mfs.forEach(symbol -> {
      Instrument instrument = httpTdaClient.getInstrumentByCUSIP(symbol);
      LOGGER.debug("{}",instrument);
    });
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBadQuery(){
    httpTdaClient.queryInstruments(new Query(null, null));
    fail("Should not have got here");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBadQuery2(){
    httpTdaClient.queryInstruments(new Query("", QueryType.SYMBOL_REGEX));
    fail("Should not have got here");
  }

  @Test(expected = IllegalArgumentException.class)
  public void testBadQuery3(){
    httpTdaClient.queryInstruments(new Query("foo", null));
    fail("Should not have got here");
  }

  @Test
  public void testFundamentalData() {

    final FullInstrument instrument = httpTdaClient.getFundamentalData("msft");
    assertThat(instrument.getAssetType()).isEqualTo(AssetType.EQUITY);
    assertThat(instrument.getSymbol()).isEqualTo("MSFT");
    assertThat(instrument.getExchange()).isEqualTo("NASDAQ");
    Fundamental fundamental = instrument.getFundamental();
    assertThat(fundamental).isNotNull();
    assertThat(fundamental.getMarketCapFloat()).isGreaterThan(new BigDecimal("1"));
    assertThat(fundamental.getDividendDate()).isNotEmpty();
    LOGGER.debug(instrument.toString());
  }

  @Test
  public void testFundamentalData2(){
    final FullInstrument instrument = httpTdaClient.getFundamentalData("594918104");
    assertThat(instrument.getAssetType()).isEqualTo(AssetType.EQUITY);
    assertThat(instrument.getCusip()).isEqualTo("594918104");
    Fundamental fundamental = instrument.getFundamental();
    assertThat(fundamental).isNotNull();
    LOGGER.debug(instrument.toString());
  }

  @Test
  public void testQuerySymbol(){
    Query query = new Query("msft.*", QueryType.SYMBOL_REGEX);
    final List<Instrument> instruments = httpTdaClient.queryInstruments(query);
    assertThat(instruments).size().isGreaterThan(0);
    LOGGER.debug("{}", instruments);
  }

  /**
   * This returns a [406 - Not Acceptable]
   */
  @Test(expected = RuntimeException.class)
  @Ignore
  public void testQueryAllSymbols(){
    Query query = new Query(".*", QueryType.SYMBOL_REGEX);
    final List<Instrument> instruments = httpTdaClient.queryInstruments(query);
    assertThat(instruments).size().isGreaterThan(0);
    LOGGER.debug("Size: {}", instruments.size());
    LOGGER.debug("{}", instruments);
  }

  @Test
  public void testQueryDescription(){
    Query query = new Query("Microsoft.*", QueryType.DESCRIPTION_REGEX);
    final List<Instrument> instruments = httpTdaClient.queryInstruments(query);
    assertThat(instruments).size().isGreaterThan(0);
    LOGGER.debug("Size: {}", instruments.size());
    LOGGER.debug("{}", instruments);
  }

  @Test
  public void testQueryDescription2(){
    Query query = new Query("Microsoft", QueryType.DESCRIPTION_SEARCH);
    final List<Instrument> instruments = httpTdaClient.queryInstruments(query);
    assertThat(instruments).size().isGreaterThan(0);
    LOGGER.debug("Size: {}", instruments.size());
    LOGGER.debug("{}", instruments);
  }

  @Test
  public void testQueryDescription3(){
    Query query = new Query("bank", QueryType.DESCRIPTION_SEARCH);
    final List<Instrument> instruments = httpTdaClient.queryInstruments(query);
    assertThat(instruments).size().isGreaterThan(0);
    LOGGER.debug("Size: {}", instruments.size());
    LOGGER.debug("{}", instruments);
  }
}
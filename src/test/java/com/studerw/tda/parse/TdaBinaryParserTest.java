package com.studerw.tda.parse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.studerw.tda.model.PriceHistory;
import com.studerw.tda.model.PriceHistory.ChartBar;
import com.studerw.tda.model.PriceHistory.Result;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TdaBinaryParserTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(TdaBinaryParserTest.class);
  private TdaBinaryParser parser = new TdaBinaryParser();

  @Test
  public void testPriceHistory() throws Exception {
    try (InputStream in = TdaBinaryParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/price_history-T.dat")) {
      byte[] bytes = IOUtils.toByteArray(in);
      PriceHistory priceHistory = parser.parsePriceHistory(bytes);
      assertNotNull("priceHistory not null", priceHistory);
      List<Result> results = priceHistory.getResults();
      assertTrue("should have only 1 result", results.size() == 1);
      Result att = results.get(0);
      assertEquals("Should have symbol T", att.getSymbol(), "T");
      LOGGER.debug("Count of chart bars: {}", att.getChartBars().size());
      assertEquals("Should have 52 chartbars", att.getChartBars().size(), 52);
      ChartBar cb1 = att.getChartBars().get(0);
      assertEquals(cb1.getClose(), new BigDecimal("38.50"));
//      assertEquals("result should be ok", qr.getResultStr(), "OK");
//      assertFalse("Should be tdaError", qr.isTdaError());
//      assertTrue("should have list of 7", qr.getResult().getQuotes().size() == 7);
//      qr.getResult().getQuotes().stream().forEach(q -> {
//        assertFalse("should not be empty", StringUtils.isBlank(q.getSymbol()));
//        LOGGER.debug("{} -> {}", q.getSymbol(), q.getAssetType());
//      });
    }
  }

  @Test
  public void testPriceHistory2() throws Exception {
    try (InputStream in = TdaBinaryParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/price_history-T2.dat")) {
      byte[] bytes = IOUtils.toByteArray(in);
      PriceHistory priceHistory = parser.parsePriceHistory(bytes);
      assertNotNull("priceHistory not null", priceHistory);
      List<Result> results = priceHistory.getResults();
      assertTrue("should have only 1 result", results.size() == 1);
      Result att = results.get(0);
      assertEquals("Should have symbol T", att.getSymbol(), "T");
      LOGGER.debug("Count of chart bars: {}", att.getChartBars().size());
//      assertEquals("Should have 52 chartbars", att.getChartBars().size(), 52);
//      assertEquals(att.getChartBars().get(0).getClose(), new BigDecimal("38.50"));
//      assertEquals("result should be ok", qr.getResultStr(), "OK");
//      assertFalse("Should be tdaError", qr.isTdaError());
//      assertTrue("should have list of 7", qr.getResult().getQuotes().size() == 7);
      att.getChartBars().stream().forEach(cb -> {
        assertFalse("should not be null", cb.getClose() == null);
        LOGGER.debug("{}", cb.toString());
      });
    }
  }

//  @Test
//  public void testPriceHistoryError() throws Exception {
//    try (InputStream in = TdaBinaryParserTest.class.getClassLoader().
//        getResourceAsStream("com/studerw/tda/model/price_history_error.dat")) {
//      PriceHistory priceHistory = parser.parsePriceHistory(IOUtils.toByteArray(in));
//      assertTrue("Should be error", priceHistory.isError());
//      LOGGER.debug("Error: {}", priceHistory.getErrorMsg());
//      assertFalse("Not empty", StringUtils.isBlank(priceHistory.getErrorMsg()));
//      assertNotNull("Result should be null", priceHistory.getResults());
//    }
//  }


}

package com.studerw.tda.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.studerw.tda.model.PriceHistory;
import com.studerw.tda.model.PriceHistory.Result;
import com.studerw.tda.model.history.IntervalType;
import com.studerw.tda.model.history.PeriodType;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PriceHistoryTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(PriceHistoryTestIT.class);

  @Test
  public void testPriceHistory() throws Exception {
    PriceHistory priceHistory = httpTdaClient
        .priceHistory(Arrays.asList("MSFT"), IntervalType.DAILY, 1, PeriodType.MONTH, 1, null,
            null, false);
    assertNotNull("priceHistory not null", priceHistory);
    List<Result> results = priceHistory.getResults();
    assertTrue("should have only 1 result", results.size() == 1);
    Result result = results.get(0);
    LOGGER.debug("Count of chart bars: {}", result.getChartBars().size());
    assertEquals("Should have symbol MSFT", result.getSymbol(), "MSFT");
    result.getChartBars().stream().forEach(cb -> {
      assertFalse("should not be null", cb.getClose() == null);
      LOGGER.debug("{}", cb.toString());
    });
  }


  @Test
  public void testPriceHistoryError() {
    List<String> symbols = Arrays.asList("");
    PriceHistory priceHistory = httpTdaClient.priceHistory(symbols, IntervalType.WEEKLY, 1,
        PeriodType.YEAR, 1, null, null, false);
    assertTrue("Should be error", priceHistory.isError());
    LOGGER.debug("Error: {}", priceHistory.getErrorMsg());
    assertFalse("Not empty", StringUtils.isBlank(priceHistory.getErrorMsg()));
    assertTrue("Result should be null", priceHistory.getResults() == null);
  }

  @Test
  @Ignore
  public void getPriceHistoryData() throws IOException {
    List<String> symbols = Arrays.asList("T");
    byte[] bytes = httpTdaClient
        .priceHistoryBytes(symbols, IntervalType.MINUTE, 30, PeriodType.DAY, 1, null, null, false);
    LOGGER.debug("Length: {}", bytes.length);
    File tempFile = File.createTempFile("price-history", ".dat");
    FileUtils.writeByteArrayToFile(tempFile, bytes);
    LOGGER.debug("Wrote: {} bytes to file: {}", bytes.length, tempFile.getAbsolutePath());
  }

}
package com.studerw.tda.client;

import com.studerw.tda.model.markethours.Hours;
import com.studerw.tda.model.markethours.Hours.MarketType;
import com.studerw.tda.parse.Utils;
import java.util.Arrays;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class MarketHoursTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(MarketHoursTestIT.class);

  @Test(expected = Exception.class)
  public void testHoursNullMarketType() {
    httpTdaClient.getMarketHours(null);
//    fail("shouldn't get here");
  }

  @Test(expected = Exception.class)
  public void testHoursNoMarketType() {
    httpTdaClient.getMarketHours(new ArrayList<>());
    fail("shouldn't get here");
  }

  @Test(expected = Exception.class)
  public void testMarketHoursInvalidDate() {
    List<Hours.MarketType> marketType = new ArrayList<>(Collections.singleton(Hours.MarketType.EQUITY));
    LocalDateTime ldt = LocalDateTime.now().minusDays(1);

    final List<Hours> hours = httpTdaClient.getMarketHours(marketType, ldt);
    fail("shouldn't get here");
  }

  @Test
  public void testMarketHoursEquity() {
    List<Hours.MarketType> marketType = new ArrayList<>(Collections.singleton(Hours.MarketType.EQUITY));

    final List<Hours> hours = httpTdaClient.getMarketHours(marketType);
    assertThat(hours).isNotNull();
    LOGGER.debug(hours.toString());
    if (!Utils.isNullOrEmpty(hours.get(0).getOtherFields())) {
      LOGGER.warn("some files weren't mapped: {}", hours.get(0).getOtherFields());
    }
  }

  @Test
  public void testMarketHoursDate() {
    List<Hours.MarketType> marketType = new ArrayList<>(Collections.singleton(Hours.MarketType.EQUITY));
    LocalDateTime ldt = LocalDateTime.now().plusDays(1);

    final List<Hours> hours = httpTdaClient.getMarketHours(marketType, ldt);
    assertThat(hours).isNotNull();
    LOGGER.debug(hours.toString());
    if (!Utils.isNullOrEmpty(hours.get(0).getOtherFields())) {
      LOGGER.warn("some files weren't mapped: {}", hours.get(0).getOtherFields());
    }
  }

  @Test
  public void testMarketHoursMulti() {
    List<Hours.MarketType> marketTypes = Arrays.asList(MarketType.EQUITY, MarketType.BOND, MarketType.ETF);
    LocalDateTime ldt = LocalDateTime.now().plusDays(1);

    final List<Hours> hours = httpTdaClient.getMarketHours(marketTypes, ldt);
    assertThat(hours).isNotNull();
    LOGGER.debug(hours.toString());
    if (!Utils.isNullOrEmpty(hours.get(0).getOtherFields())) {
      LOGGER.warn("some files weren't mapped: {}", hours.get(0).getOtherFields());
    }
  }
}

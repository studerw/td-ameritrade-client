package com.studerw.tda.model.history;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.history.PriceHistReq.Builder;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Validates a {@link PriceHistReq} using TDA's documented rules.
 */
public class PriceHistReqValidatorTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(PriceHistReqValidatorTest.class);

  @Test
  public void testDefault() {
    PriceHistReq request = Builder.priceHistReq().withSymbol("MSFT").build();
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(0);
  }

  @Test
  public void testEmptySymbol() {
    PriceHistReq request = Builder.priceHistReq().build();
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));
  }

  @Test
  public void testDatesAndPeriod() {
    Instant start = Instant.parse("2018-01-01T13:00:00.00Z");
    Instant end = Instant.now();
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withStartDate(start.toEpochMilli())
        .withEndDate(end.toEpochMilli())
        .withPeriod(1)
        .build();
    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));
  }

  @Test
  public void testJustPeriodType() {
    for (PeriodType periodType : PeriodType.values()) {
      PriceHistReq request = Builder.priceHistReq()
          .withSymbol("MSFT")
          .withPeriodType(periodType)
          .build();
      LOGGER.debug("Request: {}", request.toString());
      List<String> violations = PriceHistReqValidator.validate(request);
      assertThat(violations.size()).isEqualTo(0);
    }
  }

  @Test
  public void testValidPeriodTypeDay() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 10);
    for (Integer i : integers) {
      PriceHistReq request = Builder.priceHistReq()
          .withSymbol("MSFT")
          .withPeriodType(PeriodType.day)
          .withPeriod(i)
          .build();
      LOGGER.debug("Request: {}", request.toString());
      List<String> violations = PriceHistReqValidator.validate(request);
      assertThat(violations.size()).isEqualTo(0);
    }
  }

  @Test
  public void testValidPeriodTypeMonth() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 6);
    for (Integer i : integers) {
      PriceHistReq request = Builder.priceHistReq()
          .withSymbol("MSFT")
          .withPeriodType(PeriodType.month)
          .withPeriod(i)
          .build();
      LOGGER.debug("Request: {}", request.toString());
      List<String> violations = PriceHistReqValidator.validate(request);
      assertThat(violations.size()).isEqualTo(0);
    }
  }

  @Test
  public void testValidPeriodTypeYear() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 5, 10, 15, 20);
    for (Integer i : integers) {
      PriceHistReq request = Builder.priceHistReq()
          .withSymbol("MSFT")
          .withPeriodType(PeriodType.year)
          .withPeriod(i)
          .build();
      LOGGER.debug("Request: {}", request.toString());
      List<String> violations = PriceHistReqValidator.validate(request);
      assertThat(violations.size()).isEqualTo(0);
    }
  }

  @Test
  public void testValidPeriodTypeYtd() {
    List<Integer> integers = Collections.singletonList(1);
    for (Integer i : integers) {
      PriceHistReq request = Builder.priceHistReq()
          .withSymbol("MSFT")
          .withPeriodType(PeriodType.ytd)
          .withPeriod(i)
          .build();
      LOGGER.debug("Request: {}", request.toString());
      List<String> violations = PriceHistReqValidator.validate(request);
      assertThat(violations.size()).isEqualTo(0);
    }
  }

  @Test
  public void testBadPeriodTypeDay() {
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withPeriodType(PeriodType.day)
        .withPeriod(7)
        .build();
    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadPeriodTypeMonth() {
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withPeriodType(PeriodType.month)
        .withPeriod(4)
        .build();
    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadPeriodTypeYear() {
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withPeriodType(PeriodType.year)
        .withPeriod(4)
        .build();
    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadPeriodTypeYtd() {
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withPeriodType(PeriodType.ytd)
        .withPeriod(2)
        .build();
    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.toString());
  }


  @Test
  public void testValidPeriodTypeYTD() {
    List<Integer> integers = Collections.singletonList(1);
    for (Integer i : integers) {
      PriceHistReq request = Builder.priceHistReq()
          .withSymbol("MSFT")
          .withPeriodType(PeriodType.ytd)
          .withPeriod(i)
          .build();
      LOGGER.debug("Request: {}", request.toString());
      List<String> violations = PriceHistReqValidator.validate(request);
      assertThat(violations.size()).isEqualTo(0);
    }
  }

  @Test
  //defaults to periodType == day
  public void testJustFrequency() {
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withFrequencyType(FrequencyType.minute)
        .build();
    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(0);
  }

  @Test
  //defaults to periodType == day
  public void testBadJustFrequency() {
    for (FrequencyType ft : Arrays
        .asList(FrequencyType.daily, FrequencyType.monthly, FrequencyType.weekly)) {
      PriceHistReq request = Builder.priceHistReq()
          .withSymbol("MSFT")
          .withFrequencyType(ft)
          .build();
      LOGGER.debug("Request: {}", request.toString());
      List<String> violations = PriceHistReqValidator.validate(request);
      assertThat(violations.size()).isEqualTo(1);
    }
  }

  @Test
  public void testGoodFreqMinuteAndPeriodNull(){
    PeriodType pt = null; //default to day
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withFrequencyType(FrequencyType.minute)
        .build();
    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(0);
  }

  @Test
  public void testGoodFreqMinuteAndPeriodDay(){
    PeriodType pt = PeriodType.day;
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withFrequencyType(FrequencyType.minute)
        .build();
    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(0);
  }

  @Test
  public void testBadFrequencyAndPeriod() {
    for (PeriodType pt : PeriodType.values()) {
      for (FrequencyType ft : FrequencyType.values()) {
        PriceHistReq request = Builder.priceHistReq()
            .withSymbol("MSFT")
            .withFrequencyType(ft)
            .withPeriodType(pt)
            .build();
        List<String> violations = PriceHistReqValidator.validate(request);
        if (pt == PeriodType.day && ft != FrequencyType.minute) {
          assertThat(violations.size()).isEqualTo(1);
        } else if (pt == PeriodType.month && !Arrays
            .asList(FrequencyType.daily, FrequencyType.weekly)
            .contains(ft)) {
          assertThat(violations.size()).isEqualTo(1);
        } else if (pt == PeriodType.year && !Arrays
            .asList(FrequencyType.daily, FrequencyType.weekly, FrequencyType.monthly)
            .contains(ft)) {
          assertThat(violations.size()).isEqualTo(1);
        } else if (pt == PeriodType.ytd && !Arrays.asList(FrequencyType.daily, FrequencyType.weekly)
            .contains(ft)) {
          assertThat(violations.size()).isEqualTo(1);
        }
      }
    }
  }


  @Test
  public void tetEndBeforeStart() {
    for (FrequencyType ft : FrequencyType.values()) {
      PriceHistReq request = Builder.priceHistReq()
          .withSymbol("MSFT")
          .withStartDate(5L)
          .withEndDate(4L)
          .build();
      LOGGER.debug("Request: {}", request.toString());
      List<String> violations = PriceHistReqValidator.validate(request);
      assertThat(violations.size()).isEqualTo(1);
    }
  }

  @Test
  public void testGoodRequest(){
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withPeriodType(PeriodType.day)
        .withPeriod(2)
        .withFrequencyType(FrequencyType.minute)
        .withFrequency(1)
        .build();

    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(0);
  }

  @Test
  public void testBadRequest(){
    PriceHistReq request = Builder.priceHistReq()
        .withSymbol("MSFT")
        .withPeriodType(PeriodType.day)
        .withPeriod(2)
        .withFrequencyType(FrequencyType.minute)
        .withFrequency(1)
        .withStartDate(System.currentTimeMillis() -  604800000L) //one week
        .withEndDate(System.currentTimeMillis())
        .build();

    LOGGER.debug("Request: {}", request.toString());
    List<String> violations = PriceHistReqValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
  }


}



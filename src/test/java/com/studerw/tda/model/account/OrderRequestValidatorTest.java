package com.studerw.tda.model.account;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.ZonedDateTime;
import java.util.List;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Validates a {@link OrderRequest} using TDA's documented rules.
 */
public class OrderRequestValidatorTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(OrderRequestValidatorTest.class);

  @Test
  public void testDefault() {
    OrderRequest request = new OrderRequest();
    List<String> violations = OrderRequestValidator.validate(request);
    assertThat(violations.size()).isEqualTo(0);
  }

  @Test
  public void testEmptyToDate() {
    OrderRequest orderRequest  = new OrderRequest();
    orderRequest.setFromEnteredTime(ZonedDateTime.now());
    List<String> violations = OrderRequestValidator.validate(orderRequest);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));
  }

  @Test
  public void testEmptyFromDate() {
    OrderRequest orderRequest  = new OrderRequest();
    orderRequest.setToEnteredTime(ZonedDateTime.now());
    List<String> violations = OrderRequestValidator.validate(orderRequest);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));
  }

  @Test
  public void testFromAfterTo() {
    ZonedDateTime now = ZonedDateTime.now();
    ZonedDateTime yesterday = ZonedDateTime.now().minusDays(1);
    OrderRequest orderRequest  = new OrderRequest(now, yesterday);
    List<String> violations = OrderRequestValidator.validate(orderRequest);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));
  }

  @Test
  public void testWithin60Days() {
    ZonedDateTime now = ZonedDateTime.now();
    ZonedDateTime fiftyDays = ZonedDateTime.now().plusDays(50);
    OrderRequest orderRequest  = new OrderRequest(now, fiftyDays);
    List<String> violations = OrderRequestValidator.validate(orderRequest);
    assertThat(violations.size()).isEqualTo(0);
  }

  @Test
  public void testAfter60Days() {
    ZonedDateTime sixtyDays = ZonedDateTime.now().plusDays(61);
    ZonedDateTime ninetyDays = ZonedDateTime.now().plusDays(90);
    OrderRequest orderRequest  = new OrderRequest(sixtyDays, ninetyDays);
    List<String> violations = OrderRequestValidator.validate(orderRequest);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));

  }

}



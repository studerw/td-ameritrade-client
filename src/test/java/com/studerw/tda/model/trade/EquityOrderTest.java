package com.studerw.tda.model.trade;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.trade.EquityOrder.EquityOrderBldr;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EquityOrderTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(EquityOrderTest.class);
  private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  private Validator validator = null;

  @Before
  public void before() {
    this.validator = factory.getValidator();
  }

  @Test
  public void testBasicConstraints() {
    EquityOrder equityOrder = EquityOrderBldr.anEquityOrder().build();
    Set<ConstraintViolation<EquityOrder>> violations = validator.validate(equityOrder);
    assertThat(violations).isNotEmpty();
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testMissingAction() {
    EquityOrder equityOrder = this.validEquityOrder();
    equityOrder.setAction(null);
    Set<ConstraintViolation<EquityOrder>> violations = validator.validate(equityOrder);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testInvalidDisplaySize() {
    EquityOrder equityOrder = this.validEquityOrder();
    equityOrder.setDisplaySize(5);
    Set<ConstraintViolation<EquityOrder>> violations = validator.validate(equityOrder);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testEmptyExpire() {
    EquityOrder equityOrder = this.validEquityOrder();
    equityOrder.setExpire(null);
    Set<ConstraintViolation<EquityOrder>> violations = validator.validate(equityOrder);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadQuantity() {
    EquityOrder equityOrder = this.validEquityOrder();
    equityOrder.setQuantity(-1);
    Set<ConstraintViolation<EquityOrder>> violations = validator.validate(equityOrder);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadOrderType() {
    EquityOrder equityOrder = this.validEquityOrder();
    equityOrder.setOrderType(null);
    Set<ConstraintViolation<EquityOrder>> violations = validator.validate(equityOrder);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testValidEquityOrder() {
    EquityOrder equityOrder = this.validEquityOrder();
    Set<ConstraintViolation<EquityOrder>> violations = validator.validate(equityOrder);
    assertThat(violations).isEmpty();
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testQueryParams() {
    EquityOrder equityOrder = this.validEquityOrder();
    Set<ConstraintViolation<EquityOrder>> violations = validator.validate(equityOrder);
    assertThat(violations).isEmpty();
    String queryStr = equityOrder.toQueryString("orderstring");
    assertThat(queryStr).isNotBlank();
    LOGGER.debug(queryStr);

  }

  private EquityOrder validEquityOrder() {
    EquityOrder equityOrder = EquityOrderBldr.anEquityOrder().
        withAction(EquityAction.buy).
        withDisplaySize(100).
        withExpire(Expire.am).
        withExpireDay(30).
        withExpireMonth(10).
        withExpireYear(24).
        withOrderType(OrderType.market).
        withQuantity(1).
        withAccountId("1234").
        withSymbol("MSFT")
        .build();

    return equityOrder;
  }
}

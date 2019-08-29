package com.studerw.tda.model.trade;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.trade.OptionOrder.OptionOrderBldr;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OptionOrderTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(OptionOrderTest.class);
  private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  private Validator validator = null;

  @Before
  public void before() {
    this.validator = factory.getValidator();
  }

  @Test
  public void testBasicConstraints() {
    OptionOrder optionOrder = OptionOrderBldr.anOptionOrder().build();
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations).isNotEmpty();
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testMissingAction() {
    OptionOrder optionOrder = this.validOptionOrder();
    optionOrder.setOptionAction(null);
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations.size()).isEqualTo(1);
    assertThat(violations.toString()).contains("propertyPath=optionAction");
    LOGGER.debug(violations.toString());
  }


  @Test
  public void testEmptyExpire() {
    OptionOrder optionOrder = this.validOptionOrder();
    optionOrder.setExpire(null);
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations.size()).isEqualTo(1);
    assertThat(violations.toString()).contains("propertyPath=expire");
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadQuantity() {
    OptionOrder optionOrder = this.validOptionOrder();
    optionOrder.setQuantity(-1);
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations.size()).isEqualTo(1);
    assertThat(violations.toString()).contains("propertyPath=quantity");
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadOrderType() {
    OptionOrder optionOrder = this.validOptionOrder();
    optionOrder.setOrderType(null);
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations.size()).isEqualTo(1);
    assertThat(violations.toString()).contains("propertyPath=orderType");
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testValidOptionOrder() {
    OptionOrder optionOrder = this.validOptionOrder();
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations).isEmpty();
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadExpireDay() {
    OptionOrder optionOrder = this.validOptionOrder();
    optionOrder.setExpireDay("023");
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations.size()).isEqualTo(1);
    assertThat(violations.toString()).contains("propertyPath=expireDay");
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadExpireMonth() {
    OptionOrder optionOrder = this.validOptionOrder();
    optionOrder.setExpireMonth("011");
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations.size()).isEqualTo(1);
    assertThat(violations.toString()).contains("propertyPath=expireMonth");
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testBadExpireYear() {
    OptionOrder optionOrder = this.validOptionOrder();
    optionOrder.setExpireYear("011");
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations.size()).isEqualTo(1);
    assertThat(violations.toString()).contains("propertyPath=expireYear");
    LOGGER.debug(violations.toString());
  }

  @Test
  public void testQueryParams() {
    OptionOrder optionOrder = this.validOptionOrder();
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    assertThat(violations).isEmpty();
    String queryStr = optionOrder.toQueryString("orderstring");
    assertThat(queryStr).isNotBlank();
    LOGGER.debug(queryStr);
  }

  private OptionOrder validOptionOrder() {
    OptionOrder optionOrder = OptionOrderBldr.anOptionOrder().
        withAction(OptionAction.buytoopen).
        withExpire(OptionExpire.gtc).
        withExpireDay("30").
        withExpireMonth("10").
        withExpireYear("20").
        withOrderType(OrderType.market).
        withQuantity(1).
        withAccountId("1234").
        withSymbol("MSFT_061821C120")
        .build();

    return optionOrder;
  }
}

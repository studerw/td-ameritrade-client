package com.studerw.tda.model.trade;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class OptionOrderValidator {

  private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

  /**
   *
   * @param optionOrder to be validated based on the annotations and TDA specified constraints
   * @return set of {@link ConstraintViolation} with messages describing each individual violation.
   */
  public static Set<ConstraintViolation<OptionOrder>> validate(
      OptionOrder optionOrder) {
    Validator validator = factory.getValidator();
    Set<ConstraintViolation<OptionOrder>> violations = validator.validate(optionOrder);
    if (violations.size() > 0) {
      return violations;
    }
//    violations = checkDocViolations(equityOrder);
    return Collections.emptySet();
  }

//  private Set<ConstraintViolation<EquityOrder>> checkDocViolations(EquityOrder order) {
//    Set<ConstraintViolation<EquityOrder>> violations = new HashSet<>();
//    if (order.getOrderType() == OrderType.market){
//      if (!(order.getExpire() == Expire.day) || (order.getExpire() == Expire.moc)){
//        new ConstraintViolation<EquityOrder>()
//      }
//    }
//    return violations;
//  }
}

package com.studerw.tda.model.trade;

import com.studerw.tda.model.trade.EquityOrder;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class EquityOrderValidator  {

  private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

  /**
   *
   * @param equityOrder to be validated based on the annotations and TDA specified constraints
   * @return set of {@link ConstraintViolation} with messages describing each individual violation.
   */
  public static Set<ConstraintViolation<EquityOrder>> validate(EquityOrder equityOrder) {
    Validator validator = factory.getValidator();
    Set<ConstraintViolation<EquityOrder>> violations = validator.validate(equityOrder);
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

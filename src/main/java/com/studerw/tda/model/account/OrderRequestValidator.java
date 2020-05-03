package com.studerw.tda.model.account;

import static java.util.stream.Collectors.toList;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderRequestValidator {

  private static final Logger LOGGER = LoggerFactory.getLogger(OrderRequestValidator.class);
  private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  private static final Validator validator = factory.getValidator();

  /**
   * @param orderRequest the request to validate
   * @return a list of error messages or empty list if there are none.
   */
  public static List<String> validate(OrderRequest orderRequest) {

    List<String> violations = new ArrayList<>(useJavaValidator(orderRequest));
    if (violations.size() > 0) {
      return violations;
    }

    violations.addAll(checkDates(orderRequest));
    if (violations.size() > 0) {
      return violations;
    }

    return Collections.emptyList();
  }

  /**
   * @param orderRequest the request to validate
   * @return list of string error messages or empty set if none
   */
  private static List<String> checkDates(OrderRequest orderRequest) {
    if (orderRequest.getFromEnteredTime() == null && orderRequest.getToEnteredTime() == null) {
      return Collections.EMPTY_LIST;
    }
    List<String> violations = new ArrayList<>();

    if (orderRequest.getToEnteredTime() == null && orderRequest.getFromEnteredTime() != null) {
      String msg = "Both toEnteredTime and FromEnteredTime must be set if one or the other is set";
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    if (orderRequest.getToEnteredTime() != null && orderRequest.getFromEnteredTime() == null) {
      String msg = "Both toEnteredTime and FromEnteredTime must be set if one or the other is set";
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    if (orderRequest.getFromEnteredTime().isAfter(orderRequest.getToEnteredTime())) {
      String msg = "FromEnteredTime must not be after ToEnteredTime.";
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    ZonedDateTime inSixtyDays = ZonedDateTime.now().plusDays(60);

    if (orderRequest.getFromEnteredTime().isAfter(inSixtyDays)) {
      String msg = "ToEnteredTime must be less than 60 days from now.";
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    return Collections.EMPTY_LIST;
  }

  /**
   * @param orderRequest the request to validate
   * @return list of strings of errors messages or empty list if none
   */
  private static List<String> useJavaValidator(OrderRequest orderRequest) {
    Set<ConstraintViolation<OrderRequest>> violations = validator.validate(orderRequest);
    return violations.stream().map(ConstraintViolation::getMessage).collect(toList());
  }

}
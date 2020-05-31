package com.studerw.tda.model.transaction;

import static java.util.stream.Collectors.toList;

import java.time.LocalDate;
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

public class TransactionRequestValidator {

  private static final Logger LOGGER = LoggerFactory.getLogger(TransactionRequestValidator.class);
  private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  private static final Validator validator = factory.getValidator();

  /**
   * @param transactionRequest the request to validate
   * @return a list of error messages or empty list if there are none.
   */
  public static List<String> validate(TransactionRequest transactionRequest) {

    List<String> violations = new ArrayList<>(useJavaValidator(transactionRequest));
    if (violations.size() > 0) {
      return violations;
    }

    violations.addAll(checkDates(transactionRequest));
    if (violations.size() > 0) {
      return violations;
    }

    return Collections.emptyList();
  }

  /**
   * @param request the request to validate
   * @return list of string error messages or empty set if none
   */
  private static List<String> checkDates(TransactionRequest request) {
    if (request.getStartDate() == null && request.getEndDate() == null) {
      return Collections.EMPTY_LIST;
    }
    List<String> violations = new ArrayList<>();

    if (request.getStartDate() == null && request.getEndDate() != null) {
      String msg = "Both startDate and endDate must be set if one or the other is set";
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    if (request.getEndDate() == null && request.getStartDate() != null) {
      String msg = "Both startDate and endDate must be set if one or the other is set";
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    if (request.getStartDate().isAfter(request.getEndDate())) {
      String msg = "startDate must not be after endDate.";
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    LocalDate inOneYear = request.getStartDate().plusYears(1);

    if (request.getEndDate().isAfter(inOneYear)) {
      String msg = "End date must be less than 1 year from the start date.";
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    return Collections.EMPTY_LIST;
  }

  /**
   * @param request the request to validate
   * @return list of strings of errors messages or empty list if none
   */
  private static List<String> useJavaValidator(TransactionRequest request) {
    Set<ConstraintViolation<TransactionRequest>> violations = validator.validate(request);
    return violations.stream().map(ConstraintViolation::getMessage).collect(toList());
  }

}
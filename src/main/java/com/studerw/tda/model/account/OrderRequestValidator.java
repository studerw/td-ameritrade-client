package com.studerw.tda.model.account;

import static java.util.stream.Collectors.toList;

import com.studerw.tda.model.history.FrequencyType;
import com.studerw.tda.model.history.PeriodType;
import com.studerw.tda.model.history.PriceHistReq;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Arrays;
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
    List<String> violations = new ArrayList<>();

    violations.addAll(useJavaValidator(orderRequest));
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
      String msg = String
          .format("Both toEnteredTime and FromEnteredTime must be set if one or the other is set");
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    if (orderRequest.getToEnteredTime() != null && orderRequest.getFromEnteredTime() == null) {
      String msg = String
          .format("Both toEnteredTime and FromEnteredTime must be set if one or the other is set");
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
    return violations.stream().map(v -> v.getMessage()).collect(toList());
  }

  /**
   * <p>
   * Check that period follows TDA rules:
   * </p>
   *<ul>
   *  <li>day: 1, 2, 3, 4, 5, 10*</li>
   *  <li>month: 1*, 2, 3, 6</li>
   *  <li>year - 1, 2, 3, 5 10, 15, 20</li>
   *  <li>ytd - 1</li>
   *</ul>
   * @param priceHistReq the request to validate
   * @return list of string error messages or empty set if none
   */
  private static List<String> checkPeriod(PriceHistReq priceHistReq) {

    PeriodType periodType = priceHistReq.getPeriodType();
    Integer period = priceHistReq.getPeriod();
    LOGGER.debug("checking valid periodType: {} vs period: {}", periodType, period);

    //if both null, that's okay, it will use defaults or start and end dates
    if (period == null && periodType == null) {
      return Collections.EMPTY_LIST;
    }

    //if periodType is set, but period is empty, defaults go into effect: OK
    if (periodType != null && period == null) {
      return Collections.EMPTY_LIST;
    }

    List<String> violations = new ArrayList<>();
    // default for periodType is 'day', so I suppose you can have a period with null periodType
    if (periodType == null || periodType == periodType.day) {
      List<Integer> valids = Arrays.asList(1, 2, 3, 4, 5, 10);
      if (!valids.contains(period)) {
        String msg = String
            .format("PeriodType: %s can only use the following Period values: %s", periodType,
                valids);
        LOGGER.warn(msg);
        violations.add(msg);
      }

    } else if (periodType == PeriodType.month) {
      List<Integer> valids = Arrays.asList(1, 2, 3, 6);
      if (!valids.contains(period)) {
        String msg = String
            .format("PeriodType: %s can only use the following Period values: %s", periodType,
                valids);
        LOGGER.warn(msg);
        violations.add(msg);
      }

    } else if (periodType == PeriodType.year) {
      List<Integer> valids = Arrays.asList(1, 2, 3, 5, 10, 15, 20);
      if (!valids.contains(period)) {
        String msg = String
            .format("PeriodType: %s can only use the following Period values: %s", periodType,
                valids);
        LOGGER.warn(msg);
        violations.add(msg);
      }

    } else if (periodType == PeriodType.ytd) {
      List<Integer> valids = Arrays.asList(1);
      if (!valids.contains(period)) {
        String msg = String
            .format("PeriodType: %s can only use the following Period values: %s", periodType,
                valids);
        LOGGER.warn(msg);
        violations.add(msg);
      }

    } else {
      throw new IllegalStateException("Invalid PeriodType: " + periodType.toString());
    }

    return violations;
  }


}
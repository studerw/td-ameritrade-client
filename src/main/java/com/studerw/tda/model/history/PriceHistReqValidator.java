package com.studerw.tda.model.history;

import static java.util.stream.Collectors.toList;

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

public class PriceHistReqValidator {

  private static final Logger LOGGER = LoggerFactory.getLogger(PriceHistReqValidator.class);
  private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  private static final Validator validator = factory.getValidator();

  /**
   * @param priceHistReq the request to validate
   * @return a list of error messages or empty list if there are none.
   */
  public static List<String> validate(PriceHistReq priceHistReq) {

    List<String> violations = new ArrayList<>(useJavaValidator(priceHistReq));
    if (violations.size() > 0) {
      return violations;
    }

    violations.addAll(checkDateAndPeriod(priceHistReq));
    if (violations.size() > 0) {
      return violations;
    }

    violations.addAll(checkPeriod(priceHistReq));
    if (violations.size() > 0) {
      return violations;
    }

    violations.addAll(checkFrequency(priceHistReq));
    if (violations.size() > 0) {
      return violations;
    }

    violations.addAll(checkFrequencyAndPeriod(priceHistReq));
    if (violations.size() > 0) {
      return violations;
    }

    return Collections.emptyList();
  }

  /**
   * @param priceHistReq the request to validate
   * @return list of string error messages or empty set if none
   */
  private static List<String> checkDateAndPeriod(PriceHistReq priceHistReq) {
    if (priceHistReq.getStartDate() != null &&
        priceHistReq.getEndDate() != null &&
        priceHistReq.getPeriod() != null) {
      List<String> violations = new ArrayList<>();
      String msg = "Period should not be set when both start and end dates are also set.";
      LOGGER.warn(msg);
      violations.add(msg);
      return violations;
    }

    if ((priceHistReq.getEndDate() != null && priceHistReq.getStartDate() != null)
        && (priceHistReq.getEndDate() < priceHistReq.getStartDate())) {
      List<String> violations = new ArrayList<>();
      String msg = "End date cannot be before start date";
      violations.add(msg);
      LOGGER.warn(msg);
      return violations;
    }
    return Collections.EMPTY_LIST;
  }

  /**
   * @param priceHistReq the request to validate
   * @return list of strings of errors messages or empty list if none
   */
  private static List<String> useJavaValidator(PriceHistReq priceHistReq) {
    Set<ConstraintViolation<PriceHistReq>> violations = validator.validate(priceHistReq);
    return violations.stream().map(ConstraintViolation::getMessage).collect(toList());
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
    if (periodType == null || periodType == PeriodType.day) {
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
      List<Integer> valids = Collections.singletonList(1);
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

  /**
   * Check the FrequencyType vs PeriodType
   * @param priceHistReq the request to validate
   * @return list of strings with errors or empty list if none
   */
  private static List<String> checkFrequencyAndPeriod(PriceHistReq priceHistReq) {
    PeriodType periodType = priceHistReq.getPeriodType();
    FrequencyType frequencyType = priceHistReq.getFrequencyType();
    LOGGER.debug("Checking PeriodType: {}, and FrequencyType: {}", periodType, frequencyType);
    //this is okay as frequencyType will use default
    if (periodType != null && frequencyType == null) {
      return Collections.EMPTY_LIST;
    }

    //however if periodType == null (default == day), then only minute is allowed
    if (periodType == null || periodType == PeriodType.day) {
      if (frequencyType != null && frequencyType != FrequencyType.minute) {
        String msg = String
            .format(
                "FrequencyType: %s can only use minute when PeriodType is set to null (default is 'day') or explicitly to 'day'",
                frequencyType);
        LOGGER.warn(msg);
        return Collections.singletonList(msg);
      }
    }

    if (periodType == PeriodType.month) {
      if (!Arrays.asList(FrequencyType.daily, FrequencyType.weekly).contains(frequencyType)) {
        String msg = String
            .format(
                "FrequencyType: %s can only use 'daily' or 'weekly' when PeriodType is set to 'month'",
                frequencyType);
        LOGGER.warn(msg);
        return Collections.singletonList(msg);
      }
    }

    if (periodType == PeriodType.year) {
      if (!Arrays.asList(FrequencyType.daily, FrequencyType.weekly, FrequencyType.monthly).contains(frequencyType)) {
        String msg = String
            .format(
                "FrequencyType: %s can only use 'daily', 'weekly', or 'monthly' when PeriodType is set to 'year'",
                frequencyType);
        LOGGER.warn(msg);
        return Collections.singletonList(msg);
      }
    }

    if (periodType == PeriodType.ytd) {
      if (!Arrays.asList(FrequencyType.daily, FrequencyType.weekly).contains(frequencyType)) {
        String msg = String
            .format(
                "FrequencyType: %s can only use 'daily', 'weekly', when PeriodType is set to 'ytd'",
                frequencyType);
        LOGGER.warn(msg);
        return Collections.singletonList(msg);
      }
    }

    return Collections.EMPTY_LIST;
  }

  /**
   * Check the Frequency vs FrequencyType
   * @param priceHistReq the request to validate   *
   * @return list of strings with errors or empty list if none
   */
  private static List<String> checkFrequency(PriceHistReq priceHistReq) {
//    PeriodType periodType = priceHistReq.getPeriodType();
    FrequencyType frequencyType = priceHistReq.getFrequencyType();
    Integer frequency = priceHistReq.getFrequency();

    //if they're both null, it's okay as long as dates are set or defaults are used
    if (frequencyType == null && frequency == null) {
      return Collections.EMPTY_LIST;
    }

    //if FrequencyType is not null, we can use the default frequency
    if (frequencyType != null && frequency == null) {
      return Collections.EMPTY_LIST;
    }

    List<String> violations = new ArrayList<>();
    if (frequencyType != null) {
      if (frequencyType == FrequencyType.minute) {
        List<Integer> valids = Arrays.asList(1, 5, 10, 15, 30);
        if (!valids.contains(frequency)) {
          String msg = String
              .format("FrequencyType %s can only use the following Frequency values: %s",
                  frequencyType, valids);
          LOGGER.warn(msg);
          violations.add(msg);
        }

      } else if (frequencyType == FrequencyType.daily) {
        List<Integer> valids = Collections.singletonList(1);
        if (!valids.contains(frequency)) {
          String msg = String
              .format("FrequencyType %s can only use the following Frequency values: %s",
                  frequencyType, valids);
          LOGGER.warn(msg);
          violations.add(msg);
        }

      } else if (frequencyType == FrequencyType.weekly) {
        List<Integer> valids = Collections.singletonList(1);
        if (!valids.contains(frequency)) {
          String msg = String
              .format("FrequencyType %s can only use the following Frequency values: %s",
                  frequencyType, valids);
          LOGGER.warn(msg);
          violations.add(msg);
        }

      } else if (frequencyType == FrequencyType.monthly) {
        List<Integer> valids = Collections.singletonList(1);
        if (!valids.contains(frequency)) {
          String msg = String
              .format("FrequencyType %s can only use the following Frequency values: %s",
                  frequencyType, valids);
          LOGGER.warn(msg);
          violations.add(msg);
        }
      } else {
        throw new IllegalStateException("Invalid FrequencyType: " + frequencyType.toString());
      }
      return violations;
    }
    return Collections.EMPTY_LIST;
  }
}
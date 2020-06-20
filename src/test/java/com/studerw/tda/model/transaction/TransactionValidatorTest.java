package com.studerw.tda.model.transaction;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Validates a {@link com.studerw.tda.model.transaction.TransactionRequest}
 * using TDA's documented rules.
 */
public class TransactionValidatorTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(TransactionValidatorTest.class);

  @Test
  public void testDefault() {
    TransactionRequest request = new TransactionRequest();
    List<String> violations = TransactionRequestValidator.validate(request);
    assertThat(violations.size()).isEqualTo(0);
  }

  @Test
  public void testEmptyEndDate() {
    TransactionRequest request  = new TransactionRequest();
    request.setStartDate(LocalDate.now());
    List<String> violations = TransactionRequestValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));
  }

  @Test
  public void testEmptyStartDate() {
    TransactionRequest request  = new TransactionRequest();
    request.setStartDate(LocalDate.now());
    List<String> violations = TransactionRequestValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));
  }

  @Test
  public void testFromAfterTo() {
    LocalDate now = LocalDate.now();
    LocalDate yesterday = LocalDate.now().minusDays(1);
    TransactionRequest request  = new TransactionRequest(now, yesterday);
    List<String> violations = TransactionRequestValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));
  }

  @Test
  public void testWithin360Days() {
    LocalDate now = LocalDate.now();
    LocalDate almostYear = LocalDate.now().plusDays(360);
    TransactionRequest request  = new TransactionRequest(now, almostYear);
    List<String> violations = TransactionRequestValidator.validate(request);
    assertThat(violations.size()).isEqualTo(0);
  }

  @Test
  public void testAfterOneYear() {
    LocalDate now = LocalDate.now();
    LocalDate oneYearFromNow = LocalDate.now().plusDays(367);
    TransactionRequest request  = new TransactionRequest(now, oneYearFromNow);
    List<String> violations = TransactionRequestValidator.validate(request);
    assertThat(violations.size()).isEqualTo(1);
    LOGGER.debug(violations.get(0));

  }

}



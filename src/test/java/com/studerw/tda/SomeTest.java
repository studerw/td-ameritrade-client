package com.studerw.tda;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Arrays;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Just to make sure Maven is building correctly and other random scratch tests
 */
public class SomeTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(SomeTest.class);

  @Test
  public void testUnicodeByteToStr(){
    byte[] bytes = "T".getBytes();
    assertThat(bytes.length == 1).isTrue();
    LOGGER.debug(Arrays.toString(bytes));
  }

  @Test
  public void BigDecimalTest(){
    BigDecimal b = new BigDecimal("-23.52");
    assertThat(b.longValue()).isLessThan(0);
    LOGGER.debug(b.toString());

    BigDecimal b2 = new BigDecimal("+23.52");
    assertThat(b2.longValue()).isGreaterThan(0);
    LOGGER.debug(b2.toString());

  }
}

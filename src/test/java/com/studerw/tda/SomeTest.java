package com.studerw.tda;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Just to make sure Maven is building correctly
 */
public class SomeTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(SomeTest.class);

  @Test
  public void doTest() {
    LOGGER.debug("Testing someTest...");
    assertTrue("should be true", true);
  }
}

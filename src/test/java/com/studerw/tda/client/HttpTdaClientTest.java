package com.studerw.tda.client;

import static org.assertj.core.api.Fail.fail;

import java.util.Properties;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Check the constructors
 */
public class HttpTdaClientTest {
  private static final Logger LOGGER = LoggerFactory.getLogger(HttpTdaClientTest.class);

  @Test(expected = IllegalArgumentException.class)
  public void testDefaultPropsInResources(){
    TdaClient client = new HttpTdaClient(new Properties());
    fail("should not get here");
  }

  @Test
  public void testProps(){
    Properties props = new Properties();
    props.setProperty("tda.token.refresh", "abd");
    props.setProperty("tda.client_id", "abd");
    LOGGER.debug("Set valid props, others using defaults");
    TdaClient client = new HttpTdaClient(props);
  }
}

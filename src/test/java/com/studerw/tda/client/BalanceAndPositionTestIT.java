package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.BalancesAndPositions;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BalanceAndPositionTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(BalanceAndPositionTestIT.class);

  @Test
  public void testBalanceAndPositions() {
    BalancesAndPositions response = httpTdaClient.fetchBalancesAndPositions();
    LOGGER.debug(response.toString());
    assertThat(response).isNotNull();
    assertThat(response.isTdaError()).isFalse();
  }
}


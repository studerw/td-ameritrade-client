package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.trade.CancelOrder;
import java.util.Arrays;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CancelTradeTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(CancelTradeTestIT.class);

  @Test
  // even if the orderId does not exist, it still returns OK
  public void testInvalidOrder() {
    CancelOrder cancelOrder = httpTdaClient.cancelTrade(Arrays.asList("1234242342"));
    assertThat(cancelOrder).isNotNull();
    assertThat(cancelOrder.isTdaError()).isFalse();
  }

  @Test
  //an invalid account id will cause a failure
  public void testInvalidAccount() {
    CancelOrder cancelOrder = httpTdaClient.cancelTrade("xyz", Arrays.asList("1234242342"));
    assertThat(cancelOrder).isNotNull();
    assertThat(cancelOrder.isTdaError()).isTrue();
  }


}


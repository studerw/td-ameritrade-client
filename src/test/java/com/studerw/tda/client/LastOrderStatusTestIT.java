package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.LastOrderStatus;
import com.studerw.tda.parse.PrettyXmlPrinter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LastOrderStatusTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(LastOrderStatusTestIT.class);

  @Test
  public void testLastOrderStatus() {
    LastOrderStatus lastOrderStatus = httpTdaClient.fetchLastOrderStatus();
    assertThat(lastOrderStatus).isNotNull();
    assertThat(lastOrderStatus.isTdaError()).isFalse();
    LOGGER.debug(lastOrderStatus.toString());
    LOGGER.debug(PrettyXmlPrinter.prettyFormat(lastOrderStatus.getOriginalXml()));
  }
}

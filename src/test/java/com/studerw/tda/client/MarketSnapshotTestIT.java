package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.LastOrderStatus;
import com.studerw.tda.model.MarketSnapshot;
import com.studerw.tda.parse.PrettyXmlPrinter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarketSnapshotTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(MarketSnapshotTestIT.class);

  @Test
  public void testMarketSnapshot() {
    MarketSnapshot snapshot = httpTdaClient.fetchMarketSnapshot();
    assertThat(snapshot).isNotNull();
    assertThat(snapshot.isTdaError()).isFalse();
    LOGGER.debug(PrettyXmlPrinter.prettyFormat(snapshot.getOriginalXml()));
    LOGGER.debug(snapshot.toString());
  }

  @Test
  public void testMarketOveriew() {
    MarketSnapshot snapshot = httpTdaClient.fetchMarketOverview();
    assertThat(snapshot).isNotNull();
    assertThat(snapshot.isTdaError()).isFalse();
    LOGGER.debug(snapshot.toString());
    LOGGER.debug(PrettyXmlPrinter.prettyFormat(snapshot.getOriginalXml()));
  }
}

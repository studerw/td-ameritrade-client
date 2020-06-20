package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.marketdata.Mover;
import com.studerw.tda.model.marketdata.Mover.Direction;
import com.studerw.tda.model.marketdata.MoversReq;
import com.studerw.tda.model.marketdata.MoversReq.Change;
import com.studerw.tda.model.marketdata.MoversReq.Index;
import java.util.List;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FetchMoversTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(FetchMoversTestIT.class);

  @Test
  public void testDJI() {
    MoversReq moversReq = new MoversReq(Index.DOW_JONES, Direction.up, Change.PERCENT);
    final List<Mover> movers = httpTdaClient.fetchMovers(moversReq);
    assertThat(movers).isNotNull();
    assertThat(movers.size()).isBetween(0, 10);
    movers.forEach(m -> LOGGER.debug("{}", m));
  }

  @Test
  public void testNasdaq() {
    MoversReq moversReq = new MoversReq(Index.NASDAQ, Direction.down, Change.VALUE);
    final List<Mover> movers = httpTdaClient.fetchMovers(moversReq);
    assertThat(movers).isNotNull();
    assertThat(movers.size()).isBetween(0, 10);
    movers.forEach(m -> LOGGER.debug("{}", m));
  }

  @Test
  public void testSP() {
    MoversReq moversReq = new MoversReq(Index.S_P_500, Direction.up, Change.PERCENT);
    final List<Mover> movers = httpTdaClient.fetchMovers(moversReq);
    assertThat(movers).isNotNull();
    assertThat(movers.size()).isBetween(0, 10);
    movers.forEach(m -> LOGGER.debug("{}", m));
  }

}
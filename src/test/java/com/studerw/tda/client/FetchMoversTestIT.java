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
  //TODO
  public void testDJI() {
    MoversReq moversReq = new MoversReq(Index.DOW_JONES, Direction.UP, Change.PERCENT);
    final List<Mover> movers = httpTdaClient.fetchMovers(moversReq);
    assertThat(movers).isNotNull();
    assertThat(movers.size()).isEqualTo(0);

//    assertThat(movers.size()).isEqualTo(10);
  }


}
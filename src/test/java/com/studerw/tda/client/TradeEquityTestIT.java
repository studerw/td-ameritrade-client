package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.fail;

import com.studerw.tda.model.BalancesAndPositions;
import com.studerw.tda.model.trade.Action;
import com.studerw.tda.model.trade.EquityOrder;
import com.studerw.tda.model.trade.EquityOrder.EquityOrderBldr;
import com.studerw.tda.model.trade.EquityTrade;
import javax.validation.ValidationException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.assertj.core.api.Assertions.assertThat;
public class TradeEquityTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(TradeEquityTestIT.class);

  @Test(expected = ValidationException.class)
  public void testInvalidOrder() {
    EquityOrder order = EquityOrderBldr.anEquityOrder().withAction(Action.buy).build();
    EquityTrade equityTrade = httpTdaClient.tradeEquity(order);
    fail("Should have thrown validation exceptoin");
  }
}


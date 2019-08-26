package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import com.studerw.tda.model.LastOrderStatus;
import com.studerw.tda.model.trade.EquityAction;
import com.studerw.tda.model.trade.EquityOrder;
import com.studerw.tda.model.trade.EquityOrder.EquityOrderBldr;
import com.studerw.tda.model.trade.EquityTrade;
import com.studerw.tda.model.trade.Expire;
import com.studerw.tda.model.trade.OrderType;
import com.studerw.tda.parse.PrettyXmlPrinter;
import javax.validation.ValidationException;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TradeEquityTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(TradeEquityTestIT.class);

  @Test(expected = ValidationException.class)
  public void testInvalidOrder() {
    EquityOrder order = EquityOrderBldr.anEquityOrder().withAction(EquityAction.buy).build();
    EquityTrade equityTrade = httpTdaClient.tradeEquity(order);
    fail("Should have thrown validation exception");
  }

  @Test
  @Ignore
  public void testEquityOrder(){
    EquityOrder order = EquityOrderBldr.anEquityOrder().
        withAction(EquityAction.buy).
        withOrderType(OrderType.market).
        withQuantity(1).
        withSymbol("msft").
        withExpire(Expire.day).
        withAccountId(httpTdaClient.getDefaultAcctId()).
        build();


    EquityTrade equityTrade = httpTdaClient.tradeEquity(order);
    assertThat(equityTrade).isNotNull();
    assertThat(equityTrade.isTdaError()).isFalse();
    assertThat(equityTrade.getOrderWrapper().getError()).isBlank();
    assertThat(equityTrade.getOrderWrapper().getOrder().getSecurity().getSymbol())
        .isEqualTo("MSFT");
    assertThat(equityTrade.getOrderWrapper().getOrder().getOrderId()).isNotBlank();
    LOGGER.debug(PrettyXmlPrinter.prettyFormat(equityTrade.getOriginalXml()));
  }

  @Test
  public void testLastOrder(){
    LastOrderStatus lastOrderStatus = httpTdaClient.fetchLastOrderStatus();
    assertThat(lastOrderStatus).isNotNull();
    assertThat(lastOrderStatus.isTdaError()).isFalse();
    LOGGER.debug(PrettyXmlPrinter.prettyFormat(lastOrderStatus.getOriginalXml()));
  }


}


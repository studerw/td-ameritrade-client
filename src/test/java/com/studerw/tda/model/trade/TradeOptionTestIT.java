package com.studerw.tda.model.trade;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import com.studerw.tda.client.BaseTestIT;
import com.studerw.tda.model.LastOrderStatus;
import com.studerw.tda.model.trade.OptionOrder.OptionOrderBldr;
import com.studerw.tda.parse.PrettyXmlPrinter;
import java.math.BigDecimal;
import javax.validation.ValidationException;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TradeOptionTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(TradeOptionTestIT.class);

  @Test(expected = ValidationException.class)
  public void testInvalidOrder() {
    OptionOrder order = OptionOrderBldr.
        anOptionOrder().
        withAction(OptionAction.buytoopen).
        build();
    OptionTrade optionTrade = httpTdaClient.tradeOption(order);
    fail("Should have thrown validation exception");
  }

  @Test
  @Ignore
  public void testTradeOption() {
    final String symbol = "MSFT_083019P138";
    OptionOrder order = OptionOrderBldr.anOptionOrder().
        withAction(OptionAction.buytoopen).
        withOrderType(OrderType.limit).
        withQuantity(1).
        withPrice(new BigDecimal("0.19")).
        withActPrice(null).
        withSymbol(symbol).
        withExpire(OptionExpire.gtc).
        withAccountId(httpTdaClient.getDefaultAcctId()).
        build();

    OptionTrade optionTrade = httpTdaClient.tradeOption(order);
    LOGGER.debug(PrettyXmlPrinter.prettyFormat(optionTrade.getOriginalXml()));
    assertThat(optionTrade).isNotNull();
    assertThat(optionTrade.isTdaError()).isFalse();
    assertThat(optionTrade.getOrderWrapper().getError()).isBlank();
    assertThat(optionTrade.getOrderWrapper().getOrder().getSecurity().getSymbol())
        .isEqualTo(symbol);
    assertThat(optionTrade.getOrderWrapper().getOrder().getOrderId()).isNotBlank();
  }

  @Test
  public void testLastOrder() {
    LastOrderStatus lastOrderStatus = httpTdaClient.fetchLastOrderStatus();
    assertThat(lastOrderStatus).isNotNull();
    assertThat(lastOrderStatus.isTdaError()).isFalse();
    LOGGER.debug(PrettyXmlPrinter.prettyFormat(lastOrderStatus.getOriginalXml()));
  }


}


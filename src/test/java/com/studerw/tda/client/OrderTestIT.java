package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import com.studerw.tda.model.account.Duration;
import com.studerw.tda.model.account.EquityInstrument;
import com.studerw.tda.model.account.Instrument;
import com.studerw.tda.model.account.Order;
import com.studerw.tda.model.account.OrderLegCollection;
import com.studerw.tda.model.account.OrderLegCollection.Instruction;
import com.studerw.tda.model.account.OrderRequest;
import com.studerw.tda.model.account.OrderStrategyType;
import com.studerw.tda.model.account.OrderType;
import com.studerw.tda.model.account.Session;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OrderTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(OrderTestIT.class);

  @Test(expected = IllegalArgumentException.class)
  public void testPlaceOrderNoId() {
    httpTdaClient.placeOrder(null, new Order());
    fail("shouldn't get here");
  }


  /**
   * @see <a href="https://developer.tdameritrade.com/content/place-order-samples">Place Order
   * Samples</a>
   */
  @Test
  @Ignore
  public void testPlaceSimpleOrder() {
    Order order = new Order();
    order.setOrderType(OrderType.MARKET);
    order.setSession(Session.NORMAL);
    order.setDuration(Duration.DAY);
    order.setOrderStrategyType(OrderStrategyType.SINGLE);

    OrderLegCollection olc = new OrderLegCollection();
    olc.setInstruction(Instruction.BUY);
    olc.setQuantity(new BigDecimal("15.0"));
    order.getOrderLegCollection().add(olc);

    Instrument instrument = new EquityInstrument();
    instrument.setSymbol("MSFT");
    olc.setInstrument(instrument);
    LOGGER.debug(order.toString());

    this.httpTdaClient.placeOrder(getAccountId(), order);
  }

  @Test
  public void testFetchOrders() {
    OrderRequest orderRequest = new OrderRequest();
    final List<Order> orders = this.httpTdaClient.fetchOrders(getAccountId(), orderRequest);
    assertThat(orders).isNotNull();
    orders.forEach(o -> LOGGER.debug(o.toString()));
  }

  @Test
  public void testFetchOrderByCriteria() {
    OrderRequest orderRequest = new OrderRequest(ZonedDateTime.now().minusDays(10),
        ZonedDateTime.now().plusDays(10));
    final List<Order> orders = this.httpTdaClient.fetchOrders(getAccountId(), orderRequest);
    assertThat(orders).isNotNull();
    orders.forEach(o -> LOGGER.debug(o.toString()));
  }

  @Test
  @Ignore
  public void testCancelOrder() {
    OrderRequest orderRequest = new OrderRequest();
    this.httpTdaClient.cancelOrder(getAccountId(), "99999999");
  }
}
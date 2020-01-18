package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.assertj.core.api.Assertions.registerCustomDateFormat;

import com.studerw.tda.model.account.Duration;
import com.studerw.tda.model.account.EquityInstrument;
import com.studerw.tda.model.account.Instrument;
import com.studerw.tda.model.account.Order;
import com.studerw.tda.model.account.OrderLegCollection;
import com.studerw.tda.model.account.OrderLegCollection.Instruction;
import com.studerw.tda.model.account.OrderStrategyType;
import com.studerw.tda.model.account.OrderType;
import com.studerw.tda.model.account.Session;
import com.studerw.tda.model.account.Status;
import com.studerw.tda.model.transaction.Transaction;
import com.studerw.tda.model.transaction.TransactionRequest;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FetchTransactionsTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(FetchTransactionsTestIT.class);

  @Test(expected = IllegalArgumentException.class)
  public void testTransactionNull() {
    httpTdaClient.fetchTransactions(null, new TransactionRequest());
    fail("shouldn't get here");
  }

  @Test
  public void testFetchTransactions() {
    TransactionRequest request = new TransactionRequest();
    final List<Transaction> transactions = this.httpTdaClient.fetchTransactions(getAccountId(), request);
    assertThat(transactions).isNotNull();

    for (Transaction transaction : transactions) {
      final Long transactionId = transaction.getTransactionId();
      final Transaction received = httpTdaClient
          .getTransaction(getAccountId(), transactionId);
      assertThat(received).isNotNull();
      assertThat(transactionId).isEqualTo(received.getTransactionId());
      LOGGER.debug("{}", received);
    }
  }

  @Test
  public void testFetchTransactionsByDatesAndSymbol() {
    TransactionRequest request = new TransactionRequest("F",
        LocalDate.now().minusYears(1),
        LocalDate.now());
    final List<Transaction> transactions = this.httpTdaClient.fetchTransactions(getAccountId(), request);
    assertThat(transactions).isNotEmpty();
    transactions.forEach(t -> LOGGER.debug("{}", t));
  }
//
//  @Test
//  @Ignore
//  public void testFetchAllOrders() {
//    final List<Order> originalOrders = this.httpTdaClient.fetchOrders();
//    LOGGER.debug("Initial count of orders: {}", originalOrders.size());
//
//    this.httpTdaClient.placeOrder(getAccountId(), simpleOrder());
//    final List<Order> orders = httpTdaClient.fetchOrders();
//    LOGGER.debug("new count of orders: {}", orders.size());
//    assertThat(orders.size()).isEqualTo(originalOrders.size() + 1);
//
//    final Long orderId = orders.get(0).getOrderId();
//    LOGGER.debug("OrderId: {}", orderId);
//    httpTdaClient.cancelOrder(getAccountId(), String.valueOf(orderId));
//
//    final List<Order> orders2 = httpTdaClient.fetchOrders();
//    LOGGER.debug("final count of orders: {}", orders2.size());
//    final Optional<Order> first = orders2.stream()
//        .filter(order -> order.getOrderId().equals(orderId)).findFirst();
//    assertThat(first.isPresent());
//    assertThat(first.get().getStatus()).isEqualTo(Status.CANCELED);
//  }
//
//  @Test
//  @Ignore
//  public void testCancelOrder() {
//    TransactionRequest request = new TransactionRequest();
//    this.httpTdaClient.cancelOrder(getAccountId(), "99999999");
//  }
//
//  @Test
//  public void testAllOrders() {
//    final List<Order> orders = this.httpTdaClient.fetchOrders(new TransactionRequest());
//    assertThat(orders).isNotNull();
//    LOGGER.debug("{}", orders);
//  }
//
//  @Test
//  public void testFetchSpecificOrder() {
//    final List<Order> orders = this.httpTdaClient.fetchOrders(new TransactionRequest());
//    if (orders.size() == 0) {
//      LOGGER.warn("Can't complete test because no orders at the moment");
//      return;
//    }
//    Long orderId = orders.get(0).getOrderId();
//    final Order order = httpTdaClient.fetchOrder(getAccountId(), orderId);
//    assertThat(order).isNotNull();
//    assertThat(order.getOrderId()).isEqualTo(orderId);
//    LOGGER.debug("{}", order);
//  }
//
//  @Test(expected = RuntimeException.class)
//  public void testFetchBadOrder() {
//    final Order order = this.httpTdaClient.fetchOrder(getAccountId(), -1L);
//    fail("Should have thrown RuntimeException");
//
//  }
//
//  private Order simpleOrder() {
//    Order order = new Order();
//    order.setOrderType(OrderType.MARKET);
//    order.setSession(Session.NORMAL);
//    order.setDuration(Duration.DAY);
//    order.setOrderStrategyType(OrderStrategyType.SINGLE);
//
//    OrderLegCollection olc = new OrderLegCollection();
//    olc.setInstruction(Instruction.BUY);
//    olc.setQuantity(new BigDecimal("15.0"));
//    order.getOrderLegCollection().add(olc);
//
//    Instrument instrument = new EquityInstrument();
//    instrument.setSymbol("MSFT");
//    olc.setInstrument(instrument);
//    LOGGER.debug(order.toString());
//    return order;
//  }
}
package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import com.studerw.tda.model.transaction.Transaction;
import com.studerw.tda.model.transaction.TransactionRequest;
import java.time.LocalDate;
import java.util.List;
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
    LOGGER.debug("{}", transactions);
  }


  @Test
  @Ignore
  public void testFetchTransactionsByDatesAndSymbol() {
    TransactionRequest request = new TransactionRequest("F",
        LocalDate.now().minusYears(1),
        LocalDate.now());
    final List<Transaction> transactions = this.httpTdaClient.fetchTransactions(getAccountId(), request);
    assertThat(transactions).isNotEmpty();
    transactions.forEach(t -> LOGGER.debug("{}", t));
  }
}
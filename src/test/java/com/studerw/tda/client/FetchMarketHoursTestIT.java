package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import com.studerw.tda.model.marketdata.Hours;
import com.studerw.tda.model.marketdata.MarketHoursReq;
import com.studerw.tda.model.marketdata.MarketHoursReq.DateType;
import com.studerw.tda.model.marketdata.MarketHoursReq.MarketType;
import com.studerw.tda.model.transaction.Transaction;
import com.studerw.tda.model.transaction.TransactionRequest;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FetchMarketHoursTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(FetchMarketHoursTestIT.class);

//  @Test(expected = IllegalArgumentException.class)
//  public void testTransactionNull() {
//    httpTdaClient.fetchMarketHours(null, new TransactionRequest());
//    fail("shouldn't get here");
//  }

  @Test
  public void testFetchMarketHours() {
    MarketHoursReq marketHoursReq = new MarketHoursReq(Arrays.asList(MarketType.values()));
    final Hours hours = this.httpTdaClient.fetchMarketHours(marketHoursReq);
    assertThat(hours).isNotNull();
    LOGGER.debug("{}", hours);

    MarketHoursReq marketHoursReq2 = new MarketHoursReq(Arrays.asList(MarketType.values()), DateType.FULL);
    final Hours hours2 = this.httpTdaClient.fetchMarketHours(marketHoursReq2);
    assertThat(hours2).isNotNull();
    LOGGER.debug("{}", hours2);
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
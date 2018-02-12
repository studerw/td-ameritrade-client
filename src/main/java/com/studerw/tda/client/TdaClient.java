package com.studerw.tda.client;

import com.studerw.tda.model.Balances;
import com.studerw.tda.model.OptionChain;
import com.studerw.tda.model.OrderStatus;
import com.studerw.tda.model.QuoteResponse;

/**
 * This is thread safe. But only one client should be instantiated for each account.
 */
public interface TdaClient  {

    QuoteResponse fetchQuote(String symbol);
    Balances fetchBalancesAndPositions(String accountId);

    boolean cancelOptionOrder(String orderId);

    OrderStatus fetchOrderStatus(String... orderIds);

    OrderStatus fetchAllOrderStatuses();

    OptionChain fetchOptionChain(String symbol);
}

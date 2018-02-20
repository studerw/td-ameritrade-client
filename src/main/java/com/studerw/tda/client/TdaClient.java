package com.studerw.tda.client;

import com.studerw.tda.model.*;

/**
 * This is a thread safe class. But only one client should be instantiated for each account.
 */
public interface TdaClient  {

    /**
     * <p>
     * Return the {@link com.studerw.tda.model.Login} object which will contain your account information,
     * among other information.
     * </p>
     * Note that you need to make a rest call before obtaining the login since it may not be fetched yet.
     * @return {@link com.studerw.tda.model.Login} or null if the client has not yet made a call.
     */
    Login getCurrentLogin();

    /**
     * Fetch a single quote.
     * @param symbol
     * @return
     */
    QuoteResponse fetchQuote(String symbol);

    /**
     *
     * @param accountId
     * @return
     */
    BalancesAndPositions fetchBalancesAndPositions(String accountId);

    boolean cancelOptionOrder(String orderId);

    OrderStatus fetchOrderStatus(String... orderIds);

    OrderStatus fetchAllOrderStatuses();

    OptionChain fetchOptionChain(String symbol);
}

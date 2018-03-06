package com.studerw.tda.client;

import com.studerw.tda.model.BalancesAndPositions;
import com.studerw.tda.model.Login;
import com.studerw.tda.model.Logout;
import com.studerw.tda.model.OptionChain;
import com.studerw.tda.model.OrderStatus;
import com.studerw.tda.model.QuoteResponse;

/**
 * This is a thread safe class. But only one client should be instantiated for each account.
 */
public interface TdaClient {

  /**
   * This call will invalidate the user session. It is a security feature that should be called when
   * the user wants to stop their current session or close the client application.
   */
  Logout logout();

  /**
   * <p> Return the {@link com.studerw.tda.model.Login} object which will contain your account
   * information, among other information. </p> Note that you need to make a rest call before
   * obtaining the login since it may not be fetched yet.
   *
   * @return {@link com.studerw.tda.model.Login} or null if the client has not yet made a call.
   */
  Login getCurrentLogin();

  /**
   * Fetch a single quote.
   */
  QuoteResponse fetchQuote(String symbol);

  /**
   * @return {@link com.studerw.tda.model.BalancesAndPositions}
   */
  BalancesAndPositions fetchBalancesAndPositions(String accountId);

  boolean cancelOptionOrder(String orderId);

  OrderStatus fetchOrderStatus(String... orderIds);

  OrderStatus fetchAllOrderStatuses();

  OptionChain fetchOptionChain(String symbol);
}

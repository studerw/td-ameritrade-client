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
   * <p> the {@link com.studerw.tda.model.Login} object which will contain your account
   * information, among other information.
   * @return {@link com.studerw.tda.model.Login}
   */
  Login getCurrentLogin();


  /**
   * If the login user is inactive for more than the timeout period, the session will expire and the
   * client will need to login again. This call is designed to refresh the login user session so
   * that it does not expire.
   *
   * NOTE: The client can set their timeout to different times (i.e. 55-minutues or 2, 4, or 8
   * hours) from the TDA web site "My Profile" page. Therefore, be sure to make a KeepAlive request
   * before the client's timeout elapses."
   *
   * @return The response to the KeepAlive request will be a one world reply. Either "LoggedOn" or
   * "InvalidSession" without html or xml formatting.  The content type is text/plain.
   */
  String keepAlive();

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

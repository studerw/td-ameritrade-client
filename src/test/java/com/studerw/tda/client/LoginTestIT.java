package com.studerw.tda.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.studerw.tda.model.Login;
import com.studerw.tda.model.Logout;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginTestIT extends BaseTestIT{
  private static final Logger LOGGER = LoggerFactory.getLogger(LoginTestIT.class);

  @Test
  public void testLogin() {
    final Login currentLogin = httpTdaClient.getCurrentLogin();
    assertNotNull("should have got login", currentLogin);
    String mainAcct = currentLogin.getXmlLogIn().getAssociatedAccountId();
    final Login.XmlLogIn.Accounts accounts = currentLogin.getXmlLogIn().getAccounts();
    assertNotNull("accounts should not be null", accounts);
    assertFalse("Should be successful login", currentLogin.isTdaError());
    LOGGER.debug(currentLogin.toString());
    LOGGER.debug(currentLogin.getOriginalXml().toString());
  }

  @Test
  public void testLogout() {
    Logout logout = httpTdaClient.logout();
    LOGGER.debug(logout.getResult());
    assertEquals("should equal LoggedOut", logout.getResult(), "LoggedOut");
  }

}

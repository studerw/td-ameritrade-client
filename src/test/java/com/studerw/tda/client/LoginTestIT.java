package com.studerw.tda.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.studerw.tda.model.Login;
import com.studerw.tda.model.Logout;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(LoginTestIT.class);
  static Properties props = null;
  static HttpTdaClient httpTdaClient;

  @BeforeClass
  public static void beforeClass() {
    try (InputStream in = LoginTestIT.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/client/my-test.properties")) {
      props = new Properties();
      props.load(in);
    } catch (IOException e) {
      throw new IllegalStateException(
          "Could not load default properties from classpath at com.studerw.my-test.properties");
    }

    String user = props.getProperty("user");
    byte[] pw = props.getProperty("pw").getBytes(StandardCharsets.UTF_8);
    httpTdaClient = new HttpTdaClient(user, pw);
  }

  @Test
  public void testLogin() {
    final Login currentLogin = httpTdaClient.getCurrentLogin();
    assertNotNull("should have got login", currentLogin);
    String mainAcct = currentLogin.getXmlLogIn().getAssociatedAccountId();
    final Login.XmlLogIn.Accounts accounts = currentLogin.getXmlLogIn().getAccounts();
    assertNotNull("accounts should not be null", accounts);
    assertFalse("Should be successful login", currentLogin.isTdaError());
    LOGGER.debug(currentLogin.toString());
  }

  @Test
  public void testLogout() {
    Logout logout = httpTdaClient.logout();
    LOGGER.debug(logout.getResult());
    assertEquals("should equal LoggedOut", logout.getResult(), "LoggedOut");
    assertFalse("Should be successful logout", logout.isTdaError());
  }

}

package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;
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
    assertThat(currentLogin).isNotNull();
    String mainAcct = httpTdaClient.getDefaultAcctId();
    final Login.XmlLogIn.Accounts accounts = currentLogin.getXmlLogIn().getAccounts();
    assertThat(accounts).isNotNull();
    assertThat(currentLogin.isTdaError()).isFalse();
    LOGGER.debug(currentLogin.toString());
    LOGGER.debug(currentLogin.getOriginalXml().toString());
    LOGGER.debug(currentLogin.getXmlLogIn().getLoginTime().toString());
  }

  @Test
  public void testLogout() {
    Logout logout = httpTdaClient.logout();
    LOGGER.debug(logout.getResult());
    assertThat(logout.getResult()).isEqualTo("LoggedOut");
  }

  @Test
  public void testBadLogin() {
    TdaClient client = new HttpTdaClient("foo", "badpassword".getBytes());
    final Login currentLogin = client.getCurrentLogin();
    assertThat(currentLogin.isTdaError());
  }


}

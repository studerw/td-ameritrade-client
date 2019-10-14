package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.account.SecuritiesAccount;
import java.util.List;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AccountTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(AccountTestIT.class);

  @Test(expected = Exception.class)
  public void testAccountNoId() {
    final SecuritiesAccount account = httpTdaClient.getAccount("", false, false);
    assertThat(account).isNotNull();
    LOGGER.debug(account.toString());
  }

  @Test
  public void testAccountAlone() {
    final SecuritiesAccount account = httpTdaClient.getAccount(getAccountId(), true, true);
    assertThat(account).isNotNull();
    LOGGER.debug(account.toString());
  }

  @Test
  public void testGetAccounts() {
    final List<SecuritiesAccount> accounts = httpTdaClient.getAccounts(true, true);
    LOGGER.debug(accounts.toString());
  }


}
package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.user.UserPrincipals;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GetUserPrincipalsTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(GetUserPrincipalsTestIT.class);

  @Test
  public void testGetPreferences() {
    final UserPrincipals userPrincipals = httpTdaClient.getUserPrincipals();
    assertThat(userPrincipals).isNotNull();
    LOGGER.debug("{}", userPrincipals);
  }
}
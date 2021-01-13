package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.user.UserPrincipals;
import com.studerw.tda.model.user.UserPrincipals.Field;
import java.util.Map;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GetUserPrincipalsTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(GetUserPrincipalsTestIT.class);

  @Test
  public void testGetUserPrincipals() {
    final UserPrincipals userPrincipals = httpTdaClient.getUserPrincipals();
    assertThat(userPrincipals).isNotNull();
    LOGGER.debug("{}", userPrincipals);
  }

  @Test
  public void testGetUserPrincipalsPrefs() {
    final UserPrincipals userPrincipals = httpTdaClient.getUserPrincipals(Field.preferences);
    assertThat(userPrincipals).isNotNull();
    assertThat(userPrincipals.getStreamerSubscriptionKeys()).isNull();
    assertThat(userPrincipals.getStreamerInfo()).isNull();
    assertThat(userPrincipals.getAccounts().get(0).getPreferences()).isNotNull();
    final Map<String, String> surrogateIds = userPrincipals.getAccounts().get(0)
        .getSurrogateIds();
    assertThat(surrogateIds).isNull();
    LOGGER.debug("{}", userPrincipals);
  }

  @Test
  public void testGetUserPrincipalsNoPrefs() {
    final UserPrincipals userPrincipals = httpTdaClient
        .getUserPrincipals(
            Field.streamerConnectionInfo,
            Field.surrogateIds,
            Field.streamerSubscriptionKeys,
            Field.preferences
        );
    assertThat(userPrincipals).isNotNull();
    assertThat(userPrincipals.getStreamerSubscriptionKeys()).isNotNull();
    assertThat(userPrincipals.getStreamerInfo()).isNotNull();
    assertThat(userPrincipals.getAccounts().get(0)
        .getSurrogateIds()).isNotNull();
    assertThat(userPrincipals.getAccounts().get(0).getPreferences()).isNotNull();
    LOGGER.debug("{}", userPrincipals);
  }

}
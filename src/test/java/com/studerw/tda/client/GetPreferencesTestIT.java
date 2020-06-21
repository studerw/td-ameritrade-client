package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.user.Preferences;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GetPreferencesTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(GetPreferencesTestIT.class);

  @Test
  public void testGetPreferences() {
    final Preferences preferences = httpTdaClient.getPreferences(getAccountId());
    assertThat(preferences).isNotNull();
    LOGGER.debug("{}", preferences);
  }
}
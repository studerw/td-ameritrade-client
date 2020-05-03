package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.option.OptionChain;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OptionChainTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(OptionChainTestIT.class);

  @Test
  public void testOptionChain() {
    final OptionChain optionChain = httpTdaClient.getOptionChain("msft");
    assertThat(optionChain).isNotNull();
    assertThat(optionChain.getStatus()).isEqualTo("SUCCESS");
    assertThat(optionChain.getSymbol()).isEqualTo("MSFT");
    assertThat(optionChain.getUnderlying()).isNull();
    assertThat(optionChain.getPutExpDateMap()).isNotEmpty();
    assertThat(optionChain.getCallExpDateMap()).isNotEmpty();

    LOGGER.debug("{}", optionChain);

    LOGGER.debug("Size of puts: {}", optionChain.getPutExpDateMap().size());
    LOGGER.debug("Size of calls: {}", optionChain.getCallExpDateMap().size());
  }


}
package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.option.OptionChain;
import com.studerw.tda.model.option.OptionChainReq;
import com.studerw.tda.model.option.Underlying;
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

  @Test
  public void testOptionChain2() {
    final OptionChain optionChain = httpTdaClient.getOptionChain("amzn");
    assertThat(optionChain).isNotNull();
    assertThat(optionChain.getStatus()).isEqualTo("SUCCESS");
    assertThat(optionChain.getSymbol()).isEqualTo("AMZN");
    assertThat(optionChain.getUnderlying()).isNull();
    assertThat(optionChain.getPutExpDateMap()).isNotEmpty();
    assertThat(optionChain.getCallExpDateMap()).isNotEmpty();

//    LOGGER.debug("{}", optionChain);

    LOGGER.debug("Size of puts: {}", optionChain.getPutExpDateMap().size());
    LOGGER.debug("Size of calls: {}", optionChain.getCallExpDateMap().size());
  }

  // supposedly there is a new enumeration type of STOCK in additon to / instead of EQUITY???
  @Test public void testIssue35(){
    final OptionChain optionChain = httpTdaClient.getOptionChain("DIS");
    final Underlying underlying = optionChain.getUnderlying();
//    underlying.get
//    assertThat(optionChain.getUnderlying().get).isEqualTo(AssetType.EQUITY);
    LOGGER.debug("{}",optionChain);

  }

  @Test
  public void testOptionChainRequest() {
    final OptionChainReq request = OptionChainReq.Builder.optionChainReq()
            .withSymbol("msft")
            .withStrikeCount(5)
            .withContractType(OptionChainReq.ContractType.CALL)
            .build();
    final OptionChain optionChain = httpTdaClient.getOptionChain(request);
    assertThat(optionChain).isNotNull();
    assertThat(optionChain.getStatus()).isEqualTo("SUCCESS");
    assertThat(optionChain.getSymbol()).isEqualTo("MSFT");
    assertThat(optionChain.getUnderlying()).isNull();
    assertThat(optionChain.getPutExpDateMap()).isEmpty();
    assertThat(optionChain.getCallExpDateMap()).isNotEmpty();

    LOGGER.debug("{}", optionChain);
    LOGGER.debug("Size of puts: {}", optionChain.getPutExpDateMap().size());
    LOGGER.debug("Size of calls: {}", optionChain.getCallExpDateMap().size());
  }

}
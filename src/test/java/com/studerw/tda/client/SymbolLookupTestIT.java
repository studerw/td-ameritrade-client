package com.studerw.tda.client;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.studerw.tda.model.SymbolLookup;
import com.studerw.tda.model.SymbolLookup.Result.SymbolResult;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SymbolLookupTestIT extends BaseTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(SymbolLookupTestIT.class);

  @Test
  public void testSymbolLookup() {
    final SymbolLookup response = httpTdaClient.symbolLookup("bank");
    LOGGER.debug(response.toString());
    assertFalse("should be successful result", response.isTdaError());
    assertTrue(StringUtils.isNotEmpty(response.getResult().getSymbolResults().get(0).getSymbol()));
    for (SymbolResult symbolResult : response.getResult().getSymbolResults()) {
      LOGGER.debug("{} - {}", symbolResult.getSymbol(), symbolResult.getDescription());
    }
  }

  @Test
  public void testSymbolLookupError() {
    final SymbolLookup response = httpTdaClient.symbolLookup("");
    LOGGER.debug(response.getResultStr());
    assertTrue("should be unsuccessful result", response.isTdaError());
  }
}
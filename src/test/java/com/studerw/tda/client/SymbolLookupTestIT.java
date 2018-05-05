package com.studerw.tda.client;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.studerw.tda.model.SymbolLookup;
import com.studerw.tda.model.SymbolLookup.Result.SymbolResult;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SymbolLookupTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(SymbolLookupTestIT.class);
  static Properties props = null;
  static HttpTdaClient httpTdaClient;

  @BeforeClass
  public static void beforeClass() {
    try (InputStream in = SymbolLookupTestIT.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/client/my-test.properties")) {
      props = new Properties();
      props.load(in);
    } catch (IOException e) {
      throw new IllegalStateException(
          "Could not load default properties from com.studerw.tda.tda-api.properties in classpath");
    }

    String user = props.getProperty("user");
    byte[] pw = props.getProperty("pw").getBytes(StandardCharsets.UTF_8);
    httpTdaClient = new HttpTdaClient(user, pw);
  }


  @Test
  public void testSymbolLookup() {
    final SymbolLookup response = httpTdaClient.symbolLookup("bank of");
    LOGGER.debug(response.toString());
    assertFalse("should be successful result", response.isTdaError());
    assertTrue(StringUtils
        .isNotEmpty(response.getResult().getSymbolResults().get(0).getSymbol()));
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
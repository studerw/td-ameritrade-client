package com.studerw.tda.client;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.studerw.tda.model.SymbolLookup;
import com.studerw.tda.model.history.IntervalType;
import com.studerw.tda.model.history.PeriodType;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PriceHistoryTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(PriceHistoryTestIT.class);
  static Properties props = null;
  static HttpTdaClient httpTdaClient;

  @BeforeClass
  public static void beforeClass() {
    try (InputStream in = PriceHistoryTestIT.class.getClassLoader().
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


  @Ignore
  @Test
  public void testPriceHistory() throws IOException {
    List<String> symbols = Arrays.asList("T");
    byte[] bytes = httpTdaClient.priceHistory(symbols, IntervalType.WEEKLY, 1,
        PeriodType.YEAR, 1, null, null, false);
    LOGGER.debug("Length: {}", bytes.length);
    File tempFile = File.createTempFile("tda-sybmol-lookup-", ".dat");
    FileUtils.writeByteArrayToFile(tempFile, bytes);
    LOGGER.debug("Wrote: {} bytes to file: {}", bytes.length, tempFile.getAbsolutePath());
    readBytes(bytes);
//    assertFalse("should be successful result", response.isTdaError());
//    assertTrue(StringUtils
//        .isNotEmpty(response.getSymbolLookupResult().getSymbolResult().get(0).getSymbol()));
//    for (SymbolResult symbolResult : response.getSymbolLookupResult().getSymbolResult()) {
//      LOGGER.debug("{} - {}", symbolResult.getSymbol(), symbolResult.getDescription());
//    }
  }

  @Test
  @Ignore
  public void testPriceHistoryError() {
    final SymbolLookup response = httpTdaClient.symbolLookup("");
    LOGGER.debug(response.toString());
    assertTrue("should be unsuccessful result", response.isTdaError());
  }

  private void readBytes(byte[] bytes) {
    try {
    DataInputStream in = new DataInputStream(new ByteArrayInputStream(bytes));

    }
    catch (Exception e){
      throw new RuntimeException(e);
    }
    finally{

    }
  }
}
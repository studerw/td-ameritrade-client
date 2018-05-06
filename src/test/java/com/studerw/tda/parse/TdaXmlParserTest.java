package com.studerw.tda.parse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.studerw.tda.model.QuoteResponse;
import com.studerw.tda.model.SymbolLookup;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TdaXmlParserTest {
  private static final Logger LOGGER = LoggerFactory.getLogger(TdaXmlParserTest.class);
  private TdaXmlParser xmlParser = new TdaXmlParser();


  @Test
  public void testParseQuoteResponse() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/quote_response.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      QuoteResponse qr = xmlParser.parseQuoteResponse(xml);

      assertEquals("result should be ok", qr.getResultStr(), "OK");
      assertFalse("Should be tdaError", qr.isTdaError());
      assertTrue("should have list of 7", qr.getResult().getQuotes().size() == 7);
      qr.getResult().getQuotes().stream().forEach(q -> {
        assertFalse("should not be empty", StringUtils.isBlank(q.getSymbol()));
        LOGGER.debug("{} -> {}", q.getSymbol(), q.getAssetType());
      });
    }
  }

  @Test
  public void testQuoteResponseError() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/quote_response_error.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      QuoteResponse qr = xmlParser.parseQuoteResponse(xml);
      assertTrue("Should be tdaError", qr.isTdaError());
      LOGGER.debug("Error: {}", qr.getError());
    }
  }

  @Test
  public void testSymbolLookupError() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/symbol-lookup-response-error.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      SymbolLookup sl = xmlParser.parseSymbolLookup(xml);
      assertTrue("Should be tdaError", sl.isTdaError());
    }
  }

  @Test
  public void testSymbolLookup2() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/symbol-lookup-response.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      SymbolLookup sl = xmlParser.parseSymbolLookup(xml);

      assertEquals("result should be ok", sl.getResultStr(), "OK");
      assertFalse("Should be tdaError", sl.isTdaError());
      assertTrue("should have list of 3",
          sl.getResult().getSymbolResults().size() == 3);
      sl.getResult().getSymbolResults().stream().forEach(s -> {
        assertFalse("should not be empty", StringUtils.isBlank(s.getSymbol()));
        LOGGER.debug("{} -> {}", s.getSymbol(), s.getDescription());
      });
    }
  }


  @Test
  public void testSymbolLookup3() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/symbol-lookup-response2.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      SymbolLookup sl = xmlParser.parseSymbolLookup(xml);
      LOGGER.debug("Got {} results", sl.getResult().getSymbolResults().size());
      assertEquals("result should be ok", sl.getResultStr(), "OK");
      assertFalse("Should be tdaError", sl.isTdaError());
      assertTrue("should have list of 51",
          sl.getResult().getSymbolResults().size() == 51);
      sl.getResult().getSymbolResults().stream().forEach(s -> {
        assertFalse("should not be empty", StringUtils.isBlank(s.getSymbol()));
        LOGGER.debug("{} -> {}", s.getSymbol(), s.getDescription());
      });
    }
  }

}

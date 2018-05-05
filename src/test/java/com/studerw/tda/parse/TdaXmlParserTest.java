package com.studerw.tda.parse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.studerw.tda.model.QuoteResponse;
import com.studerw.tda.model.QuoteResponseBetter;
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

      assertEquals("result should be ok", qr.getResult(), "OK");
      assertFalse("Should be tdaError", qr.isTdaError());
      assertTrue("should have list of 7", qr.getQuoteList().getQuote().size() == 7);
      qr.getQuoteList().getQuote().stream().forEach(q -> {
        assertFalse("should not be empty", StringUtils.isBlank(q.getSymbol()));
        LOGGER.debug("{} -> {}", q.getSymbol(), q.getAssetType());
      });
    }
  }

  @Test
  public void testParseQuoteResponseBetter() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/quote_response.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      QuoteResponseBetter qr = xmlParser.parseQuoteResponseBetter(xml);

      assertEquals("result should be ok", qr.getResult(), "OK");
      assertFalse("Should be tdaError", qr.isTdaError());
      assertTrue("should have list of 7", qr.getQuoteList().getQuotes().size() == 7);
      qr.getQuoteList().getQuotes().stream().forEach(q -> {
        assertFalse("should not be empty", StringUtils.isBlank(q.getSymbol()));
        LOGGER.debug("{} -> {}", q.getSymbol(), q.getAssetType());
      });
    }
  }
}

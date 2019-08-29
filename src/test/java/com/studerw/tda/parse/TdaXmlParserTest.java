package com.studerw.tda.parse;

import static org.assertj.core.api.Assertions.assertThat;

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

      assertThat(qr.getResultStr().equals( "OK"));
      assertThat(qr.isTdaError()).isFalse();
      assertThat(qr.getResult().getQuotes().size()).isEqualTo(7);
      qr.getResult().getQuotes().stream().forEach(q -> {
        assertThat(StringUtils.isBlank(q.getSymbol())).isFalse();
        LOGGER.debug("{} -> {}", q.getSymbol(), q.getAssetType());
      });
    }
  }

  @Test
  public void testParseQuoteResponseGeneric() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/quote_response.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      QuoteResponse qr = xmlParser.parseXml(QuoteResponse.class, xml);

      assertThat(qr.getResultStr().equals("OK"));
      assertThat(qr.isTdaError());
      assertThat(qr.getResult().getQuotes().size()).isEqualTo(7);
      qr.getResult().getQuotes().stream().forEach(q -> {
        assertThat(StringUtils.isBlank(q.getSymbol())).isFalse();
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
      assertThat(qr.isTdaError()).isTrue();
      LOGGER.debug("Error: {}", qr.getError());
    }
  }

  @Test
  public void testQuoteResponseErrorGeneric() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/quote_response_error.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      QuoteResponse qr = xmlParser.parseXml(QuoteResponse.class, xml);
      PrettyXmlPrinter.prettyFormat(qr.getOriginalXml());
      assertThat(qr.isTdaError()).isFalse();
      LOGGER.debug("Error: {}", qr.getError());
    }
  }

  @Test
  public void testSymbolLookupError() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/symbol-lookup-response-error.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      SymbolLookup sl = xmlParser.parseSymbolLookup(xml);
      assertThat(sl.isTdaError()).isTrue();
    }
  }

  @Test
  public void testSymbolLookup2() throws Exception {
    try (InputStream in = TdaXmlParserTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/model/symbol-lookup-response.xml")) {
      String xml = IOUtils.toString(in, Charset.forName("UTF-8"));
      SymbolLookup sl = xmlParser.parseSymbolLookup(xml);

      assertThat(sl.getResultStr().equals("OK"));
      assertThat(sl.isTdaError()).isFalse();
      assertThat(sl.getResult().getSymbolResults().size()).isEqualTo(3);
      sl.getResult().getSymbolResults().stream().forEach(s -> {
        assertThat(StringUtils.isBlank(s.getSymbol())).isFalse();
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
      assertThat(sl.getResultStr().equals("OK"));
      assertThat(sl.isTdaError()).isFalse();
      assertThat(sl.getResult().getSymbolResults().size()).isEqualTo(51);
      sl.getResult().getSymbolResults().stream().forEach(s -> {
        assertThat(StringUtils.isBlank(s.getSymbol())).isFalse();
        LOGGER.debug("{} -> {}", s.getSymbol(), s.getDescription());
      });
    }
  }

}

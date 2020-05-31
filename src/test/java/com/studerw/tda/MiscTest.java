package com.studerw.tda;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.studerw.tda.model.instrument.Query.QueryType;
import com.studerw.tda.model.marketdata.Mover.Direction;
import com.studerw.tda.model.marketdata.MoversReq;
import com.studerw.tda.model.marketdata.MoversReq.Change;
import com.studerw.tda.model.marketdata.MoversReq.Index;
import com.studerw.tda.parse.BigDecimalNanDeserializer;
import com.studerw.tda.parse.Utils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Just to make sure Maven is building correctly and other random scratch tests
 */
public class MiscTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(MiscTest.class);

  @Test
  public void testUnicodeByteToStr() {
    byte[] bytes = "T".getBytes();
    assertThat(bytes.length == 1).isTrue();
    LOGGER.debug(Arrays.toString(bytes));
  }

  @Test
  public void BigDecimalTest() {
    BigDecimal b = new BigDecimal("-23.52");
    assertThat(b.longValue()).isLessThan(0);
    LOGGER.debug(b.toString());

    BigDecimal b2 = new BigDecimal("+23.52");
    assertThat(b2.longValue()).isGreaterThan(0);
    LOGGER.debug(b2.toString());

    BigDecimal b3 = new BigDecimal("0.234");
    LOGGER.debug(b3.toString());
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testGetList() {
    List<String> stuff = new ArrayList<>();
    String s = stuff.get(0);
    assertThat(s).isNull();

  }

  @Test
  public void testPrettyDate() {
    Long epoch = System.currentTimeMillis();
    String pretty = Utils.epochToStr(epoch);
    LOGGER.debug("epoch: {} -> {}", epoch, pretty);
  }

  @Test
  public void testIso8601Format() {
    ZonedDateTime now = ZonedDateTime.now();
    final String formatted = Utils.toTdaISO8601(now);
    LOGGER.debug(formatted);

    final String isoFormatted = now.format(DateTimeFormatter.ISO_INSTANT);
    LOGGER.debug(isoFormatted);

  }

  @Test
  public void testYmdForm() {
    LocalDate now = LocalDate.now();
    final String formatted = Utils.toTdaYMD(now);
    LOGGER.debug(formatted);
  }


  @Test
  public void testCopyVsRef() {
    String someStr = "abcde";
    String copy = doesCopy(someStr);
    LOGGER.debug("after the method: {}", someStr);
    assertThat(someStr).isEqualTo("abcde");
    assertThat(copy.equals(someStr)).isFalse();

  }

  private String doesCopy(String param) {
    param = StringUtils.upperCase(param);
    return param;
  }

  @Test
  public void getWeek() {
    long now = System.currentTimeMillis();
    LOGGER.debug("now: {}", now);
    LOGGER.debug("now: {}", Utils.epochToStr(now));

    long weekAgo = now - (1_000 * 60 * 60 * 24 * 7);
    LOGGER.debug("Week ago: {}", weekAgo);
    LOGGER.debug("Week ago: {}", Utils.epochToStr(weekAgo));
  }

  @Test
  public void javaEnumTest() {
    QueryType qt = QueryType.SYMBOL_REGEX;
    LOGGER.debug("{} - {}", qt.name(), qt.getQueryType());
  }

  @Test
  public void testEnum() {
    MoversReq moversReq = new MoversReq(Index.DOW_JONES, Direction.up, Change.PERCENT);
    LOGGER.debug("Name: {}", moversReq.getIndex().name());
    LOGGER.debug("values: {}", (Object) moversReq.getIndex().values());
    LOGGER.debug("toStr: {}", moversReq.getIndex().toString());
    LOGGER.debug("getIndex: {}", moversReq.getIndex().getIndex());
    LOGGER.debug("direction: {}", moversReq.getDirection());
  }

  @Test(expected = NumberFormatException.class)
  public void testNAN() {
    String NAN = "NAN";
    final BigDecimal bigDecimal = new BigDecimal(NAN);
    fail("Should have thrown NumberException");
    LOGGER.debug(NAN);
  }

  @Test
  public void testNanDeserializer() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    String json = "{ \"theta\":  \"NAN\"}";

    try (InputStream stream = new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8))){
      JsonParser parser = mapper.getFactory().createParser(stream);
      DeserializationContext ctxt = mapper.getDeserializationContext();
      BigDecimalNanDeserializer deserializer = new BigDecimalNanDeserializer();
      parser.nextToken();
      parser.nextToken();
      parser.nextToken();

      final BigDecimal deserialized = deserializer.deserialize(parser, ctxt);
      LOGGER.debug("NAN -> {}", deserialized);
      assertThat(deserialized).isEqualTo("0");
    }
  }

  @Test
  public void testIsoStringToInstant(){
    String isoStr = "2019-12-05T06:00:01+0000";
     ZonedDateTime zdt = Utils.fromTdaISO8601(isoStr);
    LOGGER.debug("{}", zdt);
  }
}

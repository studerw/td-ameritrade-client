package com.studerw.tda.parse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Map;

/**
 * Helper class mainly for tests to pretty print JSON, dates, etc.
 */
public class Utils {

  final private static ObjectMapper mapper = new ObjectMapper();
  final public static DateTimeFormatter TMD = DateTimeFormatter.ofPattern("yyyy-MM-dd");
  final public static DateTimeFormatter ISO = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");

  /**
   *
   * @param input json
   * @return formatted json (i.e. prettyPrint from Jackson)
   */
  public static String prettyFormat(String input) {
    try {
      return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(input);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   *
   * @param epoch number of milliseconds since epoch
   * @return formatted string e.g. January 25, 2019 at 3:55:06 AM CST
   */
  public static String epochToStr(Long epoch){
    ZonedDateTime dateTime = Instant.ofEpochMilli(epoch).atZone(ZoneId.systemDefault());
    return dateTime.toString();
  }

  /**
   *
   * @param c collection to check if null or empty
   * @return true if null or empty, otherwise false
   */
  public static boolean isNullOrEmpty( final Collection< ? > c ) {
    return c == null || c.isEmpty();
  }

  /**
   *
   * @param m map to check if null or empty
   * @return true if null or empty, otherwise false
   */
  public static boolean isNullOrEmpty( final Map< ?, ? > m ) {
    return m == null || m.isEmpty();
  }

  /**
   *
   * @param zonedDateTime the date to format
   * @return a string formatted like {@code yyyy-MM-dd'T'HH:mm:ssz}.
   */
  public static String toTdaISO8601(ZonedDateTime zonedDateTime) {
    return zonedDateTime.format(ISO);
  }

  /**
   *
   * @param isoString string formatted like {@code yyyy-MM-dd'T'HH:mm:ssz}.
   * @return instant
   */
  public static ZonedDateTime fromTdaISO8601(String isoString){
    return ZonedDateTime.parse(isoString, ISO);

  }
  /**
   *
   * @param zonedDateTime the date to format
   * @return a string formatted like {@code yyyy-MM-dd}.
   */
  public static String toTdaYMD(ZonedDateTime zonedDateTime) {
    return zonedDateTime.format(TMD);
  }

  /**
   *
   * @param localDate to convert
   * @return a String in form of "yyyy-MM-dd"
   */
  public static String toTdaYMD(LocalDate localDate) {
    return localDate.format(TMD);
  }
}

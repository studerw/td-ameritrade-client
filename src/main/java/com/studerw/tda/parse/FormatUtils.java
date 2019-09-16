package com.studerw.tda.parse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Helper class mainly for tests to pretty print JSON, dates, etc.
 */
public class FormatUtils {

  final private static ObjectMapper mapper = new ObjectMapper();

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

}

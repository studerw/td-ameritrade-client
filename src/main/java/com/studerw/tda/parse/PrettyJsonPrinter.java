package com.studerw.tda.parse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Helper class mainly for tests to pretty print JSON
 */
public class PrettyJsonPrinter {

  final private static ObjectMapper mapper = new ObjectMapper();

  public static String prettyFormat(String input) {
    try {
      return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(input);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

}

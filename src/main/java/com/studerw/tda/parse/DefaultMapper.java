package com.studerw.tda.parse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

/**
 * Convert between Java pojos and JSON. This class is thread safe.
 */
public class DefaultMapper {

  private final static ObjectMapper defaultMapper;

  static {
    defaultMapper = new ObjectMapper();

    SimpleModule module =
        new SimpleModule("BigDecimalNanDeserializer", new Version(1, 0, 0, null, null, null));
    module.addDeserializer(BigDecimal.class, new BigDecimalNanDeserializer());
    defaultMapper.registerModule(module);
//    defaultMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
//    defaultMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
  }


  /**
   * Convert object to JSON string. Use {@link Utils#prettyFormat(String)} to pretty format the
   * returned JSON string.
   *
   * @param object Java POJO to serialize into JSON
   * @return JSON representation of the object
   */
  public static String toJson(Object object) {
    try {
      return defaultMapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Convert object from JSON to POJO
   *
   * @param json string of json
   * @param clazz the class type
   * @param <T> the type to marshall
   * @return a deserialized java POJO
   */
  public static <T> T fromJson(String json, Class<T> clazz) {
    try {
      return defaultMapper.readValue(json, clazz);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Convert object from JSON to POJO.
   *
   * @param in InputStream of json, guaranteed to be closed upon return.
   * @param clazz the class type
   * @param <T> the type to marshall
   * @return a deserialized java POJO
   */
  public static <T> T fromJson(InputStream in, Class<T> clazz) {
    try (BufferedInputStream ignored = new BufferedInputStream(in)) {
      return defaultMapper.readValue(in, clazz);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Convert object from JSON to POJO.
   *
   * @param in InputStream of json, guaranteed to be closed upon return.
   * @param typeReference Jackson {@link TypeReference} of the pojo to map
   * @param <T> the type to marshall
   * @return a deserialized java POJO
   */
  public static <T> T fromJson(InputStream in, TypeReference<T> typeReference) {
    try (BufferedInputStream ignored = new BufferedInputStream(in)) {
      return defaultMapper.readValue(in, typeReference);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

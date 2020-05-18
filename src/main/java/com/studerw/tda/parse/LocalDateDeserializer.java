package com.studerw.tda.parse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalDateDeserializer extends JsonDeserializer<LocalDate> {

  private static final Logger LOGGER = LoggerFactory.getLogger(LocalDateDeserializer.class);

  @Override
  public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
    final String valueAsString = jp.getValueAsString();
    return LocalDate.parse(valueAsString);
  }
}
package com.studerw.tda.parse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.time.ZonedDateTime;

public class ZonedDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {

  @Override
  public ZonedDateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
    final String valueAsString = jp.getValueAsString();
    return Utils.fromTdaISO8601(valueAsString);
  }
}
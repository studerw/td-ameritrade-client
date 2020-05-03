package com.studerw.tda.parse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TDA seems to return invalid JSON sometimes with an OptionChain.theta. When it gets very close to
 * 0, the JSON returns '{theta: "NAN"}'.
 */
public class BigDecimalNanDeserializer extends JsonDeserializer<BigDecimal> {

  private static final Logger LOGGER = LoggerFactory.getLogger(BigDecimalNanDeserializer.class);
//  private final NumberDeserializers.BigDecimalDeserializer delegate = NumberDeserializers.BigDecimalDeserializer.instance;

  @Override
  public BigDecimal deserialize(JsonParser jp, DeserializationContext ctxt)
      throws IOException {
    final String valueAsString = jp.getValueAsString();
    if ("NAN".equalsIgnoreCase(valueAsString)) {
      LOGGER.warn("{} using invalid NAN instead of a valid double", jp.getCurrentName());
      return new BigDecimal(0);
    }
    return new BigDecimal(valueAsString);
  }
}
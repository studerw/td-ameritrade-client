package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Cash Equivalent Instrument
 */
public class CashEquivalentInstrument extends Instrument {

  @JsonProperty("type")
  private Type type;

  public Type getType() {
    return type;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("type", type)
        .toString();
  }

  public enum Type {
    SAVINGS,
    MONEY_MARKET_FUND
  }
}
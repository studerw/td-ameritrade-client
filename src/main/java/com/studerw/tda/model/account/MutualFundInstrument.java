package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Mutual Fund Instrument
 */
public class MutualFundInstrument extends Instrument {
  @JsonProperty("type")
  private Type type;

  public MutualFundInstrument(){
    this.setAssetType(AssetType.MUTUAL_FUND);
  }

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
    NOT_APPLICABLE,
    OPEN_END_NON_TAXABLE,
    OPEN_END_TAXABLE,
    NO_LOAD_NON_TAXABLE,
    NO_LOAD_TAXABLE
  }
}

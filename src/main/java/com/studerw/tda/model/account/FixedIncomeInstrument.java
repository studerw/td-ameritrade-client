package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Fixed Income Instrument
 */
public class FixedIncomeInstrument extends Instrument {

  @JsonProperty("maturityDate")
  private Date maturityDate;
  @JsonProperty("variableRate")
  private BigDecimal variableRate;
  @JsonProperty("factor")
  private BigDecimal factor;

  public FixedIncomeInstrument(){
    this.setAssetType(AssetType.FIXED_INCOME);
  }

  public Date getMaturityDate() {
    return maturityDate;
  }

  public BigDecimal getVariableRate() {
    return variableRate;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("maturityDate", maturityDate)
        .append("variableRate", variableRate)
        .append("factor", factor)
        .toString();
  }
}

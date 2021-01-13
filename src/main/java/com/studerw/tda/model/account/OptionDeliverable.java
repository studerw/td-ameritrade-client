package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OptionDeliverable implements Serializable {

  private final static long serialVersionUID = -3299806247296774837L;

  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("deliverableUnits")
  private BigDecimal deliverableUnits;
  @JsonProperty("currencyType")
  private String currencyType;
  @JsonProperty("assetType")
  private String assetType;

  public String getSymbol() {
    return symbol;
  }

  public BigDecimal getDeliverableUnits() {
    return deliverableUnits;
  }

  public String getCurrencyType() {
    return currencyType;
  }

  public String getAssetType() {
    return assetType;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("symbol", symbol)
        .append("deliverableUnits", deliverableUnits)
        .append("currencyType", currencyType)
        .append("assetType", assetType)
        .toString();
  }

  /**
   * Issue 35 - originally used EQUITY, but now using STOCK for some (e.g. DIS)
   * So changing the AssetType to String from enum because the TDA site now says it's just a generic string
   * with no Enum list to chose from.
   */
//  public enum AssetType {
//    CASH_EQUIVALENT,
//    CURRENCY,
//    EQUITY,
//    STOCK,
//    FIXED_INCOME,
//    INDEX,
//    MUTUAL_FUND,
//    OPTION
//  }

//  public enum CurrencyType {
//    USD,
//    CAD,
//    EUR,
//    JPY
//  }


}

package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OptionDeliverable implements Serializable {

  private final static long serialVersionUID = -3299806247296774837L;

  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("deliverableUnits")
  private BigDecimal deliverableUnits;
  @JsonProperty("currencyType")
  private CurrencyType currencyType;
  @JsonProperty("assetType")
  private AssetType assetType;

  public String getSymbol() {
    return symbol;
  }

  public BigDecimal getDeliverableUnits() {
    return deliverableUnits;
  }

  public CurrencyType getCurrencyType() {
    return currencyType;
  }

  public AssetType getAssetType() {
    return assetType;
  }

  public enum AssetType {
    EQUITY,
    OPTION,
    INDEX,
    MUTUAL_FUND,
    CASH_EQUIVALENT,
    FIXED_INCOME,
    CURRENCY
  }

  public enum CurrencyType {
    USD,
    CAD,
    EUR,
    JPY
  }
}

package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    CASH_EQUIVALENT,
    CURRENCY,
    EQUITY,
    FIXED_INCOME,
    INDEX,
    MUTUAL_FUND,
    OPTION
  }

  public enum CurrencyType {
    USD,
    CAD,
    EUR,
    JPY
  }
}

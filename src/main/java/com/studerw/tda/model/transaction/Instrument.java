package com.studerw.tda.model.transaction;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Instrument implements Serializable {

  private final static long serialVersionUID = -3728240577716458348L;

  @JsonProperty("symbol")
  private String symbol;

  @JsonProperty("underlyingSymbol")
  private String underlyingSymbol;

  @JsonProperty("optionExpirationDate")
  private Date optionExpirationDate;

  @JsonProperty("optionStrikePrice")
  private BigDecimal optionStrikePrice;

  @JsonProperty("putCall")
  private Instrument.PutCall putCall;

  @JsonProperty("cusip")
  private String cusip;

  @JsonProperty("description")
  private String description;

  @JsonAlias("type")
  @JsonProperty("assetType")
  private Instrument.AssetType assetType;

  @JsonProperty("bondMaturityDate")
  private Date bondMaturityDate;

  @JsonProperty("bondInterestRate")
  private BigDecimal bondInterestRate;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public String getSymbol() {
    return symbol;
  }

  public String getUnderlyingSymbol() {
    return underlyingSymbol;
  }

  public Date getOptionExpirationDate() {
    return optionExpirationDate;
  }

  public BigDecimal getOptionStrikePrice() {
    return optionStrikePrice;
  }

  public PutCall getPutCall() {
    return putCall;
  }

  public String getCusip() {
    return cusip;
  }

  public String getDescription() {
    return description;
  }

  public AssetType getAssetType() {
    return assetType;
  }

  public Date getBondMaturityDate() {
    return bondMaturityDate;
  }

  public BigDecimal getBondInterestRate() {
    return bondInterestRate;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("symbol", symbol)
        .append("underlyingSymbol", underlyingSymbol)
        .append("optionExpirationDate", optionExpirationDate)
        .append("optionStrikePrice", optionStrikePrice)
        .append("putCall", putCall)
        .append("cusip", cusip)
        .append("description", description)
        .append("assetType", assetType)
        .append("bondMaturityDate", bondMaturityDate)
        .append("bondInterestRate", bondInterestRate)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum AssetType {
    EQUITY,
    MUTUAL_FUND,
    MONEY_MARKET,
    OPTION,
    FIXED_INCOME,
    CASH_EQUIVALENT
  }

  public enum PutCall {
    PUT,
    CALL
  }

}

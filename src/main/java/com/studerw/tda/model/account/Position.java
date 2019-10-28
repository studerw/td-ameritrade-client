package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Position implements Serializable {

  private final static long serialVersionUID = 3974533181521750706L;

  @JsonProperty("shortQuantity")
  private BigDecimal shortQuantity;
  @JsonProperty("averagePrice")
  private BigDecimal averagePrice;
  @JsonProperty("currentDayProfitLoss")
  private BigDecimal currentDayProfitLoss;
  @JsonProperty("currentDayProfitLossPercentage")
  private BigDecimal currentDayProfitLossPercentage;
  @JsonProperty("longQuantity")
  private BigDecimal longQuantity;
  @JsonProperty("settledLongQuantity")
  private BigDecimal settledLongQuantity;
  @JsonProperty("settledShortQuantity")
  private BigDecimal settledShortQuantity;
  @JsonProperty("agedQuantity")
  private BigDecimal agedQuantity;
  @JsonProperty("instrument")
  private Instrument instrument;
  @JsonProperty("marketValue")
  private BigDecimal marketValue;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public BigDecimal getShortQuantity() {
    return shortQuantity;
  }

  public BigDecimal getAveragePrice() {
    return averagePrice;
  }

  public BigDecimal getCurrentDayProfitLoss() {
    return currentDayProfitLoss;
  }

  public BigDecimal getCurrentDayProfitLossPercentage() {
    return currentDayProfitLossPercentage;
  }

  public BigDecimal getLongQuantity() {
    return longQuantity;
  }

  public BigDecimal getSettledLongQuantity() {
    return settledLongQuantity;
  }

  public BigDecimal getSettledShortQuantity() {
    return settledShortQuantity;
  }

  public BigDecimal getAgedQuantity() {
    return agedQuantity;
  }

  public Instrument getInstrument() {
    return instrument;
  }

  public BigDecimal getMarketValue() {
    return marketValue;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("shortQuantity", shortQuantity)
        .append("averagePrice", averagePrice)
        .append("currentDayProfitLoss", currentDayProfitLoss)
        .append("currentDayProfitLossPercentage", currentDayProfitLossPercentage)
        .append("longQuantity", longQuantity)
        .append("settledLongQuantity", settledLongQuantity)
        .append("settledShortQuantity", settledShortQuantity)
        .append("agedQuantity", agedQuantity)
        .append("instrument", instrument)
        .append("marketValue", marketValue)
        .append("otherFields", otherFields)
        .toString();
  }
}

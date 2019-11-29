package com.studerw.tda.model.option;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Option Chains
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OptionChain implements Serializable {

  private final static long serialVersionUID = 4023146712021169805L;
  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("status")
  private String status;
  @JsonProperty("underlying")
  private Underlying underlying;
  @JsonProperty("strategy")
  private Strategy strategy;
  @JsonProperty("interval")
  private BigDecimal interval;
  @JsonProperty("isDelayed")
  private Boolean isDelayed;
  @JsonProperty("isIndex")
  private Boolean isIndex;
  @JsonProperty("daysToExpiration")
  private BigDecimal daysToExpiration;
  @JsonProperty("interestRate")
  private BigDecimal interestRate;
  @JsonProperty("underlyingPrice")
  private BigDecimal underlyingPrice;
  @JsonProperty("volatility")
  private BigDecimal volatility;
  @JsonProperty("callExpDateMap")
  private Map<String, Map<BigDecimal, List<Option>>> callExpDateMap;
  @JsonProperty("putExpDateMap")
  private Map<String, Map<BigDecimal, List<Option>>> putExpDateMap;
  @JsonProperty("numberOfContracts")
  private Integer numberOfContracts;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public String getSymbol() {
    return symbol;
  }

  public String getStatus() {
    return status;
  }

  public Underlying getUnderlying() {
    return underlying;
  }

  public Strategy getStrategy() {
    return strategy;
  }

  public BigDecimal getInterval() {
    return interval;
  }

  public Boolean getDelayed() {
    return isDelayed;
  }

  public Boolean getIndex() {
    return isIndex;
  }

  public BigDecimal getDaysToExpiration() {
    return daysToExpiration;
  }

  public BigDecimal getInterestRate() {
    return interestRate;
  }

  public BigDecimal getUnderlyingPrice() {
    return underlyingPrice;
  }

  public BigDecimal getVolatility() {
    return volatility;
  }

  public Map<String, Map<BigDecimal, List<Option>>> getCallExpDateMap() {
    return callExpDateMap;
  }

  public Map<String, Map<BigDecimal, List<Option>>> getPutExpDateMap() {
    return putExpDateMap;
  }

  public Integer getNumberOfContracts() {
    return numberOfContracts;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("symbol", symbol)
        .append("status", status)
        .append("underlying", underlying)
        .append("strategy", strategy)
        .append("interval", interval)
        .append("isDelayed", isDelayed)
        .append("isIndex", isIndex)
        .append("daysToExpiration", daysToExpiration)
        .append("interestRate", interestRate)
        .append("underlyingPrice", underlyingPrice)
        .append("volatility", volatility)
        .append("callExpDateMap", callExpDateMap)
        .append("putExpDateMap", putExpDateMap)
        .append("numberOfContracts", numberOfContracts)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum Strategy {
    SINGLE,
    ANALYTICAL,
    COVERED,
    VERTICAL,
    CALENDAR,
    STRANGLE,
    STRADDLE,
    BUTTERFLY,
    CONDOR,
    DIAGONAL,
    COLLAR,
    ROLL
  }

}

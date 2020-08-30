package com.studerw.tda.model.quote;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.studerw.tda.parse.BigDecimalNanDeserializer;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FutureOptionQuote extends Quote implements Serializable {

  private final static long serialVersionUID = -5072373475224958309L;

  @JsonProperty("bidPriceInDouble")
  private BigDecimal bidPriceInDouble;

  @JsonProperty("askPriceInDouble")
  private BigDecimal askPriceInDouble;

  @JsonProperty("lastPriceInDouble")
  private BigDecimal lastPriceInDouble;

  @JsonProperty("highPriceInDouble")
  private BigDecimal highPriceInDouble;

  @JsonProperty("lowPriceInDouble")
  private BigDecimal lowPriceInDouble;

  @JsonProperty("closePriceInDouble")
  private BigDecimal closePriceInDouble;

  @JsonProperty("openPriceInDouble")
  private BigDecimal openPriceInDouble;

  @JsonProperty("netChangeInDouble")
  private BigDecimal netChangeInDouble;

  @JsonProperty("openInterest")
  private BigDecimal openInterest;

  @JsonProperty("exchangeName")
  private String exchangeName;

  @JsonProperty("securityStatus")
  private String securityStatus;

  @JsonProperty("volatility")
  private BigDecimal volatility;

  @JsonProperty("moneyIntrinsicValueInDouble")
  private BigDecimal moneyIntrinsicValueInDouble;

  @JsonProperty("multiplierInDouble")
  private BigDecimal multiplierInDouble;

  @JsonProperty("digits")
  private Long digits;

  @JsonProperty("strikePriceInDouble")
  private BigDecimal strikePriceInDouble;

  @JsonProperty("contractType")
  private String contractType;

  @JsonProperty("underlying")
  private String underlying;

  @JsonProperty("timeValueInDouble")
  private BigDecimal timeValueInDouble;

  @JsonProperty("deltaInDouble")

  private BigDecimal deltaInDouble;

  @JsonProperty("gammaInDouble")

  private BigDecimal gammaInDouble;

  @JsonProperty("thetaInDouble")

  private BigDecimal thetaInDouble;

  @JsonProperty("vegaInDouble")

  private BigDecimal vegaInDouble;

  @JsonProperty("rhoInDouble")

  private BigDecimal rhoInDouble;

  @JsonProperty("mark")
  private BigDecimal mark;

  @JsonProperty("tick")
  private BigDecimal tick;

  @JsonProperty("tickAmount")
  private BigDecimal tickAmount;

  @JsonProperty("futureIsTradable")
  private Boolean futureIsTradable;

  @JsonProperty("futureTradingHours")
  private String futureTradingHours;

  @JsonProperty("futurePercentChange")
  private BigDecimal futurePercentChange;

  @JsonProperty("futureIsActive")
  private Boolean futureIsActive;

  @JsonProperty("futureExpirationDate")
  private Long futureExpirationDate;

  @JsonProperty("expirationType")
  private String expirationType;

  @JsonProperty("exerciseType")
  private String exerciseType;

  @JsonProperty("inTheMoney")
  private Boolean inTheMoney;

  public BigDecimal getBidPriceInDouble() {
    return bidPriceInDouble;
  }

  public BigDecimal getAskPriceInDouble() {
    return askPriceInDouble;
  }

  public BigDecimal getLastPriceInDouble() {
    return lastPriceInDouble;
  }

  public BigDecimal getHighPriceInDouble() {
    return highPriceInDouble;
  }

  public BigDecimal getLowPriceInDouble() {
    return lowPriceInDouble;
  }

  public BigDecimal getClosePriceInDouble() {
    return closePriceInDouble;
  }

  public BigDecimal getOpenPriceInDouble() {
    return openPriceInDouble;
  }

  public BigDecimal getNetChangeInDouble() {
    return netChangeInDouble;
  }

  public BigDecimal getOpenInterest() {
    return openInterest;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public String getSecurityStatus() {
    return securityStatus;
  }

  public BigDecimal getVolatility() {
    return volatility;
  }

  public BigDecimal getMoneyIntrinsicValueInDouble() {
    return moneyIntrinsicValueInDouble;
  }

  public BigDecimal getMultiplierInDouble() {
    return multiplierInDouble;
  }

  public Long getDigits() {
    return digits;
  }

  public BigDecimal getStrikePriceInDouble() {
    return strikePriceInDouble;
  }

  public String getContractType() {
    return contractType;
  }

  public String getUnderlying() {
    return underlying;
  }

  public BigDecimal getTimeValueInDouble() {
    return timeValueInDouble;
  }

  public BigDecimal getDeltaInDouble() {
    return deltaInDouble;
  }

  public BigDecimal getGammaInDouble() {
    return gammaInDouble;
  }

  public BigDecimal getThetaInDouble() {
    return thetaInDouble;
  }

  public BigDecimal getVegaInDouble() {
    return vegaInDouble;
  }

  public BigDecimal getRhoInDouble() {
    return rhoInDouble;
  }

  public BigDecimal getMark() {
    return mark;
  }

  public BigDecimal getTick() {
    return tick;
  }

  public BigDecimal getTickAmount() {
    return tickAmount;
  }

  public Boolean getFutureIsTradable() {
    return futureIsTradable;
  }

  public String getFutureTradingHours() {
    return futureTradingHours;
  }

  public BigDecimal getFuturePercentChange() {
    return futurePercentChange;
  }

  public Boolean getFutureIsActive() {
    return futureIsActive;
  }

  public Long getFutureExpirationDate() {
    return futureExpirationDate;
  }

  public String getExpirationType() {
    return expirationType;
  }

  public String getExerciseType() {
    return exerciseType;
  }

  public Boolean getInTheMoney() {
    return inTheMoney;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("bidPriceInDouble", bidPriceInDouble)
        .append("askPriceInDouble", askPriceInDouble)
        .append("lastPriceInDouble", lastPriceInDouble)
        .append("highPriceInDouble", highPriceInDouble)
        .append("lowPriceInDouble", lowPriceInDouble)
        .append("closePriceInDouble", closePriceInDouble)
        .append("openPriceInDouble", openPriceInDouble)
        .append("netChangeInDouble", netChangeInDouble)
        .append("openInterest", openInterest)
        .append("exchangeName", exchangeName)
        .append("securityStatus", securityStatus)
        .append("volatility", volatility)
        .append("moneyIntrinsicValueInDouble", moneyIntrinsicValueInDouble)
        .append("multiplierInDouble", multiplierInDouble)
        .append("digits", digits)
        .append("strikePriceInDouble", strikePriceInDouble)
        .append("contractType", contractType)
        .append("underlying", underlying)
        .append("timeValueInDouble", timeValueInDouble)
        .append("deltaInDouble", deltaInDouble)
        .append("gammaInDouble", gammaInDouble)
        .append("thetaInDouble", thetaInDouble)
        .append("vegaInDouble", vegaInDouble)
        .append("rhoInDouble", rhoInDouble)
        .append("mark", mark)
        .append("tick", tick)
        .append("tickAmount", tickAmount)
        .append("futureIsTradable", futureIsTradable)
        .append("futureTradingHours", futureTradingHours)
        .append("futurePercentChange", futurePercentChange)
        .append("futureIsActive", futureIsActive)
        .append("futureExpirationDate", futureExpirationDate)
        .append("expirationType", expirationType)
        .append("exerciseType", exerciseType)
        .append("inTheMoney", inTheMoney)
        .toString();
  }
}

package com.studerw.tda.model.quote;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FutureQuote extends Quote implements Serializable {

  private final static long serialVersionUID = -6534945955741249771L;
  @JsonProperty("bidPriceInDouble")
  private BigDecimal bidPriceInDouble;
  @JsonProperty("askPriceInDouble")
  private BigDecimal askPriceInDouble;
  @JsonProperty("lastPriceInDouble")
  private BigDecimal lastPriceInDouble;
  @JsonProperty("bidId")
  private String bidId;
  @JsonProperty("askId")
  private String askId;
  @JsonProperty("highPriceInDouble")
  private BigDecimal highPriceInDouble;
  @JsonProperty("lowPriceInDouble")
  private BigDecimal lowPriceInDouble;
  @JsonProperty("closePriceInDouble")
  private BigDecimal closePriceInDouble;
  @JsonProperty("exchange")
  private String exchange;
  @JsonProperty("lastId")
  private String lastId;
  @JsonProperty("openPriceInDouble")
  private BigDecimal openPriceInDouble;
  @JsonProperty("changeInDouble")
  private BigDecimal changeInDouble;
  @JsonProperty("futurePercentChange")
  private BigDecimal futurePercentChange;
  @JsonProperty("exchangeName")
  private String exchangeName;
  @JsonProperty("securityStatus")
  private String securityStatus;
  @JsonProperty("openInterest")
  private BigDecimal openInterest;
  @JsonProperty("mark")
  private BigDecimal mark;
  @JsonProperty("tick")
  private BigDecimal tick;
  @JsonProperty("tickAmount")
  private BigDecimal tickAmount;
  @JsonProperty("product")
  private String product;
  @JsonProperty("futurePriceFormat")
  private String futurePriceFormat;
  @JsonProperty("futureTradingHours")
  private String futureTradingHours;
  @JsonProperty("futureIsTradable")
  private Boolean futureIsTradable;
  @JsonProperty("futureMultiplier")
  private BigDecimal futureMultiplier;
  @JsonProperty("futureIsActive")
  private Boolean futureIsActive;
  @JsonProperty("futureSettlementPrice")
  private BigDecimal futureSettlementPrice;
  @JsonProperty("futureActiveSymbol")
  private String futureActiveSymbol;
  @JsonProperty("futureExpirationDate")
  private String futureExpirationDate;

  public BigDecimal getBidPriceInDouble() {
    return bidPriceInDouble;
  }

  public BigDecimal getAskPriceInDouble() {
    return askPriceInDouble;
  }

  public BigDecimal getLastPriceInDouble() {
    return lastPriceInDouble;
  }

  public String getBidId() {
    return bidId;
  }

  public String getAskId() {
    return askId;
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

  public String getExchange() {
    return exchange;
  }

  public String getLastId() {
    return lastId;
  }

  public BigDecimal getOpenPriceInDouble() {
    return openPriceInDouble;
  }

  public BigDecimal getChangeInDouble() {
    return changeInDouble;
  }

  public BigDecimal getFuturePercentChange() {
    return futurePercentChange;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public String getSecurityStatus() {
    return securityStatus;
  }

  public BigDecimal getOpenInterest() {
    return openInterest;
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

  public String getProduct() {
    return product;
  }

  public String getFuturePriceFormat() {
    return futurePriceFormat;
  }

  public String getFutureTradingHours() {
    return futureTradingHours;
  }

  public Boolean getFutureIsTradable() {
    return futureIsTradable;
  }

  public BigDecimal getFutureMultiplier() {
    return futureMultiplier;
  }

  public Boolean getFutureIsActive() {
    return futureIsActive;
  }

  public BigDecimal getFutureSettlementPrice() {
    return futureSettlementPrice;
  }

  public String getFutureActiveSymbol() {
    return futureActiveSymbol;
  }

  public String getFutureExpirationDate() {
    return futureExpirationDate;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("bidPriceInDouble", bidPriceInDouble)
        .append("askPriceInDouble", askPriceInDouble)
        .append("lastPriceInDouble", lastPriceInDouble)
        .append("bidId", bidId)
        .append("askId", askId)
        .append("highPriceInDouble", highPriceInDouble)
        .append("lowPriceInDouble", lowPriceInDouble)
        .append("closePriceInDouble", closePriceInDouble)
        .append("exchange", exchange)
        .append("lastId", lastId)
        .append("openPriceInDouble", openPriceInDouble)
        .append("changeInDouble", changeInDouble)
        .append("futurePercentChange", futurePercentChange)
        .append("exchangeName", exchangeName)
        .append("securityStatus", securityStatus)
        .append("openInterest", openInterest)
        .append("mark", mark)
        .append("tick", tick)
        .append("tickAmount", tickAmount)
        .append("product", product)
        .append("futurePriceFormat", futurePriceFormat)
        .append("futureTradingHours", futureTradingHours)
        .append("futureIsTradable", futureIsTradable)
        .append("futureMultiplier", futureMultiplier)
        .append("futureIsActive", futureIsActive)
        .append("futureSettlementPrice", futureSettlementPrice)
        .append("futureActiveSymbol", futureActiveSymbol)
        .append("futureExpirationDate", futureExpirationDate)
        .toString();
  }
}

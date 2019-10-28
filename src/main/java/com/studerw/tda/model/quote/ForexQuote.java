package com.studerw.tda.model.quote;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ForexQuote extends Quote implements Serializable {

  private final static long serialVersionUID = 6629579214269168074L;
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
  @JsonProperty("exchange")
  private String exchange;
  @JsonProperty("openPriceInDouble")
  private BigDecimal openPriceInDouble;
  @JsonProperty("changeInDouble")
  private BigDecimal changeInDouble;
  @JsonProperty("percentChange")
  private BigDecimal percentChange;
  @JsonProperty("exchangeName")
  private String exchangeName;
  @JsonProperty("digits")
  private Long digits;
  @JsonProperty("securityStatus")
  private String securityStatus;
  @JsonProperty("tick")
  private BigDecimal tick;
  @JsonProperty("tickAmount")
  private BigDecimal tickAmount;
  @JsonProperty("product")
  private String product;
  @JsonProperty("tradingHours")
  private String tradingHours;
  @JsonProperty("isTradable")
  private Boolean isTradable;
  @JsonProperty("marketMaker")
  private String marketMaker;
  @JsonProperty("52WkHighInDouble")
  private BigDecimal _52WkHighInDouble;
  @JsonProperty("52WkLowInDouble")
  private BigDecimal _52WkLowInDouble;
  @JsonProperty("mark")
  private BigDecimal mark;

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

  public String getExchange() {
    return exchange;
  }

  public BigDecimal getOpenPriceInDouble() {
    return openPriceInDouble;
  }

  public BigDecimal getChangeInDouble() {
    return changeInDouble;
  }

  public BigDecimal getPercentChange() {
    return percentChange;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public Long getDigits() {
    return digits;
  }

  public String getSecurityStatus() {
    return securityStatus;
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

  public String getTradingHours() {
    return tradingHours;
  }

  public Boolean getTradable() {
    return isTradable;
  }

  public String getMarketMaker() {
    return marketMaker;
  }

  public BigDecimal get_52WkHighInDouble() {
    return _52WkHighInDouble;
  }

  public BigDecimal get_52WkLowInDouble() {
    return _52WkLowInDouble;
  }

  public BigDecimal getMark() {
    return mark;
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
        .append("exchange", exchange)
        .append("openPriceInDouble", openPriceInDouble)
        .append("changeInDouble", changeInDouble)
        .append("percentChange", percentChange)
        .append("exchangeName", exchangeName)
        .append("digits", digits)
        .append("securityStatus", securityStatus)
        .append("tick", tick)
        .append("tickAmount", tickAmount)
        .append("product", product)
        .append("tradingHours", tradingHours)
        .append("isTradable", isTradable)
        .append("marketMaker", marketMaker)
        .append("52WkHighInDouble", _52WkHighInDouble)
        .append("52WkLowInDouble", _52WkLowInDouble)
        .append("mark", mark)
        .toString();
  }
}

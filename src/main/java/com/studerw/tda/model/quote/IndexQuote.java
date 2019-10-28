package com.studerw.tda.model.quote;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class IndexQuote extends Quote implements Serializable {

  private final static long serialVersionUID = 1617675449656795991L;
  @JsonProperty("lastPrice")
  private BigDecimal lastPrice;
  @JsonProperty("openPrice")
  private BigDecimal openPrice;
  @JsonProperty("highPrice")
  private BigDecimal highPrice;
  @JsonProperty("lowPrice")
  private BigDecimal lowPrice;
  @JsonProperty("closePrice")
  private BigDecimal closePrice;
  @JsonProperty("netChange")
  private BigDecimal netChange;
  @JsonProperty("totalVolume")
  private Long totalVolume;
  @JsonProperty("tradeTimeInLong")
  private Long tradeTimeInLong;
  @JsonProperty("exchange")
  private String exchange;
  @JsonProperty("exchangeName")
  private String exchangeName;
  @JsonProperty("digits")
  private Long digits;
  @JsonProperty("52WkHigh")
  private BigDecimal _52WkHigh;
  @JsonProperty("52WkLow")
  private BigDecimal _52WkLow;
  @JsonProperty("securityStatus")
  private String securityStatus;

  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public BigDecimal getOpenPrice() {
    return openPrice;
  }

  public BigDecimal getHighPrice() {
    return highPrice;
  }

  public BigDecimal getLowPrice() {
    return lowPrice;
  }

  public BigDecimal getClosePrice() {
    return closePrice;
  }

  public BigDecimal getNetChange() {
    return netChange;
  }

  public Long getTotalVolume() {
    return totalVolume;
  }

  public Long getTradeTimeInLong() {
    return tradeTimeInLong;
  }

  public String getExchange() {
    return exchange;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public Long getDigits() {
    return digits;
  }

  public BigDecimal get_52WkHigh() {
    return _52WkHigh;
  }

  public BigDecimal get_52WkLow() {
    return _52WkLow;
  }

  public String getSecurityStatus() {
    return securityStatus;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("lastPrice", lastPrice)
        .append("openPrice", openPrice)
        .append("highPrice", highPrice)
        .append("lowPrice", lowPrice)
        .append("closePrice", closePrice)
        .append("netChange", netChange)
        .append("totalVolume", totalVolume)
        .append("tradeTimeInLong", tradeTimeInLong)
        .append("exchange", exchange)
        .append("exchangeName", exchangeName)
        .append("digits", digits)
        .append("52WkHigh", _52WkHigh)
        .append("52WkLow", _52WkLow)
        .append("securityStatus", securityStatus)
        .toString();
  }
}

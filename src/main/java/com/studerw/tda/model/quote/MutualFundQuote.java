package com.studerw.tda.model.quote;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MutualFundQuote extends Quote implements Serializable {

  private final static long serialVersionUID = 6499081434369769426L;
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
  @JsonProperty("nAV")
  private BigDecimal nAV;
  @JsonProperty("peRatio")
  private BigDecimal peRatio;
  @JsonProperty("divAmount")
  private BigDecimal divAmount;
  @JsonProperty("divYield")
  private BigDecimal divYield;
  @JsonProperty("divDate")
  private String divDate;
  @JsonProperty("securityStatus")
  private String securityStatus;

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

  public BigDecimal getnAV() {
    return nAV;
  }

  public BigDecimal getPeRatio() {
    return peRatio;
  }

  public BigDecimal getDivAmount() {
    return divAmount;
  }

  public BigDecimal getDivYield() {
    return divYield;
  }

  public String getDivDate() {
    return divDate;
  }

  public String getSecurityStatus() {
    return securityStatus;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("closePrice", closePrice)
        .append("netChange", netChange)
        .append("totalVolume", totalVolume)
        .append("tradeTimeInLong", tradeTimeInLong)
        .append("exchange", exchange)
        .append("exchangeName", exchangeName)
        .append("digits", digits)
        .append("52WkHigh", _52WkHigh)
        .append("52WkLow", _52WkLow)
        .append("nAV", nAV)
        .append("peRatio", peRatio)
        .append("divAmount", divAmount)
        .append("divYield", divYield)
        .append("divDate", divDate)
        .append("securityStatus", securityStatus)
        .toString();
  }
}

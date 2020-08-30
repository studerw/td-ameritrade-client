package com.studerw.tda.model.quote;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OptionQuote extends Quote implements Serializable {

  private final static long serialVersionUID = 5700643694979579869L;

  @JsonProperty("askPrice")
  private BigDecimal askPrice;

  @JsonProperty("askSize")
  private Long askSize;

  @JsonProperty("bidPrice")
  private BigDecimal bidPrice;

  @JsonProperty("bidSize")
  private Long bidSize;

  @JsonProperty("closePrice")
  private BigDecimal closePrice;

  @JsonProperty("contractType")
  private String contractType;

  @JsonProperty("deliverables")
  private String deliverables;

  @JsonProperty("delta")
  private BigDecimal delta;

  @JsonProperty("exchange")
  private String exchange;

  @JsonProperty("exchangeName")
  private String exchangeName;

  @JsonProperty("gamma")
  private BigDecimal gamma;

  @JsonProperty("highPrice")
  private BigDecimal highPrice;

  @JsonProperty("lastPrice")
  private BigDecimal lastPrice;

  @JsonProperty("lastSize")
  private Long lastSize;

  @JsonProperty("lowPrice")
  private BigDecimal lowPrice;

  @JsonProperty("openPrice")
  private BigDecimal openPrice;

  @JsonProperty("mark")
  private BigDecimal mark;

  @JsonProperty("moneyIntrinsicValue")
  private BigDecimal moneyIntrinsicValue;

  @JsonProperty("multiplier")
  private BigDecimal multiplier;

  @JsonProperty("netChange")
  private BigDecimal netChange;

  @JsonProperty("openInterest")
  private BigDecimal openInterest;

  @JsonProperty("quoteTimeInLong")
  private Long quoteTimeInLong;

  @JsonProperty("rho")
  private BigDecimal rho;

  @JsonProperty("securityStatus")
  private String securityStatus;

  @JsonProperty("settlementType")
  private String settlementType;

  @JsonProperty("strikePrice")
  private BigDecimal strikePrice;

  @JsonProperty("timeValue")
  private BigDecimal timeValue;

  @JsonProperty("theta")
  private BigDecimal theta;

  @JsonProperty("theoreticalOptionValue")
  private BigDecimal theoreticalOptionValue;

  @JsonProperty("totalVolume")
  private Long totalVolume;

  @JsonProperty("tradeTimeInLong")
  private Long tradeTimeInLong;

  @JsonProperty("volatility")
  private BigDecimal volatility;

  @JsonProperty("underlying")
  private String underlying;

  @JsonProperty("vega")
  private BigDecimal vega;

  @JsonProperty("underlyingPrice")
  private BigDecimal underlyingPrice;

  @JsonProperty("uvExpirationType")
  private String uvExpirationType;

  public BigDecimal getBidPrice() {
    return bidPrice;
  }

  public Long getBidSize() {
    return bidSize;
  }

  public BigDecimal getAskPrice() {
    return askPrice;
  }

  public Long getAskSize() {
    return askSize;
  }

  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public Long getLastSize() {
    return lastSize;
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

  public Long getQuoteTimeInLong() {
    return quoteTimeInLong;
  }

  public Long getTradeTimeInLong() {
    return tradeTimeInLong;
  }

  public BigDecimal getMark() {
    return mark;
  }

  public BigDecimal getOpenInterest() {
    return openInterest;
  }

  public BigDecimal getVolatility() {
    return volatility;
  }

  public BigDecimal getMoneyIntrinsicValue() {
    return moneyIntrinsicValue;
  }

  public BigDecimal getMultiplier() {
    return multiplier;
  }

  public BigDecimal getStrikePrice() {
    return strikePrice;
  }

  public String getContractType() {
    return contractType;
  }

  public String getUnderlying() {
    return underlying;
  }

  public BigDecimal getTimeValue() {
    return timeValue;
  }

  public String getDeliverables() {
    return deliverables;
  }

  public BigDecimal getDelta() {
    return delta;
  }

  public BigDecimal getGamma() {
    return gamma;
  }

  public BigDecimal getTheta() {
    return theta;
  }

  public BigDecimal getVega() {
    return vega;
  }

  public BigDecimal getRho() {
    return rho;
  }

  public String getSecurityStatus() {
    return securityStatus;
  }

  public BigDecimal getTheoreticalOptionValue() {
    return theoreticalOptionValue;
  }

  public BigDecimal getUnderlyingPrice() {
    return underlyingPrice;
  }

  public String getUvExpirationType() {
    return uvExpirationType;
  }

  public String getExchange() {
    return exchange;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public String getSettlementType() {
    return settlementType;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("bidPrice", bidPrice)
        .append("bidSize", bidSize)
        .append("askPrice", askPrice)
        .append("askSize", askSize)
        .append("lastPrice", lastPrice)
        .append("lastSize", lastSize)
        .append("openPrice", openPrice)
        .append("highPrice", highPrice)
        .append("lowPrice", lowPrice)
        .append("closePrice", closePrice)
        .append("netChange", netChange)
        .append("totalVolume", totalVolume)
        .append("quoteTimeInLong", quoteTimeInLong)
        .append("tradeTimeInLong", tradeTimeInLong)
        .append("mark", mark)
        .append("openInterest", openInterest)
        .append("volatility", volatility)
        .append("moneyIntrinsicValue", moneyIntrinsicValue)
        .append("multiplier", multiplier)
        .append("strikePrice", strikePrice)
        .append("contractType", contractType)
        .append("underlying", underlying)
        .append("timeValue", timeValue)
        .append("deliverables", deliverables)
        .append("delta", delta)
        .append("gamma", gamma)
        .append("theta", theta)
        .append("vega", vega)
        .append("rho", rho)
        .append("securityStatus", securityStatus)
        .append("theoreticalOptionValue", theoreticalOptionValue)
        .append("underlyingPrice", underlyingPrice)
        .append("uvExpirationType", uvExpirationType)
        .append("exchange", exchange)
        .append("exchangeName", exchangeName)
        .append("settlementType", settlementType)
        .toString();
  }
}

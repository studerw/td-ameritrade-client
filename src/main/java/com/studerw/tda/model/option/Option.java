package com.studerw.tda.model.option;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.studerw.tda.model.account.OptionDeliverable;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Option
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Option implements Serializable {

  private final static long serialVersionUID = -6922953717171708238L;

  @JsonProperty("putCall")
  private PutCall putCall;

  @JsonProperty("symbol")
  private String symbol;

  @JsonProperty("description")
  private String description;

  @JsonProperty("exchangeName")
  private String exchangeName;

  @JsonAlias({"bid"})
  @JsonProperty("bidPrice")
  private BigDecimal bidPrice;

  @JsonAlias({"ask"})
  @JsonProperty("askPrice")
  private BigDecimal askPrice;

  @JsonAlias({"last"})
  @JsonProperty("lastPrice")
  private BigDecimal lastPrice;

  @JsonProperty("bidAskSize")
  private String bidAskSize;

  @JsonAlias({"mark"})
  @JsonProperty("markPrice")
  private BigDecimal markPrice;

  @JsonProperty("bidSize")
  private Long bidSize;

  @JsonProperty("askSize")
  private Long askSize;

  @JsonProperty("lastSize")
  private Long lastSize;

  @JsonProperty("highPrice")
  private BigDecimal highPrice;

  @JsonProperty("lowPrice")
  private BigDecimal lowPrice;

  @JsonProperty("openPrice")
  private BigDecimal openPrice;

  @JsonProperty("closePrice")
  private BigDecimal closePrice;

  @JsonProperty("totalVolume")
  private Long totalVolume;

  @JsonProperty("quoteTimeInLong")
  private Long quoteTimeInLong;

  @JsonProperty("tradeTimeInLong")
  private Long tradeTimeInLong;

  @JsonProperty("netChange")
  private BigDecimal netChange;

  @JsonProperty("volatility")
  private BigDecimal volatility;

  @JsonProperty("delta")
  private BigDecimal delta;

  @JsonProperty("gamma")
  private BigDecimal gamma;

  @JsonProperty("theta")
  private BigDecimal theta;

  @JsonProperty("vega")
  private BigDecimal vega;

  @JsonProperty("rho")
  private BigDecimal rho;

  @JsonProperty("timeValue")
  private BigDecimal timeValue;

  @JsonProperty("openInterest")
  private BigDecimal openInterest;

  @JsonAlias({"inTheMoney"})
  @JsonProperty("isInTheMoney")
  private Boolean isInTheMoney;

  @JsonProperty("theoreticalOptionValue")
  private BigDecimal theoreticalOptionValue;

  @JsonProperty("theoreticalVolatility")
  private BigDecimal theoreticalVolatility;

  @JsonAlias({"mini"})
  @JsonProperty("isMini")
  private Boolean isMini;

  @JsonProperty("isNonStandard")
  @JsonAlias({"nonStandard"})
  private Boolean isNonStandard;

  @JsonProperty("optionDeliverablesList")
  private List<OptionDeliverable> optionDeliverablesList = new ArrayList<>();

  @JsonProperty("strikePrice")
  private BigDecimal strikePrice;

  @JsonProperty("expirationDate")
  private Long expirationDate;

  @JsonProperty("expirationType")
  private String expirationType;

  @JsonProperty("multiplier")
  private BigDecimal multiplier;

  @JsonProperty("settlementType")
  private String settlementType;

  @JsonProperty("deliverableNote")
  private String deliverableNote;

  @JsonProperty("isIndexOption")
  private Boolean isIndexOption;

  @JsonProperty("percentChange")
  private BigDecimal percentChange;

  @JsonProperty("markChange")
  private BigDecimal markChange;

  @JsonProperty("markPercentChange")
  private BigDecimal markPercentChange;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public PutCall getPutCall() {
    return putCall;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getDescription() {
    return description;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public BigDecimal getBidPrice() {
    return bidPrice;
  }

  public BigDecimal getAskPrice() {
    return askPrice;
  }

  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public String getBidAskSize() {
    return bidAskSize;
  }

  public BigDecimal getMarkPrice() {
    return markPrice;
  }

  public Long getBidSize() {
    return bidSize;
  }

  public Long getAskSize() {
    return askSize;
  }

  public Long getLastSize() {
    return lastSize;
  }

  public BigDecimal getHighPrice() {
    return highPrice;
  }

  public BigDecimal getLowPrice() {
    return lowPrice;
  }

  public BigDecimal getOpenPrice() {
    return openPrice;
  }

  public BigDecimal getClosePrice() {
    return closePrice;
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

  public BigDecimal getNetChange() {
    return netChange;
  }

  public BigDecimal getVolatility() {
    return volatility;
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

  public BigDecimal getTimeValue() {
    return timeValue;
  }

  public BigDecimal getOpenInterest() {
    return openInterest;
  }

  public Boolean getInTheMoney() {
    return isInTheMoney;
  }

  public BigDecimal getTheoreticalOptionValue() {
    return theoreticalOptionValue;
  }

  public BigDecimal getTheoreticalVolatility() {
    return theoreticalVolatility;
  }

  public Boolean getMini() {
    return isMini;
  }

  public Boolean getNonStandard() {
    return isNonStandard;
  }

  public List<OptionDeliverable> getOptionDeliverablesList() {
    return optionDeliverablesList;
  }

  public BigDecimal getStrikePrice() {
    return strikePrice;
  }

  public Long getExpirationDate() {
    return expirationDate;
  }

  public String getExpirationType() {
    return expirationType;
  }

  public BigDecimal getMultiplier() {
    return multiplier;
  }

  public String getSettlementType() {
    return settlementType;
  }

  public String getDeliverableNote() {
    return deliverableNote;
  }

  public Boolean getIndexOption() {
    return isIndexOption;
  }

  public BigDecimal getPercentChange() {
    return percentChange;
  }

  public BigDecimal getMarkChange() {
    return markChange;
  }

  public BigDecimal getMarkPercentChange() {
    return markPercentChange;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("putCall", putCall)
        .append("symbol", symbol)
        .append("description", description)
        .append("exchangeName", exchangeName)
        .append("bidPrice", bidPrice)
        .append("askPrice", askPrice)
        .append("lastPrice", lastPrice)
        .append("bidAskSize", bidAskSize)
        .append("markPrice", markPrice)
        .append("bidSize", bidSize)
        .append("askSize", askSize)
        .append("lastSize", lastSize)
        .append("highPrice", highPrice)
        .append("lowPrice", lowPrice)
        .append("openPrice", openPrice)
        .append("closePrice", closePrice)
        .append("totalVolume", totalVolume)
        .append("quoteTimeInLong", quoteTimeInLong)
        .append("tradeTimeInLong", tradeTimeInLong)
        .append("netChange", netChange)
        .append("volatility", volatility)
        .append("delta", delta)
        .append("gamma", gamma)
        .append("theta", theta)
        .append("vega", vega)
        .append("rho", rho)
        .append("timeValue", timeValue)
        .append("openInterest", openInterest)
        .append("isInTheMoney", isInTheMoney)
        .append("theoreticalOptionValue", theoreticalOptionValue)
        .append("theoreticalVolatility", theoreticalVolatility)
        .append("isMini", isMini)
        .append("isNonStandard", isNonStandard)
        .append("optionDeliverablesList", optionDeliverablesList)
        .append("strikePrice", strikePrice)
        .append("expirationDate", expirationDate)
        .append("expirationType", expirationType)
        .append("multiplier", multiplier)
        .append("settlementType", settlementType)
        .append("deliverableNote", deliverableNote)
        .append("isIndexOption", isIndexOption)
        .append("percentChange", percentChange)
        .append("markChange", markChange)
        .append("markPercentChange", markPercentChange)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum PutCall {
    PUT,
    CALL
  }

}

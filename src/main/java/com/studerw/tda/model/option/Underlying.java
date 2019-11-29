package com.studerw.tda.model.option;

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


/**
 * Underlying
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Underlying implements Serializable {

  private final static long serialVersionUID = -5823669960209725841L;
  @JsonProperty("ask")
  private BigDecimal ask;
  @JsonProperty("askSize")
  private Long askSize;
  @JsonProperty("bid")
  private BigDecimal bid;
  @JsonProperty("bidSize")
  private Long bidSize;
  @JsonProperty("change")
  private BigDecimal change;
  @JsonProperty("close")
  private BigDecimal close;
  @JsonProperty("delayed")
  private Boolean delayed;
  @JsonProperty("description")
  private String description;
  @JsonProperty("exchangeName")
  private Underlying.ExchangeName exchangeName;
  @JsonProperty("fiftyTwoWeekHigh")
  private BigDecimal fiftyTwoWeekHigh;
  @JsonProperty("fiftyTwoWeekLow")
  private BigDecimal fiftyTwoWeekLow;
  @JsonProperty("highPrice")
  private BigDecimal highPrice;
  @JsonProperty("last")
  private BigDecimal last;
  @JsonProperty("lowPrice")
  private BigDecimal lowPrice;
  @JsonProperty("mark")
  private BigDecimal mark;
  @JsonProperty("markChange")
  private BigDecimal markChange;
  @JsonProperty("markPercentChange")
  private BigDecimal markPercentChange;
  @JsonProperty("openPrice")
  private BigDecimal openPrice;
  @JsonProperty("percentChange")
  private BigDecimal percentChange;
  @JsonProperty("quoteTime")
  private Long quoteTime;
  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("totalVolume")
  private Long totalVolume;
  @JsonProperty("tradeTime")
  private Long tradeTime;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public BigDecimal getAsk() {
    return ask;
  }

  public Long getAskSize() {
    return askSize;
  }

  public BigDecimal getBid() {
    return bid;
  }

  public Long getBidSize() {
    return bidSize;
  }

  public BigDecimal getChange() {
    return change;
  }

  public BigDecimal getClose() {
    return close;
  }

  public Boolean getDelayed() {
    return delayed;
  }

  public String getDescription() {
    return description;
  }

  public ExchangeName getExchangeName() {
    return exchangeName;
  }

  public BigDecimal getFiftyTwoWeekHigh() {
    return fiftyTwoWeekHigh;
  }

  public BigDecimal getFiftyTwoWeekLow() {
    return fiftyTwoWeekLow;
  }

  public BigDecimal getHighPrice() {
    return highPrice;
  }

  public BigDecimal getLast() {
    return last;
  }

  public BigDecimal getLowPrice() {
    return lowPrice;
  }

  public BigDecimal getMark() {
    return mark;
  }

  public BigDecimal getMarkChange() {
    return markChange;
  }

  public BigDecimal getMarkPercentChange() {
    return markPercentChange;
  }

  public BigDecimal getOpenPrice() {
    return openPrice;
  }

  public BigDecimal getPercentChange() {
    return percentChange;
  }

  public Long getQuoteTime() {
    return quoteTime;
  }

  public String getSymbol() {
    return symbol;
  }

  public Long getTotalVolume() {
    return totalVolume;
  }

  public Long getTradeTime() {
    return tradeTime;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("ask", ask)
        .append("askSize", askSize)
        .append("bid", bid)
        .append("bidSize", bidSize)
        .append("change", change)
        .append("close", close)
        .append("delayed", delayed)
        .append("description", description)
        .append("exchangeName", exchangeName)
        .append("fiftyTwoWeekHigh", fiftyTwoWeekHigh)
        .append("fiftyTwoWeekLow", fiftyTwoWeekLow)
        .append("highPrice", highPrice)
        .append("last", last)
        .append("lowPrice", lowPrice)
        .append("mark", mark)
        .append("markChange", markChange)
        .append("markPercentChange", markPercentChange)
        .append("openPrice", openPrice)
        .append("percentChange", percentChange)
        .append("quoteTime", quoteTime)
        .append("symbol", symbol)
        .append("totalVolume", totalVolume)
        .append("tradeTime", tradeTime)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum ExchangeName {
    IND,
    ASE,
    NYS,
    NAS,
    NAP,
    PAC,
    OPR,
    BATS
  }
}

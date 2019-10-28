package com.studerw.tda.model.quote;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EtfQuote extends Quote implements Serializable {

  private final static long serialVersionUID = 4708352699832618193L;
  @JsonProperty("bidPrice")
  private BigDecimal bidPrice;
  @JsonProperty("bidSize")
  private Long bidSize;
  @JsonProperty("bidId")
  private String bidId;
  @JsonProperty("askPrice")
  private BigDecimal askPrice;
  @JsonProperty("askSize")
  private Long askSize;
  @JsonProperty("askId")
  private String askId;
  @JsonProperty("lastPrice")
  private BigDecimal lastPrice;
  @JsonProperty("lastSize")
  private Long lastSize;
  @JsonProperty("lastId")
  private String lastId;
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
  @JsonProperty("quoteTimeInLong")
  private Long quoteTimeInLong;
  @JsonProperty("tradeTimeInLong")
  private Long tradeTimeInLong;
  @JsonProperty("mark")
  private BigDecimal mark;
  @JsonProperty("exchange")
  private String exchange;
  @JsonProperty("exchangeName")
  private String exchangeName;
  @JsonProperty("marginable")
  private Boolean marginable;
  @JsonProperty("shortable")
  private Boolean shortable;
  @JsonProperty("volatility")
  private BigDecimal volatility;
  @JsonProperty("digits")
  private Long digits;
  @JsonProperty("52WkHigh")
  private BigDecimal _52WkHigh;
  @JsonProperty("52WkLow")
  private BigDecimal _52WkLow;
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
  @JsonProperty("regularMarketLastPrice")
  private BigDecimal regularMarketLastPrice;
  @JsonProperty("regularMarketLastSize")
  private Long regularMarketLastSize;
  @JsonProperty("regularMarketNetChange")
  private BigDecimal regularMarketNetChange;
  @JsonProperty("regularMarketTradeTimeInLong")
  private Long regularMarketTradeTimeInLong;

  public BigDecimal getBidPrice() {
    return bidPrice;
  }

  public Long getBidSize() {
    return bidSize;
  }

  public String getBidId() {
    return bidId;
  }

  public BigDecimal getAskPrice() {
    return askPrice;
  }

  public Long getAskSize() {
    return askSize;
  }

  public String getAskId() {
    return askId;
  }

  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public Long getLastSize() {
    return lastSize;
  }

  public String getLastId() {
    return lastId;
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

  public String getExchange() {
    return exchange;
  }

  public String getExchangeName() {
    return exchangeName;
  }

  public Boolean getMarginable() {
    return marginable;
  }

  public Boolean getShortable() {
    return shortable;
  }

  public BigDecimal getVolatility() {
    return volatility;
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

  public BigDecimal getRegularMarketLastPrice() {
    return regularMarketLastPrice;
  }

  public Long getRegularMarketLastSize() {
    return regularMarketLastSize;
  }

  public BigDecimal getRegularMarketNetChange() {
    return regularMarketNetChange;
  }

  public Long getRegularMarketTradeTimeInLong() {
    return regularMarketTradeTimeInLong;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("bidPrice", bidPrice)
        .append("bidSize", bidSize)
        .append("bidId", bidId)
        .append("askPrice", askPrice)
        .append("askSize", askSize)
        .append("askId", askId)
        .append("lastPrice", lastPrice)
        .append("lastSize", lastSize)
        .append("lastId", lastId)
        .append("openPrice", openPrice)
        .append("highPrice", highPrice)
        .append("lowPrice", lowPrice)
        .append("closePrice", closePrice)
        .append("netChange", netChange)
        .append("totalVolume", totalVolume)
        .append("quoteTimeInLong", quoteTimeInLong)
        .append("tradeTimeInLong", tradeTimeInLong)
        .append("mark", mark)
        .append("exchange", exchange)
        .append("exchangeName", exchangeName)
        .append("marginable", marginable)
        .append("shortable", shortable)
        .append("volatility", volatility)
        .append("digits", digits)
        .append("52WkHigh", _52WkHigh)
        .append("52WkLow", _52WkLow)
        .append("peRatio", peRatio)
        .append("divAmount", divAmount)
        .append("divYield", divYield)
        .append("divDate", divDate)
        .append("securityStatus", securityStatus)
        .append("regularMarketLastPrice", regularMarketLastPrice)
        .append("regularMarketLastSize", regularMarketLastSize)
        .append("regularMarketNetChange", regularMarketNetChange)
        .append("regularMarketTradeTimeInLong", regularMarketTradeTimeInLong)
        .toString();
  }
}

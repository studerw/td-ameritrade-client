package com.studerw.tda.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultStr",
    "error",
    "result"
})
@XmlRootElement(name = "amtd")
public class QuoteResponse extends BaseTda {

  @XmlElement(required = true, name = "result")
  protected String resultStr;
  @XmlElement
  protected String error;
  @XmlElement(name = "quote-list")
  protected QuoteResponse.Result result;

  public String getResultStr() {
    return resultStr;
  }

  public void setResultStr(String value) {
    this.resultStr = value;
  }

  public String getError() {
    return error;
  }

  public void setError(String value) {
    this.error = value;
  }

  public QuoteResponse.Result getResult() {
    return result;
  }

  public void setQuoteResult(QuoteResponse.Result value) {
    this.result = value;
  }


  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "quote-list")
  public static class Result {

    @XmlElement(required = true)
    protected String error;
    @XmlElement(name = "quote")
    protected List<QuoteResponse.Result.Quote> quotes;

    /**
     * Gets the value of the error property.
     *
     * @return possible object is {@link String }
     */
    public String getError() {
      return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value allowed object is {@link String }
     */
    public void setError(String value) {
      this.error = value;
    }

    public List<QuoteResponse.Result.Quote> getQuotes() {
      if (quotes == null) {
        quotes = new ArrayList<QuoteResponse.Result.Quote>();
      }
      return this.quotes;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "quote", propOrder = {
        "error",
        "symbol",
        "description",
        "bid",
        "ask",
        "bidAskSize",
        "last",
        "lastTradeSize",
        "lastTradeDate",
        "open",
        "high",
        "low",
        "close",
        "volume",
        "yearHigh",
        "yearLow",
        "realTime",
        "exchange",
        "assetType",
        "change",
        "changePercent",
        "nav",
        "offer",
        "strikePrice",
        "openInterest",
        "expirationMonth",
        "expirationDay",
        "expirationYear",
        "underlyingSymbol",
        "putCall",
        "delta",
        "gamma",
        "theta",
        "vega",
        "rho",
        "impliedVolatility",
        "daysToExpiration",
        "timeValueIndex",
        "multiplier"
    })
    public static class Quote {

      protected String error;
      protected String symbol;
      protected String description;
      protected BigDecimal bid;
      protected BigDecimal ask;
      @XmlElement(name = "bid-ask-size")
      protected String bidAskSize;
      protected BigDecimal last;
      @XmlElement(name = "last-trade-size")
      protected Integer lastTradeSize;
      @XmlElement(name = "last-trade-date")
      protected ZonedDateTime lastTradeDate;
      protected BigDecimal open;
      protected BigDecimal high;
      protected BigDecimal low;
      protected BigDecimal close;
      protected Integer volume;
      @XmlElement(name = "year-high")
      protected BigDecimal yearHigh;
      @XmlElement(name = "year-low")
      protected BigDecimal yearLow;
      @XmlElement(name = "real-time")
      protected Boolean realTime;
      protected String exchange;
      @XmlElement(name = "asset-type")
      protected String assetType;
      protected BigDecimal change;
      @XmlElement(name = "change-percent")
      protected String changePercent;
      protected String nav;
      protected String offer;
      @XmlElement(name = "strike-price")
      protected String strikePrice;
      @XmlElement(name = "open-interest")
      protected String openInterest;
      @XmlElement(name = "expiration-month")
      protected String expirationMonth;
      @XmlElement(name = "expiration-day")
      protected String expirationDay;
      @XmlElement(name = "expiration-year")
      protected String expirationYear;
      @XmlElement(name = "underlying-symbol")
      protected String underlyingSymbol;
      @XmlElement(name = "put-call")
      protected String putCall;
      protected Double delta;
      protected Double gamma;
      protected Double theta;
      protected Double vega;
      protected Double rho;
      @XmlElement(name = "implied-volatility")
      protected Double impliedVolatility;
      @XmlElement(name = "days-to-expiration")
      protected Integer daysToExpiration;
      @XmlElement(name = "time-value-index")
      protected Double timeValueIndex;
      protected BigDecimal multiplier;

      public String getError() {
        return error;
      }

      public void setError(String value) {
        this.error = value;
      }

      public String getSymbol() {
        return symbol;
      }

      public void setSymbol(String value) {
        this.symbol = value;
      }

      public String getDescription() {
        return description;
      }

      public void setDescription(String value) {
        this.description = value;
      }

      public BigDecimal getBid() {
        return bid;
      }

      public void setBid(BigDecimal value) {
        this.bid = value;
      }

      public BigDecimal getAsk() {
        return ask;
      }

      public void setAsk(BigDecimal value) {
        this.ask = value;
      }

      public String getBidAskSize() {
        return bidAskSize;
      }

      public void setBidAskSize(String value) {
        this.bidAskSize = value;
      }

      public BigDecimal getLast() {
        return last;
      }

      public void setLast(BigDecimal value) {
        this.last = value;
      }

      public Integer getLastTradeSize() {
        return lastTradeSize;
      }

      public void setLastTradeSize(Integer value) {
        this.lastTradeSize = value;
      }

      public ZonedDateTime getLastTradeDate() {
        return lastTradeDate;
      }

      public void setLastTradeDate(ZonedDateTime value) {
        this.lastTradeDate = value;
      }

      public BigDecimal getOpen() {
        return open;
      }

      public void setOpen(BigDecimal value) {
        this.open = value;
      }

      public BigDecimal getHigh() {
        return high;
      }

      public void setHigh(BigDecimal value) {
        this.high = value;
      }

      public BigDecimal getLow() {
        return low;
      }

      public void setLow(BigDecimal value) {
        this.low = value;
      }

      public BigDecimal getClose() {
        return close;
      }

      public void setClose(BigDecimal value) {
        this.close = value;
      }

      public Integer getVolume() {
        return volume;
      }

      public void setVolume(Integer value) {
        this.volume = value;
      }

      public BigDecimal getYearHigh() {
        return yearHigh;
      }

      public void setYearHigh(BigDecimal value) {
        this.yearHigh = value;
      }

      public BigDecimal getYearLow() {
        return yearLow;
      }

      public void setYearLow(BigDecimal value) {
        this.yearLow = value;
      }

      public Boolean getRealTime() {
        return realTime;
      }

      public void setRealTime(Boolean value) {
        this.realTime = value;
      }

      public String getExchange() {
        return exchange;
      }

      public void setExchange(String value) {
        this.exchange = value;
      }

      public String getAssetType() {
        return assetType;
      }

      public void setAssetType(String value) {
        this.assetType = value;
      }

      public BigDecimal getChange() {
        return change;
      }

      public void setChange(BigDecimal value) {
        this.change = value;
      }

      public String getChangePercent() {
        return changePercent;
      }

      public void setChangePercent(String value) {
        this.changePercent = value;
      }

      public String getNav() {
        return nav;
      }

      public void setNav(String value) {
        this.nav = value;
      }

      public String getOffer() {
        return offer;
      }

      public void setOffer(String value) {
        this.offer = value;
      }

      public String getStrikePrice() {
        return strikePrice;
      }

      public void setStrikePrice(String value) {
        this.strikePrice = value;
      }

      public String getOpenInterest() {
        return openInterest;
      }

      public void setOpenInterest(String value) {
        this.openInterest = value;
      }

      public String getExpirationMonth() {
        return expirationMonth;
      }

      public void setExpirationMonth(String value) {
        this.expirationMonth = value;
      }

      public String getExpirationDay() {
        return expirationDay;
      }

      public void setExpirationDay(String value) {
        this.expirationDay = value;
      }

      public String getExpirationYear() {
        return expirationYear;
      }

      public void setExpirationYear(String value) {
        this.expirationYear = value;
      }

      public String getUnderlyingSymbol() {
        return underlyingSymbol;
      }

      public void setUnderlyingSymbol(String value) {
        this.underlyingSymbol = value;
      }

      public String getPutCall() {
        return putCall;
      }

      public void setPutCall(String value) {
        this.putCall = value;
      }

      public Double getDelta() {
        return delta;
      }

      public void setDelta(Double value) {
        this.delta = value;
      }

      public Double getGamma() {
        return gamma;
      }

      public void setGamma(Double value) {
        this.gamma = value;
      }

      public Double getTheta() {
        return theta;
      }

      public void setTheta(Double value) {
        this.theta = value;
      }

      public Double getVega() {
        return vega;
      }

      public void setVega(Double value) {
        this.vega = value;
      }

      public Double getRho() {
        return rho;
      }

      public void setRho(Double value) {
        this.rho = value;
      }

      public Double getImpliedVolatility() {
        return impliedVolatility;
      }

      public void setImpliedVolatility(Double value) {
        this.impliedVolatility = value;
      }

      public Integer getDaysToExpiration() {
        return daysToExpiration;
      }

      public void setDaysToExpiration(Integer value) {
        this.daysToExpiration = value;
      }

      public Double getTimeValueIndex() {
        return timeValueIndex;
      }

      public void setTimeValueIndex(Double value) {
        this.timeValueIndex = value;
      }

      public BigDecimal getMultiplier() {
        return multiplier;
      }

      public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
      }

    }
  }

}

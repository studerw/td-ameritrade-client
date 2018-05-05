package com.studerw.tda.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"result",
		"error",
		"quoteList"
})
@XmlRootElement(name = "amtd")
public class QuoteResponseBetter extends BaseTda {

	@XmlElement(required = true)
	protected String result;
	@XmlElement
	protected String error;
	@XmlElement(name = "quote-list")
	protected QuoteResponseBetter.QuoteList quoteList;

	public String getResult() {
		return result;
	}

	public void setResult(String value) {
		this.result = value;
	}

	public String getError() {
		return error;
	}

	public void setError(String value) {
		this.error = value;
	}

	public QuoteResponseBetter.QuoteList getQuoteList() {
		return quoteList;
	}

	public void setQuoteList(QuoteResponseBetter.QuoteList value) {
		this.quoteList = value;
	}


	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "quote-list")
	public static class QuoteList {

		@XmlElement(required = true)
		protected String error;
		@XmlElement(name="quote")
		protected List<QuoteResponseBetter.QuoteList.Quote> quotes;

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

		public List<QuoteResponseBetter.QuoteList.Quote> getQuotes() {
			if (quotes == null) {
				quotes = new ArrayList<QuoteResponseBetter.QuoteList.Quote>();
			}
			return this.quotes;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "quote",  propOrder = {
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
			protected String bid;
			protected String ask;
			@XmlElement(name = "bid-ask-size")
			protected String bidAskSize;
			protected String last;
			@XmlElement(name = "last-trade-size")
			protected String lastTradeSize;
			@XmlElement(name = "last-trade-date")
			protected String lastTradeDate;
			protected String open;
			protected String high;
			protected String low;
			protected String close;
			protected String volume;
			@XmlElement(name = "year-high")
			protected String yearHigh;
			@XmlElement(name = "year-low")
			protected String yearLow;
			@XmlElement(name = "real-time")
			protected String realTime;
			protected String exchange;
			@XmlElement(name = "asset-type")
			protected String assetType;
			protected String change;
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
			protected String delta;
			protected String gamma;
			protected String theta;
			protected String vega;
			protected String rho;
			@XmlElement(name = "implied-volatility")
			protected String impliedVolatility;
			@XmlElement(name = "days-to-expiration")
			protected String daysToExpiration;
			@XmlElement(name = "time-value-index")
			protected String timeValueIndex;
			protected String multiplier;

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

			public String getBid() {
				return bid;
			}

			public void setBid(String value) {
				this.bid = value;
			}

			public String getAsk() {
				return ask;
			}

			public void setAsk(String value) {
				this.ask = value;
			}

			public String getBidAskSize() {
				return bidAskSize;
			}

			public void setBidAskSize(String value) {
				this.bidAskSize = value;
			}

			public String getLast() {
				return last;
			}

			public void setLast(String value) {
				this.last = value;
			}

			public String getLastTradeSize() {
				return lastTradeSize;
			}

			public void setLastTradeSize(String value) {
				this.lastTradeSize = value;
			}

			public String getLastTradeDate() {
				return lastTradeDate;
			}

			public void setLastTradeDate(String value) {
				this.lastTradeDate = value;
			}

			public String getOpen() {
				return open;
			}

			public void setOpen(String value) {
				this.open = value;
			}

			public String getHigh() {
				return high;
			}

			public void setHigh(String value) {
				this.high = value;
			}

			public String getLow() {
				return low;
			}

			public void setLow(String value) {
				this.low = value;
			}

			public String getClose() {
				return close;
			}

			public void setClose(String value) {
				this.close = value;
			}

			public String getVolume() {
				return volume;
			}

			public void setVolume(String value) {
				this.volume = value;
			}

			public String getYearHigh() {
				return yearHigh;
			}

			public void setYearHigh(String value) {
				this.yearHigh = value;
			}

			public String getYearLow() {
				return yearLow;
			}

			public void setYearLow(String value) {
				this.yearLow = value;
			}

			public String getRealTime() {
				return realTime;
			}

			public void setRealTime(String value) {
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

			public String getChange() {
				return change;
			}

			public void setChange(String value) {
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

			public String getDelta() {
				return delta;
			}

			public void setDelta(String value) {
				this.delta = value;
			}

			public String getGamma() {
				return gamma;
			}

			public void setGamma(String value) {
				this.gamma = value;
			}

			public String getTheta() {
				return theta;
			}

			public void setTheta(String value) {
				this.theta = value;
			}

			public String getVega() {
				return vega;
			}

			public void setVega(String value) {
				this.vega = value;
			}

			public String getRho() {
				return rho;
			}

			public void setRho(String value) {
				this.rho = value;
			}

			public String getImpliedVolatility() {
				return impliedVolatility;
			}

			public void setImpliedVolatility(String value) {
				this.impliedVolatility = value;
			}

			public String getDaysToExpiration() {
				return daysToExpiration;
			}

			public void setDaysToExpiration(String value) {
				this.daysToExpiration = value;
			}

			public String getTimeValueIndex() {
				return timeValueIndex;
			}

			public void setTimeValueIndex(String value) {
				this.timeValueIndex = value;
			}

			public String getMultiplier() {
				return multiplier;
			}

			public void setMultiplier(String value) {
				this.multiplier = value;
			}

		}
	}

}

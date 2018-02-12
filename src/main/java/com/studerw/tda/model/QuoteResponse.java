
package com.studerw.tda.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quote-list">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="quote">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="bid-ask-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="last-trade-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="strike-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="open-interest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="expiration-month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="expiration-day" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="expiration-year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="underlying-symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="put-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="delta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="gamma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="theta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="vega" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="rho" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="implied-volatility" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="days-to-expiration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="time-value-index" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "quoteList"
})
@XmlRootElement(name = "amtd")
public class QuoteResponse {

    @XmlTransient
    private String originalXml;

    @XmlElement(required = true)
    protected String result;
    @XmlElement(name = "quote-list", required = true)
    protected QuoteResponse.QuoteList quoteList;

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the quoteList property.
     *
     * @return
     *     possible object is
     *     {@link QuoteResponse.QuoteList }
     *
     */
    public QuoteResponse.QuoteList getQuoteList() {
        return quoteList;
    }

    /**
     * Sets the value of the quoteList property.
     *
     * @param value
     *     allowed object is
     *     {@link QuoteResponse.QuoteList }
     *
     */
    public void setQuoteList(QuoteResponse.QuoteList value) {
        this.quoteList = value;
    }

    public String getOriginalXml() {
        return originalXml;
    }

    public void setOriginalXml(String originalXml) {
        this.originalXml = originalXml;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="quote">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ask" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="bid-ask-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="last-trade-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="strike-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="open-interest" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="expiration-month" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="expiration-day" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="expiration-year" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="underlying-symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="put-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="delta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="gamma" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="theta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="vega" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="rho" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="implied-volatility" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="days-to-expiration" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="time-value-index" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "error",
        "quote"
    })
    public static class QuoteList {

        @XmlElement(required = true)
        protected String error;
        @XmlElement(required = true)
        protected Quote quote;

        /**
         * Gets the value of the error property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getError() {
            return error;
        }

        /**
         * Sets the value of the error property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setError(String value) {
            this.error = value;
        }

        /**
         * Gets the value of the quote property.
         * 
         * @return
         *     possible object is
         *     {@link Quote }
         *     
         */
        public Quote getQuote() {
            return quote;
        }

        /**
         * Sets the value of the quote property.
         * 
         * @param value
         *     allowed object is
         *     {@link Quote }
         *     
         */
        public void setQuote(Quote value) {
            this.quote = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ask" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="bid-ask-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="last-trade-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="strike-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="open-interest" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="expiration-month" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="expiration-day" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="expiration-year" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="underlying-symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="put-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="delta" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="gamma" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="theta" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="vega" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="rho" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="implied-volatility" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="days-to-expiration" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="time-value-index" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
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
            "strikePrice",
            "openInterest",
            "expirationMonth",
            "expirationDay",
            "expirationYear",
            "realTime",
            "exchange",
            "assetType",
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
            "multiplier",
            "change",
            "changePercent"
        })
        public static class Quote {

            @XmlElement(required = true)
            protected String error;
            @XmlElement(required = true)
            protected String symbol;
            @XmlElement(required = true)
            protected String description;
            @XmlElement(required = true)
            protected String bid;
            @XmlElement(required = true)
            protected String ask;
            @XmlElement(name = "bid-ask-size", required = true)
            protected String bidAskSize;
            @XmlElement(required = true)
            protected String last;
            @XmlElement(name = "last-trade-size", required = true)
            protected String lastTradeSize;
            @XmlElement(name = "last-trade-date", required = true)
            protected String lastTradeDate;
            @XmlElement(required = true)
            protected String open;
            @XmlElement(required = true)
            protected String high;
            @XmlElement(required = true)
            protected String low;
            @XmlElement(required = true)
            protected String close;
            @XmlElement(required = true)
            protected String volume;
            @XmlElement(name = "strike-price", required = true)
            protected String strikePrice;
            @XmlElement(name = "open-interest", required = true)
            protected String openInterest;
            @XmlElement(name = "expiration-month", required = true)
            protected String expirationMonth;
            @XmlElement(name = "expiration-day", required = true)
            protected String expirationDay;
            @XmlElement(name = "expiration-year", required = true)
            protected String expirationYear;
            @XmlElement(name = "real-time", required = true)
            protected String realTime;
            @XmlElement(required = true)
            protected String exchange;
            @XmlElement(name = "asset-type", required = true)
            protected String assetType;
            @XmlElement(name = "underlying-symbol", required = true)
            protected String underlyingSymbol;
            @XmlElement(name = "put-call", required = true)
            protected String putCall;
            @XmlElement(required = true)
            protected String delta;
            @XmlElement(required = true)
            protected String gamma;
            @XmlElement(required = true)
            protected String theta;
            @XmlElement(required = true)
            protected String vega;
            @XmlElement(required = true)
            protected String rho;
            @XmlElement(name = "implied-volatility", required = true)
            protected String impliedVolatility;
            @XmlElement(name = "days-to-expiration", required = true)
            protected String daysToExpiration;
            @XmlElement(name = "time-value-index", required = true)
            protected String timeValueIndex;
            @XmlElement(required = true)
            protected String multiplier;
            @XmlElement(required = true)
            protected String change;
            @XmlElement(name = "change-percent", required = true)
            protected String changePercent;

            /**
             * Gets the value of the error property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getError() {
                return error;
            }

            /**
             * Sets the value of the error property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setError(String value) {
                this.error = value;
            }

            /**
             * Gets the value of the symbol property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSymbol() {
                return symbol;
            }

            /**
             * Sets the value of the symbol property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSymbol(String value) {
                this.symbol = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the bid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBid() {
                return bid;
            }

            /**
             * Sets the value of the bid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBid(String value) {
                this.bid = value;
            }

            /**
             * Gets the value of the ask property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAsk() {
                return ask;
            }

            /**
             * Sets the value of the ask property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAsk(String value) {
                this.ask = value;
            }

            /**
             * Gets the value of the bidAskSize property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBidAskSize() {
                return bidAskSize;
            }

            /**
             * Sets the value of the bidAskSize property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBidAskSize(String value) {
                this.bidAskSize = value;
            }

            /**
             * Gets the value of the last property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLast() {
                return last;
            }

            /**
             * Sets the value of the last property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLast(String value) {
                this.last = value;
            }

            /**
             * Gets the value of the lastTradeSize property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastTradeSize() {
                return lastTradeSize;
            }

            /**
             * Sets the value of the lastTradeSize property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastTradeSize(String value) {
                this.lastTradeSize = value;
            }

            /**
             * Gets the value of the lastTradeDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastTradeDate() {
                return lastTradeDate;
            }

            /**
             * Sets the value of the lastTradeDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastTradeDate(String value) {
                this.lastTradeDate = value;
            }

            /**
             * Gets the value of the open property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpen() {
                return open;
            }

            /**
             * Sets the value of the open property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpen(String value) {
                this.open = value;
            }

            /**
             * Gets the value of the high property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHigh() {
                return high;
            }

            /**
             * Sets the value of the high property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHigh(String value) {
                this.high = value;
            }

            /**
             * Gets the value of the low property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLow() {
                return low;
            }

            /**
             * Sets the value of the low property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLow(String value) {
                this.low = value;
            }

            /**
             * Gets the value of the close property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClose() {
                return close;
            }

            /**
             * Sets the value of the close property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClose(String value) {
                this.close = value;
            }

            /**
             * Gets the value of the volume property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVolume() {
                return volume;
            }

            /**
             * Sets the value of the volume property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVolume(String value) {
                this.volume = value;
            }

            /**
             * Gets the value of the strikePrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStrikePrice() {
                return strikePrice;
            }

            /**
             * Sets the value of the strikePrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStrikePrice(String value) {
                this.strikePrice = value;
            }

            /**
             * Gets the value of the openInterest property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpenInterest() {
                return openInterest;
            }

            /**
             * Sets the value of the openInterest property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpenInterest(String value) {
                this.openInterest = value;
            }

            /**
             * Gets the value of the expirationMonth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpirationMonth() {
                return expirationMonth;
            }

            /**
             * Sets the value of the expirationMonth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpirationMonth(String value) {
                this.expirationMonth = value;
            }

            /**
             * Gets the value of the expirationDay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpirationDay() {
                return expirationDay;
            }

            /**
             * Sets the value of the expirationDay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpirationDay(String value) {
                this.expirationDay = value;
            }

            /**
             * Gets the value of the expirationYear property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpirationYear() {
                return expirationYear;
            }

            /**
             * Sets the value of the expirationYear property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpirationYear(String value) {
                this.expirationYear = value;
            }

            /**
             * Gets the value of the realTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRealTime() {
                return realTime;
            }

            /**
             * Sets the value of the realTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRealTime(String value) {
                this.realTime = value;
            }

            /**
             * Gets the value of the exchange property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExchange() {
                return exchange;
            }

            /**
             * Sets the value of the exchange property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExchange(String value) {
                this.exchange = value;
            }

            /**
             * Gets the value of the assetType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssetType() {
                return assetType;
            }

            /**
             * Sets the value of the assetType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssetType(String value) {
                this.assetType = value;
            }

            /**
             * Gets the value of the underlyingSymbol property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnderlyingSymbol() {
                return underlyingSymbol;
            }

            /**
             * Sets the value of the underlyingSymbol property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnderlyingSymbol(String value) {
                this.underlyingSymbol = value;
            }

            /**
             * Gets the value of the putCall property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPutCall() {
                return putCall;
            }

            /**
             * Sets the value of the putCall property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPutCall(String value) {
                this.putCall = value;
            }

            /**
             * Gets the value of the delta property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDelta() {
                return delta;
            }

            /**
             * Sets the value of the delta property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDelta(String value) {
                this.delta = value;
            }

            /**
             * Gets the value of the gamma property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGamma() {
                return gamma;
            }

            /**
             * Sets the value of the gamma property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGamma(String value) {
                this.gamma = value;
            }

            /**
             * Gets the value of the theta property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTheta() {
                return theta;
            }

            /**
             * Sets the value of the theta property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTheta(String value) {
                this.theta = value;
            }

            /**
             * Gets the value of the vega property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVega() {
                return vega;
            }

            /**
             * Sets the value of the vega property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVega(String value) {
                this.vega = value;
            }

            /**
             * Gets the value of the rho property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRho() {
                return rho;
            }

            /**
             * Sets the value of the rho property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRho(String value) {
                this.rho = value;
            }

            /**
             * Gets the value of the impliedVolatility property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getImpliedVolatility() {
                return impliedVolatility;
            }

            /**
             * Sets the value of the impliedVolatility property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setImpliedVolatility(String value) {
                this.impliedVolatility = value;
            }

            /**
             * Gets the value of the daysToExpiration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDaysToExpiration() {
                return daysToExpiration;
            }

            /**
             * Sets the value of the daysToExpiration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDaysToExpiration(String value) {
                this.daysToExpiration = value;
            }

            /**
             * Gets the value of the timeValueIndex property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTimeValueIndex() {
                return timeValueIndex;
            }

            /**
             * Sets the value of the timeValueIndex property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTimeValueIndex(String value) {
                this.timeValueIndex = value;
            }

            /**
             * Gets the value of the multiplier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMultiplier() {
                return multiplier;
            }

            /**
             * Sets the value of the multiplier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMultiplier(String value) {
                this.multiplier = value;
            }

            /**
             * Gets the value of the change property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChange() {
                return change;
            }

            /**
             * Sets the value of the change property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChange(String value) {
                this.change = value;
            }

            /**
             * Gets the value of the changePercent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChangePercent() {
                return changePercent;
            }

            /**
             * Sets the value of the changePercent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChangePercent(String value) {
                this.changePercent = value;
            }

        }

    }

}

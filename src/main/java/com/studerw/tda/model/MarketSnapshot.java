
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
 *         &lt;element name="market-snapshot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="quote-timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="markets">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="index" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="year-high" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="year-low" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "snapshot"
})
@XmlRootElement(name = "amtd")
public class MarketSnapshot extends BaseTda {

    @XmlElement(required = true)
    protected String result;
    @XmlElement(name = "market-snapshot", required = true)
    protected Snapshot snapshot;

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
     * Gets the value of the marketSnapshot property.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot }
     *     
     */
    public Snapshot getSnapshot() {
        return snapshot;
    }

    /**
     * Sets the value of the marketSnapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setSnapshot(Snapshot value) {
        this.snapshot = value;
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
     *         &lt;element name="quote-timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="markets">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="index" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="year-high" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="year-low" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "quoteTimestamp",
        "markets"
    })
    public static class Snapshot {

        @XmlElement(name = "quote-timestamp", required = true)
        protected ZonedDateTime quoteTimestamp;
        @XmlElement(required = true)
        protected Snapshot.Markets markets;

        /**
         * Gets the value of the quoteTimestamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public ZonedDateTime getQuoteTimestamp() {
            return quoteTimestamp;
        }

        /**
         * Sets the value of the quoteTimestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuoteTimestamp(ZonedDateTime value) {
            this.quoteTimestamp = value;
        }

        /**
         * Gets the value of the markets property.
         * 
         * @return
         *     possible object is
         *     {@link Snapshot.Markets }
         *     
         */
        public Snapshot.Markets getMarkets() {
            return markets;
        }

        /**
         * Sets the value of the markets property.
         * 
         * @param value
         *     allowed object is
         *     {@link Snapshot.Markets }
         *     
         */
        public void setMarkets(Snapshot.Markets value) {
            this.markets = value;
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
         *         &lt;element name="index" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="year-high" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="year-low" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "index"
        })
        public static class Markets {

            protected List<Snapshot.Markets.Index> index;

            /**
             * Gets the value of the index property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the index property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIndex().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Snapshot.Markets.Index }
             * 
             * 
             */
            public List<Snapshot.Markets.Index> getIndex() {
                if (index == null) {
                    index = new ArrayList<Snapshot.Markets.Index>();
                }
                return this.index;
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
             *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="year-high" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="year-low" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "open",
                "high",
                "low",
                "last",
                "lastTradeDate",
                "close",
                "yearHigh",
                "yearLow",
                "realTime",
                "assetType",
                "change",
                "changePercent",
                "volume"
            })
            public static class Index {

                @XmlElement(required = true)
                protected String error;
                @XmlElement(required = true)
                protected String symbol;
                @XmlElement(required = true)
                protected String description;
                @XmlElement(required = true)
                protected BigDecimal open;
                @XmlElement(required = true)
                protected BigDecimal high;
                @XmlElement(required = true)
                protected BigDecimal low;
                @XmlElement(required = true)
                protected BigDecimal last;
                @XmlElement(name = "last-trade-date", required = true)
                protected ZonedDateTime lastTradeDate;
                @XmlElement(required = true)
                protected BigDecimal close;
                @XmlElement(name = "year-high", required = true)
                protected BigDecimal yearHigh;
                @XmlElement(name = "year-low", required = true)
                protected BigDecimal yearLow;
                @XmlElement(name = "real-time", required = true)
                protected Boolean realTime;
                @XmlElement(name = "asset-type", required = true)
                protected String assetType;
                @XmlElement(required = true)
                protected BigDecimal change;
                @XmlElement(name = "change-percent", required = true)
                protected String changePercent;
                @XmlElement(required = true)
                protected Long volume;

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
                 * Gets the value of the open property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public BigDecimal getOpen() {
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
                public void setOpen(BigDecimal value) {
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
                public BigDecimal getHigh() {
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
                public void setHigh(BigDecimal value) {
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
                public BigDecimal getLow() {
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
                public void setLow(BigDecimal value) {
                    this.low = value;
                }

                /**
                 * Gets the value of the last property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public BigDecimal getLast() {
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
                public void setLast(BigDecimal value) {
                    this.last = value;
                }

                /**
                 * Gets the value of the lastTradeDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public ZonedDateTime getLastTradeDate() {
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
                public void setLastTradeDate(ZonedDateTime value) {
                    this.lastTradeDate = value;
                }

                /**
                 * Gets the value of the close property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public BigDecimal getClose() {
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
                public void setClose(BigDecimal value) {
                    this.close = value;
                }

                /**
                 * Gets the value of the yearHigh property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public BigDecimal getYearHigh() {
                    return yearHigh;
                }

                /**
                 * Sets the value of the yearHigh property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setYearHigh(BigDecimal value) {
                    this.yearHigh = value;
                }

                /**
                 * Gets the value of the yearLow property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public BigDecimal getYearLow() {
                    return yearLow;
                }

                /**
                 * Sets the value of the yearLow property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setYearLow(BigDecimal value) {
                    this.yearLow = value;
                }

                /**
                 * Gets the value of the realTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public Boolean getRealTime() {
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
                public void setRealTime(Boolean value) {
                    this.realTime = value;
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
                 * Gets the value of the change property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public BigDecimal getChange() {
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
                public void setChange(BigDecimal value) {
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

                /**
                 * Gets the value of the volume property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public Long getVolume() {
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
                public void setVolume(Long value) {
                    this.volume = value;
                }

            }

        }

    }

}

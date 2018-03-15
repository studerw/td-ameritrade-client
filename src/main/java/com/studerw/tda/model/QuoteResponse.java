package com.studerw.tda.model;

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
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quote-list" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="quote" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="ask" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="bid-ask-size" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="last-trade-size" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="year-high" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="year-low" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="nav" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="offer" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="strike-price" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="open-interest" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="expiration-month" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="expiration-day" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="expiration-year" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="underlying-symbol" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="put-call" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="delta" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="gamma" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="theta" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="vega" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="rho" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="implied-volatility"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="days-to-expiration"
 * type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="time-value-index" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                             &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/>
 *                           &lt;/choice>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "error",
    "quoteList"
})
@XmlRootElement(name = "amtd")
public class QuoteResponse extends BaseTda {

  @XmlElement(required = true)
  protected String result;
  protected String error;
  @XmlElement(name = "quote-list")
  protected QuoteResponse.QuoteList quoteList;

  /**
   * Gets the value of the result property.
   *
   * @return possible object is {@link String }
   */
  public String getResult() {
    return result;
  }

  /**
   * Sets the value of the result property.
   *
   * @param value allowed object is {@link String }
   */
  public void setResult(String value) {
    this.result = value;
  }

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

  /**
   * Gets the value of the quoteList property.
   *
   * @return possible object is {@link QuoteResponse.QuoteList }
   */
  public QuoteResponse.QuoteList getQuoteList() {
    return quoteList;
  }

  /**
   * Sets the value of the quoteList property.
   *
   * @param value allowed object is {@link QuoteResponse.QuoteList }
   */
  public void setQuoteList(QuoteResponse.QuoteList value) {
    this.quoteList = value;
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
   *         &lt;element name="quote" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;choice>
   *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *                   &lt;element name="ask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *                   &lt;element name="bid-ask-size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *                   &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="last-trade-size" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="year-high" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="year-low" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="nav" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="offer" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="strike-price" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="open-interest" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="expiration-month" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="expiration-day" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="expiration-year" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="underlying-symbol" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="put-call" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="delta" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="gamma" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="theta" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="vega" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="rho" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="implied-volatility" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="days-to-expiration" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="time-value-index" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                   &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string"
   * minOccurs="0"/>
   *                 &lt;/choice>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "error",
      "quote"
  })
  public static class QuoteList {

    @XmlElement(required = true)
    protected String error;
    protected List<QuoteResponse.QuoteList.Quote> quote;

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

    /**
     * Gets the value of the quotes property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the quote property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getQuote().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * QuoteResponse.QuoteList.Quote }
     */
    public List<QuoteResponse.QuoteList.Quote> getQuote() {
      if (quote == null) {
        quote = new ArrayList<QuoteResponse.QuoteList.Quote>();
      }
      return this.quote;
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
     *       &lt;choice>
     *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="bid" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="ask" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="bid-ask-size" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="last-trade-size" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="last-trade-date" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="close" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="year-high" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="year-low" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="change-percent" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="nav" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="offer" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="strike-price" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="open-interest" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="expiration-month" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="expiration-day" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="expiration-year" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="underlying-symbol" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="put-call" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="delta" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="gamma" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="theta" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="vega" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="rho" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="implied-volatility" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="days-to-expiration" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="time-value-index" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string"
     * minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
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

      /**
       * Gets the value of the symbol property.
       *
       * @return possible object is {@link String }
       */
      public String getSymbol() {
        return symbol;
      }

      /**
       * Sets the value of the symbol property.
       *
       * @param value allowed object is {@link String }
       */
      public void setSymbol(String value) {
        this.symbol = value;
      }

      /**
       * Gets the value of the description property.
       *
       * @return possible object is {@link String }
       */
      public String getDescription() {
        return description;
      }

      /**
       * Sets the value of the description property.
       *
       * @param value allowed object is {@link String }
       */
      public void setDescription(String value) {
        this.description = value;
      }

      /**
       * Gets the value of the bid property.
       *
       * @return possible object is {@link String }
       */
      public String getBid() {
        return bid;
      }

      /**
       * Sets the value of the bid property.
       *
       * @param value allowed object is {@link String }
       */
      public void setBid(String value) {
        this.bid = value;
      }

      /**
       * Gets the value of the ask property.
       *
       * @return possible object is {@link String }
       */
      public String getAsk() {
        return ask;
      }

      /**
       * Sets the value of the ask property.
       *
       * @param value allowed object is {@link String }
       */
      public void setAsk(String value) {
        this.ask = value;
      }

      /**
       * Gets the value of the bidAskSize property.
       *
       * @return possible object is {@link String }
       */
      public String getBidAskSize() {
        return bidAskSize;
      }

      /**
       * Sets the value of the bidAskSize property.
       *
       * @param value allowed object is {@link String }
       */
      public void setBidAskSize(String value) {
        this.bidAskSize = value;
      }

      /**
       * Gets the value of the last property.
       *
       * @return possible object is {@link String }
       */
      public String getLast() {
        return last;
      }

      /**
       * Sets the value of the last property.
       *
       * @param value allowed object is {@link String }
       */
      public void setLast(String value) {
        this.last = value;
      }

      /**
       * Gets the value of the lastTradeSize property.
       *
       * @return possible object is {@link String }
       */
      public String getLastTradeSize() {
        return lastTradeSize;
      }

      /**
       * Sets the value of the lastTradeSize property.
       *
       * @param value allowed object is {@link String }
       */
      public void setLastTradeSize(String value) {
        this.lastTradeSize = value;
      }

      /**
       * Gets the value of the lastTradeDate property.
       *
       * @return possible object is {@link String }
       */
      public String getLastTradeDate() {
        return lastTradeDate;
      }

      /**
       * Sets the value of the lastTradeDate property.
       *
       * @param value allowed object is {@link String }
       */
      public void setLastTradeDate(String value) {
        this.lastTradeDate = value;
      }

      /**
       * Gets the value of the open property.
       *
       * @return possible object is {@link String }
       */
      public String getOpen() {
        return open;
      }

      /**
       * Sets the value of the open property.
       *
       * @param value allowed object is {@link String }
       */
      public void setOpen(String value) {
        this.open = value;
      }

      /**
       * Gets the value of the high property.
       *
       * @return possible object is {@link String }
       */
      public String getHigh() {
        return high;
      }

      /**
       * Sets the value of the high property.
       *
       * @param value allowed object is {@link String }
       */
      public void setHigh(String value) {
        this.high = value;
      }

      /**
       * Gets the value of the low property.
       *
       * @return possible object is {@link String }
       */
      public String getLow() {
        return low;
      }

      /**
       * Sets the value of the low property.
       *
       * @param value allowed object is {@link String }
       */
      public void setLow(String value) {
        this.low = value;
      }

      /**
       * Gets the value of the close property.
       *
       * @return possible object is {@link String }
       */
      public String getClose() {
        return close;
      }

      /**
       * Sets the value of the close property.
       *
       * @param value allowed object is {@link String }
       */
      public void setClose(String value) {
        this.close = value;
      }

      /**
       * Gets the value of the volume property.
       *
       * @return possible object is {@link String }
       */
      public String getVolume() {
        return volume;
      }

      /**
       * Sets the value of the volume property.
       *
       * @param value allowed object is {@link String }
       */
      public void setVolume(String value) {
        this.volume = value;
      }

      /**
       * Gets the value of the yearHigh property.
       *
       * @return possible object is {@link String }
       */
      public String getYearHigh() {
        return yearHigh;
      }

      /**
       * Sets the value of the yearHigh property.
       *
       * @param value allowed object is {@link String }
       */
      public void setYearHigh(String value) {
        this.yearHigh = value;
      }

      /**
       * Gets the value of the yearLow property.
       *
       * @return possible object is {@link String }
       */
      public String getYearLow() {
        return yearLow;
      }

      /**
       * Sets the value of the yearLow property.
       *
       * @param value allowed object is {@link String }
       */
      public void setYearLow(String value) {
        this.yearLow = value;
      }

      /**
       * Gets the value of the realTime property.
       *
       * @return possible object is {@link String }
       */
      public String getRealTime() {
        return realTime;
      }

      /**
       * Sets the value of the realTime property.
       *
       * @param value allowed object is {@link String }
       */
      public void setRealTime(String value) {
        this.realTime = value;
      }

      /**
       * Gets the value of the exchange property.
       *
       * @return possible object is {@link String }
       */
      public String getExchange() {
        return exchange;
      }

      /**
       * Sets the value of the exchange property.
       *
       * @param value allowed object is {@link String }
       */
      public void setExchange(String value) {
        this.exchange = value;
      }

      /**
       * Gets the value of the assetType property.
       *
       * @return possible object is {@link String }
       */
      public String getAssetType() {
        return assetType;
      }

      /**
       * Sets the value of the assetType property.
       *
       * @param value allowed object is {@link String }
       */
      public void setAssetType(String value) {
        this.assetType = value;
      }

      /**
       * Gets the value of the change property.
       *
       * @return possible object is {@link String }
       */
      public String getChange() {
        return change;
      }

      /**
       * Sets the value of the change property.
       *
       * @param value allowed object is {@link String }
       */
      public void setChange(String value) {
        this.change = value;
      }

      /**
       * Gets the value of the changePercent property.
       *
       * @return possible object is {@link String }
       */
      public String getChangePercent() {
        return changePercent;
      }

      /**
       * Sets the value of the changePercent property.
       *
       * @param value allowed object is {@link String }
       */
      public void setChangePercent(String value) {
        this.changePercent = value;
      }

      /**
       * Gets the value of the nav property.
       *
       * @return possible object is {@link String }
       */
      public String getNav() {
        return nav;
      }

      /**
       * Sets the value of the nav property.
       *
       * @param value allowed object is {@link String }
       */
      public void setNav(String value) {
        this.nav = value;
      }

      /**
       * Gets the value of the offer property.
       *
       * @return possible object is {@link String }
       */
      public String getOffer() {
        return offer;
      }

      /**
       * Sets the value of the offer property.
       *
       * @param value allowed object is {@link String }
       */
      public void setOffer(String value) {
        this.offer = value;
      }

      /**
       * Gets the value of the strikePrice property.
       *
       * @return possible object is {@link String }
       */
      public String getStrikePrice() {
        return strikePrice;
      }

      /**
       * Sets the value of the strikePrice property.
       *
       * @param value allowed object is {@link String }
       */
      public void setStrikePrice(String value) {
        this.strikePrice = value;
      }

      /**
       * Gets the value of the openInterest property.
       *
       * @return possible object is {@link String }
       */
      public String getOpenInterest() {
        return openInterest;
      }

      /**
       * Sets the value of the openInterest property.
       *
       * @param value allowed object is {@link String }
       */
      public void setOpenInterest(String value) {
        this.openInterest = value;
      }

      /**
       * Gets the value of the expirationMonth property.
       *
       * @return possible object is {@link String }
       */
      public String getExpirationMonth() {
        return expirationMonth;
      }

      /**
       * Sets the value of the expirationMonth property.
       *
       * @param value allowed object is {@link String }
       */
      public void setExpirationMonth(String value) {
        this.expirationMonth = value;
      }

      /**
       * Gets the value of the expirationDay property.
       *
       * @return possible object is {@link String }
       */
      public String getExpirationDay() {
        return expirationDay;
      }

      /**
       * Sets the value of the expirationDay property.
       *
       * @param value allowed object is {@link String }
       */
      public void setExpirationDay(String value) {
        this.expirationDay = value;
      }

      /**
       * Gets the value of the expirationYear property.
       *
       * @return possible object is {@link String }
       */
      public String getExpirationYear() {
        return expirationYear;
      }

      /**
       * Sets the value of the expirationYear property.
       *
       * @param value allowed object is {@link String }
       */
      public void setExpirationYear(String value) {
        this.expirationYear = value;
      }

      /**
       * Gets the value of the underlyingSymbol property.
       *
       * @return possible object is {@link String }
       */
      public String getUnderlyingSymbol() {
        return underlyingSymbol;
      }

      /**
       * Sets the value of the underlyingSymbol property.
       *
       * @param value allowed object is {@link String }
       */
      public void setUnderlyingSymbol(String value) {
        this.underlyingSymbol = value;
      }

      /**
       * Gets the value of the putCall property.
       *
       * @return possible object is {@link String }
       */
      public String getPutCall() {
        return putCall;
      }

      /**
       * Sets the value of the putCall property.
       *
       * @param value allowed object is {@link String }
       */
      public void setPutCall(String value) {
        this.putCall = value;
      }

      /**
       * Gets the value of the delta property.
       *
       * @return possible object is {@link String }
       */
      public String getDelta() {
        return delta;
      }

      /**
       * Sets the value of the delta property.
       *
       * @param value allowed object is {@link String }
       */
      public void setDelta(String value) {
        this.delta = value;
      }

      /**
       * Gets the value of the gamma property.
       *
       * @return possible object is {@link String }
       */
      public String getGamma() {
        return gamma;
      }

      /**
       * Sets the value of the gamma property.
       *
       * @param value allowed object is {@link String }
       */
      public void setGamma(String value) {
        this.gamma = value;
      }

      /**
       * Gets the value of the theta property.
       *
       * @return possible object is {@link String }
       */
      public String getTheta() {
        return theta;
      }

      /**
       * Sets the value of the theta property.
       *
       * @param value allowed object is {@link String }
       */
      public void setTheta(String value) {
        this.theta = value;
      }

      /**
       * Gets the value of the vega property.
       *
       * @return possible object is {@link String }
       */
      public String getVega() {
        return vega;
      }

      /**
       * Sets the value of the vega property.
       *
       * @param value allowed object is {@link String }
       */
      public void setVega(String value) {
        this.vega = value;
      }

      /**
       * Gets the value of the rho property.
       *
       * @return possible object is {@link String }
       */
      public String getRho() {
        return rho;
      }

      /**
       * Sets the value of the rho property.
       *
       * @param value allowed object is {@link String }
       */
      public void setRho(String value) {
        this.rho = value;
      }

      /**
       * Gets the value of the impliedVolatility property.
       *
       * @return possible object is {@link String }
       */
      public String getImpliedVolatility() {
        return impliedVolatility;
      }

      /**
       * Sets the value of the impliedVolatility property.
       *
       * @param value allowed object is {@link String }
       */
      public void setImpliedVolatility(String value) {
        this.impliedVolatility = value;
      }

      /**
       * Gets the value of the daysToExpiration property.
       *
       * @return possible object is {@link String }
       */
      public String getDaysToExpiration() {
        return daysToExpiration;
      }

      /**
       * Sets the value of the daysToExpiration property.
       *
       * @param value allowed object is {@link String }
       */
      public void setDaysToExpiration(String value) {
        this.daysToExpiration = value;
      }

      /**
       * Gets the value of the timeValueIndex property.
       *
       * @return possible object is {@link String }
       */
      public String getTimeValueIndex() {
        return timeValueIndex;
      }

      /**
       * Sets the value of the timeValueIndex property.
       *
       * @param value allowed object is {@link String }
       */
      public void setTimeValueIndex(String value) {
        this.timeValueIndex = value;
      }

      /**
       * Gets the value of the multiplier property.
       *
       * @return possible object is {@link String }
       */
      public String getMultiplier() {
        return multiplier;
      }

      /**
       * Sets the value of the multiplier property.
       *
       * @param value allowed object is {@link String }
       */
      public void setMultiplier(String value) {
        this.multiplier = value;
      }

    }

  }

}

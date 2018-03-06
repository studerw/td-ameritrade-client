package com.studerw.tda.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
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
 *         &lt;element name="order-wrapper">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orderstring" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="order" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="security">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="symbol-with-type-prefix"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="asset-type"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="exchange"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="order-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="trade-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="requested-destination">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="routing-mode"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="option-exchange"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="response-description"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="routing-display-size"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="order-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="limit-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="stop-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="time-in-force">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="put-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="open-close" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "orderWrapper"
})
@XmlRootElement(name = "amtd")
public class OptionTradeResponse {

  @XmlElement(required = true)
  protected String result;

  @XmlTransient
  protected String originalXml;

  @XmlElement(name = "order-wrapper", required = true)
  protected OptionTradeResponse.OrderWrapper orderWrapper;

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
   * Gets the value of the orderWrapper property.
   *
   * @return possible object is {@link OptionTradeResponse.OrderWrapper }
   */
  public OptionTradeResponse.OrderWrapper getOrderWrapper() {
    return orderWrapper;
  }

  /**
   * Sets the value of the orderWrapper property.
   *
   * @param value allowed object is {@link OptionTradeResponse.OrderWrapper }
   */
  public void setOrderWrapper(OptionTradeResponse.OrderWrapper value) {
    this.orderWrapper = value;
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
   *         &lt;element name="orderstring" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="order" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="security">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="symbol-with-type-prefix"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="order-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="trade-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="requested-destination">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="routing-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="option-exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="response-description"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="routing-display-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="order-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="limit-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="stop-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="time-in-force">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="put-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="open-close" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
      "orderstring",
      "error",
      "order"
  })
  public static class OrderWrapper {

    @XmlElement(required = true)
    protected String orderstring;
    @XmlElement(required = true)
    protected String error;
    protected List<Order> order;

    /**
     * Gets the value of the orderstring property.
     *
     * @return possible object is {@link String }
     */
    public String getOrderstring() {
      return orderstring;
    }

    /**
     * Sets the value of the orderstring property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOrderstring(String value) {
      this.orderstring = value;
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
     * Gets the value of the order property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the order property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getOrder().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * OptionTradeResponse.OrderWrapper.Order }
     */
    public List<Order> getOrder() {
      if (order == null) {
        order = new ArrayList<Order>();
      }
      return this.order;
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
     *         &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="security">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="symbol-with-type-prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="order-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="trade-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="requested-destination">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="routing-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="option-exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="response-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="routing-display-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="order-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="limit-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="stop-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="time-in-force">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="put-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="open-close" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountId",
        "symbol",
        "security",
        "quantity",
        "orderId",
        "action",
        "tradeType",
        "requestedDestination",
        "routingDisplaySize",
        "orderType",
        "limitPrice",
        "stopPrice",
        "timeInForce",
        "putCall",
        "openClose"
    })
    public static class Order {

      @XmlElement(name = "account-id", required = true)
      protected String accountId;
      @XmlElement(required = true)
      protected String symbol;
      @XmlElement(required = true)
      protected OptionTradeResponse.OrderWrapper.Order.Security security;
      @XmlElement(required = true)
      protected String quantity;
      @XmlElement(name = "order-id", required = true)
      protected String orderId;
      @XmlElement(required = true)
      protected String action;
      @XmlElement(name = "trade-type", required = true)
      protected String tradeType;
      @XmlElement(name = "requested-destination", required = true)
      protected OptionTradeResponse.OrderWrapper.Order.RequestedDestination requestedDestination;
      @XmlElement(name = "routing-display-size", required = true)
      protected String routingDisplaySize;
      @XmlElement(name = "order-type", required = true)
      protected String orderType;
      @XmlElement(name = "limit-price", required = true)
      protected String limitPrice;
      @XmlElement(name = "stop-price", required = true)
      protected String stopPrice;
      @XmlElement(name = "time-in-force", required = true)
      protected OptionTradeResponse.OrderWrapper.Order.TimeInForce timeInForce;
      @XmlElement(name = "put-call", required = true)
      protected String putCall;
      @XmlElement(name = "open-close", required = true)
      protected String openClose;

      /**
       * Gets the value of the accountId property.
       *
       * @return possible object is {@link String }
       */
      public String getAccountId() {
        return accountId;
      }

      /**
       * Sets the value of the accountId property.
       *
       * @param value allowed object is {@link String }
       */
      public void setAccountId(String value) {
        this.accountId = value;
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
       * Gets the value of the security property.
       *
       * @return possible object is {@link OptionTradeResponse.OrderWrapper.Order.Security }
       */
      public OptionTradeResponse.OrderWrapper.Order.Security getSecurity() {
        return security;
      }

      /**
       * Sets the value of the security property.
       *
       * @param value allowed object is {@link OptionTradeResponse.OrderWrapper.Order.Security }
       */
      public void setSecurity(OptionTradeResponse.OrderWrapper.Order.Security value) {
        this.security = value;
      }

      /**
       * Gets the value of the quantity property.
       *
       * @return possible object is {@link String }
       */
      public String getQuantity() {
        return quantity;
      }

      /**
       * Sets the value of the quantity property.
       *
       * @param value allowed object is {@link String }
       */
      public void setQuantity(String value) {
        this.quantity = value;
      }

      /**
       * Gets the value of the orderId property.
       *
       * @return possible object is {@link String }
       */
      public String getOrderId() {
        return orderId;
      }

      /**
       * Sets the value of the orderId property.
       *
       * @param value allowed object is {@link String }
       */
      public void setOrderId(String value) {
        this.orderId = value;
      }

      /**
       * Gets the value of the action property.
       *
       * @return possible object is {@link String }
       */
      public String getAction() {
        return action;
      }

      /**
       * Sets the value of the action property.
       *
       * @param value allowed object is {@link String }
       */
      public void setAction(String value) {
        this.action = value;
      }

      /**
       * Gets the value of the tradeType property.
       *
       * @return possible object is {@link String }
       */
      public String getTradeType() {
        return tradeType;
      }

      /**
       * Sets the value of the tradeType property.
       *
       * @param value allowed object is {@link String }
       */
      public void setTradeType(String value) {
        this.tradeType = value;
      }

      /**
       * Gets the value of the requestedDestination property.
       *
       * @return possible object is {@link OptionTradeResponse.OrderWrapper.Order.RequestedDestination
       * }
       */
      public OptionTradeResponse.OrderWrapper.Order.RequestedDestination getRequestedDestination() {
        return requestedDestination;
      }

      /**
       * Sets the value of the requestedDestination property.
       *
       * @param value allowed object is {@link OptionTradeResponse.OrderWrapper.Order.RequestedDestination
       * }
       */
      public void setRequestedDestination(
          OptionTradeResponse.OrderWrapper.Order.RequestedDestination value) {
        this.requestedDestination = value;
      }

      /**
       * Gets the value of the routingDisplaySize property.
       *
       * @return possible object is {@link String }
       */
      public String getRoutingDisplaySize() {
        return routingDisplaySize;
      }

      /**
       * Sets the value of the routingDisplaySize property.
       *
       * @param value allowed object is {@link String }
       */
      public void setRoutingDisplaySize(String value) {
        this.routingDisplaySize = value;
      }

      /**
       * Gets the value of the orderType property.
       *
       * @return possible object is {@link String }
       */
      public String getOrderType() {
        return orderType;
      }

      /**
       * Sets the value of the orderType property.
       *
       * @param value allowed object is {@link String }
       */
      public void setOrderType(String value) {
        this.orderType = value;
      }

      /**
       * Gets the value of the limitPrice property.
       *
       * @return possible object is {@link String }
       */
      public String getLimitPrice() {
        return limitPrice;
      }

      /**
       * Sets the value of the limitPrice property.
       *
       * @param value allowed object is {@link String }
       */
      public void setLimitPrice(String value) {
        this.limitPrice = value;
      }

      /**
       * Gets the value of the stopPrice property.
       *
       * @return possible object is {@link String }
       */
      public String getStopPrice() {
        return stopPrice;
      }

      /**
       * Sets the value of the stopPrice property.
       *
       * @param value allowed object is {@link String }
       */
      public void setStopPrice(String value) {
        this.stopPrice = value;
      }

      /**
       * Gets the value of the timeInForce property.
       *
       * @return possible object is {@link OptionTradeResponse.OrderWrapper.Order.TimeInForce }
       */
      public OptionTradeResponse.OrderWrapper.Order.TimeInForce getTimeInForce() {
        return timeInForce;
      }

      /**
       * Sets the value of the timeInForce property.
       *
       * @param value allowed object is {@link OptionTradeResponse.OrderWrapper.Order.TimeInForce }
       */
      public void setTimeInForce(OptionTradeResponse.OrderWrapper.Order.TimeInForce value) {
        this.timeInForce = value;
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
       * Gets the value of the openClose property.
       *
       * @return possible object is {@link String }
       */
      public String getOpenClose() {
        return openClose;
      }

      /**
       * Sets the value of the openClose property.
       *
       * @param value allowed object is {@link String }
       */
      public void setOpenClose(String value) {
        this.openClose = value;
      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this
       * class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="routing-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="option-exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="response-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
          "routingMode",
          "optionExchange",
          "responseDescription"
      })
      public static class RequestedDestination {

        @XmlElement(name = "routing-mode", required = true)
        protected String routingMode;
        @XmlElement(name = "option-exchange", required = true)
        protected String optionExchange;
        @XmlElement(name = "response-description", required = true)
        protected String responseDescription;

        /**
         * Gets the value of the routingMode property.
         *
         * @return possible object is {@link String }
         */
        public String getRoutingMode() {
          return routingMode;
        }

        /**
         * Sets the value of the routingMode property.
         *
         * @param value allowed object is {@link String }
         */
        public void setRoutingMode(String value) {
          this.routingMode = value;
        }

        /**
         * Gets the value of the optionExchange property.
         *
         * @return possible object is {@link String }
         */
        public String getOptionExchange() {
          return optionExchange;
        }

        /**
         * Sets the value of the optionExchange property.
         *
         * @param value allowed object is {@link String }
         */
        public void setOptionExchange(String value) {
          this.optionExchange = value;
        }

        /**
         * Gets the value of the responseDescription property.
         *
         * @return possible object is {@link String }
         */
        public String getResponseDescription() {
          return responseDescription;
        }

        /**
         * Sets the value of the responseDescription property.
         *
         * @param value allowed object is {@link String }
         */
        public void setResponseDescription(String value) {
          this.responseDescription = value;
        }

      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this
       * class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="symbol-with-type-prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
          "symbol",
          "symbolWithTypePrefix",
          "description",
          "assetType",
          "exchange"
      })
      public static class Security {

        @XmlElement(required = true)
        protected String symbol;
        @XmlElement(name = "symbol-with-type-prefix", required = true)
        protected String symbolWithTypePrefix;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(name = "asset-type", required = true)
        protected String assetType;
        @XmlElement(required = true)
        protected String exchange;

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
         * Gets the value of the symbolWithTypePrefix property.
         *
         * @return possible object is {@link String }
         */
        public String getSymbolWithTypePrefix() {
          return symbolWithTypePrefix;
        }

        /**
         * Sets the value of the symbolWithTypePrefix property.
         *
         * @param value allowed object is {@link String }
         */
        public void setSymbolWithTypePrefix(String value) {
          this.symbolWithTypePrefix = value;
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

      }


      /**
       * <p>Java class for anonymous complex type.
       *
       * <p>The following schema fragment specifies the expected content contained within this
       * class.
       *
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
          "session"
      })
      public static class TimeInForce {

        @XmlElement(required = true)
        protected String session;

        /**
         * Gets the value of the session property.
         *
         * @return possible object is {@link String }
         */
        public String getSession() {
          return session;
        }

        /**
         * Sets the value of the session property.
         *
         * @param value allowed object is {@link String }
         */
        public void setSession(String value) {
          this.session = value;
        }

      }

    }

  }

}

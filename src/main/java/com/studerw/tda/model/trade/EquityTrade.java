
package com.studerw.tda.model.trade;

import com.studerw.tda.model.BaseTda;
import java.math.BigDecimal;
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
 *         &lt;element name="order-wrapper">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orderstring" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="order">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="security">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="symbol-with-type-prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="exchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                       &lt;element name="routing-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="market-maker-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="response-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="routing-display-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "orderWrapper"
})
@XmlRootElement(name = "amtd")
public class EquityTrade extends BaseTda {

    @XmlElement(required = true)
    protected String result;
    @XmlElement(name = "order-wrapper", required = true)
    protected EquityTrade.OrderWrapper orderWrapper;

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
     * Gets the value of the orderWrapper property.
     * 
     * @return
     *     possible object is
     *     {@link EquityTrade.OrderWrapper }
     *     
     */
    public EquityTrade.OrderWrapper getOrderWrapper() {
        return orderWrapper;
    }

    /**
     * Sets the value of the orderWrapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityTrade.OrderWrapper }
     *     
     */
    public void setOrderWrapper(EquityTrade.OrderWrapper value) {
        this.orderWrapper = value;
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
     *         &lt;element name="order">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="security">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="symbol-with-type-prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                             &lt;element name="market-maker-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="response-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "orderstring",
        "error",
        "order"
    })
    public static class OrderWrapper {

        @XmlElement(required = true)
        protected String orderstring;
        @XmlElement(required = true)
        protected String error;
        @XmlElement(required = true)
        protected EquityTrade.OrderWrapper.Order order;

        /**
         * Gets the value of the orderstring property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderstring() {
            return orderstring;
        }

        /**
         * Sets the value of the orderstring property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderstring(String value) {
            this.orderstring = value;
        }

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
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link EquityTrade.OrderWrapper.Order }
         *     
         */
        public EquityTrade.OrderWrapper.Order getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquityTrade.OrderWrapper.Order }
         *     
         */
        public void setOrder(EquityTrade.OrderWrapper.Order value) {
            this.order = value;
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
         *                   &lt;element name="market-maker-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "accountId",
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
            "timeInForce"
        })
        public static class Order {

            @XmlElement(name = "account-id", required = true)
            protected String accountId;
            @XmlElement(required = true)
            protected EquityTrade.OrderWrapper.Order.Security security;
            @XmlElement(required = true)
            protected Double quantity;
            @XmlElement(name = "order-id", required = true)
            protected String orderId;
            @XmlElement(required = true)
            protected String action;
            @XmlElement(name = "trade-type", required = true)
            protected Integer tradeType;
            @XmlElement(name = "requested-destination", required = true)
            protected EquityTrade.OrderWrapper.Order.RequestedDestination requestedDestination;
            @XmlElement(name = "routing-display-size", required = true)
            protected String routingDisplaySize;
            @XmlElement(name = "order-type", required = true)
            protected String orderType;
            @XmlElement(name = "limit-price", required = true)
            protected BigDecimal limitPrice;
            @XmlElement(name = "stop-price", required = true)
            protected BigDecimal stopPrice;
            @XmlElement(name = "time-in-force", required = true)
            protected EquityTrade.OrderWrapper.Order.TimeInForce timeInForce;

            /**
             * Gets the value of the accountId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountId() {
                return accountId;
            }

            /**
             * Sets the value of the accountId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountId(String value) {
                this.accountId = value;
            }

            /**
             * Gets the value of the security property.
             * 
             * @return
             *     possible object is
             *     {@link EquityTrade.OrderWrapper.Order.Security }
             *     
             */
            public EquityTrade.OrderWrapper.Order.Security getSecurity() {
                return security;
            }

            /**
             * Sets the value of the security property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquityTrade.OrderWrapper.Order.Security }
             *     
             */
            public void setSecurity(EquityTrade.OrderWrapper.Order.Security value) {
                this.security = value;
            }

            /**
             * Gets the value of the quantity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Double getQuantity() {
                return quantity;
            }

            /**
             * Sets the value of the quantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantity(Double value) {
                this.quantity = value;
            }

            /**
             * Gets the value of the orderId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderId() {
                return orderId;
            }

            /**
             * Sets the value of the orderId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderId(String value) {
                this.orderId = value;
            }

            /**
             * Gets the value of the action property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAction() {
                return action;
            }

            /**
             * Sets the value of the action property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAction(String value) {
                this.action = value;
            }

            /**
             * Gets the value of the tradeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public Integer getTradeType() {
                return tradeType;
            }

            /**
             * Sets the value of the tradeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTradeType(Integer value) {
                this.tradeType = value;
            }

            /**
             * Gets the value of the requestedDestination property.
             * 
             * @return
             *     possible object is
             *     {@link EquityTrade.OrderWrapper.Order.RequestedDestination }
             *     
             */
            public EquityTrade.OrderWrapper.Order.RequestedDestination getRequestedDestination() {
                return requestedDestination;
            }

            /**
             * Sets the value of the requestedDestination property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquityTrade.OrderWrapper.Order.RequestedDestination }
             *     
             */
            public void setRequestedDestination(EquityTrade.OrderWrapper.Order.RequestedDestination value) {
                this.requestedDestination = value;
            }

            /**
             * Gets the value of the routingDisplaySize property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoutingDisplaySize() {
                return routingDisplaySize;
            }

            /**
             * Sets the value of the routingDisplaySize property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoutingDisplaySize(String value) {
                this.routingDisplaySize = value;
            }

            /**
             * Gets the value of the orderType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderType() {
                return orderType;
            }

            /**
             * Sets the value of the orderType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderType(String value) {
                this.orderType = value;
            }

            /**
             * Gets the value of the limitPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public BigDecimal getLimitPrice() {
                return limitPrice;
            }

            /**
             * Sets the value of the limitPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLimitPrice(BigDecimal value) {
                this.limitPrice = value;
            }

            /**
             * Gets the value of the stopPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public BigDecimal getStopPrice() {
                return stopPrice;
            }

            /**
             * Sets the value of the stopPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStopPrice(BigDecimal value) {
                this.stopPrice = value;
            }

            /**
             * Gets the value of the timeInForce property.
             * 
             * @return
             *     possible object is
             *     {@link EquityTrade.OrderWrapper.Order.TimeInForce }
             *     
             */
            public EquityTrade.OrderWrapper.Order.TimeInForce getTimeInForce() {
                return timeInForce;
            }

            /**
             * Sets the value of the timeInForce property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquityTrade.OrderWrapper.Order.TimeInForce }
             *     
             */
            public void setTimeInForce(EquityTrade.OrderWrapper.Order.TimeInForce value) {
                this.timeInForce = value;
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
             *         &lt;element name="routing-mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="market-maker-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="response-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "routingMode",
                "marketMakerId",
                "responseDescription"
            })
            public static class RequestedDestination {

                @XmlElement(name = "routing-mode", required = true)
                protected String routingMode;
                @XmlElement(name = "market-maker-id", required = true)
                protected String marketMakerId;
                @XmlElement(name = "response-description", required = true)
                protected String responseDescription;

                /**
                 * Gets the value of the routingMode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoutingMode() {
                    return routingMode;
                }

                /**
                 * Sets the value of the routingMode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoutingMode(String value) {
                    this.routingMode = value;
                }

                /**
                 * Gets the value of the marketMakerId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMarketMakerId() {
                    return marketMakerId;
                }

                /**
                 * Sets the value of the marketMakerId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMarketMakerId(String value) {
                    this.marketMakerId = value;
                }

                /**
                 * Gets the value of the responseDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResponseDescription() {
                    return responseDescription;
                }

                /**
                 * Sets the value of the responseDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResponseDescription(String value) {
                    this.responseDescription = value;
                }

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
             * 
             * 
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
                 * Gets the value of the symbolWithTypePrefix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSymbolWithTypePrefix() {
                    return symbolWithTypePrefix;
                }

                /**
                 * Sets the value of the symbolWithTypePrefix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSymbolWithTypePrefix(String value) {
                    this.symbolWithTypePrefix = value;
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
             *         &lt;element name="session" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "session"
            })
            public static class TimeInForce {

                @XmlElement(required = true)
                protected String session;

                /**
                 * Gets the value of the session property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSession() {
                    return session;
                }

                /**
                 * Sets the value of the session property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSession(String value) {
                    this.session = value;
                }

            }

        }

    }

}

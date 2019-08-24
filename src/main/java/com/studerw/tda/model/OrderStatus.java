package com.studerw.tda.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="orderstatus-list">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="orderstatus" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="order-number">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="1646866322"/>
 *                                   &lt;enumeration value="1646866308"/>
 *                                   &lt;enumeration value="1633934757"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cancelable">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="false"/>
 *                                   &lt;enumeration value="true"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="editable">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="false"/>
 *                                   &lt;enumeration value="true"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="complex-option" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="enhanced-order" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="display-status">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Canceled"/>
 *                                   &lt;enumeration value="Open"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="order-routing-status"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="order-received-date-time">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="2017-12-10 10:29:43 EST"/>
 *                                   &lt;enumeration value="2017-12-10 10:25:47 EST"/>
 *                                   &lt;enumeration value="2017-11-24 11:03:14 EST"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="reported-time" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="2017-12-10 10:47:10 EST"/>
 *                                   &lt;enumeration value="2017-12-10 10:49:36 EST"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cancel-date-time" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="2017-12-10 10:47:10 EST"/>
 *                                   &lt;enumeration value="2017-12-10 10:49:36 EST"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="remaining-quantity">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *                                   &lt;enumeration value="0.0"/>
 *                                   &lt;enumeration value="66.0"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="trailing-activation-price"
 * type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="order">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="account-id"
 * type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="symbol">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="MRK_121517C55"/>
 *                                             &lt;enumeration value="RY_011918P65"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="security">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="symbol">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="MRK_121517C55"/>
 *                                                       &lt;enumeration value="RY_011918P65"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="symbol-with-type-prefix">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="MRK_121517C55"/>
 *                                                       &lt;enumeration value="RY_011918P65"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="description">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="MRK DEC 15 2017 55.0
 * Call"/>
 *                                                       &lt;enumeration value="RY JAN 19 2018 65.0
 * Put"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="asset-type"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="quantity">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="66"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="order-id">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                             &lt;enumeration value="1646866322"/>
 *                                             &lt;enumeration value="1646866308"/>
 *                                             &lt;enumeration value="1633934757"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="action">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="B"/>
 *                                             &lt;enumeration value="S"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="trade-type"
 * type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="requested-destination">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="routing-mode"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="option-exchange"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="response-description"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="actual-destination">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="routing-mode"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="option-exchange"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="response-description"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="routing-display-size"
 * type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="order-type">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="M"/>
 *                                             &lt;enumeration value="L"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="limit-price">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value=""/>
 *                                             &lt;enumeration value="0.25"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="stop-price"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="special-conditions"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="time-in-force">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="session">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="D"/>
 *                                                       &lt;enumeration value="GTD"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="expiration"
 * type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="put-call">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="C"/>
 *                                             &lt;enumeration value="P"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="open-close">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="O"/>
 *                                             &lt;enumeration value="C"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "orderstatusList"
})
@XmlRootElement(name = "amtd")
public class OrderStatus extends BaseTda {

  @XmlElement(required = true)
  protected String result;
  @XmlElement(name = "orderstatus-list", required = true)
  protected OrderStatus.OrderstatusList orderstatusList;
  @XmlTransient
  private String originalXml;

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
   * Gets the value of the orderstatusList property.
   *
   * @return possible object is {@link OrderStatus.OrderstatusList }
   */
  public OrderStatus.OrderstatusList getOrderstatusList() {
    return orderstatusList;
  }

  /**
   * Sets the value of the orderstatusList property.
   *
   * @param value allowed object is {@link OrderStatus.OrderstatusList }
   */
  public void setOrderstatusList(OrderStatus.OrderstatusList value) {
    this.orderstatusList = value;
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
   *         &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}int"/>
   *         &lt;element name="orderstatus" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="order-number">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
   *                         &lt;enumeration value="1646866322"/>
   *                         &lt;enumeration value="1646866308"/>
   *                         &lt;enumeration value="1633934757"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                   &lt;element name="cancelable">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                         &lt;enumeration value="false"/>
   *                         &lt;enumeration value="true"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                   &lt;element name="editable">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                         &lt;enumeration value="false"/>
   *                         &lt;enumeration value="true"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                   &lt;element name="complex-option" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="enhanced-order" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="display-status">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                         &lt;enumeration value="Canceled"/>
   *                         &lt;enumeration value="Open"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                   &lt;element name="order-routing-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="order-received-date-time">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                         &lt;enumeration value="2017-12-10 10:29:43 EST"/>
   *                         &lt;enumeration value="2017-12-10 10:25:47 EST"/>
   *                         &lt;enumeration value="2017-11-24 11:03:14 EST"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                   &lt;element name="reported-time" minOccurs="0">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                         &lt;enumeration value="2017-12-10 10:47:10 EST"/>
   *                         &lt;enumeration value="2017-12-10 10:49:36 EST"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                   &lt;element name="cancel-date-time" minOccurs="0">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                         &lt;enumeration value="2017-12-10 10:47:10 EST"/>
   *                         &lt;enumeration value="2017-12-10 10:49:36 EST"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                   &lt;element name="remaining-quantity">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
   *                         &lt;enumeration value="0.0"/>
   *                         &lt;enumeration value="66.0"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                   &lt;element name="trailing-activation-price" type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                   &lt;element name="order">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}int"/>
   *                             &lt;element name="symbol">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="MRK_121517C55"/>
   *                                   &lt;enumeration value="RY_011918P65"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="security">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="symbol">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="MRK_121517C55"/>
   *                                             &lt;enumeration value="RY_011918P65"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="symbol-with-type-prefix">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="MRK_121517C55"/>
   *                                             &lt;enumeration value="RY_011918P65"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="description">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="MRK DEC 15 2017 55.0
   * Call"/>
   *                                             &lt;enumeration value="RY JAN 19 2018 65.0 Put"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="asset-type"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="quantity">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
   *                                   &lt;enumeration value="1"/>
   *                                   &lt;enumeration value="66"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="order-id">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
   *                                   &lt;enumeration value="1646866322"/>
   *                                   &lt;enumeration value="1646866308"/>
   *                                   &lt;enumeration value="1633934757"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="action">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="B"/>
   *                                   &lt;enumeration value="S"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="trade-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
   *                             &lt;element name="actual-destination">
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
   * type="{http://www.w3.org/2001/XMLSchema}byte"/>
   *                             &lt;element name="order-type">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="M"/>
   *                                   &lt;enumeration value="L"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="limit-price">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value=""/>
   *                                   &lt;enumeration value="0.25"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="stop-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="special-conditions"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="time-in-force">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="session">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="D"/>
   *                                             &lt;enumeration value="GTD"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="expiration"
   * type="{http://www.w3.org/2001/XMLSchema}date"/>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="put-call">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="C"/>
   *                                   &lt;enumeration value="P"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="open-close">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="O"/>
   *                                   &lt;enumeration value="C"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
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
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "accountId",
      "orderstatus"
  })
  public static class OrderstatusList {

    @XmlElement(name = "account-id")
    protected int accountId;
    protected List<Orderstatus> orderstatus;

    /**
     * Gets the value of the accountId property.
     */
    public int getAccountId() {
      return accountId;
    }

    /**
     * Sets the value of the accountId property.
     */
    public void setAccountId(int value) {
      this.accountId = value;
    }

    /**
     * Gets the value of the orderstatus property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the orderstatus property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getOrderstatus().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * OrderStatus.OrderstatusList.Orderstatus }
     */
    public List<Orderstatus> getOrderstatus() {
      if (orderstatus == null) {
        orderstatus = new ArrayList<Orderstatus>();
      }
      return this.orderstatus;
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
     *         &lt;element name="order-number">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;enumeration value="1646866322"/>
     *               &lt;enumeration value="1646866308"/>
     *               &lt;enumeration value="1633934757"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cancelable">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="false"/>
     *               &lt;enumeration value="true"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="editable">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="false"/>
     *               &lt;enumeration value="true"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="complex-option" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="enhanced-order" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="display-status">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Canceled"/>
     *               &lt;enumeration value="Open"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="order-routing-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="order-received-date-time">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="2017-12-10 10:29:43 EST"/>
     *               &lt;enumeration value="2017-12-10 10:25:47 EST"/>
     *               &lt;enumeration value="2017-11-24 11:03:14 EST"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="reported-time" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="2017-12-10 10:47:10 EST"/>
     *               &lt;enumeration value="2017-12-10 10:49:36 EST"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cancel-date-time" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="2017-12-10 10:47:10 EST"/>
     *               &lt;enumeration value="2017-12-10 10:49:36 EST"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="remaining-quantity">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
     *               &lt;enumeration value="0.0"/>
     *               &lt;enumeration value="66.0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="trailing-activation-price" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="order">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="symbol">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="MRK_121517C55"/>
     *                         &lt;enumeration value="RY_011918P65"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="security">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="symbol">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="MRK_121517C55"/>
     *                                   &lt;enumeration value="RY_011918P65"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="symbol-with-type-prefix">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="MRK_121517C55"/>
     *                                   &lt;enumeration value="RY_011918P65"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="MRK DEC 15 2017 55.0 Call"/>
     *                                   &lt;enumeration value="RY JAN 19 2018 65.0 Put"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="quantity">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="66"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="order-id">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="1646866322"/>
     *                         &lt;enumeration value="1646866308"/>
     *                         &lt;enumeration value="1633934757"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="action">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="B"/>
     *                         &lt;enumeration value="S"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="trade-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
     *                   &lt;element name="actual-destination">
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
     *                   &lt;element name="routing-display-size" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="order-type">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="M"/>
     *                         &lt;enumeration value="L"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="limit-price">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value=""/>
     *                         &lt;enumeration value="0.25"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="stop-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="special-conditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="time-in-force">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="session">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="D"/>
     *                                   &lt;enumeration value="GTD"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="put-call">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="C"/>
     *                         &lt;enumeration value="P"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="open-close">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="O"/>
     *                         &lt;enumeration value="C"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
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
        "orderNumber",
        "cancelable",
        "editable",
        "complexOption",
        "enhancedOrder",
        "displayStatus",
        "orderRoutingStatus",
        "orderReceivedDateTime",
        "reportedTime",
        "cancelDateTime",
        "remainingQuantity",
        "trailingActivationPrice",
        "order"
    })
    public static class Orderstatus {

      @XmlElement(name = "order-number")
      protected int orderNumber;
      @XmlElement(required = true)
      protected boolean cancelable;
      @XmlElement(required = true)
      protected String editable;
      @XmlElement(name = "complex-option", required = true)
      protected String complexOption;
      @XmlElement(name = "enhanced-order", required = true)
      protected String enhancedOrder;
      @XmlElement(name = "display-status", required = true)
      protected String displayStatus;
      @XmlElement(name = "order-routing-status", required = true)
      protected String orderRoutingStatus;
      @XmlElement(name = "order-received-date-time", required = true)
      protected String orderReceivedDateTime;
      @XmlElement(name = "reported-time")
      protected String reportedTime;
      @XmlElement(name = "cancel-date-time")
      protected String cancelDateTime;
      @XmlElement(name = "remaining-quantity")
      protected float remainingQuantity;
      @XmlElement(name = "trailing-activation-price")
      protected byte trailingActivationPrice;
      @XmlElement(required = true)
      protected OrderStatus.OrderstatusList.Orderstatus.Order order;

      /**
       * Gets the value of the orderNumber property.
       */
      public int getOrderNumber() {
        return orderNumber;
      }

      /**
       * Sets the value of the orderNumber property.
       */
      public void setOrderNumber(int value) {
        this.orderNumber = value;
      }

      /**
       * Gets the value of the cancelable property.
       *
       */
      public boolean isCancelable() {
        return cancelable;
      }

      /**
       * Sets the value of the cancelable property.
       *
       */
      public void setCancelable(boolean value) {
        this.cancelable = value;
      }

      /**
       * Gets the value of the editable property.
       *
       * @return possible object is {@link String }
       */
      public String getEditable() {
        return editable;
      }

      /**
       * Sets the value of the editable property.
       *
       * @param value allowed object is {@link String }
       */
      public void setEditable(String value) {
        this.editable = value;
      }

      /**
       * Gets the value of the complexOption property.
       *
       * @return possible object is {@link String }
       */
      public String getComplexOption() {
        return complexOption;
      }

      /**
       * Sets the value of the complexOption property.
       *
       * @param value allowed object is {@link String }
       */
      public void setComplexOption(String value) {
        this.complexOption = value;
      }

      /**
       * Gets the value of the enhancedOrder property.
       *
       * @return possible object is {@link String }
       */
      public String getEnhancedOrder() {
        return enhancedOrder;
      }

      /**
       * Sets the value of the enhancedOrder property.
       *
       * @param value allowed object is {@link String }
       */
      public void setEnhancedOrder(String value) {
        this.enhancedOrder = value;
      }

      /**
       * Gets the value of the displayStatus property.
       *
       * @return possible object is {@link String }
       */
      public String getDisplayStatus() {
        return displayStatus;
      }

      /**
       * Sets the value of the displayStatus property.
       *
       * @param value allowed object is {@link String }
       */
      public void setDisplayStatus(String value) {
        this.displayStatus = value;
      }

      /**
       * Gets the value of the orderRoutingStatus property.
       *
       * @return possible object is {@link String }
       */
      public String getOrderRoutingStatus() {
        return orderRoutingStatus;
      }

      /**
       * Sets the value of the orderRoutingStatus property.
       *
       * @param value allowed object is {@link String }
       */
      public void setOrderRoutingStatus(String value) {
        this.orderRoutingStatus = value;
      }

      /**
       * Gets the value of the orderReceivedDateTime property.
       *
       * @return possible object is {@link String }
       */
      public String getOrderReceivedDateTime() {
        return orderReceivedDateTime;
      }

      /**
       * Sets the value of the orderReceivedDateTime property.
       *
       * @param value allowed object is {@link String }
       */
      public void setOrderReceivedDateTime(String value) {
        this.orderReceivedDateTime = value;
      }

      /**
       * Gets the value of the reportedTime property.
       *
       * @return possible object is {@link String }
       */
      public String getReportedTime() {
        return reportedTime;
      }

      /**
       * Sets the value of the reportedTime property.
       *
       * @param value allowed object is {@link String }
       */
      public void setReportedTime(String value) {
        this.reportedTime = value;
      }

      /**
       * Gets the value of the cancelDateTime property.
       *
       * @return possible object is {@link String }
       */
      public String getCancelDateTime() {
        return cancelDateTime;
      }

      /**
       * Sets the value of the cancelDateTime property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCancelDateTime(String value) {
        this.cancelDateTime = value;
      }

      /**
       * Gets the value of the remainingQuantity property.
       */
      public float getRemainingQuantity() {
        return remainingQuantity;
      }

      /**
       * Sets the value of the remainingQuantity property.
       */
      public void setRemainingQuantity(float value) {
        this.remainingQuantity = value;
      }

      /**
       * Gets the value of the trailingActivationPrice property.
       */
      public byte getTrailingActivationPrice() {
        return trailingActivationPrice;
      }

      /**
       * Sets the value of the trailingActivationPrice property.
       */
      public void setTrailingActivationPrice(byte value) {
        this.trailingActivationPrice = value;
      }

      /**
       * Gets the value of the order property.
       *
       * @return possible object is {@link OrderStatus.OrderstatusList.Orderstatus.Order }
       */
      public OrderStatus.OrderstatusList.Orderstatus.Order getOrder() {
        return order;
      }

      /**
       * Sets the value of the order property.
       *
       * @param value allowed object is {@link OrderStatus.OrderstatusList.Orderstatus.Order }
       */
      public void setOrder(OrderStatus.OrderstatusList.Orderstatus.Order value) {
        this.order = value;
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
       *         &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}int"/>
       *         &lt;element name="symbol">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="MRK_121517C55"/>
       *               &lt;enumeration value="RY_011918P65"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="security">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="symbol">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="MRK_121517C55"/>
       *                         &lt;enumeration value="RY_011918P65"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="symbol-with-type-prefix">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="MRK_121517C55"/>
       *                         &lt;enumeration value="RY_011918P65"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="description">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="MRK DEC 15 2017 55.0 Call"/>
       *                         &lt;enumeration value="RY JAN 19 2018 65.0 Put"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="quantity">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
       *               &lt;enumeration value="1"/>
       *               &lt;enumeration value="66"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="order-id">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
       *               &lt;enumeration value="1646866322"/>
       *               &lt;enumeration value="1646866308"/>
       *               &lt;enumeration value="1633934757"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="action">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="B"/>
       *               &lt;enumeration value="S"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="trade-type" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
       *         &lt;element name="actual-destination">
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
       *         &lt;element name="routing-display-size" type="{http://www.w3.org/2001/XMLSchema}byte"/>
       *         &lt;element name="order-type">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="M"/>
       *               &lt;enumeration value="L"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="limit-price">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value=""/>
       *               &lt;enumeration value="0.25"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="stop-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="special-conditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="time-in-force">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="session">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="D"/>
       *                         &lt;enumeration value="GTD"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}date"/>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="put-call">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="C"/>
       *               &lt;enumeration value="P"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="open-close">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="O"/>
       *               &lt;enumeration value="C"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
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
          "actualDestination",
          "routingDisplaySize",
          "orderType",
          "limitPrice",
          "stopPrice",
          "specialConditions",
          "timeInForce",
          "putCall",
          "openClose"
      })
      public static class Order {

        @XmlElement(name = "account-id")
        protected int accountId;
        @XmlElement(required = true)
        protected String symbol;
        @XmlElement(required = true)
        protected OrderStatus.OrderstatusList.Orderstatus.Order.Security security;
        protected byte quantity;
        @XmlElement(name = "order-id")
        protected int orderId;
        @XmlElement(required = true)
        protected String action;
        @XmlElement(name = "trade-type")
        protected byte tradeType;
        @XmlElement(name = "requested-destination", required = true)
        protected OrderStatus.OrderstatusList.Orderstatus.Order.RequestedDestination requestedDestination;
        @XmlElement(name = "actual-destination", required = true)
        protected OrderStatus.OrderstatusList.Orderstatus.Order.ActualDestination actualDestination;
        @XmlElement(name = "routing-display-size")
        protected byte routingDisplaySize;
        @XmlElement(name = "order-type", required = true)
        protected String orderType;
        @XmlElement(name = "limit-price", required = true)
        protected String limitPrice;
        @XmlElement(name = "stop-price", required = true)
        protected String stopPrice;
        @XmlElement(name = "special-conditions", required = true)
        protected String specialConditions;
        @XmlElement(name = "time-in-force", required = true)
        protected OrderStatus.OrderstatusList.Orderstatus.Order.TimeInForce timeInForce;
        @XmlElement(name = "put-call", required = true)
        protected String putCall;
        @XmlElement(name = "open-close", required = true)
        protected String openClose;

        /**
         * Gets the value of the accountId property.
         */
        public int getAccountId() {
          return accountId;
        }

        /**
         * Sets the value of the accountId property.
         */
        public void setAccountId(int value) {
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
         * @return possible object is {@link OrderStatus.OrderstatusList.Orderstatus.Order.Security
         * }
         */
        public OrderStatus.OrderstatusList.Orderstatus.Order.Security getSecurity() {
          return security;
        }

        /**
         * Sets the value of the security property.
         *
         * @param value allowed object is {@link OrderStatus.OrderstatusList.Orderstatus.Order.Security
         * }
         */
        public void setSecurity(OrderStatus.OrderstatusList.Orderstatus.Order.Security value) {
          this.security = value;
        }

        /**
         * Gets the value of the quantity property.
         */
        public byte getQuantity() {
          return quantity;
        }

        /**
         * Sets the value of the quantity property.
         */
        public void setQuantity(byte value) {
          this.quantity = value;
        }

        /**
         * Gets the value of the orderId property.
         */
        public int getOrderId() {
          return orderId;
        }

        /**
         * Sets the value of the orderId property.
         */
        public void setOrderId(int value) {
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
         */
        public byte getTradeType() {
          return tradeType;
        }

        /**
         * Sets the value of the tradeType property.
         */
        public void setTradeType(byte value) {
          this.tradeType = value;
        }

        /**
         * Gets the value of the requestedDestination property.
         *
         * @return possible object is {@link OrderStatus.OrderstatusList.Orderstatus.Order.RequestedDestination
         * }
         */
        public OrderStatus.OrderstatusList.Orderstatus.Order.RequestedDestination getRequestedDestination() {
          return requestedDestination;
        }

        /**
         * Sets the value of the requestedDestination property.
         *
         * @param value allowed object is {@link OrderStatus.OrderstatusList.Orderstatus.Order.RequestedDestination
         * }
         */
        public void setRequestedDestination(
            OrderStatus.OrderstatusList.Orderstatus.Order.RequestedDestination value) {
          this.requestedDestination = value;
        }

        /**
         * Gets the value of the actualDestination property.
         *
         * @return possible object is {@link OrderStatus.OrderstatusList.Orderstatus.Order.ActualDestination
         * }
         */
        public OrderStatus.OrderstatusList.Orderstatus.Order.ActualDestination getActualDestination() {
          return actualDestination;
        }

        /**
         * Sets the value of the actualDestination property.
         *
         * @param value allowed object is {@link OrderStatus.OrderstatusList.Orderstatus.Order.ActualDestination
         * }
         */
        public void setActualDestination(
            OrderStatus.OrderstatusList.Orderstatus.Order.ActualDestination value) {
          this.actualDestination = value;
        }

        /**
         * Gets the value of the routingDisplaySize property.
         */
        public byte getRoutingDisplaySize() {
          return routingDisplaySize;
        }

        /**
         * Sets the value of the routingDisplaySize property.
         */
        public void setRoutingDisplaySize(byte value) {
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
         * Gets the value of the specialConditions property.
         *
         * @return possible object is {@link String }
         */
        public String getSpecialConditions() {
          return specialConditions;
        }

        /**
         * Sets the value of the specialConditions property.
         *
         * @param value allowed object is {@link String }
         */
        public void setSpecialConditions(String value) {
          this.specialConditions = value;
        }

        /**
         * Gets the value of the timeInForce property.
         *
         * @return possible object is {@link OrderStatus.OrderstatusList.Orderstatus.Order.TimeInForce
         * }
         */
        public OrderStatus.OrderstatusList.Orderstatus.Order.TimeInForce getTimeInForce() {
          return timeInForce;
        }

        /**
         * Sets the value of the timeInForce property.
         *
         * @param value allowed object is {@link OrderStatus.OrderstatusList.Orderstatus.Order.TimeInForce
         * }
         */
        public void setTimeInForce(
            OrderStatus.OrderstatusList.Orderstatus.Order.TimeInForce value) {
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
        public static class ActualDestination {

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
         *         &lt;element name="symbol">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="MRK_121517C55"/>
         *               &lt;enumeration value="RY_011918P65"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="symbol-with-type-prefix">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="MRK_121517C55"/>
         *               &lt;enumeration value="RY_011918P65"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="description">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="MRK DEC 15 2017 55.0 Call"/>
         *               &lt;enumeration value="RY JAN 19 2018 65.0 Put"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "assetType"
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
         *         &lt;element name="session">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="D"/>
         *               &lt;enumeration value="GTD"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "session",
            "expiration"
        })
        public static class TimeInForce {

          @XmlElement(required = true)
          protected String session;
          @XmlElement(required = true)
          @XmlSchemaType(name = "date")
          protected XMLGregorianCalendar expiration;

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

          /**
           * Gets the value of the expiration property.
           *
           * @return possible object is {@link XMLGregorianCalendar }
           */
          public XMLGregorianCalendar getExpiration() {
            return expiration;
          }

          /**
           * Sets the value of the expiration property.
           *
           * @param value allowed object is {@link XMLGregorianCalendar }
           */
          public void setExpiration(XMLGregorianCalendar value) {
            this.expiration = value;
          }

        }

      }

    }

  }

}

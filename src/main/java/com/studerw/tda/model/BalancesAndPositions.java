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
 * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
 * expected content contained within this class. <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="balance">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="day-trader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="round-trips" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="resticted-closing-transactions-only"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="cash-balance">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="money-market-balance">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="savings-balance">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="long-stock-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="long-option-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="short-option-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mutual-fund-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="bond-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="account-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="pending-deposits">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="in-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="in-potential-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="short-balance">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="margin-balance">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="short-stock-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="long-marginable-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="short-marginable-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="margin-equity">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="equity-percentage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="option-buying-power" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="stock-buying-power" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="day-trading-buying-power" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="available-funds-for-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="maintenance-requirement">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maintenance-call-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="potential" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="regulation-t-call-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="potential" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="day-trading-call-value">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="potential" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="day-equity-call-value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="positions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="stocks">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="position" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="quantity">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="-14"/>
 *                                             &lt;enumeration value="17550"/>
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
 *                                                       &lt;enumeration value="RY"/>
 *                                                       &lt;enumeration value="UVXY"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="symbol-with-type-prefix">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="RY"/>
 *                                                       &lt;enumeration value="UVXY"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="description">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="ROYAL BANK CDA
 * MONTREAL QUE COM"/>
 *                                                       &lt;enumeration value="PROSHARES ULTRA VIX
 * SHRT TM FUTURES ETF"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="asset-type"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="cusip">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="780087102"/>
 *                                                       &lt;enumeration value="74347W163"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="account-type">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="2"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="close-price">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="79.64"/>
 *                                             &lt;enumeration value="12.06"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="position-type">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="SHORT"/>
 *                                             &lt;enumeration value="LONG"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="average-price">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="79.442143"/>
 *                                             &lt;enumeration value="20.959573"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="current-value">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="-1114.96"/>
 *                                             &lt;enumeration value="211828.50"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="bond-factor"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="quote">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="error"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="symbol">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="RY"/>
 *                                                       &lt;enumeration value="UVXY"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="description"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="bid">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="62.50"/>
 *                                                       &lt;enumeration value="12.07"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ask">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="90.00"/>
 *                                                       &lt;enumeration value="12.08"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="bid-ask-size">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="1X1"/>
 *                                                       &lt;enumeration value="6X5"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="last">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="79.64"/>
 *                                                       &lt;enumeration value="12.06"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="last-trade-size">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="9474"/>
 *                                                       &lt;enumeration value="0"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="last-trade-date">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="2017-12-08 15:02:02
 * CST"/>
 *                                                       &lt;enumeration value="2017-12-08 19:00:00
 * CST"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="open">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="79.45"/>
 *                                                       &lt;enumeration value="12.50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="high">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="79.68"/>
 *                                                       &lt;enumeration value="12.5764"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="low">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="79.33"/>
 *                                                       &lt;enumeration value="12.04"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="close">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="79.64"/>
 *                                                       &lt;enumeration value="12.06"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="volume">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="882424"/>
 *                                                       &lt;enumeration value="26026459"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="year-high">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="80.98"/>
 *                                                       &lt;enumeration value="45.62"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="year-low">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="66.66"/>
 *                                                       &lt;enumeration value="6.07"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="real-time"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="exchange">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="NYS"/>
 *                                                       &lt;enumeration value="PAC"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="asset-type"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="change">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.30"/>
 *                                                       &lt;enumeration value="-0.86"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="change-percent">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.38%"/>
 *                                                       &lt;enumeration value="-7.13%"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="maintenance-requirement">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="334.49"/>
 *                                             &lt;enumeration value="169462.80"/>
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
 *                   &lt;element name="options">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="position" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="quantity">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="580"/>
 *                                             &lt;enumeration value="540"/>
 *                                             &lt;enumeration value="66"/>
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
 *                                                       &lt;enumeration value="NG_011918C7"/>
 *                                                       &lt;enumeration value="RY_011918P65"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="symbol-with-type-prefix">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="MRK_121517C55"/>
 *                                                       &lt;enumeration value="NG_011918C7"/>
 *                                                       &lt;enumeration value="RY_011918P65"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="description">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="MERCK &amp; CO INC.
 * COM"/>
 *                                                       &lt;enumeration value="NOVAGOLD RESOURCES
 * INC COM"/>
 *                                                       &lt;enumeration value="ROYAL BANK CDA
 * MONTREAL QUE COM"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="asset-type"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="cusip">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0MRK..LF70055000"/>
 *                                                       &lt;enumeration value="0NG...AJ80007000"/>
 *                                                       &lt;enumeration value="0RY...MJ80065000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="account-type"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="close-price">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="0.725"/>
 *                                             &lt;enumeration value="0.025"/>
 *                                             &lt;enumeration value="0.075"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="position-type"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="average-price">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="1.016379"/>
 *                                             &lt;enumeration value="0.084444"/>
 *                                             &lt;enumeration value="0.35"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="current-value">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="42050.00"/>
 *                                             &lt;enumeration value="1350.00"/>
 *                                             &lt;enumeration value="495.00"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="underlying-symbol">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="MRK"/>
 *                                             &lt;enumeration value="NG"/>
 *                                             &lt;enumeration value="RY"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="put-call">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="C"/>
 *                                             &lt;enumeration value="P"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="bond-factor"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="quote">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="error"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="symbol">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="MRK_121517C55"/>
 *                                                       &lt;enumeration value="NG_011918C7"/>
 *                                                       &lt;enumeration value="RY_011918P65"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="description">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="MRK 100 15 DEC 17 55
 * CALL"/>
 *                                                       &lt;enumeration value="NG 100 19 JAN 18 7
 * CALL"/>
 *                                                       &lt;enumeration value="RY 100 19 JAN 18 65
 * PUT"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="bid">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.68"/>
 *                                                       &lt;enumeration value="0.00"/>
 *                                                       &lt;enumeration value="0.05"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ask">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.77"/>
 *                                                       &lt;enumeration value="0.05"/>
 *                                                       &lt;enumeration value="0.10"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="bid-ask-size">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="21X4"/>
 *                                                       &lt;enumeration value="0X1862"/>
 *                                                       &lt;enumeration value="2X325"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="last">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.73"/>
 *                                                       &lt;enumeration value="0.02"/>
 *                                                       &lt;enumeration value="0.05"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="last-trade-size">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="2"/>
 *                                                       &lt;enumeration value="190"/>
 *                                                       &lt;enumeration value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="last-trade-date">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="2017-12-08 14:56:28
 * CST"/>
 *                                                       &lt;enumeration value="2017-12-08 13:45:06
 * CST"/>
 *                                                       &lt;enumeration value="2017-12-04 10:48:53
 * CST"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="open">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.48"/>
 *                                                       &lt;enumeration value="0.02"/>
 *                                                       &lt;enumeration value="0.00"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="high">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.80"/>
 *                                                       &lt;enumeration value="0.02"/>
 *                                                       &lt;enumeration value="0.00"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="low">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.40"/>
 *                                                       &lt;enumeration value="0.02"/>
 *                                                       &lt;enumeration value="0.00"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="close">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.725"/>
 *                                                       &lt;enumeration value="0.025"/>
 *                                                       &lt;enumeration value="0.075"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="volume">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="2197"/>
 *                                                       &lt;enumeration value="190"/>
 *                                                       &lt;enumeration value="0"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="strike-price">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="55.00"/>
 *                                                       &lt;enumeration value="7.00"/>
 *                                                       &lt;enumeration value="65.00"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="open-interest">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="24673"/>
 *                                                       &lt;enumeration value="35216"/>
 *                                                       &lt;enumeration value="1775"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="expiration-month">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="12"/>
 *                                                       &lt;enumeration value="1"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="expiration-day">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="15"/>
 *                                                       &lt;enumeration value="19"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="expiration-year">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="2017"/>
 *                                                       &lt;enumeration value="2018"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="real-time"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="exchange">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="OPR"/>
 *                                                       &lt;enumeration value="NAS"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="asset-type"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="underlying-symbol">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="MRK"/>
 *                                                       &lt;enumeration value="NG"/>
 *                                                       &lt;enumeration value="RY"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="put-call">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="C"/>
 *                                                       &lt;enumeration value="P"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="delta">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.71814"/>
 *                                                       &lt;enumeration value="0.051461"/>
 *                                                       &lt;enumeration value="-0.023519"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="gamma">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.351086"/>
 *                                                       &lt;enumeration value="0.078936"/>
 *                                                       &lt;enumeration value="0.006761"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="theta">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="-0.024583"/>
 *                                                       &lt;enumeration value="-0.001725"/>
 *                                                       &lt;enumeration value="-0.005835"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="vega">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.024028"/>
 *                                                       &lt;enumeration value="0.001216"/>
 *                                                       &lt;enumeration value="0.014893"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="rho">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.005653"/>
 *                                                       &lt;enumeration value="0.00017"/>
 *                                                       &lt;enumeration value="-0.002184"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="implied-volatility">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.2188"/>
 *                                                       &lt;enumeration value="0.4918"/>
 *                                                       &lt;enumeration value="0.1627"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="days-to-expiration">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="5"/>
 *                                                       &lt;enumeration value="40"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="time-value-index">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.155"/>
 *                                                       &lt;enumeration value="0.025"/>
 *                                                       &lt;enumeration value="0.075"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="multiplier"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="change">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="0.245"/>
 *                                                       &lt;enumeration value="0.005"/>
 *                                                       &lt;enumeration value="0.025"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="change-percent">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="33.79%"/>
 *                                                       &lt;enumeration value="20.00%"/>
 *                                                       &lt;enumeration value="33.33%"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="maintenance-requirement"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                   &lt;element name="funds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="bonds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="money-market" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "balance",
    "positions",
    "error"
})
@XmlRootElement(name = "amtd")
public class BalancesAndPositions {

  @XmlElement(required = true)
  protected String result;
  @XmlElement
  protected Balance balance;
  @XmlElement
  protected String error;
  @XmlElement
  protected BalancesAndPositions.Positions positions;
  @XmlTransient
  protected String originalXml;

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
   * Gets the value of the balance property.
   *
   * @return possible object is {@link Balance }
   */
  public Balance getBalance() {
    return balance;
  }

  /**
   * Sets the value of the balance property.
   *
   * @param value allowed object is {@link Balance }
   */
  public void setBalance(Balance value) {
    this.balance = value;
  }

  /**
   * Gets the value of the positions property.
   *
   * @return possible object is {@link BalancesAndPositions.Positions }
   */
  public BalancesAndPositions.Positions getPositions() {
    return positions;
  }

  /**
   * Sets the value of the positions property.
   *
   * @param value allowed object is {@link BalancesAndPositions.Positions }
   */
  public void setPositions(BalancesAndPositions.Positions value) {
    this.positions = value;
  }

  public String getOriginalXml() {
    return originalXml;
  }

  public void setOriginalXml(String originalXml) {
    this.originalXml = originalXml;
  }

  /**
   * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
   * expected content contained within this class. <p>
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="day-trader" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="round-trips" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="resticted-closing-transactions-only" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="cash-balance">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="money-market-balance">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="savings-balance">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="long-stock-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="long-option-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="short-option-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="mutual-fund-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="bond-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="account-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="pending-deposits">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="in-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="in-potential-call" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="short-balance">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="margin-balance">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="short-stock-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="long-marginable-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="short-marginable-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="margin-equity">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="equity-percentage">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="option-buying-power" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="stock-buying-power" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="day-trading-buying-power" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="available-funds-for-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="maintenance-requirement">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="maintenance-call-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="potential" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="regulation-t-call-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="potential" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="day-trading-call-value">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="potential" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="day-equity-call-value" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "error",
      "accountId",
      "dayTrader",
      "roundTrips",
      "restictedClosingTransactionsOnly",
      "cashBalance",
      "moneyMarketBalance",
      "savingsBalance",
      "longStockValue",
      "longOptionValue",
      "shortOptionValue",
      "mutualFundValue",
      "bondValue",
      "accountValue",
      "pendingDeposits",
      "inCall",
      "inPotentialCall",
      "shortBalance",
      "marginBalance",
      "shortStockValue",
      "longMarginableValue",
      "shortMarginableValue",
      "marginEquity",
      "equityPercentage",
      "optionBuyingPower",
      "stockBuyingPower",
      "dayTradingBuyingPower",
      "availableFundsForTrading",
      "maintenanceRequirement",
      "maintenanceCallValue",
      "regulationTCallValue",
      "dayTradingCallValue",
      "dayEquityCallValue"
  })
  public static class Balance {

    @XmlElement(required = true)
    protected String error;
    @XmlElement(name = "account-id", required = true)
    protected String accountId;
    @XmlElement(name = "day-trader", required = true)
    protected String dayTrader;
    @XmlElement(name = "round-trips", required = true)
    protected String roundTrips;
    @XmlElement(name = "resticted-closing-transactions-only", required = true)
    protected String restictedClosingTransactionsOnly;
    @XmlElement(name = "cash-balance", required = true)
    protected Balance.CashBalance cashBalance;
    @XmlElement(name = "money-market-balance", required = true)
    protected Balance.MoneyMarketBalance moneyMarketBalance;
    @XmlElement(name = "savings-balance", required = true)
    protected Balance.SavingsBalance savingsBalance;
    @XmlElement(name = "long-stock-value", required = true)
    protected Balance.LongStockValue longStockValue;
    @XmlElement(name = "long-option-value", required = true)
    protected Balance.LongOptionValue longOptionValue;
    @XmlElement(name = "short-option-value", required = true)
    protected Balance.ShortOptionValue shortOptionValue;
    @XmlElement(name = "mutual-fund-value", required = true)
    protected Balance.MutualFundValue mutualFundValue;
    @XmlElement(name = "bond-value", required = true)
    protected Balance.BondValue bondValue;
    @XmlElement(name = "account-value", required = true)
    protected Balance.AccountValue accountValue;
    @XmlElement(name = "pending-deposits", required = true)
    protected Balance.PendingDeposits pendingDeposits;
    @XmlElement(name = "in-call", required = true)
    protected String inCall;
    @XmlElement(name = "in-potential-call", required = true)
    protected String inPotentialCall;
    @XmlElement(name = "short-balance", required = true)
    protected Balance.ShortBalance shortBalance;
    @XmlElement(name = "margin-balance", required = true)
    protected Balance.MarginBalance marginBalance;
    @XmlElement(name = "short-stock-value", required = true)
    protected Balance.ShortStockValue shortStockValue;
    @XmlElement(name = "long-marginable-value", required = true)
    protected Balance.LongMarginableValue longMarginableValue;
    @XmlElement(name = "short-marginable-value", required = true)
    protected Balance.ShortMarginableValue shortMarginableValue;
    @XmlElement(name = "margin-equity", required = true)
    protected Balance.MarginEquity marginEquity;
    @XmlElement(name = "equity-percentage", required = true)
    protected Balance.EquityPercentage equityPercentage;
    @XmlElement(name = "option-buying-power", required = true)
    protected String optionBuyingPower;
    @XmlElement(name = "stock-buying-power", required = true)
    protected String stockBuyingPower;
    @XmlElement(name = "day-trading-buying-power", required = true)
    protected String dayTradingBuyingPower;
    @XmlElement(name = "available-funds-for-trading", required = true)
    protected String availableFundsForTrading;
    @XmlElement(name = "maintenance-requirement", required = true)
    protected Balance.MaintenanceRequirement maintenanceRequirement;
    @XmlElement(name = "maintenance-call-value", required = true)
    protected Balance.MaintenanceCallValue maintenanceCallValue;
    @XmlElement(name = "regulation-t-call-value", required = true)
    protected Balance.RegulationTCallValue regulationTCallValue;
    @XmlElement(name = "day-trading-call-value", required = true)
    protected Balance.DayTradingCallValue dayTradingCallValue;
    @XmlElement(name = "day-equity-call-value", required = true)
    protected String dayEquityCallValue;

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
     * Gets the value of the dayTrader property.
     *
     * @return possible object is {@link String }
     */
    public String getDayTrader() {
      return dayTrader;
    }

    /**
     * Sets the value of the dayTrader property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDayTrader(String value) {
      this.dayTrader = value;
    }

    /**
     * Gets the value of the roundTrips property.
     *
     * @return possible object is {@link String }
     */
    public String getRoundTrips() {
      return roundTrips;
    }

    /**
     * Sets the value of the roundTrips property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRoundTrips(String value) {
      this.roundTrips = value;
    }

    /**
     * Gets the value of the restictedClosingTransactionsOnly property.
     *
     * @return possible object is {@link String }
     */
    public String getRestictedClosingTransactionsOnly() {
      return restictedClosingTransactionsOnly;
    }

    /**
     * Sets the value of the restictedClosingTransactionsOnly property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRestictedClosingTransactionsOnly(String value) {
      this.restictedClosingTransactionsOnly = value;
    }

    /**
     * Gets the value of the cashBalance property.
     *
     * @return possible object is {@link Balance.CashBalance }
     */
    public Balance.CashBalance getCashBalance() {
      return cashBalance;
    }

    /**
     * Sets the value of the cashBalance property.
     *
     * @param value allowed object is {@link Balance.CashBalance }
     */
    public void setCashBalance(Balance.CashBalance value) {
      this.cashBalance = value;
    }

    /**
     * Gets the value of the moneyMarketBalance property.
     *
     * @return possible object is {@link Balance.MoneyMarketBalance }
     */
    public Balance.MoneyMarketBalance getMoneyMarketBalance() {
      return moneyMarketBalance;
    }

    /**
     * Sets the value of the moneyMarketBalance property.
     *
     * @param value allowed object is {@link Balance.MoneyMarketBalance }
     */
    public void setMoneyMarketBalance(Balance.MoneyMarketBalance value) {
      this.moneyMarketBalance = value;
    }

    /**
     * Gets the value of the savingsBalance property.
     *
     * @return possible object is {@link Balance.SavingsBalance }
     */
    public Balance.SavingsBalance getSavingsBalance() {
      return savingsBalance;
    }

    /**
     * Sets the value of the savingsBalance property.
     *
     * @param value allowed object is {@link Balance.SavingsBalance }
     */
    public void setSavingsBalance(Balance.SavingsBalance value) {
      this.savingsBalance = value;
    }

    /**
     * Gets the value of the longStockValue property.
     *
     * @return possible object is {@link Balance.LongStockValue }
     */
    public Balance.LongStockValue getLongStockValue() {
      return longStockValue;
    }

    /**
     * Sets the value of the longStockValue property.
     *
     * @param value allowed object is {@link Balance.LongStockValue }
     */
    public void setLongStockValue(Balance.LongStockValue value) {
      this.longStockValue = value;
    }

    /**
     * Gets the value of the longOptionValue property.
     *
     * @return possible object is {@link Balance.LongOptionValue }
     */
    public Balance.LongOptionValue getLongOptionValue() {
      return longOptionValue;
    }

    /**
     * Sets the value of the longOptionValue property.
     *
     * @param value allowed object is {@link Balance.LongOptionValue }
     */
    public void setLongOptionValue(Balance.LongOptionValue value) {
      this.longOptionValue = value;
    }

    /**
     * Gets the value of the shortOptionValue property.
     *
     * @return possible object is {@link Balance.ShortOptionValue }
     */
    public Balance.ShortOptionValue getShortOptionValue() {
      return shortOptionValue;
    }

    /**
     * Sets the value of the shortOptionValue property.
     *
     * @param value allowed object is {@link Balance.ShortOptionValue }
     */
    public void setShortOptionValue(Balance.ShortOptionValue value) {
      this.shortOptionValue = value;
    }

    /**
     * Gets the value of the mutualFundValue property.
     *
     * @return possible object is {@link Balance.MutualFundValue }
     */
    public Balance.MutualFundValue getMutualFundValue() {
      return mutualFundValue;
    }

    /**
     * Sets the value of the mutualFundValue property.
     *
     * @param value allowed object is {@link Balance.MutualFundValue }
     */
    public void setMutualFundValue(Balance.MutualFundValue value) {
      this.mutualFundValue = value;
    }

    /**
     * Gets the value of the bondValue property.
     *
     * @return possible object is {@link Balance.BondValue }
     */
    public Balance.BondValue getBondValue() {
      return bondValue;
    }

    /**
     * Sets the value of the bondValue property.
     *
     * @param value allowed object is {@link Balance.BondValue }
     */
    public void setBondValue(Balance.BondValue value) {
      this.bondValue = value;
    }

    /**
     * Gets the value of the accountValue property.
     *
     * @return possible object is {@link Balance.AccountValue }
     */
    public Balance.AccountValue getAccountValue() {
      return accountValue;
    }

    /**
     * Sets the value of the accountValue property.
     *
     * @param value allowed object is {@link Balance.AccountValue }
     */
    public void setAccountValue(Balance.AccountValue value) {
      this.accountValue = value;
    }

    /**
     * Gets the value of the pendingDeposits property.
     *
     * @return possible object is {@link Balance.PendingDeposits }
     */
    public Balance.PendingDeposits getPendingDeposits() {
      return pendingDeposits;
    }

    /**
     * Sets the value of the pendingDeposits property.
     *
     * @param value allowed object is {@link Balance.PendingDeposits }
     */
    public void setPendingDeposits(Balance.PendingDeposits value) {
      this.pendingDeposits = value;
    }

    /**
     * Gets the value of the inCall property.
     *
     * @return possible object is {@link String }
     */
    public String getInCall() {
      return inCall;
    }

    /**
     * Sets the value of the inCall property.
     *
     * @param value allowed object is {@link String }
     */
    public void setInCall(String value) {
      this.inCall = value;
    }

    /**
     * Gets the value of the inPotentialCall property.
     *
     * @return possible object is {@link String }
     */
    public String getInPotentialCall() {
      return inPotentialCall;
    }

    /**
     * Sets the value of the inPotentialCall property.
     *
     * @param value allowed object is {@link String }
     */
    public void setInPotentialCall(String value) {
      this.inPotentialCall = value;
    }

    /**
     * Gets the value of the shortBalance property.
     *
     * @return possible object is {@link Balance.ShortBalance }
     */
    public Balance.ShortBalance getShortBalance() {
      return shortBalance;
    }

    /**
     * Sets the value of the shortBalance property.
     *
     * @param value allowed object is {@link Balance.ShortBalance }
     */
    public void setShortBalance(Balance.ShortBalance value) {
      this.shortBalance = value;
    }

    /**
     * Gets the value of the marginBalance property.
     *
     * @return possible object is {@link Balance.MarginBalance }
     */
    public Balance.MarginBalance getMarginBalance() {
      return marginBalance;
    }

    /**
     * Sets the value of the marginBalance property.
     *
     * @param value allowed object is {@link Balance.MarginBalance }
     */
    public void setMarginBalance(Balance.MarginBalance value) {
      this.marginBalance = value;
    }

    /**
     * Gets the value of the shortStockValue property.
     *
     * @return possible object is {@link Balance.ShortStockValue }
     */
    public Balance.ShortStockValue getShortStockValue() {
      return shortStockValue;
    }

    /**
     * Sets the value of the shortStockValue property.
     *
     * @param value allowed object is {@link Balance.ShortStockValue }
     */
    public void setShortStockValue(Balance.ShortStockValue value) {
      this.shortStockValue = value;
    }

    /**
     * Gets the value of the longMarginableValue property.
     *
     * @return possible object is {@link Balance.LongMarginableValue }
     */
    public Balance.LongMarginableValue getLongMarginableValue() {
      return longMarginableValue;
    }

    /**
     * Sets the value of the longMarginableValue property.
     *
     * @param value allowed object is {@link Balance.LongMarginableValue }
     */
    public void setLongMarginableValue(Balance.LongMarginableValue value) {
      this.longMarginableValue = value;
    }

    /**
     * Gets the value of the shortMarginableValue property.
     *
     * @return possible object is {@link Balance.ShortMarginableValue }
     */
    public Balance.ShortMarginableValue getShortMarginableValue() {
      return shortMarginableValue;
    }

    /**
     * Sets the value of the shortMarginableValue property.
     *
     * @param value allowed object is {@link Balance.ShortMarginableValue }
     */
    public void setShortMarginableValue(Balance.ShortMarginableValue value) {
      this.shortMarginableValue = value;
    }

    /**
     * Gets the value of the marginEquity property.
     *
     * @return possible object is {@link Balance.MarginEquity }
     */
    public Balance.MarginEquity getMarginEquity() {
      return marginEquity;
    }

    /**
     * Sets the value of the marginEquity property.
     *
     * @param value allowed object is {@link Balance.MarginEquity }
     */
    public void setMarginEquity(Balance.MarginEquity value) {
      this.marginEquity = value;
    }

    /**
     * Gets the value of the equityPercentage property.
     *
     * @return possible object is {@link Balance.EquityPercentage }
     */
    public Balance.EquityPercentage getEquityPercentage() {
      return equityPercentage;
    }

    /**
     * Sets the value of the equityPercentage property.
     *
     * @param value allowed object is {@link Balance.EquityPercentage }
     */
    public void setEquityPercentage(Balance.EquityPercentage value) {
      this.equityPercentage = value;
    }

    /**
     * Gets the value of the optionBuyingPower property.
     *
     * @return possible object is {@link String }
     */
    public String getOptionBuyingPower() {
      return optionBuyingPower;
    }

    /**
     * Sets the value of the optionBuyingPower property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOptionBuyingPower(String value) {
      this.optionBuyingPower = value;
    }

    /**
     * Gets the value of the stockBuyingPower property.
     *
     * @return possible object is {@link String }
     */
    public String getStockBuyingPower() {
      return stockBuyingPower;
    }

    /**
     * Sets the value of the stockBuyingPower property.
     *
     * @param value allowed object is {@link String }
     */
    public void setStockBuyingPower(String value) {
      this.stockBuyingPower = value;
    }

    /**
     * Gets the value of the dayTradingBuyingPower property.
     *
     * @return possible object is {@link String }
     */
    public String getDayTradingBuyingPower() {
      return dayTradingBuyingPower;
    }

    /**
     * Sets the value of the dayTradingBuyingPower property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDayTradingBuyingPower(String value) {
      this.dayTradingBuyingPower = value;
    }

    /**
     * Gets the value of the availableFundsForTrading property.
     *
     * @return possible object is {@link String }
     */
    public String getAvailableFundsForTrading() {
      return availableFundsForTrading;
    }

    /**
     * Sets the value of the availableFundsForTrading property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAvailableFundsForTrading(String value) {
      this.availableFundsForTrading = value;
    }

    /**
     * Gets the value of the maintenanceRequirement property.
     *
     * @return possible object is {@link Balance.MaintenanceRequirement }
     */
    public Balance.MaintenanceRequirement getMaintenanceRequirement() {
      return maintenanceRequirement;
    }

    /**
     * Sets the value of the maintenanceRequirement property.
     *
     * @param value allowed object is {@link Balance.MaintenanceRequirement }
     */
    public void setMaintenanceRequirement(Balance.MaintenanceRequirement value) {
      this.maintenanceRequirement = value;
    }

    /**
     * Gets the value of the maintenanceCallValue property.
     *
     * @return possible object is {@link Balance.MaintenanceCallValue }
     */
    public Balance.MaintenanceCallValue getMaintenanceCallValue() {
      return maintenanceCallValue;
    }

    /**
     * Sets the value of the maintenanceCallValue property.
     *
     * @param value allowed object is {@link Balance.MaintenanceCallValue }
     */
    public void setMaintenanceCallValue(Balance.MaintenanceCallValue value) {
      this.maintenanceCallValue = value;
    }

    /**
     * Gets the value of the regulationTCallValue property.
     *
     * @return possible object is {@link Balance.RegulationTCallValue }
     */
    public Balance.RegulationTCallValue getRegulationTCallValue() {
      return regulationTCallValue;
    }

    /**
     * Sets the value of the regulationTCallValue property.
     *
     * @param value allowed object is {@link Balance.RegulationTCallValue }
     */
    public void setRegulationTCallValue(Balance.RegulationTCallValue value) {
      this.regulationTCallValue = value;
    }

    /**
     * Gets the value of the dayTradingCallValue property.
     *
     * @return possible object is {@link Balance.DayTradingCallValue }
     */
    public Balance.DayTradingCallValue getDayTradingCallValue() {
      return dayTradingCallValue;
    }

    /**
     * Sets the value of the dayTradingCallValue property.
     *
     * @param value allowed object is {@link Balance.DayTradingCallValue }
     */
    public void setDayTradingCallValue(Balance.DayTradingCallValue value) {
      this.dayTradingCallValue = value;
    }

    /**
     * Gets the value of the dayEquityCallValue property.
     *
     * @return possible object is {@link String }
     */
    public String getDayEquityCallValue() {
      return dayEquityCallValue;
    }

    /**
     * Sets the value of the dayEquityCallValue property.
     *
     * @param value allowed object is {@link String }
     */
    public void setDayEquityCallValue(String value) {
      this.dayEquityCallValue = value;
    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class AccountValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class BondValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class CashBalance {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="potential" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "potential",
        "initial"
    })
    public static class DayTradingCallValue {

      @XmlElement(required = true)
      protected String potential;
      @XmlElement(required = true)
      protected String initial;

      /**
       * Gets the value of the potential property.
       *
       * @return possible object is {@link String }
       */
      public String getPotential() {
        return potential;
      }

      /**
       * Sets the value of the potential property.
       *
       * @param value allowed object is {@link String }
       */
      public void setPotential(String value) {
        this.potential = value;
      }

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class EquityPercentage {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class LongMarginableValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class LongOptionValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class LongStockValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="potential" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "potential"
    })
    public static class MaintenanceCallValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String potential;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
      }

      /**
       * Gets the value of the potential property.
       *
       * @return possible object is {@link String }
       */
      public String getPotential() {
        return potential;
      }

      /**
       * Sets the value of the potential property.
       *
       * @param value allowed object is {@link String }
       */
      public void setPotential(String value) {
        this.potential = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class MaintenanceRequirement {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class MarginBalance {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class MarginEquity {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class MoneyMarketBalance {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class MutualFundValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class PendingDeposits {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="potential" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "potential"
    })
    public static class RegulationTCallValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String potential;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
      }

      /**
       * Gets the value of the potential property.
       *
       * @return possible object is {@link String }
       */
      public String getPotential() {
        return potential;
      }

      /**
       * Sets the value of the potential property.
       *
       * @param value allowed object is {@link String }
       */
      public void setPotential(String value) {
        this.potential = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "current"
    })
    public static class SavingsBalance {

      @XmlElement(required = true)
      protected String current;

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
      }

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class ShortBalance {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class ShortMarginableValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class ShortOptionValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "initial",
        "current",
        "change"
    })
    public static class ShortStockValue {

      @XmlElement(required = true)
      protected String initial;
      @XmlElement(required = true)
      protected String current;
      @XmlElement(required = true)
      protected String change;

      /**
       * Gets the value of the initial property.
       *
       * @return possible object is {@link String }
       */
      public String getInitial() {
        return initial;
      }

      /**
       * Sets the value of the initial property.
       *
       * @param value allowed object is {@link String }
       */
      public void setInitial(String value) {
        this.initial = value;
      }

      /**
       * Gets the value of the current property.
       *
       * @return possible object is {@link String }
       */
      public String getCurrent() {
        return current;
      }

      /**
       * Sets the value of the current property.
       *
       * @param value allowed object is {@link String }
       */
      public void setCurrent(String value) {
        this.current = value;
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

    }

  }


  /**
   * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
   * expected content contained within this class. <p>
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="stocks">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="position" maxOccurs="unbounded" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="quantity">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="-14"/>
   *                                   &lt;enumeration value="17550"/>
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
   *                                             &lt;enumeration value="RY"/>
   *                                             &lt;enumeration value="UVXY"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="symbol-with-type-prefix">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="RY"/>
   *                                             &lt;enumeration value="UVXY"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="description">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="ROYAL BANK CDA MONTREAL QUE
   * COM"/>
   *                                             &lt;enumeration value="PROSHARES ULTRA VIX SHRT TM
   * FUTURES ETF"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="asset-type"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="cusip">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="780087102"/>
   *                                             &lt;enumeration value="74347W163"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="account-type">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="3"/>
   *                                   &lt;enumeration value="2"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="close-price">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="79.64"/>
   *                                   &lt;enumeration value="12.06"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="position-type">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="SHORT"/>
   *                                   &lt;enumeration value="LONG"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="average-price">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="79.442143"/>
   *                                   &lt;enumeration value="20.959573"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="current-value">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="-1114.96"/>
   *                                   &lt;enumeration value="211828.50"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="bond-factor" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="quote">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="symbol">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="RY"/>
   *                                             &lt;enumeration value="UVXY"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="description"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="bid">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="62.50"/>
   *                                             &lt;enumeration value="12.07"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="ask">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="90.00"/>
   *                                             &lt;enumeration value="12.08"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="bid-ask-size">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="1X1"/>
   *                                             &lt;enumeration value="6X5"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="last">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="79.64"/>
   *                                             &lt;enumeration value="12.06"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="last-trade-size">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="9474"/>
   *                                             &lt;enumeration value="0"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="last-trade-date">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="2017-12-08 15:02:02 CST"/>
   *                                             &lt;enumeration value="2017-12-08 19:00:00 CST"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="open">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="79.45"/>
   *                                             &lt;enumeration value="12.50"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="high">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="79.68"/>
   *                                             &lt;enumeration value="12.5764"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="low">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="79.33"/>
   *                                             &lt;enumeration value="12.04"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="close">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="79.64"/>
   *                                             &lt;enumeration value="12.06"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="volume">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="882424"/>
   *                                             &lt;enumeration value="26026459"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="year-high">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="80.98"/>
   *                                             &lt;enumeration value="45.62"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="year-low">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="66.66"/>
   *                                             &lt;enumeration value="6.07"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="real-time"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="exchange">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="NYS"/>
   *                                             &lt;enumeration value="PAC"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="asset-type"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="change">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.30"/>
   *                                             &lt;enumeration value="-0.86"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="change-percent">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.38%"/>
   *                                             &lt;enumeration value="-7.13%"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="maintenance-requirement">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="334.49"/>
   *                                   &lt;enumeration value="169462.80"/>
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
   *         &lt;element name="options">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="position" maxOccurs="unbounded" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="quantity">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="580"/>
   *                                   &lt;enumeration value="540"/>
   *                                   &lt;enumeration value="66"/>
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
   *                                             &lt;enumeration value="NG_011918C7"/>
   *                                             &lt;enumeration value="RY_011918P65"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="symbol-with-type-prefix">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="MRK_121517C55"/>
   *                                             &lt;enumeration value="NG_011918C7"/>
   *                                             &lt;enumeration value="RY_011918P65"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="description">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="MERCK &amp; CO INC. COM"/>
   *                                             &lt;enumeration value="NOVAGOLD RESOURCES INC
   * COM"/>
   *                                             &lt;enumeration value="ROYAL BANK CDA MONTREAL QUE
   * COM"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="asset-type"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="cusip">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0MRK..LF70055000"/>
   *                                             &lt;enumeration value="0NG...AJ80007000"/>
   *                                             &lt;enumeration value="0RY...MJ80065000"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="account-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="close-price">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="0.725"/>
   *                                   &lt;enumeration value="0.025"/>
   *                                   &lt;enumeration value="0.075"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="position-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="average-price">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="1.016379"/>
   *                                   &lt;enumeration value="0.084444"/>
   *                                   &lt;enumeration value="0.35"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="current-value">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="42050.00"/>
   *                                   &lt;enumeration value="1350.00"/>
   *                                   &lt;enumeration value="495.00"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="underlying-symbol">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="MRK"/>
   *                                   &lt;enumeration value="NG"/>
   *                                   &lt;enumeration value="RY"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="put-call">
   *                               &lt;simpleType>
   *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                   &lt;enumeration value="C"/>
   *                                   &lt;enumeration value="P"/>
   *                                 &lt;/restriction>
   *                               &lt;/simpleType>
   *                             &lt;/element>
   *                             &lt;element name="bond-factor" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="quote">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="symbol">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="MRK_121517C55"/>
   *                                             &lt;enumeration value="NG_011918C7"/>
   *                                             &lt;enumeration value="RY_011918P65"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="description">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="MRK 100 15 DEC 17 55
   * CALL"/>
   *                                             &lt;enumeration value="NG 100 19 JAN 18 7 CALL"/>
   *                                             &lt;enumeration value="RY 100 19 JAN 18 65 PUT"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="bid">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.68"/>
   *                                             &lt;enumeration value="0.00"/>
   *                                             &lt;enumeration value="0.05"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="ask">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.77"/>
   *                                             &lt;enumeration value="0.05"/>
   *                                             &lt;enumeration value="0.10"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="bid-ask-size">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="21X4"/>
   *                                             &lt;enumeration value="0X1862"/>
   *                                             &lt;enumeration value="2X325"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="last">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.73"/>
   *                                             &lt;enumeration value="0.02"/>
   *                                             &lt;enumeration value="0.05"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="last-trade-size">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="2"/>
   *                                             &lt;enumeration value="190"/>
   *                                             &lt;enumeration value="1"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="last-trade-date">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="2017-12-08 14:56:28 CST"/>
   *                                             &lt;enumeration value="2017-12-08 13:45:06 CST"/>
   *                                             &lt;enumeration value="2017-12-04 10:48:53 CST"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="open">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.48"/>
   *                                             &lt;enumeration value="0.02"/>
   *                                             &lt;enumeration value="0.00"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="high">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.80"/>
   *                                             &lt;enumeration value="0.02"/>
   *                                             &lt;enumeration value="0.00"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="low">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.40"/>
   *                                             &lt;enumeration value="0.02"/>
   *                                             &lt;enumeration value="0.00"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="close">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.725"/>
   *                                             &lt;enumeration value="0.025"/>
   *                                             &lt;enumeration value="0.075"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="volume">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="2197"/>
   *                                             &lt;enumeration value="190"/>
   *                                             &lt;enumeration value="0"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="strike-price">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="55.00"/>
   *                                             &lt;enumeration value="7.00"/>
   *                                             &lt;enumeration value="65.00"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="open-interest">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="24673"/>
   *                                             &lt;enumeration value="35216"/>
   *                                             &lt;enumeration value="1775"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="expiration-month">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="12"/>
   *                                             &lt;enumeration value="1"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="expiration-day">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="15"/>
   *                                             &lt;enumeration value="19"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="expiration-year">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="2017"/>
   *                                             &lt;enumeration value="2018"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="real-time"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="exchange">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="OPR"/>
   *                                             &lt;enumeration value="NAS"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="asset-type"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="underlying-symbol">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="MRK"/>
   *                                             &lt;enumeration value="NG"/>
   *                                             &lt;enumeration value="RY"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="put-call">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="C"/>
   *                                             &lt;enumeration value="P"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="delta">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.71814"/>
   *                                             &lt;enumeration value="0.051461"/>
   *                                             &lt;enumeration value="-0.023519"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="gamma">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.351086"/>
   *                                             &lt;enumeration value="0.078936"/>
   *                                             &lt;enumeration value="0.006761"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="theta">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="-0.024583"/>
   *                                             &lt;enumeration value="-0.001725"/>
   *                                             &lt;enumeration value="-0.005835"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="vega">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.024028"/>
   *                                             &lt;enumeration value="0.001216"/>
   *                                             &lt;enumeration value="0.014893"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="rho">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.005653"/>
   *                                             &lt;enumeration value="0.00017"/>
   *                                             &lt;enumeration value="-0.002184"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="implied-volatility">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.2188"/>
   *                                             &lt;enumeration value="0.4918"/>
   *                                             &lt;enumeration value="0.1627"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="days-to-expiration">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="5"/>
   *                                             &lt;enumeration value="40"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="time-value-index">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.155"/>
   *                                             &lt;enumeration value="0.025"/>
   *                                             &lt;enumeration value="0.075"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="multiplier"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="change">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="0.245"/>
   *                                             &lt;enumeration value="0.005"/>
   *                                             &lt;enumeration value="0.025"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                       &lt;element name="change-percent">
   *                                         &lt;simpleType>
   *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                                             &lt;enumeration value="33.79%"/>
   *                                             &lt;enumeration value="20.00%"/>
   *                                             &lt;enumeration value="33.33%"/>
   *                                           &lt;/restriction>
   *                                         &lt;/simpleType>
   *                                       &lt;/element>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="maintenance-requirement"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
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
   *         &lt;element name="funds" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="bonds" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="money-market" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "error",
      "accountId",
      "stocks",
      "options",
      "funds",
      "bonds",
      "moneyMarket"
  })
  public static class Positions {

    @XmlElement(required = true)
    protected String error;
    @XmlElement(name = "account-id", required = true)
    protected String accountId;
    @XmlElement(required = true)
    protected BalancesAndPositions.Positions.Stocks stocks;
    @XmlElement(required = true)
    protected BalancesAndPositions.Positions.Options options;
    @XmlElement(required = true)
    protected String funds;
    @XmlElement(required = true)
    protected String bonds;
    @XmlElement(name = "money-market", required = true)
    protected String moneyMarket;

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
     * Gets the value of the stocks property.
     *
     * @return possible object is {@link BalancesAndPositions.Positions.Stocks }
     */
    public BalancesAndPositions.Positions.Stocks getStocks() {
      return stocks;
    }

    /**
     * Sets the value of the stocks property.
     *
     * @param value allowed object is {@link BalancesAndPositions.Positions.Stocks }
     */
    public void setStocks(BalancesAndPositions.Positions.Stocks value) {
      this.stocks = value;
    }

    /**
     * Gets the value of the options property.
     *
     * @return possible object is {@link BalancesAndPositions.Positions.Options }
     */
    public BalancesAndPositions.Positions.Options getOptions() {
      return options;
    }

    /**
     * Sets the value of the options property.
     *
     * @param value allowed object is {@link BalancesAndPositions.Positions.Options }
     */
    public void setOptions(BalancesAndPositions.Positions.Options value) {
      this.options = value;
    }

    /**
     * Gets the value of the funds property.
     *
     * @return possible object is {@link String }
     */
    public String getFunds() {
      return funds;
    }

    /**
     * Sets the value of the funds property.
     *
     * @param value allowed object is {@link String }
     */
    public void setFunds(String value) {
      this.funds = value;
    }

    /**
     * Gets the value of the bonds property.
     *
     * @return possible object is {@link String }
     */
    public String getBonds() {
      return bonds;
    }

    /**
     * Sets the value of the bonds property.
     *
     * @param value allowed object is {@link String }
     */
    public void setBonds(String value) {
      this.bonds = value;
    }

    /**
     * Gets the value of the moneyMarket property.
     *
     * @return possible object is {@link String }
     */
    public String getMoneyMarket() {
      return moneyMarket;
    }

    /**
     * Sets the value of the moneyMarket property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMoneyMarket(String value) {
      this.moneyMarket = value;
    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="position" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="quantity">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="580"/>
     *                         &lt;enumeration value="540"/>
     *                         &lt;enumeration value="66"/>
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
     *                                   &lt;enumeration value="NG_011918C7"/>
     *                                   &lt;enumeration value="RY_011918P65"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="symbol-with-type-prefix">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="MRK_121517C55"/>
     *                                   &lt;enumeration value="NG_011918C7"/>
     *                                   &lt;enumeration value="RY_011918P65"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="MERCK &amp; CO INC. COM"/>
     *                                   &lt;enumeration value="NOVAGOLD RESOURCES INC COM"/>
     *                                   &lt;enumeration value="ROYAL BANK CDA MONTREAL QUE COM"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="cusip">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0MRK..LF70055000"/>
     *                                   &lt;enumeration value="0NG...AJ80007000"/>
     *                                   &lt;enumeration value="0RY...MJ80065000"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="account-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="close-price">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="0.725"/>
     *                         &lt;enumeration value="0.025"/>
     *                         &lt;enumeration value="0.075"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="position-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="average-price">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="1.016379"/>
     *                         &lt;enumeration value="0.084444"/>
     *                         &lt;enumeration value="0.35"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="current-value">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="42050.00"/>
     *                         &lt;enumeration value="1350.00"/>
     *                         &lt;enumeration value="495.00"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="underlying-symbol">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="MRK"/>
     *                         &lt;enumeration value="NG"/>
     *                         &lt;enumeration value="RY"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="put-call">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="C"/>
     *                         &lt;enumeration value="P"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="bond-factor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="quote">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="symbol">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="MRK_121517C55"/>
     *                                   &lt;enumeration value="NG_011918C7"/>
     *                                   &lt;enumeration value="RY_011918P65"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="MRK 100 15 DEC 17 55 CALL"/>
     *                                   &lt;enumeration value="NG 100 19 JAN 18 7 CALL"/>
     *                                   &lt;enumeration value="RY 100 19 JAN 18 65 PUT"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="bid">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.68"/>
     *                                   &lt;enumeration value="0.00"/>
     *                                   &lt;enumeration value="0.05"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ask">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.77"/>
     *                                   &lt;enumeration value="0.05"/>
     *                                   &lt;enumeration value="0.10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="bid-ask-size">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="21X4"/>
     *                                   &lt;enumeration value="0X1862"/>
     *                                   &lt;enumeration value="2X325"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="last">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.73"/>
     *                                   &lt;enumeration value="0.02"/>
     *                                   &lt;enumeration value="0.05"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="last-trade-size">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="190"/>
     *                                   &lt;enumeration value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="last-trade-date">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="2017-12-08 14:56:28 CST"/>
     *                                   &lt;enumeration value="2017-12-08 13:45:06 CST"/>
     *                                   &lt;enumeration value="2017-12-04 10:48:53 CST"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="open">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.48"/>
     *                                   &lt;enumeration value="0.02"/>
     *                                   &lt;enumeration value="0.00"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="high">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.80"/>
     *                                   &lt;enumeration value="0.02"/>
     *                                   &lt;enumeration value="0.00"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="low">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.40"/>
     *                                   &lt;enumeration value="0.02"/>
     *                                   &lt;enumeration value="0.00"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="close">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.725"/>
     *                                   &lt;enumeration value="0.025"/>
     *                                   &lt;enumeration value="0.075"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="volume">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="2197"/>
     *                                   &lt;enumeration value="190"/>
     *                                   &lt;enumeration value="0"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="strike-price">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="55.00"/>
     *                                   &lt;enumeration value="7.00"/>
     *                                   &lt;enumeration value="65.00"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="open-interest">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="24673"/>
     *                                   &lt;enumeration value="35216"/>
     *                                   &lt;enumeration value="1775"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="expiration-month">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="12"/>
     *                                   &lt;enumeration value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="expiration-day">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="15"/>
     *                                   &lt;enumeration value="19"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="expiration-year">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="2017"/>
     *                                   &lt;enumeration value="2018"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="exchange">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="OPR"/>
     *                                   &lt;enumeration value="NAS"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="underlying-symbol">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="MRK"/>
     *                                   &lt;enumeration value="NG"/>
     *                                   &lt;enumeration value="RY"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="put-call">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="C"/>
     *                                   &lt;enumeration value="P"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="delta">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.71814"/>
     *                                   &lt;enumeration value="0.051461"/>
     *                                   &lt;enumeration value="-0.023519"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="gamma">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.351086"/>
     *                                   &lt;enumeration value="0.078936"/>
     *                                   &lt;enumeration value="0.006761"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="theta">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="-0.024583"/>
     *                                   &lt;enumeration value="-0.001725"/>
     *                                   &lt;enumeration value="-0.005835"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="vega">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.024028"/>
     *                                   &lt;enumeration value="0.001216"/>
     *                                   &lt;enumeration value="0.014893"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="rho">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.005653"/>
     *                                   &lt;enumeration value="0.00017"/>
     *                                   &lt;enumeration value="-0.002184"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="implied-volatility">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.2188"/>
     *                                   &lt;enumeration value="0.4918"/>
     *                                   &lt;enumeration value="0.1627"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="days-to-expiration">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="5"/>
     *                                   &lt;enumeration value="40"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="time-value-index">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.155"/>
     *                                   &lt;enumeration value="0.025"/>
     *                                   &lt;enumeration value="0.075"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="change">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.245"/>
     *                                   &lt;enumeration value="0.005"/>
     *                                   &lt;enumeration value="0.025"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="change-percent">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="33.79%"/>
     *                                   &lt;enumeration value="20.00%"/>
     *                                   &lt;enumeration value="33.33%"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maintenance-requirement" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "position"
    })
    public static class Options {

      protected List<Position> position;

      /**
       * Gets the value of the position property. <p> <p> This accessor method returns a reference
       * to the live list, not a snapshot. Therefore any modification you make to the returned list
       * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method
       * for the position property. <p> <p> For example, to add a new item, do as follows:
       * <pre>
       *    getPosition().add(newItem);
       * </pre>
       * <p> <p> <p> Objects of the following type(s) are allowed in the list {@link
       * BalancesAndPositions.Positions.Options.Position }
       */
      public List<Position> getPosition() {
        if (position == null) {
          position = new ArrayList<Position>();
        }
        return this.position;
      }


      /**
       * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies
       * the expected content contained within this class. <p>
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="quantity">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="580"/>
       *               &lt;enumeration value="540"/>
       *               &lt;enumeration value="66"/>
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
       *                         &lt;enumeration value="NG_011918C7"/>
       *                         &lt;enumeration value="RY_011918P65"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="symbol-with-type-prefix">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="MRK_121517C55"/>
       *                         &lt;enumeration value="NG_011918C7"/>
       *                         &lt;enumeration value="RY_011918P65"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="description">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="MERCK &amp; CO INC. COM"/>
       *                         &lt;enumeration value="NOVAGOLD RESOURCES INC COM"/>
       *                         &lt;enumeration value="ROYAL BANK CDA MONTREAL QUE COM"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="cusip">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0MRK..LF70055000"/>
       *                         &lt;enumeration value="0NG...AJ80007000"/>
       *                         &lt;enumeration value="0RY...MJ80065000"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="account-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="close-price">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="0.725"/>
       *               &lt;enumeration value="0.025"/>
       *               &lt;enumeration value="0.075"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="position-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="average-price">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="1.016379"/>
       *               &lt;enumeration value="0.084444"/>
       *               &lt;enumeration value="0.35"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="current-value">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="42050.00"/>
       *               &lt;enumeration value="1350.00"/>
       *               &lt;enumeration value="495.00"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="underlying-symbol">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="MRK"/>
       *               &lt;enumeration value="NG"/>
       *               &lt;enumeration value="RY"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="put-call">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="C"/>
       *               &lt;enumeration value="P"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="bond-factor" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="quote">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="symbol">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="MRK_121517C55"/>
       *                         &lt;enumeration value="NG_011918C7"/>
       *                         &lt;enumeration value="RY_011918P65"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="description">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="MRK 100 15 DEC 17 55 CALL"/>
       *                         &lt;enumeration value="NG 100 19 JAN 18 7 CALL"/>
       *                         &lt;enumeration value="RY 100 19 JAN 18 65 PUT"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="bid">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.68"/>
       *                         &lt;enumeration value="0.00"/>
       *                         &lt;enumeration value="0.05"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="ask">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.77"/>
       *                         &lt;enumeration value="0.05"/>
       *                         &lt;enumeration value="0.10"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="bid-ask-size">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="21X4"/>
       *                         &lt;enumeration value="0X1862"/>
       *                         &lt;enumeration value="2X325"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="last">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.73"/>
       *                         &lt;enumeration value="0.02"/>
       *                         &lt;enumeration value="0.05"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="last-trade-size">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="2"/>
       *                         &lt;enumeration value="190"/>
       *                         &lt;enumeration value="1"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="last-trade-date">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="2017-12-08 14:56:28 CST"/>
       *                         &lt;enumeration value="2017-12-08 13:45:06 CST"/>
       *                         &lt;enumeration value="2017-12-04 10:48:53 CST"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="open">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.48"/>
       *                         &lt;enumeration value="0.02"/>
       *                         &lt;enumeration value="0.00"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="high">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.80"/>
       *                         &lt;enumeration value="0.02"/>
       *                         &lt;enumeration value="0.00"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="low">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.40"/>
       *                         &lt;enumeration value="0.02"/>
       *                         &lt;enumeration value="0.00"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="close">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.725"/>
       *                         &lt;enumeration value="0.025"/>
       *                         &lt;enumeration value="0.075"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="volume">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="2197"/>
       *                         &lt;enumeration value="190"/>
       *                         &lt;enumeration value="0"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="strike-price">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="55.00"/>
       *                         &lt;enumeration value="7.00"/>
       *                         &lt;enumeration value="65.00"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="open-interest">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="24673"/>
       *                         &lt;enumeration value="35216"/>
       *                         &lt;enumeration value="1775"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="expiration-month">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="12"/>
       *                         &lt;enumeration value="1"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="expiration-day">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="15"/>
       *                         &lt;enumeration value="19"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="expiration-year">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="2017"/>
       *                         &lt;enumeration value="2018"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="exchange">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="OPR"/>
       *                         &lt;enumeration value="NAS"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="underlying-symbol">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="MRK"/>
       *                         &lt;enumeration value="NG"/>
       *                         &lt;enumeration value="RY"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="put-call">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="C"/>
       *                         &lt;enumeration value="P"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="delta">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.71814"/>
       *                         &lt;enumeration value="0.051461"/>
       *                         &lt;enumeration value="-0.023519"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="gamma">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.351086"/>
       *                         &lt;enumeration value="0.078936"/>
       *                         &lt;enumeration value="0.006761"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="theta">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="-0.024583"/>
       *                         &lt;enumeration value="-0.001725"/>
       *                         &lt;enumeration value="-0.005835"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="vega">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.024028"/>
       *                         &lt;enumeration value="0.001216"/>
       *                         &lt;enumeration value="0.014893"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="rho">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.005653"/>
       *                         &lt;enumeration value="0.00017"/>
       *                         &lt;enumeration value="-0.002184"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="implied-volatility">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.2188"/>
       *                         &lt;enumeration value="0.4918"/>
       *                         &lt;enumeration value="0.1627"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="days-to-expiration">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="5"/>
       *                         &lt;enumeration value="40"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="time-value-index">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.155"/>
       *                         &lt;enumeration value="0.025"/>
       *                         &lt;enumeration value="0.075"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="change">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.245"/>
       *                         &lt;enumeration value="0.005"/>
       *                         &lt;enumeration value="0.025"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="change-percent">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="33.79%"/>
       *                         &lt;enumeration value="20.00%"/>
       *                         &lt;enumeration value="33.33%"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="maintenance-requirement" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {
          "error",
          "quantity",
          "security",
          "accountType",
          "closePrice",
          "positionType",
          "averagePrice",
          "currentValue",
          "underlyingSymbol",
          "putCall",
          "bondFactor",
          "quote",
          "maintenanceRequirement"
      })
      public static class Position {

        @XmlElement(required = true)
        protected String error;
        @XmlElement(required = true)
        protected String quantity;
        @XmlElement(required = true)
        protected BalancesAndPositions.Positions.Options.Position.Security security;
        @XmlElement(name = "account-type", required = true)
        protected String accountType;
        @XmlElement(name = "close-price", required = true)
        protected String closePrice;
        @XmlElement(name = "position-type", required = true)
        protected String positionType;
        @XmlElement(name = "average-price", required = true)
        protected String averagePrice;
        @XmlElement(name = "current-value", required = true)
        protected String currentValue;
        @XmlElement(name = "underlying-symbol", required = true)
        protected String underlyingSymbol;
        @XmlElement(name = "put-call", required = true)
        protected String putCall;
        @XmlElement(name = "bond-factor", required = true)
        protected String bondFactor;
        @XmlElement(required = true)
        protected BalancesAndPositions.Positions.Options.Position.Quote quote;
        @XmlElement(name = "maintenance-requirement", required = true)
        protected String maintenanceRequirement;

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
         * Gets the value of the security property.
         *
         * @return possible object is {@link BalancesAndPositions.Positions.Options.Position.Security
         * }
         */
        public BalancesAndPositions.Positions.Options.Position.Security getSecurity() {
          return security;
        }

        /**
         * Sets the value of the security property.
         *
         * @param value allowed object is {@link BalancesAndPositions.Positions.Options.Position.Security
         * }
         */
        public void setSecurity(BalancesAndPositions.Positions.Options.Position.Security value) {
          this.security = value;
        }

        /**
         * Gets the value of the accountType property.
         *
         * @return possible object is {@link String }
         */
        public String getAccountType() {
          return accountType;
        }

        /**
         * Sets the value of the accountType property.
         *
         * @param value allowed object is {@link String }
         */
        public void setAccountType(String value) {
          this.accountType = value;
        }

        /**
         * Gets the value of the closePrice property.
         *
         * @return possible object is {@link String }
         */
        public String getClosePrice() {
          return closePrice;
        }

        /**
         * Sets the value of the closePrice property.
         *
         * @param value allowed object is {@link String }
         */
        public void setClosePrice(String value) {
          this.closePrice = value;
        }

        /**
         * Gets the value of the positionType property.
         *
         * @return possible object is {@link String }
         */
        public String getPositionType() {
          return positionType;
        }

        /**
         * Sets the value of the positionType property.
         *
         * @param value allowed object is {@link String }
         */
        public void setPositionType(String value) {
          this.positionType = value;
        }

        /**
         * Gets the value of the averagePrice property.
         *
         * @return possible object is {@link String }
         */
        public String getAveragePrice() {
          return averagePrice;
        }

        /**
         * Sets the value of the averagePrice property.
         *
         * @param value allowed object is {@link String }
         */
        public void setAveragePrice(String value) {
          this.averagePrice = value;
        }

        /**
         * Gets the value of the currentValue property.
         *
         * @return possible object is {@link String }
         */
        public String getCurrentValue() {
          return currentValue;
        }

        /**
         * Sets the value of the currentValue property.
         *
         * @param value allowed object is {@link String }
         */
        public void setCurrentValue(String value) {
          this.currentValue = value;
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
         * Gets the value of the bondFactor property.
         *
         * @return possible object is {@link String }
         */
        public String getBondFactor() {
          return bondFactor;
        }

        /**
         * Sets the value of the bondFactor property.
         *
         * @param value allowed object is {@link String }
         */
        public void setBondFactor(String value) {
          this.bondFactor = value;
        }

        /**
         * Gets the value of the quote property.
         *
         * @return possible object is {@link BalancesAndPositions.Positions.Options.Position.Quote }
         */
        public BalancesAndPositions.Positions.Options.Position.Quote getQuote() {
          return quote;
        }

        /**
         * Sets the value of the quote property.
         *
         * @param value allowed object is {@link BalancesAndPositions.Positions.Options.Position.Quote
         * }
         */
        public void setQuote(BalancesAndPositions.Positions.Options.Position.Quote value) {
          this.quote = value;
        }

        /**
         * Gets the value of the maintenanceRequirement property.
         *
         * @return possible object is {@link String }
         */
        public String getMaintenanceRequirement() {
          return maintenanceRequirement;
        }

        /**
         * Sets the value of the maintenanceRequirement property.
         *
         * @param value allowed object is {@link String }
         */
        public void setMaintenanceRequirement(String value) {
          this.maintenanceRequirement = value;
        }


        /**
         * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies
         * the expected content contained within this class. <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="symbol">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="MRK_121517C55"/>
         *               &lt;enumeration value="NG_011918C7"/>
         *               &lt;enumeration value="RY_011918P65"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="description">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="MRK 100 15 DEC 17 55 CALL"/>
         *               &lt;enumeration value="NG 100 19 JAN 18 7 CALL"/>
         *               &lt;enumeration value="RY 100 19 JAN 18 65 PUT"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="bid">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.68"/>
         *               &lt;enumeration value="0.00"/>
         *               &lt;enumeration value="0.05"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ask">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.77"/>
         *               &lt;enumeration value="0.05"/>
         *               &lt;enumeration value="0.10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="bid-ask-size">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="21X4"/>
         *               &lt;enumeration value="0X1862"/>
         *               &lt;enumeration value="2X325"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="last">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.73"/>
         *               &lt;enumeration value="0.02"/>
         *               &lt;enumeration value="0.05"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="last-trade-size">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="190"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="last-trade-date">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="2017-12-08 14:56:28 CST"/>
         *               &lt;enumeration value="2017-12-08 13:45:06 CST"/>
         *               &lt;enumeration value="2017-12-04 10:48:53 CST"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="open">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.48"/>
         *               &lt;enumeration value="0.02"/>
         *               &lt;enumeration value="0.00"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="high">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.80"/>
         *               &lt;enumeration value="0.02"/>
         *               &lt;enumeration value="0.00"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="low">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.40"/>
         *               &lt;enumeration value="0.02"/>
         *               &lt;enumeration value="0.00"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="close">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.725"/>
         *               &lt;enumeration value="0.025"/>
         *               &lt;enumeration value="0.075"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="volume">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="2197"/>
         *               &lt;enumeration value="190"/>
         *               &lt;enumeration value="0"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="strike-price">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="55.00"/>
         *               &lt;enumeration value="7.00"/>
         *               &lt;enumeration value="65.00"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="open-interest">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="24673"/>
         *               &lt;enumeration value="35216"/>
         *               &lt;enumeration value="1775"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="expiration-month">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="12"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="expiration-day">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="15"/>
         *               &lt;enumeration value="19"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="expiration-year">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="2017"/>
         *               &lt;enumeration value="2018"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="exchange">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="OPR"/>
         *               &lt;enumeration value="NAS"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="underlying-symbol">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="MRK"/>
         *               &lt;enumeration value="NG"/>
         *               &lt;enumeration value="RY"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="put-call">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="C"/>
         *               &lt;enumeration value="P"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="delta">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.71814"/>
         *               &lt;enumeration value="0.051461"/>
         *               &lt;enumeration value="-0.023519"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="gamma">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.351086"/>
         *               &lt;enumeration value="0.078936"/>
         *               &lt;enumeration value="0.006761"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="theta">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="-0.024583"/>
         *               &lt;enumeration value="-0.001725"/>
         *               &lt;enumeration value="-0.005835"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="vega">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.024028"/>
         *               &lt;enumeration value="0.001216"/>
         *               &lt;enumeration value="0.014893"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="rho">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.005653"/>
         *               &lt;enumeration value="0.00017"/>
         *               &lt;enumeration value="-0.002184"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="implied-volatility">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.2188"/>
         *               &lt;enumeration value="0.4918"/>
         *               &lt;enumeration value="0.1627"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="days-to-expiration">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="5"/>
         *               &lt;enumeration value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="time-value-index">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.155"/>
         *               &lt;enumeration value="0.025"/>
         *               &lt;enumeration value="0.075"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="change">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.245"/>
         *               &lt;enumeration value="0.005"/>
         *               &lt;enumeration value="0.025"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="change-percent">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="33.79%"/>
         *               &lt;enumeration value="20.00%"/>
         *               &lt;enumeration value="33.33%"/>
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

        }


        /**
         * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies
         * the expected content contained within this class. <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="symbol">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="MRK_121517C55"/>
         *               &lt;enumeration value="NG_011918C7"/>
         *               &lt;enumeration value="RY_011918P65"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="symbol-with-type-prefix">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="MRK_121517C55"/>
         *               &lt;enumeration value="NG_011918C7"/>
         *               &lt;enumeration value="RY_011918P65"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="description">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="MERCK &amp; CO INC. COM"/>
         *               &lt;enumeration value="NOVAGOLD RESOURCES INC COM"/>
         *               &lt;enumeration value="ROYAL BANK CDA MONTREAL QUE COM"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="cusip">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0MRK..LF70055000"/>
         *               &lt;enumeration value="0NG...AJ80007000"/>
         *               &lt;enumeration value="0RY...MJ80065000"/>
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
            "symbol",
            "symbolWithTypePrefix",
            "description",
            "assetType",
            "cusip"
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
          protected String cusip;

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
           * Gets the value of the cusip property.
           *
           * @return possible object is {@link String }
           */
          public String getCusip() {
            return cusip;
          }

          /**
           * Sets the value of the cusip property.
           *
           * @param value allowed object is {@link String }
           */
          public void setCusip(String value) {
            this.cusip = value;
          }

        }

      }

    }


    /**
     * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies the
     * expected content contained within this class. <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="position" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="quantity">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="-14"/>
     *                         &lt;enumeration value="17550"/>
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
     *                                   &lt;enumeration value="RY"/>
     *                                   &lt;enumeration value="UVXY"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="symbol-with-type-prefix">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="RY"/>
     *                                   &lt;enumeration value="UVXY"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="ROYAL BANK CDA MONTREAL QUE COM"/>
     *                                   &lt;enumeration value="PROSHARES ULTRA VIX SHRT TM FUTURES
     * ETF"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="cusip">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="780087102"/>
     *                                   &lt;enumeration value="74347W163"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="account-type">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="close-price">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="79.64"/>
     *                         &lt;enumeration value="12.06"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="position-type">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="SHORT"/>
     *                         &lt;enumeration value="LONG"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="average-price">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="79.442143"/>
     *                         &lt;enumeration value="20.959573"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="current-value">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="-1114.96"/>
     *                         &lt;enumeration value="211828.50"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="bond-factor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="quote">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="symbol">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="RY"/>
     *                                   &lt;enumeration value="UVXY"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="bid">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="62.50"/>
     *                                   &lt;enumeration value="12.07"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ask">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="90.00"/>
     *                                   &lt;enumeration value="12.08"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="bid-ask-size">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="1X1"/>
     *                                   &lt;enumeration value="6X5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="last">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="79.64"/>
     *                                   &lt;enumeration value="12.06"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="last-trade-size">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="9474"/>
     *                                   &lt;enumeration value="0"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="last-trade-date">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="2017-12-08 15:02:02 CST"/>
     *                                   &lt;enumeration value="2017-12-08 19:00:00 CST"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="open">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="79.45"/>
     *                                   &lt;enumeration value="12.50"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="high">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="79.68"/>
     *                                   &lt;enumeration value="12.5764"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="low">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="79.33"/>
     *                                   &lt;enumeration value="12.04"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="close">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="79.64"/>
     *                                   &lt;enumeration value="12.06"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="volume">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="882424"/>
     *                                   &lt;enumeration value="26026459"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="year-high">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="80.98"/>
     *                                   &lt;enumeration value="45.62"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="year-low">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="66.66"/>
     *                                   &lt;enumeration value="6.07"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="exchange">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="NYS"/>
     *                                   &lt;enumeration value="PAC"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="change">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.30"/>
     *                                   &lt;enumeration value="-0.86"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="change-percent">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="0.38%"/>
     *                                   &lt;enumeration value="-7.13%"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maintenance-requirement">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="334.49"/>
     *                         &lt;enumeration value="169462.80"/>
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
        "position"
    })
    public static class Stocks {

      protected List<Position> position;

      /**
       * Gets the value of the position property. <p> <p> This accessor method returns a reference
       * to the live list, not a snapshot. Therefore any modification you make to the returned list
       * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method
       * for the position property. <p> <p> For example, to add a new item, do as follows:
       * <pre>
       *    getPosition().add(newItem);
       * </pre>
       * <p> <p> <p> Objects of the following type(s) are allowed in the list {@link
       * BalancesAndPositions.Positions.Stocks.Position }
       */
      public List<Position> getPosition() {
        if (position == null) {
          position = new ArrayList<Position>();
        }
        return this.position;
      }


      /**
       * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies
       * the expected content contained within this class. <p>
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="quantity">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="-14"/>
       *               &lt;enumeration value="17550"/>
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
       *                         &lt;enumeration value="RY"/>
       *                         &lt;enumeration value="UVXY"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="symbol-with-type-prefix">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="RY"/>
       *                         &lt;enumeration value="UVXY"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="description">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="ROYAL BANK CDA MONTREAL QUE COM"/>
       *                         &lt;enumeration value="PROSHARES ULTRA VIX SHRT TM FUTURES ETF"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="cusip">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="780087102"/>
       *                         &lt;enumeration value="74347W163"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="account-type">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="3"/>
       *               &lt;enumeration value="2"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="close-price">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="79.64"/>
       *               &lt;enumeration value="12.06"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="position-type">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="SHORT"/>
       *               &lt;enumeration value="LONG"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="average-price">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="79.442143"/>
       *               &lt;enumeration value="20.959573"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="current-value">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="-1114.96"/>
       *               &lt;enumeration value="211828.50"/>
       *             &lt;/restriction>
       *           &lt;/simpleType>
       *         &lt;/element>
       *         &lt;element name="bond-factor" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="quote">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="symbol">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="RY"/>
       *                         &lt;enumeration value="UVXY"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="bid">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="62.50"/>
       *                         &lt;enumeration value="12.07"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="ask">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="90.00"/>
       *                         &lt;enumeration value="12.08"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="bid-ask-size">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="1X1"/>
       *                         &lt;enumeration value="6X5"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="last">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="79.64"/>
       *                         &lt;enumeration value="12.06"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="last-trade-size">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="9474"/>
       *                         &lt;enumeration value="0"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="last-trade-date">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="2017-12-08 15:02:02 CST"/>
       *                         &lt;enumeration value="2017-12-08 19:00:00 CST"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="open">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="79.45"/>
       *                         &lt;enumeration value="12.50"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="high">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="79.68"/>
       *                         &lt;enumeration value="12.5764"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="low">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="79.33"/>
       *                         &lt;enumeration value="12.04"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="close">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="79.64"/>
       *                         &lt;enumeration value="12.06"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="volume">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="882424"/>
       *                         &lt;enumeration value="26026459"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="year-high">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="80.98"/>
       *                         &lt;enumeration value="45.62"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="year-low">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="66.66"/>
       *                         &lt;enumeration value="6.07"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="exchange">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="NYS"/>
       *                         &lt;enumeration value="PAC"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="change">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.30"/>
       *                         &lt;enumeration value="-0.86"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                   &lt;element name="change-percent">
       *                     &lt;simpleType>
       *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *                         &lt;enumeration value="0.38%"/>
       *                         &lt;enumeration value="-7.13%"/>
       *                       &lt;/restriction>
       *                     &lt;/simpleType>
       *                   &lt;/element>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="maintenance-requirement">
       *           &lt;simpleType>
       *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
       *               &lt;enumeration value="334.49"/>
       *               &lt;enumeration value="169462.80"/>
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
          "error",
          "quantity",
          "security",
          "accountType",
          "closePrice",
          "positionType",
          "averagePrice",
          "currentValue",
          "bondFactor",
          "quote",
          "maintenanceRequirement"
      })
      public static class Position {

        @XmlElement(required = true)
        protected String error;
        @XmlElement(required = true)
        protected String quantity;
        @XmlElement(required = true)
        protected BalancesAndPositions.Positions.Stocks.Position.Security security;
        @XmlElement(name = "account-type", required = true)
        protected String accountType;
        @XmlElement(name = "close-price", required = true)
        protected String closePrice;
        @XmlElement(name = "position-type", required = true)
        protected String positionType;
        @XmlElement(name = "average-price", required = true)
        protected String averagePrice;
        @XmlElement(name = "current-value", required = true)
        protected String currentValue;
        @XmlElement(name = "bond-factor", required = true)
        protected String bondFactor;
        @XmlElement(required = true)
        protected BalancesAndPositions.Positions.Stocks.Position.Quote quote;
        @XmlElement(name = "maintenance-requirement", required = true)
        protected String maintenanceRequirement;

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
         * Gets the value of the security property.
         *
         * @return possible object is {@link BalancesAndPositions.Positions.Stocks.Position.Security
         * }
         */
        public BalancesAndPositions.Positions.Stocks.Position.Security getSecurity() {
          return security;
        }

        /**
         * Sets the value of the security property.
         *
         * @param value allowed object is {@link BalancesAndPositions.Positions.Stocks.Position.Security
         * }
         */
        public void setSecurity(BalancesAndPositions.Positions.Stocks.Position.Security value) {
          this.security = value;
        }

        /**
         * Gets the value of the accountType property.
         *
         * @return possible object is {@link String }
         */
        public String getAccountType() {
          return accountType;
        }

        /**
         * Sets the value of the accountType property.
         *
         * @param value allowed object is {@link String }
         */
        public void setAccountType(String value) {
          this.accountType = value;
        }

        /**
         * Gets the value of the closePrice property.
         *
         * @return possible object is {@link String }
         */
        public String getClosePrice() {
          return closePrice;
        }

        /**
         * Sets the value of the closePrice property.
         *
         * @param value allowed object is {@link String }
         */
        public void setClosePrice(String value) {
          this.closePrice = value;
        }

        /**
         * Gets the value of the positionType property.
         *
         * @return possible object is {@link String }
         */
        public String getPositionType() {
          return positionType;
        }

        /**
         * Sets the value of the positionType property.
         *
         * @param value allowed object is {@link String }
         */
        public void setPositionType(String value) {
          this.positionType = value;
        }

        /**
         * Gets the value of the averagePrice property.
         *
         * @return possible object is {@link String }
         */
        public String getAveragePrice() {
          return averagePrice;
        }

        /**
         * Sets the value of the averagePrice property.
         *
         * @param value allowed object is {@link String }
         */
        public void setAveragePrice(String value) {
          this.averagePrice = value;
        }

        /**
         * Gets the value of the currentValue property.
         *
         * @return possible object is {@link String }
         */
        public String getCurrentValue() {
          return currentValue;
        }

        /**
         * Sets the value of the currentValue property.
         *
         * @param value allowed object is {@link String }
         */
        public void setCurrentValue(String value) {
          this.currentValue = value;
        }

        /**
         * Gets the value of the bondFactor property.
         *
         * @return possible object is {@link String }
         */
        public String getBondFactor() {
          return bondFactor;
        }

        /**
         * Sets the value of the bondFactor property.
         *
         * @param value allowed object is {@link String }
         */
        public void setBondFactor(String value) {
          this.bondFactor = value;
        }

        /**
         * Gets the value of the quote property.
         *
         * @return possible object is {@link BalancesAndPositions.Positions.Stocks.Position.Quote }
         */
        public BalancesAndPositions.Positions.Stocks.Position.Quote getQuote() {
          return quote;
        }

        /**
         * Sets the value of the quote property.
         *
         * @param value allowed object is {@link BalancesAndPositions.Positions.Stocks.Position.Quote
         * }
         */
        public void setQuote(BalancesAndPositions.Positions.Stocks.Position.Quote value) {
          this.quote = value;
        }

        /**
         * Gets the value of the maintenanceRequirement property.
         *
         * @return possible object is {@link String }
         */
        public String getMaintenanceRequirement() {
          return maintenanceRequirement;
        }

        /**
         * Sets the value of the maintenanceRequirement property.
         *
         * @param value allowed object is {@link String }
         */
        public void setMaintenanceRequirement(String value) {
          this.maintenanceRequirement = value;
        }


        /**
         * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies
         * the expected content contained within this class. <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="symbol">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="RY"/>
         *               &lt;enumeration value="UVXY"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="bid">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="62.50"/>
         *               &lt;enumeration value="12.07"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ask">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="90.00"/>
         *               &lt;enumeration value="12.08"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="bid-ask-size">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="1X1"/>
         *               &lt;enumeration value="6X5"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="last">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="79.64"/>
         *               &lt;enumeration value="12.06"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="last-trade-size">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="9474"/>
         *               &lt;enumeration value="0"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="last-trade-date">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="2017-12-08 15:02:02 CST"/>
         *               &lt;enumeration value="2017-12-08 19:00:00 CST"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="open">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="79.45"/>
         *               &lt;enumeration value="12.50"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="high">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="79.68"/>
         *               &lt;enumeration value="12.5764"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="low">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="79.33"/>
         *               &lt;enumeration value="12.04"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="close">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="79.64"/>
         *               &lt;enumeration value="12.06"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="volume">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="882424"/>
         *               &lt;enumeration value="26026459"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="year-high">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="80.98"/>
         *               &lt;enumeration value="45.62"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="year-low">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="66.66"/>
         *               &lt;enumeration value="6.07"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="real-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="exchange">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="NYS"/>
         *               &lt;enumeration value="PAC"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="change">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.30"/>
         *               &lt;enumeration value="-0.86"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="change-percent">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0.38%"/>
         *               &lt;enumeration value="-7.13%"/>
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
          @XmlElement(name = "year-high", required = true)
          protected String yearHigh;
          @XmlElement(name = "year-low", required = true)
          protected String yearLow;
          @XmlElement(name = "real-time", required = true)
          protected String realTime;
          @XmlElement(required = true)
          protected String exchange;
          @XmlElement(name = "asset-type", required = true)
          protected String assetType;
          @XmlElement(required = true)
          protected String change;
          @XmlElement(name = "change-percent", required = true)
          protected String changePercent;

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

        }


        /**
         * <p>Java class for anonymous complex type. <p> <p>The following schema fragment specifies
         * the expected content contained within this class. <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="symbol">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="RY"/>
         *               &lt;enumeration value="UVXY"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="symbol-with-type-prefix">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="RY"/>
         *               &lt;enumeration value="UVXY"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="description">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="ROYAL BANK CDA MONTREAL QUE COM"/>
         *               &lt;enumeration value="PROSHARES ULTRA VIX SHRT TM FUTURES ETF"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="asset-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="cusip">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="780087102"/>
         *               &lt;enumeration value="74347W163"/>
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
            "symbol",
            "symbolWithTypePrefix",
            "description",
            "assetType",
            "cusip"
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
          protected String cusip;

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
           * Gets the value of the cusip property.
           *
           * @return possible object is {@link String }
           */
          public String getCusip() {
            return cusip;
          }

          /**
           * Sets the value of the cusip property.
           *
           * @param value allowed object is {@link String }
           */
          public void setCusip(String value) {
            this.cusip = value;
          }

        }

      }

    }

  }

}

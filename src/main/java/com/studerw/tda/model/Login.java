package com.studerw.tda.model;

import java.time.ZonedDateTime;
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
 *         &lt;element name="xml-log-in">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="session-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="user-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="cdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="login-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="associated-account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nyse-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nasdaq-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="opra-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="amex-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="cme-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ice-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="forex-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="exchange-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="authorizations">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="options360" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="accounts">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="account">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="account-id"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="display-name"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="cdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="description"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="associated-account"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="unified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="preferences">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="express-trading"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="option-direct-routing"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="stock-direct-routing"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="default-stock-action"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="default-stock-order-type"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="default-stock-quantity"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="default-stock-expiration"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="default-stock-special-instructions"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="default-stock-routing"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="default-stock-display-size"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="stock-tax-lot-method"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="option-tax-lot-method"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="mutual-fund-tax-lot-method"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="default-advanced-tool-launch"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="authorizations">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="apex"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="level2"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="stock-trading"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="margin-trading"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="streaming-news"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="option-trading"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="streamer"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="advanced-margin"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
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
    "xmlLogIn",
    "error"
})
@XmlRootElement(name = "amtd")
public class Login extends BaseTda {

  @XmlElement(required = true)
  protected String result;
  @XmlElement(name = "xml-log-in", required = false)
  protected Login.XmlLogIn xmlLogIn;

  @XmlElement(name = "error", required = false)
  protected String error;

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
   * Gets the value of the xmlLogIn property.
   *
   * @return possible object is {@link Login.XmlLogIn }
   */
  public Login.XmlLogIn getXmlLogIn() {
    return xmlLogIn;
  }

  /**
   * Sets the value of the xmlLogIn property.
   *
   * @param value allowed object is {@link Login.XmlLogIn }
   */
  public void setXmlLogIn(Login.XmlLogIn value) {
    this.xmlLogIn = value;
  }

  /**
   * Gets the value of the error property if there was an error, otherwise it is empty.
   *
   * @return possible object is {@link String }
   */
  public String getError() {
    return error;
  }


  /**
   * Sets the value of the error property.
   *
   * @param error allowed object is {@link String }
   */
  public void setError(String error) {
    this.error = error;
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
   *         &lt;element name="session-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="user-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="cdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="login-time" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="associated-account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="nyse-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="nasdaq-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="opra-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="amex-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="cme-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="ice-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="forex-quotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="exchange-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="authorizations">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="options360" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                 &lt;/sequence>
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="accounts">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="account">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="display-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="cdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="associated-account"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="unified" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="preferences">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="express-trading"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="option-direct-routing"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="stock-direct-routing"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="default-stock-action"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="default-stock-order-type"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="default-stock-quantity"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="default-stock-expiration"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="default-stock-special-instructions"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="default-stock-routing"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="default-stock-display-size"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="stock-tax-lot-method"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="option-tax-lot-method"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="mutual-fund-tax-lot-method"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="default-advanced-tool-launch"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="authorizations">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="apex" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="level2" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="stock-trading"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="margin-trading"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="streaming-news"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="option-trading"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="streamer"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="advanced-margin"
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
      "sessionId",
      "userId",
      "cdi",
      "timeout",
      "loginTime",
      "associatedAccountId",
      "nyseQuotes",
      "nasdaqQuotes",
      "opraQuotes",
      "amexQuotes",
      "cmeQuotes",
      "iceQuotes",
      "forexQuotes",
      "exchangeStatus",
      "authorizations",
      "accounts"
  })
  public static class XmlLogIn {

    @XmlElement(name = "session-id", required = true)
    protected String sessionId;
    @XmlElement(name = "user-id", required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String cdi;
    @XmlElement(required = true)
    protected Integer timeout;
    @XmlElement(name = "login-time", required = true)
    protected ZonedDateTime loginTime;
    @XmlElement(name = "associated-account-id", required = true)
    protected String associatedAccountId;
    @XmlElement(name = "nyse-quotes", required = true)
    protected String nyseQuotes;
    @XmlElement(name = "nasdaq-quotes", required = true)
    protected String nasdaqQuotes;
    @XmlElement(name = "opra-quotes", required = true)
    protected String opraQuotes;
    @XmlElement(name = "amex-quotes", required = true)
    protected String amexQuotes;
    @XmlElement(name = "cme-quotes", required = true)
    protected String cmeQuotes;
    @XmlElement(name = "ice-quotes", required = true)
    protected String iceQuotes;
    @XmlElement(name = "forex-quotes", required = true)
    protected String forexQuotes;
    @XmlElement(name = "exchange-status", required = true)
    protected String exchangeStatus;
    @XmlElement(required = true)
    protected Login.XmlLogIn.Authorizations authorizations;
    @XmlElement(required = true)
    protected Login.XmlLogIn.Accounts accounts;

    /**
     * Gets the value of the sessionId property.
     *
     * @return possible object is {@link String }
     */
    public String getSessionId() {
      return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setSessionId(String value) {
      this.sessionId = value;
    }

    /**
     * Gets the value of the userId property.
     *
     * @return possible object is {@link String }
     */
    public String getUserId() {
      return userId;
    }

    /**
     * Sets the value of the userId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setUserId(String value) {
      this.userId = value;
    }

    /**
     * Gets the value of the cdi property.
     *
     * @return possible object is {@link String }
     */
    public String getCdi() {
      return cdi;
    }

    /**
     * Sets the value of the cdi property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCdi(String value) {
      this.cdi = value;
    }

    /**
     * Gets the value of the timeout property.
     *
     * @return possible object is {@link String }
     */
    public Integer getTimeout() {
      return timeout;
    }

    /**
     * Sets the value of the timeout property.
     *
     * @param value allowed object is {@link String }
     */
    public void setTimeout(Integer value) {
      this.timeout = value;
    }

    /**
     * Gets the value of the loginTime property.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getLoginTime() {
      return loginTime;
    }

    /**
     * Sets the value of the loginTime property.
     *
     * @param value allowed object is {@link String }
     */
    public void setLoginTime(ZonedDateTime value) {
      this.loginTime = value;
    }

    /**
     * Gets the value of the associatedAccountId property.
     *
     * @return possible object is {@link String }
     */
    public String getAssociatedAccountId() {
      return associatedAccountId;
    }

    /**
     * Sets the value of the associatedAccountId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAssociatedAccountId(String value) {
      this.associatedAccountId = value;
    }

    /**
     * Gets the value of the nyseQuotes property.
     *
     * @return possible object is {@link String }
     */
    public String getNyseQuotes() {
      return nyseQuotes;
    }

    /**
     * Sets the value of the nyseQuotes property.
     *
     * @param value allowed object is {@link String }
     */
    public void setNyseQuotes(String value) {
      this.nyseQuotes = value;
    }

    /**
     * Gets the value of the nasdaqQuotes property.
     *
     * @return possible object is {@link String }
     */
    public String getNasdaqQuotes() {
      return nasdaqQuotes;
    }

    /**
     * Sets the value of the nasdaqQuotes property.
     *
     * @param value allowed object is {@link String }
     */
    public void setNasdaqQuotes(String value) {
      this.nasdaqQuotes = value;
    }

    /**
     * Gets the value of the opraQuotes property.
     *
     * @return possible object is {@link String }
     */
    public String getOpraQuotes() {
      return opraQuotes;
    }

    /**
     * Sets the value of the opraQuotes property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOpraQuotes(String value) {
      this.opraQuotes = value;
    }

    /**
     * Gets the value of the amexQuotes property.
     *
     * @return possible object is {@link String }
     */
    public String getAmexQuotes() {
      return amexQuotes;
    }

    /**
     * Sets the value of the amexQuotes property.
     *
     * @param value allowed object is {@link String }
     */
    public void setAmexQuotes(String value) {
      this.amexQuotes = value;
    }

    /**
     * Gets the value of the cmeQuotes property.
     *
     * @return possible object is {@link String }
     */
    public String getCmeQuotes() {
      return cmeQuotes;
    }

    /**
     * Sets the value of the cmeQuotes property.
     *
     * @param value allowed object is {@link String }
     */
    public void setCmeQuotes(String value) {
      this.cmeQuotes = value;
    }

    /**
     * Gets the value of the iceQuotes property.
     *
     * @return possible object is {@link String }
     */
    public String getIceQuotes() {
      return iceQuotes;
    }

    /**
     * Sets the value of the iceQuotes property.
     *
     * @param value allowed object is {@link String }
     */
    public void setIceQuotes(String value) {
      this.iceQuotes = value;
    }

    /**
     * Gets the value of the forexQuotes property.
     *
     * @return possible object is {@link String }
     */
    public String getForexQuotes() {
      return forexQuotes;
    }

    /**
     * Sets the value of the forexQuotes property.
     *
     * @param value allowed object is {@link String }
     */
    public void setForexQuotes(String value) {
      this.forexQuotes = value;
    }

    /**
     * Gets the value of the exchangeStatus property.
     *
     * @return possible object is {@link String }
     */
    public String getExchangeStatus() {
      return exchangeStatus;
    }

    /**
     * Sets the value of the exchangeStatus property.
     *
     * @param value allowed object is {@link String }
     */
    public void setExchangeStatus(String value) {
      this.exchangeStatus = value;
    }

    /**
     * Gets the value of the authorizations property.
     *
     * @return possible object is {@link Login.XmlLogIn.Authorizations }
     */
    public Login.XmlLogIn.Authorizations getAuthorizations() {
      return authorizations;
    }

    /**
     * Sets the value of the authorizations property.
     *
     * @param value allowed object is {@link Login.XmlLogIn.Authorizations }
     */
    public void setAuthorizations(Login.XmlLogIn.Authorizations value) {
      this.authorizations = value;
    }

    /**
     * Gets the value of the accounts property.
     *
     * @return possible object is {@link Login.XmlLogIn.Accounts }
     */
    public Login.XmlLogIn.Accounts getAccounts() {
      return accounts;
    }

    /**
     * Sets the value of the accounts property.
     *
     * @param value allowed object is {@link Login.XmlLogIn.Accounts }
     */
    public void setAccounts(Login.XmlLogIn.Accounts value) {
      this.accounts = value;
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
     *         &lt;element name="account">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="display-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="cdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="associated-account" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="unified" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="preferences">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="express-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="option-direct-routing"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="stock-direct-routing"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="default-stock-action"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="default-stock-order-type"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="default-stock-quantity"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="default-stock-expiration"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="default-stock-special-instructions"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="default-stock-routing"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="default-stock-display-size"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="stock-tax-lot-method"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="option-tax-lot-method"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="mutual-fund-tax-lot-method"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="default-advanced-tool-launch"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="authorizations">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="apex" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="level2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="stock-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="margin-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="streaming-news" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="option-trading"
     * type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="streamer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="advanced-margin" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "account"
    })
    public static class Accounts {

      @XmlElement(required = true)
      protected Login.XmlLogIn.Accounts.Account account;

      /**
       * Gets the value of the account property.
       *
       * @return possible object is {@link Login.XmlLogIn.Accounts.Account }
       */
      public Login.XmlLogIn.Accounts.Account getAccount() {
        return account;
      }

      /**
       * Sets the value of the account property.
       *
       * @param value allowed object is {@link Login.XmlLogIn.Accounts.Account }
       */
      public void setAccount(Login.XmlLogIn.Accounts.Account value) {
        this.account = value;
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
       *         &lt;element name="account-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="display-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="cdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="associated-account" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="unified" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="preferences">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="express-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="option-direct-routing"
       * type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="stock-direct-routing" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="default-stock-action" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="default-stock-order-type"
       * type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="default-stock-quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="default-stock-expiration"
       * type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="default-stock-special-instructions"
       * type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="default-stock-routing" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="default-stock-display-size"
       * type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="stock-tax-lot-method" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="option-tax-lot-method"
       * type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="mutual-fund-tax-lot-method"
       * type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="default-advanced-tool-launch"
       * type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="authorizations">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="apex" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="level2" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="stock-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="margin-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="streaming-news" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="option-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="streamer" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="advanced-margin" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
          "displayName",
          "cdi",
          "description",
          "associatedAccount",
          "company",
          "segment",
          "unified",
          "preferences",
          "authorizations"
      })
      public static class Account {

        @XmlElement(name = "account-id", required = true)
        protected String accountId;
        @XmlElement(name = "display-name", required = true)
        protected String displayName;
        @XmlElement(required = true)
        protected String cdi;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(name = "associated-account", required = true)
        protected Boolean associatedAccount;
        @XmlElement(required = true)
        protected String company;
        @XmlElement(required = true)
        protected String segment;
        @XmlElement(required = true)
        protected Boolean unified;
        @XmlElement(required = true)
        protected Login.XmlLogIn.Accounts.Account.Preferences preferences;
        @XmlElement(required = true)
        protected Login.XmlLogIn.Accounts.Account.Authorizations authorizations;

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
         * Gets the value of the displayName property.
         *
         * @return possible object is {@link String }
         */
        public String getDisplayName() {
          return displayName;
        }

        /**
         * Sets the value of the displayName property.
         *
         * @param value allowed object is {@link String }
         */
        public void setDisplayName(String value) {
          this.displayName = value;
        }

        /**
         * Gets the value of the cdi property.
         *
         * @return possible object is {@link String }
         */
        public String getCdi() {
          return cdi;
        }

        /**
         * Sets the value of the cdi property.
         *
         * @param value allowed object is {@link String }
         */
        public void setCdi(String value) {
          this.cdi = value;
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
         * Gets the value of the associatedAccount property.
         *
         * @return possible object is {@link String }
         */
        public Boolean getAssociatedAccount() {
          return associatedAccount;
        }

        /**
         * Sets the value of the associatedAccount property.
         *
         * @param value allowed object is {@link String }
         */
        public void setAssociatedAccount(Boolean value) {
          this.associatedAccount = value;
        }

        /**
         * Gets the value of the company property.
         *
         * @return possible object is {@link String }
         */
        public String getCompany() {
          return company;
        }

        /**
         * Sets the value of the company property.
         *
         * @param value allowed object is {@link String }
         */
        public void setCompany(String value) {
          this.company = value;
        }

        /**
         * Gets the value of the segment property.
         *
         * @return possible object is {@link String }
         */
        public String getSegment() {
          return segment;
        }

        /**
         * Sets the value of the segment property.
         *
         * @param value allowed object is {@link String }
         */
        public void setSegment(String value) {
          this.segment = value;
        }

        /**
         * Gets the value of the unified property.
         *
         * @return possible object is {@link String }
         */
        public Boolean getUnified() {
          return unified;
        }

        /**
         * Sets the value of the unified property.
         *
         * @param value allowed object is {@link String }
         */
        public void setUnified(Boolean value) {
          this.unified = value;
        }

        /**
         * Gets the value of the preferences property.
         *
         * @return possible object is {@link Login.XmlLogIn.Accounts.Account.Preferences }
         */
        public Login.XmlLogIn.Accounts.Account.Preferences getPreferences() {
          return preferences;
        }

        /**
         * Sets the value of the preferences property.
         *
         * @param value allowed object is {@link Login.XmlLogIn.Accounts.Account.Preferences }
         */
        public void setPreferences(Login.XmlLogIn.Accounts.Account.Preferences value) {
          this.preferences = value;
        }

        /**
         * Gets the value of the authorizations property.
         *
         * @return possible object is {@link Login.XmlLogIn.Accounts.Account.Authorizations }
         */
        public Login.XmlLogIn.Accounts.Account.Authorizations getAuthorizations() {
          return authorizations;
        }

        /**
         * Sets the value of the authorizations property.
         *
         * @param value allowed object is {@link Login.XmlLogIn.Accounts.Account.Authorizations }
         */
        public void setAuthorizations(Login.XmlLogIn.Accounts.Account.Authorizations value) {
          this.authorizations = value;
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
         *         &lt;element name="apex" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="level2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="stock-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="margin-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="streaming-news" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="option-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="streamer" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="advanced-margin" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "apex",
            "level2",
            "stockTrading",
            "marginTrading",
            "streamingNews",
            "optionTrading",
            "streamer",
            "advancedMargin"
        })
        public static class Authorizations {

          @XmlElement(required = true)
          protected Boolean apex;
          @XmlElement(required = true)
          protected Boolean level2;
          @XmlElement(name = "stock-trading", required = true)
          protected Boolean stockTrading;
          @XmlElement(name = "margin-trading", required = true)
          protected Boolean marginTrading;
          @XmlElement(name = "streaming-news", required = true)
          protected Boolean streamingNews;
          @XmlElement(name = "option-trading", required = true)
          protected String optionTrading;
          @XmlElement(required = true)
          protected Boolean streamer;
          @XmlElement(name = "advanced-margin", required = true)
          protected Boolean advancedMargin;

          /**
           * Gets the value of the apex property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getApex() {
            return apex;
          }

          /**
           * Sets the value of the apex property.
           *
           * @param value allowed object is {@link String }
           */
          public void setApex(Boolean value) {
            this.apex = value;
          }

          /**
           * Gets the value of the level2 property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getLevel2() {
            return level2;
          }

          /**
           * Sets the value of the level2 property.
           *
           * @param value allowed object is {@link String }
           */
          public void setLevel2(Boolean value) {
            this.level2 = value;
          }

          /**
           * Gets the value of the stockTrading property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getStockTrading() {
            return stockTrading;
          }

          /**
           * Sets the value of the stockTrading property.
           *
           * @param value allowed object is {@link String }
           */
          public void setStockTrading(Boolean value) {
            this.stockTrading = value;
          }

          /**
           * Gets the value of the marginTrading property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getMarginTrading() {
            return marginTrading;
          }

          /**
           * Sets the value of the marginTrading property.
           *
           * @param value allowed object is {@link String }
           */
          public void setMarginTrading(Boolean value) {
            this.marginTrading = value;
          }

          /**
           * Gets the value of the streamingNews property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getStreamingNews() {
            return streamingNews;
          }

          /**
           * Sets the value of the streamingNews property.
           *
           * @param value allowed object is {@link String }
           */
          public void setStreamingNews(Boolean value) {
            this.streamingNews = value;
          }

          /**
           * Gets the value of the optionTrading property.
           *
           * @return possible object is {@link String }
           */
          public String getOptionTrading() {
            return optionTrading;
          }

          /**
           * Sets the value of the optionTrading property.
           *
           * @param value allowed object is {@link String }
           */
          public void setOptionTrading(String value) {
            this.optionTrading = value;
          }

          /**
           * Gets the value of the streamer property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getStreamer() {
            return streamer;
          }

          /**
           * Sets the value of the streamer property.
           *
           * @param value allowed object is {@link String }
           */
          public void setStreamer(Boolean value) {
            this.streamer = value;
          }

          /**
           * Gets the value of the advancedMargin property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getAdvancedMargin() {
            return advancedMargin;
          }

          /**
           * Sets the value of the advancedMargin property.
           *
           * @param value allowed object is {@link String }
           */
          public void setAdvancedMargin(Boolean value) {
            this.advancedMargin = value;
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
         *         &lt;element name="express-trading" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="option-direct-routing" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="stock-direct-routing" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="default-stock-action" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="default-stock-order-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="default-stock-quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="default-stock-expiration" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="default-stock-special-instructions"
         * type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="default-stock-routing" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="default-stock-display-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="stock-tax-lot-method" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="option-tax-lot-method" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="mutual-fund-tax-lot-method" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="default-advanced-tool-launch" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "expressTrading",
            "optionDirectRouting",
            "stockDirectRouting",
            "defaultStockAction",
            "defaultStockOrderType",
            "defaultStockQuantity",
            "defaultStockExpiration",
            "defaultStockSpecialInstructions",
            "defaultStockRouting",
            "defaultStockDisplaySize",
            "stockTaxLotMethod",
            "optionTaxLotMethod",
            "mutualFundTaxLotMethod",
            "defaultAdvancedToolLaunch"
        })
        public static class Preferences {

          @XmlElement(name = "express-trading", required = true)
          protected Boolean expressTrading;
          @XmlElement(name = "option-direct-routing", required = true)
          protected Boolean optionDirectRouting;
          @XmlElement(name = "stock-direct-routing", required = true)
          protected Boolean stockDirectRouting;
          @XmlElement(name = "default-stock-action", required = true)
          protected String defaultStockAction;
          @XmlElement(name = "default-stock-order-type", required = true)
          protected String defaultStockOrderType;
          @XmlElement(name = "default-stock-quantity", required = true)
          protected String defaultStockQuantity;
          @XmlElement(name = "default-stock-expiration", required = true)
          protected String defaultStockExpiration;
          @XmlElement(name = "default-stock-special-instructions", required = true)
          protected String defaultStockSpecialInstructions;
          @XmlElement(name = "default-stock-routing", required = true)
          protected String defaultStockRouting;
          @XmlElement(name = "default-stock-display-size", required = true)
          protected String defaultStockDisplaySize;
          @XmlElement(name = "stock-tax-lot-method", required = true)
          protected String stockTaxLotMethod;
          @XmlElement(name = "option-tax-lot-method", required = true)
          protected String optionTaxLotMethod;
          @XmlElement(name = "mutual-fund-tax-lot-method", required = true)
          protected String mutualFundTaxLotMethod;
          @XmlElement(name = "default-advanced-tool-launch", required = true)
          protected String defaultAdvancedToolLaunch;

          /**
           * Gets the value of the expressTrading property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getExpressTrading() {
            return expressTrading;
          }

          /**
           * Sets the value of the expressTrading property.
           *
           * @param value allowed object is {@link String }
           */
          public void setExpressTrading(Boolean value) {
            this.expressTrading = value;
          }

          /**
           * Gets the value of the optionDirectRouting property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getOptionDirectRouting() {
            return optionDirectRouting;
          }

          /**
           * Sets the value of the optionDirectRouting property.
           *
           * @param value allowed object is {@link String }
           */
          public void setOptionDirectRouting(Boolean value) {
            this.optionDirectRouting = value;
          }

          /**
           * Gets the value of the stockDirectRouting property.
           *
           * @return possible object is {@link String }
           */
          public Boolean getStockDirectRouting() {
            return stockDirectRouting;
          }

          /**
           * Sets the value of the stockDirectRouting property.
           *
           * @param value allowed object is {@link String }
           */
          public void setStockDirectRouting(Boolean value) {
            this.stockDirectRouting = value;
          }

          /**
           * Gets the value of the defaultStockAction property.
           *
           * @return possible object is {@link String }
           */
          public String getDefaultStockAction() {
            return defaultStockAction;
          }

          /**
           * Sets the value of the defaultStockAction property.
           *
           * @param value allowed object is {@link String }
           */
          public void setDefaultStockAction(String value) {
            this.defaultStockAction = value;
          }

          /**
           * Gets the value of the defaultStockOrderType property.
           *
           * @return possible object is {@link String }
           */
          public String getDefaultStockOrderType() {
            return defaultStockOrderType;
          }

          /**
           * Sets the value of the defaultStockOrderType property.
           *
           * @param value allowed object is {@link String }
           */
          public void setDefaultStockOrderType(String value) {
            this.defaultStockOrderType = value;
          }

          /**
           * Gets the value of the defaultStockQuantity property.
           *
           * @return possible object is {@link String }
           */
          public String getDefaultStockQuantity() {
            return defaultStockQuantity;
          }

          /**
           * Sets the value of the defaultStockQuantity property.
           *
           * @param value allowed object is {@link String }
           */
          public void setDefaultStockQuantity(String value) {
            this.defaultStockQuantity = value;
          }

          /**
           * Gets the value of the defaultStockExpiration property.
           *
           * @return possible object is {@link String }
           */
          public String getDefaultStockExpiration() {
            return defaultStockExpiration;
          }

          /**
           * Sets the value of the defaultStockExpiration property.
           *
           * @param value allowed object is {@link String }
           */
          public void setDefaultStockExpiration(String value) {
            this.defaultStockExpiration = value;
          }

          /**
           * Gets the value of the defaultStockSpecialInstructions property.
           *
           * @return possible object is {@link String }
           */
          public String getDefaultStockSpecialInstructions() {
            return defaultStockSpecialInstructions;
          }

          /**
           * Sets the value of the defaultStockSpecialInstructions property.
           *
           * @param value allowed object is {@link String }
           */
          public void setDefaultStockSpecialInstructions(String value) {
            this.defaultStockSpecialInstructions = value;
          }

          /**
           * Gets the value of the defaultStockRouting property.
           *
           * @return possible object is {@link String }
           */
          public String getDefaultStockRouting() {
            return defaultStockRouting;
          }

          /**
           * Sets the value of the defaultStockRouting property.
           *
           * @param value allowed object is {@link String }
           */
          public void setDefaultStockRouting(String value) {
            this.defaultStockRouting = value;
          }

          /**
           * Gets the value of the defaultStockDisplaySize property.
           *
           * @return possible object is {@link String }
           */
          public String getDefaultStockDisplaySize() {
            return defaultStockDisplaySize;
          }

          /**
           * Sets the value of the defaultStockDisplaySize property.
           *
           * @param value allowed object is {@link String }
           */
          public void setDefaultStockDisplaySize(String value) {
            this.defaultStockDisplaySize = value;
          }

          /**
           * Gets the value of the stockTaxLotMethod property.
           *
           * @return possible object is {@link String }
           */
          public String getStockTaxLotMethod() {
            return stockTaxLotMethod;
          }

          /**
           * Sets the value of the stockTaxLotMethod property.
           *
           * @param value allowed object is {@link String }
           */
          public void setStockTaxLotMethod(String value) {
            this.stockTaxLotMethod = value;
          }

          /**
           * Gets the value of the optionTaxLotMethod property.
           *
           * @return possible object is {@link String }
           */
          public String getOptionTaxLotMethod() {
            return optionTaxLotMethod;
          }

          /**
           * Sets the value of the optionTaxLotMethod property.
           *
           * @param value allowed object is {@link String }
           */
          public void setOptionTaxLotMethod(String value) {
            this.optionTaxLotMethod = value;
          }

          /**
           * Gets the value of the mutualFundTaxLotMethod property.
           *
           * @return possible object is {@link String }
           */
          public String getMutualFundTaxLotMethod() {
            return mutualFundTaxLotMethod;
          }

          /**
           * Sets the value of the mutualFundTaxLotMethod property.
           *
           * @param value allowed object is {@link String }
           */
          public void setMutualFundTaxLotMethod(String value) {
            this.mutualFundTaxLotMethod = value;
          }

          /**
           * Gets the value of the defaultAdvancedToolLaunch property.
           *
           * @return possible object is {@link String }
           */
          public String getDefaultAdvancedToolLaunch() {
            return defaultAdvancedToolLaunch;
          }

          /**
           * Sets the value of the defaultAdvancedToolLaunch property.
           *
           * @param value allowed object is {@link String }
           */
          public void setDefaultAdvancedToolLaunch(String value) {
            this.defaultAdvancedToolLaunch = value;
          }

        }

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
     *         &lt;element name="options360" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "options360"
    })
    public static class Authorizations {

      @XmlElement(required = true)
      protected String options360;

      /**
       * Gets the value of the options360 property.
       *
       * @return possible object is {@link String }
       */
      public String getOptions360() {
        return options360;
      }

      /**
       * Sets the value of the options360 property.
       *
       * @param value allowed object is {@link String }
       */
      public void setOptions360(String value) {
        this.options360 = value;
      }

    }

  }

}

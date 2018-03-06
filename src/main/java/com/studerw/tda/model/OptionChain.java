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
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="option-chain-results">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="option-date" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="expiration-type">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="W"/>
 *                                   &lt;enumeration value="R"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="days-to-expiration"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="option-strike" maxOccurs="unbounded"
 * minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="strike-price"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="standard-option"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="put">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="symbol"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="description"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="call">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="symbol"
 * type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="description"
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
    "error",
    "optionChainResults"
})
@XmlRootElement(name = "amtd")
public class OptionChain {

  @XmlElement(required = true)
  protected String result;
  @XmlElement(required = true)
  protected String error;
  @XmlElement(name = "option-chain-results", required = true)
  protected OptionChain.OptionChainResults optionChainResults;
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
   * Gets the value of the optionChainResults property.
   *
   * @return possible object is {@link OptionChain.OptionChainResults }
   */
  public OptionChain.OptionChainResults getOptionChainResults() {
    return optionChainResults;
  }

  /**
   * Sets the value of the optionChainResults property.
   *
   * @param value allowed object is {@link OptionChain.OptionChainResults }
   */
  public void setOptionChainResults(OptionChain.OptionChainResults value) {
    this.optionChainResults = value;
  }

  public String getOriginalXml() {
    return this.originalXml;
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
   *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="option-date" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="expiration-type">
   *                     &lt;simpleType>
   *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
   *                         &lt;enumeration value="W"/>
   *                         &lt;enumeration value="R"/>
   *                       &lt;/restriction>
   *                     &lt;/simpleType>
   *                   &lt;/element>
   *                   &lt;element name="days-to-expiration" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                   &lt;element name="option-strike" maxOccurs="unbounded" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="strike-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="standard-option" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                             &lt;element name="put">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="description"
   * type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                     &lt;/sequence>
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                             &lt;element name="call">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *                                       &lt;element name="description"
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
      "error",
      "symbol",
      "optionDate"
  })
  public static class OptionChainResults {

    @XmlElement(required = true)
    protected String error;
    @XmlElement(required = true)
    protected String symbol;
    @XmlElement(name = "option-date")
    protected List<OptionDate> optionDate;

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
     * Gets the value of the optionDate property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the optionDate property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getOptionDate().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * OptionChain.OptionChainResults.OptionDate }
     */
    public List<OptionDate> getOptionDate() {
      if (optionDate == null) {
        optionDate = new ArrayList<OptionDate>();
      }
      return this.optionDate;
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
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="expiration-type">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="W"/>
     *               &lt;enumeration value="R"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="days-to-expiration" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="option-strike" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="strike-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="standard-option" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="put">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="call">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "date",
        "expirationType",
        "daysToExpiration",
        "optionStrike"
    })
    public static class OptionDate {

      @XmlElement(required = true)
      protected String date;
      @XmlElement(name = "expiration-type", required = true)
      protected String expirationType;
      @XmlElement(name = "days-to-expiration", required = true)
      protected String daysToExpiration;
      @XmlElement(name = "option-strike")
      protected List<OptionStrike> optionStrike;

      /**
       * Gets the value of the date property.
       *
       * @return possible object is {@link String }
       */
      public String getDate() {
        return date;
      }

      /**
       * Sets the value of the date property.
       *
       * @param value allowed object is {@link String }
       */
      public void setDate(String value) {
        this.date = value;
      }

      /**
       * Gets the value of the expirationType property.
       *
       * @return possible object is {@link String }
       */
      public String getExpirationType() {
        return expirationType;
      }

      /**
       * Sets the value of the expirationType property.
       *
       * @param value allowed object is {@link String }
       */
      public void setExpirationType(String value) {
        this.expirationType = value;
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
       * Gets the value of the optionStrike property.
       *
       * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore
       * any modification you make to the returned list will be present inside the JAXB object. This
       * is why there is not a <CODE>set</CODE> method for the optionStrike property.
       *
       * <p> For example, to add a new item, do as follows:
       * <pre>
       *    getOptionStrike().add(newItem);
       * </pre>
       *
       *
       * <p> Objects of the following type(s) are allowed in the list {@link
       * OptionChain.OptionChainResults.OptionDate.OptionStrike }
       */
      public List<OptionStrike> getOptionStrike() {
        if (optionStrike == null) {
          optionStrike = new ArrayList<OptionStrike>();
        }
        return this.optionStrike;
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
       *         &lt;element name="strike-price" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="standard-option" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *         &lt;element name="put">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                 &lt;/sequence>
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *         &lt;element name="call">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
       *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
          "strikePrice",
          "standardOption",
          "put",
          "call"
      })
      public static class OptionStrike {

        @XmlElement(name = "strike-price", required = true)
        protected String strikePrice;
        @XmlElement(name = "standard-option", required = true)
        protected String standardOption;
        @XmlElement(required = true)
        protected OptionChain.OptionChainResults.OptionDate.OptionStrike.Put put;
        @XmlElement(required = true)
        protected OptionChain.OptionChainResults.OptionDate.OptionStrike.Call call;

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
         * Gets the value of the standardOption property.
         *
         * @return possible object is {@link String }
         */
        public String getStandardOption() {
          return standardOption;
        }

        /**
         * Sets the value of the standardOption property.
         *
         * @param value allowed object is {@link String }
         */
        public void setStandardOption(String value) {
          this.standardOption = value;
        }

        /**
         * Gets the value of the put property.
         *
         * @return possible object is {@link OptionChain.OptionChainResults.OptionDate.OptionStrike.Put
         * }
         */
        public OptionChain.OptionChainResults.OptionDate.OptionStrike.Put getPut() {
          return put;
        }

        /**
         * Sets the value of the put property.
         *
         * @param value allowed object is {@link OptionChain.OptionChainResults.OptionDate.OptionStrike.Put
         * }
         */
        public void setPut(OptionChain.OptionChainResults.OptionDate.OptionStrike.Put value) {
          this.put = value;
        }

        /**
         * Gets the value of the call property.
         *
         * @return possible object is {@link OptionChain.OptionChainResults.OptionDate.OptionStrike.Call
         * }
         */
        public OptionChain.OptionChainResults.OptionDate.OptionStrike.Call getCall() {
          return call;
        }

        /**
         * Sets the value of the call property.
         *
         * @param value allowed object is {@link OptionChain.OptionChainResults.OptionDate.OptionStrike.Call
         * }
         */
        public void setCall(OptionChain.OptionChainResults.OptionDate.OptionStrike.Call value) {
          this.call = value;
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
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "symbol",
            "description"
        })
        public static class Call {

          @XmlElement(required = true)
          protected String symbol;
          @XmlElement(required = true)
          protected String description;

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
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "symbol",
            "description"
        })
        public static class Put {

          @XmlElement(required = true)
          protected String symbol;
          @XmlElement(required = true)
          protected String description;

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

        }

      }

    }

  }

}

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
 *         &lt;element name="symbol-lookup-result" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="search-string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="symbol-result" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "resultStr",
    "error",
    "result"
})
@XmlRootElement(name = "amtd")
public class SymbolLookup extends BaseTda {

  @XmlElement(required = true, name = "result")
  protected String resultStr;
  protected String error;
  @XmlElement(name = "symbol-lookup-result")
  protected SymbolLookup.Result result ;

  /**
   * Gets the value of the result property.
   *
   * @return possible object is {@link String }
   */
  public String getResultStr() {
    return resultStr;
  }

  /**
   * Sets the value of the result property.
   *
   * @param value allowed object is {@link String }
   */
  public void setResultStr(String value) {
    this.resultStr = value;
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
   * Gets the value of the symbolLookupResult property.
   *
   * @return possible object is {@link SymbolLookup.Result }
   */
  public SymbolLookup.Result getResult() {
    return result;
  }

  /**
   * Sets the value of the symbolLookupResult property.
   *
   * @param value allowed object is {@link SymbolLookup.Result }
   */
  public void setResult(SymbolLookup.Result value) {
    this.result = value;
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
   *         &lt;element name="search-string" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="symbol-result" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
      "error",
      "searchString",
      "symbolResults"
  })
  public static class Result {

    @XmlElement(required = true)
    protected String error;
    @XmlElement(name = "search-string", required = true)
    protected String searchString;
    @XmlElement(name = "symbol-result")
    protected List<SymbolLookup.Result.SymbolResult> symbolResults;

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
     * Gets the value of the searchString property.
     *
     * @return possible object is {@link String }
     */
    public String getSearchString() {
      return searchString;
    }

    /**
     * Sets the value of the searchString property.
     *
     * @param value allowed object is {@link String }
     */
    public void setSearchString(String value) {
      this.searchString = value;
    }

    /**
     * Gets the value of the symbolResult property.
     *
     * <p> This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the symbolResult property.
     *
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getSymbolResult().add(newItem);
     * </pre>
     *
     *
     * <p> Objects of the following type(s) are allowed in the list {@link
     * SymbolLookup.Result.SymbolResult }
     */
    public List<SymbolLookup.Result.SymbolResult> getSymbolResults() {
      if (symbolResults == null) {
        symbolResults = new ArrayList<SymbolLookup.Result.SymbolResult>();
      }
      return this.symbolResults;
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
     *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    public static class SymbolResult {

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

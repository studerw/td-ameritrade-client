package com.studerw.tda.model.marketdata;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Market Hours
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hours implements Serializable {

  private final static long serialVersionUID = -2046539522034779917L;

  @JsonProperty("category")
  private String category;
  @JsonProperty("date")
  private String date;
  @JsonProperty("exchange")
  private String exchange;
  @JsonProperty("isOpen")
  private Boolean isOpen;
  @JsonProperty("marketType")
  private MarketType marketType;
  @JsonProperty("product")
  private String product;
  @JsonProperty("productName")
  private String productName;
  @JsonProperty("sessionHours")
  private Map<String, Object> sessionHours;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  @JsonProperty("exchange")
  public String getExchange() {
    return exchange;
  }

  @JsonProperty("isOpen")
  public Boolean getIsOpen() {
    return isOpen;
  }

  @JsonProperty("marketType")
  public MarketType getMarketType() {
    return marketType;
  }

  @JsonProperty("product")
  public String getProduct() {
    return product;
  }

  @JsonProperty("productName")
  public String getProductName() {
    return productName;
  }

  @JsonProperty("sessionHours")
  public Map<String, Object> getSessionHours() {
    return sessionHours;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("category", category)
        .append("date", date)
        .append("exchange", exchange)
        .append("isOpen", isOpen)
        .append("marketType", marketType)
        .append("product", product)
        .append("productName", productName)
        .append("sessionHours", sessionHours)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum MarketType {
    BOND,
    EQUITY,
    ETF,
    FOREX,
    FUTURE,
    FUTURE_OPTION,
    INDEX,
    INDICATOR,
    MUTUAL_FUND,
    OPTION,
    UNKNOWN
  }
}


package com.studerw.tda.model.markethours;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * TDA Hours.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonRootName("hours")
public class Hours implements Serializable {

    @JsonProperty("date")
    private String date;
    @JsonProperty("category")
    private String category;
    @JsonProperty("marketType")
    private MarketType marketType;
    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("product")
    private String product;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("isOpen")
    private Boolean isOpen;
    @JsonProperty("sessionHours")
    private SessionHours sessionHours;
    @JsonAnySetter
    private Map<String, Object> otherFields = new HashMap<>();

    public String getDate() {
    return date;
    }

    public void setDate(String date) {
    this.date = date;
    }

    public MarketType getMarketType() {
    return marketType;
    }

    public void setMarketType(MarketType marketType) {
    this.marketType = marketType;
    }

    public String getExchange() {
    return exchange;
    }

    public void setExchange(String exchange) {
    this.exchange = exchange;
    }

    public String getCategory() {
    return category;
    }

    public void setCategory(String category) {
    this.category = category;
    }

    public String getProduct() {
    return product;
    }

    public void setProduct(String product) {
    this.product = product;
    }

    public String getProductName() {
    return productName;
    }

    public void setProductName(String productName) {
    this.productName = productName;
    }

    public Boolean getIsOpen() {
    return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
    this.isOpen = isOpen;
    }

    public SessionHours getSessionHours() {
    return sessionHours;
    }

    public void setSessionHours(SessionHours sessionHours) {
    this.sessionHours = sessionHours;
    }

    @JsonIgnore
    public Map<String, Object> getOtherFields() {
        return otherFields;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("date", date)
                .append("marketType", marketType)
                .append("exchange", exchange)
                .append("category", category)
                .append("product", product)
                .append("productName", productName)
                .append("isOpen", isOpen)
                .append("sessionHours", sessionHours)
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

package com.studerw.tda.model.instrument;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Instrument
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Instrument implements Serializable {

  private final static long serialVersionUID = 4090333024332618028L;
  @JsonProperty("bondPrice")
  private BigDecimal bondPrice;
  @JsonProperty("cusip")
  private String cusip;
  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("description")
  private String description;
  @JsonProperty("exchange")
  private String exchange;
  @JsonProperty("assetType")
  private AssetType assetType;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  /**
   *
   * @return bond price. This will be null in all cases except for bonds (i.e. AssetType=BOND).
   */
  public BigDecimal getBondPrice() {
    return bondPrice;
  }

  public String getCusip() {
    return cusip;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getDescription() {
    return description;
  }

  public String getExchange() {
    return exchange;
  }

  public AssetType getAssetType() {
    return assetType;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("bondPrice", bondPrice)
        .append("cusip", cusip)
        .append("symbol", symbol)
        .append("description", description)
        .append("exchange", exchange)
        .append("assetType", assetType)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum AssetType {
    EQUITY,
    ETF,
    FOREX,
    FUTURE,
    FUTURE_OPTION,
    INDEX,
    INDICATOR,
    MUTUAL_FUND,
    OPTION,
    UNKNOWN,
    BOND
  }
}

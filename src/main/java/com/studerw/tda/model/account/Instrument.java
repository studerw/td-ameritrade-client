package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(
    use = Id.NAME,
    property = "assetType",
    visible = true
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = EquityInstrument.class, name = "EQUITY"),
    @JsonSubTypes.Type(value = MutualFundInstrument.class, name = "MUTUAL_FUND"),
    @JsonSubTypes.Type(value = CurrencyInstrument.class, name = "CURRENCY"),
    @JsonSubTypes.Type(value = OptionInstrument.class, name = "OPTION"),
    @JsonSubTypes.Type(value = IndexInstrument.class, name = "INDEX"),
    @JsonSubTypes.Type(value = CashEquivalentInstrument.class, name = "CASH_EQUIVALENT"),
    @JsonSubTypes.Type(value = FixedIncomeInstrument.class, name = "FIXED_INCOME")
})
public class Instrument implements Serializable {

  private final static long serialVersionUID = -3284598815785216905L;

  @JsonProperty("assetType")
  private AssetType assetType;
  @JsonProperty("cusip")
  private String cusip;
  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("description")
  private String description;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public AssetType getAssetType() {
    return assetType;
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

  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("assetType", assetType)
        .append("cusip", cusip)
        .append("symbol", symbol)
        .append("description", description)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum AssetType {
    EQUITY,
    OPTION,
    INDEX,
    MUTUAL_FUND,
    CASH_EQUIVALENT,
    FIXED_INCOME,
    CURRENCY
  }
}

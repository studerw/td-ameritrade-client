package com.studerw.tda.model.quote;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.studerw.tda.model.AssetType;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonTypeInfo(
    use = Id.NAME,
    property = "assetType",
    visible = true
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = EquityQuote.class, name = "EQUITY"),
    @JsonSubTypes.Type(value = MutualFundQuote.class, name = "MUTUAL_FUND"),
    @JsonSubTypes.Type(value = IndexQuote.class, name = "INDEX"),
    @JsonSubTypes.Type(value = EtfQuote.class, name = "ETF"),
    @JsonSubTypes.Type(value = ForexQuote.class, name = "FOREX"),
    @JsonSubTypes.Type(value = OptionQuote.class, name = "OPTION"),
    @JsonSubTypes.Type(value = FutureQuote.class, name = "FUTURE"),
    @JsonSubTypes.Type(value = FutureOptionQuote.class, name = "FUTURE_OPTION")
})
public class Quote {

  @JsonProperty("assetType")
  private AssetType assetType;
  @JsonProperty("delayed")
  private Boolean delayed;
  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("description")
  private String description;
  @JsonAnySetter
  private Map<String, Object> unknownFields = new HashMap<>();

  public Boolean getDelayed() {
    return delayed;
  }

  public AssetType getAssetType() {
    return assetType;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getDescription() {
    return description;
  }

  @JsonAnyGetter
  public Map<String, Object> otherFields() {
    return unknownFields;
  }

  @JsonAnySetter
  public void setOtherField(String name, String value) {
    unknownFields.put(name, value);
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("assetType", assetType)
        .append("delayed", delayed)
        .append("symbol", symbol)
        .append("description", description)
        .append("unknownFields", unknownFields)
        .toString();
  }
}

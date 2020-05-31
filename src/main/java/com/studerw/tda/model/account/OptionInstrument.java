package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Option Instrument
 */
public class OptionInstrument extends Instrument {

  @JsonProperty("type")
  private Type type;
  @JsonProperty("putCall")
  private PutCall putCall;
  @JsonProperty("underlyingSymbol")
  private String underlyingSymbol;
  @JsonProperty("optionMultiplier")
  private Long optionMultiplier;
  @JsonProperty("optionDeliverables")
  private List<OptionDeliverable> optionDeliverables = new ArrayList<>();
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public OptionInstrument(){
    this.setAssetType(AssetType.OPTION);
  }

  public Type getType() {
    return type;
  }

  public PutCall getPutCall() {
    return putCall;
  }

  public String getUnderlyingSymbol() {
    return underlyingSymbol;
  }

  public Long getOptionMultiplier() {
    return optionMultiplier;
  }

  public List<OptionDeliverable> getOptionDeliverables() {
    return optionDeliverables;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("type", type)
        .append("putCall", putCall)
        .append("underlyingSymbol", underlyingSymbol)
        .append("optionMultiplier", optionMultiplier)
        .append("optionDeliverables", optionDeliverables)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum PutCall {
    PUT,
    CALL
  }

  public enum Type {
    VANILLA,
    BINARY,
    BARRIER
  }
}

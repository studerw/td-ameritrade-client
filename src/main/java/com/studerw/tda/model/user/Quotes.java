package com.studerw.tda.model.user;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Quotes implements Serializable {

  private final static long serialVersionUID = -8425084498390228436L;
  @JsonProperty("isNyseDelayed")
  private Boolean isNyseDelayed = false;
  @JsonProperty("isNasdaqDelayed")
  private Boolean isNasdaqDelayed = false;
  @JsonProperty("isOpraDelayed")
  private Boolean isOpraDelayed = false;
  @JsonProperty("isAmexDelayed")
  private Boolean isAmexDelayed = false;
  @JsonProperty("isCmeDelayed")
  private Boolean isCmeDelayed = false;
  @JsonProperty("isIceDelayed")
  private Boolean isIceDelayed = false;
  @JsonProperty("isForexDelayed")
  private Boolean isForexDelayed = false;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public Boolean getIsNyseDelayed() {
    return isNyseDelayed;
  }

  public Boolean getIsNasdaqDelayed() {
    return isNasdaqDelayed;
  }

  public Boolean getIsOpraDelayed() {
    return isOpraDelayed;
  }

  public Boolean getIsAmexDelayed() {
    return isAmexDelayed;
  }

  public Boolean getIsCmeDelayed() {
    return isCmeDelayed;
  }

  public Boolean getIsIceDelayed() {
    return isIceDelayed;
  }

  public Boolean getIsForexDelayed() {
    return isForexDelayed;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("isNyseDelayed", isNyseDelayed)
        .append("isNasdaqDelayed", isNasdaqDelayed)
        .append("isOpraDelayed", isOpraDelayed)
        .append("isAmexDelayed", isAmexDelayed)
        .append("isCmeDelayed", isCmeDelayed)
        .append("isIceDelayed", isIceDelayed)
        .append("isForexDelayed", isForexDelayed)
        .append("otherFields", otherFields)
        .toString();
  }
}

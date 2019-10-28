package com.studerw.tda.model.account;

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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExecutionLeg implements Serializable {

  private final static long serialVersionUID = -3026972395059549610L;

  @JsonProperty("legId")
  private Long legId;
  @JsonProperty("quantity")
  private BigDecimal quantity;
  @JsonProperty("mismarkedQuantity")
  private BigDecimal mismarkedQuantity;
  @JsonProperty("price")
  private BigDecimal price;
  @JsonProperty("time")
  private String time;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public Long getLegId() {
    return legId;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public BigDecimal getMismarkedQuantity() {
    return mismarkedQuantity;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public String getTime() {
    return time;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("legId", legId)
        .append("quantity", quantity)
        .append("mismarkedQuantity", mismarkedQuantity)
        .append("price", price)
        .append("time", time)
        .append("otherFields", otherFields)
        .toString();
  }
}

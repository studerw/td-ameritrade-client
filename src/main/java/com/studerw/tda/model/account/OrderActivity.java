package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Order Activity
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderActivity implements Serializable {

  private final static long serialVersionUID = 589737347638334679L;

  @JsonProperty("activityType")
  private ActivityType activityType;
  @JsonProperty("executionType")
  private ExecutionType executionType;
  @JsonProperty("quantity")
  private BigDecimal quantity;
  @JsonProperty("orderRemainingQuantity")
  private BigDecimal orderRemainingQuantity;
  @JsonProperty("executionLegs")
  private List<ExecutionLeg> executionLegs = new ArrayList<>();
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public ActivityType getActivityType() {
    return activityType;
  }

  public ExecutionType getExecutionType() {
    return executionType;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public BigDecimal getOrderRemainingQuantity() {
    return orderRemainingQuantity;
  }

  public List<ExecutionLeg> getExecutionLegs() {
    return executionLegs;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("activityType", activityType)
        .append("executionType", executionType)
        .append("quantity", quantity)
        .append("orderRemainingQuantity", orderRemainingQuantity)
        .append("executionLegs", executionLegs)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum ExecutionType {
    FILL
  }

}

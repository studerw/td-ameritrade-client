package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderActivityCollection implements Serializable {
  private final static long serialVersionUID = 84543157970094919L;

  @JsonProperty("activityType")
  private ActivityType activityType;
  @JsonProperty("executionType")
  private OrderActivity.ExecutionType executionType;
  @JsonProperty("quantity")
  private BigDecimal quantity;
  @JsonProperty("orderRemainingQuantity")
  private BigDecimal orderRemainingQuantity;
  @JsonProperty("executionLegs")
  private List<ExecutionLeg> executionLegs = new ArrayList<ExecutionLeg>();


  public ActivityType getActivityType() {
    return activityType;
  }

}

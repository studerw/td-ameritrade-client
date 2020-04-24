package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderActivityCollection implements Serializable {
  private final static long serialVersionUID = 84543157970094919L;

  @JsonProperty("activityType")
  private ActivityType activityType;

  public ActivityType getActivityType() {
    return activityType;
  }

}

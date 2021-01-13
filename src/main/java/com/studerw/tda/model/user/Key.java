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
public class Key implements Serializable {

  private final static long serialVersionUID = -4546266201008934050L;

  @JsonProperty("key")
  private String key;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public String getKey() {
    return key;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("key", key)
        .append("otherFields", otherFields)
        .toString();
  }
}

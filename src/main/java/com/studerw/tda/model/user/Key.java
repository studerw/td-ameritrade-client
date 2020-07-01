package com.studerw.tda.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Key implements Serializable {

  private final static long serialVersionUID = -4546266201008934050L;

  @JsonProperty("key")
  private String key;

  @JsonProperty("key")
  public String getKey() {
    return key;
  }

}

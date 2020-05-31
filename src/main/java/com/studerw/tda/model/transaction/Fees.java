package com.studerw.tda.model.transaction;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fees implements Serializable {

  private final static long serialVersionUID = -6343848216023344614L;

  @JsonAnySetter
  private Map<String, BigDecimal> otherFields = new HashMap<>();

  @JsonIgnore
  public Map<String, BigDecimal> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("otherFields", otherFields)
        .toString();
  }
}

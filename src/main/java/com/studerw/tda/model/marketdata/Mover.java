package com.studerw.tda.model.marketdata;

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


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mover implements Serializable {

  private final static long serialVersionUID = 9021846294309705175L;
  @JsonProperty("change")
  private BigDecimal change;
  @JsonProperty("description")
  private String description;
  @JsonProperty("direction")
  private Mover.Direction direction;
  @JsonProperty("last")
  private BigDecimal last;
  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("totalVolume")
  private Long totalVolume;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public BigDecimal getChange() {
    return change;
  }

  public String getDescription() {
    return description;
  }

  public Direction getDirection() {
    return direction;
  }

  public BigDecimal getLast() {
    return last;
  }

  public String getSymbol() {
    return symbol;
  }

  public Long getTotalVolume() {
    return totalVolume;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
      return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("change", change)
        .append("description", description)
        .append("direction", direction)
        .append("last", last)
        .append("symbol", symbol)
        .append("totalVolume", totalVolume)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum Direction {
    up,
    down
  }

}

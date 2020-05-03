package com.studerw.tda.model.history;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * PriceHistory meant to display on a graph
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "candles",
    "empty",
    "symbol"
})
public class PriceHistory implements Serializable {

  private final static long serialVersionUID = -1691611288512481647L;
  /**
   * List of candles
   */
  @JsonProperty("candles")
  private List<Candle> candles = new ArrayList<>();
  @JsonProperty("empty")
  private Boolean empty;
  @JsonProperty("symbol")
  private String symbol;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public List<Candle> getCandles() {
    return candles;
  }

  public Boolean isEmpty() {
    return empty;
  }

  public String getSymbol() {
    return symbol;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("empty", empty)
        .append("symbol", symbol)
        .append("candles:", candles)
        .append("otherFields", otherFields)
        .toString();
  }
}

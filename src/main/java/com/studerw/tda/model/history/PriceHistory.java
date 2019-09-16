package com.studerw.tda.model.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * PriceHistory meant to display on a graph
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
  @JsonPropertyDescription("List of candles")
  private List<Candle> candles = new ArrayList<Candle>();
  @JsonProperty("empty")
  private Boolean empty;
  @JsonProperty("symbol")
  @JsonPropertyDescription("Symbol")
  private String symbol;

  public List<Candle> getCandles() {
    return candles;
  }

  public Boolean isEmpty() {
    return empty;
  }

  public String getSymbol() {
    return symbol;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("empty", empty)
        .append("symbol", symbol)
        .append("candles:", candles)
        .toString();
  }
}

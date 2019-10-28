package com.studerw.tda.model.history;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.studerw.tda.parse.Utils;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Candle implements Serializable {

  private final static long serialVersionUID = 9206560361311199158L;

  @JsonProperty("close")
  private BigDecimal close;
  @JsonProperty("datetime")
  private Long datetime;
  @JsonProperty("high")
  private BigDecimal high;
  @JsonProperty("low")
  private BigDecimal low;
  @JsonProperty("open")
  private BigDecimal open;
  @JsonProperty("volume")
  private Long volume;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();


  public BigDecimal getClose() {
    return close;
  }

  public Long getDatetime() {
    return datetime;
  }

  public BigDecimal getHigh() {
    return high;
  }

  public BigDecimal getLow() {
    return low;
  }

  public BigDecimal getOpen() {
    return open;
  }

  public Long getVolume() {
    return volume;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("close", close)
        .append("datetime", datetime)
        .append("datetimeStr", Utils.epochToStr(datetime))
        .append("high", high)
        .append("low", low)
        .append("open", open)
        .append("volume", volume)
        .append("otherFields", otherFields)
        .toString();
  }

}

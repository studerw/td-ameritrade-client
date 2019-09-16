package com.studerw.tda.model.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.studerw.tda.parse.FormatUtils;
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "close",
    "datetime",
    "high",
    "low",
    "open",
    "volume"
})
public class Candle implements Serializable {

  private final static long serialVersionUID = 9206560361311199158L;

  @JsonProperty("close")
  @JsonPropertyDescription("Close")
  private BigDecimal close;
  @JsonProperty("datetime")
  @JsonPropertyDescription("DateTime")
  private Long datetime;
  @JsonProperty("high")
  @JsonPropertyDescription("High")
  private BigDecimal high;
  @JsonProperty("low")
  @JsonPropertyDescription("Low")
  private BigDecimal low;
  @JsonProperty("open")
  @JsonPropertyDescription("Open")
  private BigDecimal open;
  @JsonProperty("volume")
  @JsonPropertyDescription("Volume")
  private Long volume;

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


  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("close", close)
        .append("datetime", datetime)
        .append("datetimeStr", FormatUtils.epochToStr(datetime))
        .append("high", high)
        .append("low", low)
        .append("open", open)
        .append("volume", volume)
        .toString();
  }

}

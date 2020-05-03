package com.studerw.tda.model.instrument;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Instrument with full {@link Fundamental} data.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FullInstrument extends Instrument implements Serializable {

  private final static long serialVersionUID = 4090333024332618028L;

  @JsonProperty("fundamental")
  private Fundamental fundamental;

  public Fundamental getFundamental() {
    return fundamental;
  }


  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("fundamental", fundamental)
        .toString();
  }
}

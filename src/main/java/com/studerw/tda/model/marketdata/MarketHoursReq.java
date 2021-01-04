package com.studerw.tda.model.marketdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.studerw.tda.model.marketdata.Mover.Direction;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Query for Market Hours
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MarketHoursReq implements Serializable {

  private final static long serialVersionUID = 9021846294309705175L;
  private final List<MarketType> marketTypes;
  private final DateType dateType;

  public MarketHoursReq(List<MarketType> marketType) {
    this.marketTypes = marketType;
    this.dateType = DateType.SIMPLE;
  }

  public MarketHoursReq(List<MarketType> marketTypes, DateType dateType) {
    this.marketTypes = marketTypes;
    this.dateType = dateType;
  }

  public List<MarketType> getMarketTypes() {
    return marketTypes;
  }

  public DateType getDateType() {
    return dateType;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("marketTypes", marketTypes)
        .append("dateType", dateType)
        .toString();
  }

  public enum MarketType {
    EQUITY,
    OPTION,
    FUTURE,
    BOND,
    FOREX
  }

  public enum DateType {
    SIMPLE("yyyy-MM-dd"),
    FULL("yyyy-MM-dd'T'HH:mm:ssz");

    private final String format;

    DateType(String format) {
      this.format = format;
    }

    public String getFormat() {
      return format;
    }
  }

}
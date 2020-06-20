package com.studerw.tda.model.marketdata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.studerw.tda.model.marketdata.Mover.Direction;
import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Query for Movers - Top 10 (up or down) movers by value or percent for a particular market index.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoversReq implements Serializable {

  private final static long serialVersionUID = 9021846294309705175L;
  private final Index index;
  private final Mover.Direction direction;
  private final Change change;

  public MoversReq(Index index, Mover.Direction direction, Change change) {
    this.index = index;
    this.direction = direction;
    this.change = change;
  }

  public Index getIndex() {
    return index;
  }

  public Direction getDirection() {
    return direction;
  }

  public Change getChange() {
    return change;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("index", index)
        .append("direction", direction)
        .append("change", change)
        .toString();
  }

  public enum Index {
    NASDAQ("$COMPX"),
    DOW_JONES("$DJI"),
    S_P_500("$SPX.X");

    private final String index;

    Index(String index) {
      this.index = index;
    }

    public String getIndex() {
      return index;
    }
  }

  public enum Change {
    VALUE("value"),
    PERCENT("percent");

    private final String change;

    Change(String change) {
      this.change = change;
    }

    public String getChange() {
      return change;
    }
  }

}

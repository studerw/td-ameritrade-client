package com.studerw.tda.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PriceHistory {

  private boolean error;
  private String errorMsg;
  private List<Result> results;
  public PriceHistory() {
  }
  public PriceHistory(String errorMsg) {
    this.setError(true);
    this.setErrorMsg(errorMsg);
  }

  public boolean isError() {
    return error;
  }

  public void setError(boolean error) {
    this.error = error;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public List<Result> getResults() {
    return results;
  }

  public void setResults(List<Result> results) {
    this.results = results;
  }


  public static class Result {

    private boolean error;
    private String errorMsg;
    private List<PriceHistory.ChartBar> chartBars;
    private String symbol;

    public String getSymbol() {
      return symbol;
    }

    public void setSymbol(String symbol) {
      this.symbol = symbol;
    }


    public boolean isError() {
      return error;
    }

    public void setError(boolean error) {
      this.error = error;
    }

    public String getErrorMsg() {
      return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
    }

    public List<ChartBar> getChartBars() {
      return chartBars;
    }

    public void setChartBars(List<ChartBar> chartBars) {
      this.chartBars = chartBars;
    }
  }

  public static class ChartBar {

    private BigDecimal close;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal open;
    private BigDecimal volume;
    private Long timestamp;

    public BigDecimal getClose() {
      return close;
    }

    public void setClose(BigDecimal close) {
      this.close = close;
    }

    public BigDecimal getHigh() {
      return high;
    }

    public void setHigh(BigDecimal high) {
      this.high = high;
    }

    public BigDecimal getLow() {
      return low;
    }

    public void setLow(BigDecimal low) {
      this.low = low;
    }

    public BigDecimal getOpen() {
      return open;
    }

    public void setOpen(BigDecimal open) {
      this.open = open;
    }

    public BigDecimal getVolume() {
      return volume;
    }

    public void setVolume(BigDecimal volume) {
      this.volume = volume;
    }

    public Long getTimestamp() {
      return timestamp;
    }

    public void setTimestamp(Long timestamp) {
      this.timestamp = timestamp;
    }

    public String getTimeStampStr() {
      if (this.timestamp == null) {
        return null;
      }
      return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault())
          .toString();
    }

    @Override
    public String toString() {
      return new ToStringBuilder(this)
          .append("close", close)
          .append("high", high)
          .append("low", low)
          .append("open", open)
          .append("volume", volume)
          .append("timestamp", getTimeStampStr()).toString();
    }

  }


}

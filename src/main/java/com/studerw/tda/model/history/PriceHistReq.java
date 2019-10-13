package com.studerw.tda.model.history;

import javax.validation.constraints.NotBlank;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * <p>
 * Encapsulates the necessary parameters for a {@link com.studerw.tda.client.TdaClient#priceHistory(PriceHistReq)}
 * call. Use the {@link Builder} to create an instance.
 * </p>

 * <pre class="code">
 *     //Price history for AMTD for the last week by the minute
 *     PriceHistReq request = PriceHistReqBuilder.priceHistReq()
 *       .withSymbol("AMTD")
 *       .withStartDate(System.currentTimeMillis() - (1000 * 60 * 60 * 24 * 7))
 *       .withFrequencyType(FrequencyType.minute)
 *       .withFrequency(1)
 *       .build();
 * </pre>
 *
 */
public class PriceHistReq {
  private final static long serialVersionUID = -1691611288512481627L;
  @NotBlank(message = "The symbol must be set")
  private String symbol;
  private PeriodType periodType;
  private Integer period;
  private FrequencyType frequencyType;
  private Integer frequency;
  private Long startDate;
  private Long endDate;
  private Boolean extendedHours;

  private PriceHistReq(){}

  /**
   *
   * @return uppercase symbol of equity, index, forex, option chain, etc. Your account must be explicitly enabled
   * for several of the types.
   */
  public String getSymbol() {
    return symbol;
  }

  /**
   * @return The number of periods for which the data is returned.
   * For example, if <em>periodtype=day</em> and <em>period=10</em>, then the request is for 10 days of data
   */
  public PeriodType getPeriodType() {
    return periodType;
  }

  /**
   * @return The number of periods for which the data is returned.
   * For example, if <em>periodtype=day</em> and <em>period=10</em>, then the request is for 10 days of data
   */
  public Integer getPeriod() {
    return period;
  }

  /**
   *
   * @return The type of frequency with which a new candle is formed.
   */
  public FrequencyType getFrequencyType() {
    return frequencyType;
  }

  /**
   * @return The number of the frequencyType to be included in each candle.
   */
  public Integer getFrequency() {
    return frequency;
  }

  /**
   *  @return The start date of the data being requested (Inclusive).
   *  If the <em>startDate</em> is not specified, then it will be (<em>endDate - period</em>) excluding weekends and holidays.  If specified, then <em>period</em> and <em>periodType</em> CANNOT be specified.
   */
  public Long getStartDate() {
    return startDate;
  }

  /**
   * @return  The end date of the data being requested (Inclusive). If NULL, then the default is the previous business day.
   */
  public Long getEndDate() {
    return endDate;
  }

  /**
   *
   * @return Indicates if extended hours data is to be included in the response. FALSE if null. NOTE: Only valid for intraday data requests.
   */
  public Boolean getExtendedHours() {
    return extendedHours;
  }



  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("symbol", symbol)
        .append("periodType", periodType)
        .append("period", period)
        .append("frequencyType", frequencyType)
        .append("frequency", frequency)
        .append("startDate", startDate)
        .append("endDate", endDate)
        .append("extendedHours", extendedHours)
        .toString();
  }

  public static final class Builder {

    private String symbol;
    private PeriodType periodType;
    private Integer period;
    private FrequencyType frequencyType;
    private Integer frequency;
    private Long startDate;
    private Long endDate;
    private Boolean extendedHours = Boolean.TRUE;

    private Builder() {
    }

    public static Builder priceHistReq() {
      return new Builder();
    }

    public Builder withSymbol(String symbol) {
      this.symbol = symbol;
      return this;
    }

    public Builder withPeriodType(PeriodType periodType) {
      this.periodType = periodType;
      return this;
    }

    public Builder withPeriod(Integer period) {
      this.period = period;
      return this;
    }

    public Builder withFrequencyType(FrequencyType frequencyType) {
      this.frequencyType = frequencyType;
      return this;
    }

    public Builder withFrequency(Integer frequency) {
      this.frequency = frequency;
      return this;
    }

    public Builder withStartDate(Long startDate) {
      this.startDate = startDate;
      return this;
    }

    public Builder withEndDate(Long endDate) {
      this.endDate = endDate;
      return this;
    }

    public Builder withExtendedHours(Boolean extendedHours) {
      this.extendedHours = extendedHours;
      return this;
    }

    public PriceHistReq build() {
      PriceHistReq priceHistReq = new PriceHistReq();
      priceHistReq.periodType = this.periodType;
      priceHistReq.period = this.period;
      priceHistReq.frequency = this.frequency;
      priceHistReq.endDate = this.endDate;
      priceHistReq.symbol = this.symbol;
      priceHistReq.extendedHours = this.extendedHours;
      priceHistReq.frequencyType = this.frequencyType;
      priceHistReq.startDate = this.startDate;
      return priceHistReq;
    }
  }
}

package com.studerw.tda.model.option;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.time.Month;

public class OptionChainReq {
  private final static long serialVersionUID = -1691611288512481627L;
  @NotBlank(message = "The symbol must be set")
  private String symbol;
  private ContractType contractType = ContractType.ALL;
  private Integer strikeCount;
  private Boolean includeQuotes;
  private Strategy strategy = Strategy.SINGLE;
  private Double interval;
  private Double strike;
  private Range range = Range.ALL;
  private LocalDateTime fromDate;
  private LocalDateTime toDate;
  private Double volatility;
  private Double underlyingPrice;
  private Double interestRate;
  private Integer daysToExpiration;
  private Month month;
  private OptionType optionType;

  private OptionChainReq(){}

  public String getSymbol() {
    return symbol;
  }

  public ContractType getContractType() {
    return contractType;
  }

  public Integer getStrikeCount() {
    return strikeCount;
  }

  public Boolean getIncludeQuotes() {
    return includeQuotes;
  }

  public Strategy getStrategy() {
    return strategy;
  }

  public Double getInterval() {
    return interval;
  }

  public Double getStrike() {
    return strike;
  }

  public Range getRange() {
    return range;
  }

  public LocalDateTime getFromDate() {
    return fromDate;
  }

  public LocalDateTime getToDate() {
    return toDate;
  }

  public Double getVolatility() {
    return volatility;
  }

  public Double getUnderlyingPrice() {
    return underlyingPrice;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public Integer getDaysToExpiration() {
    return daysToExpiration;
  }

  public Month getMonth() {
    return month;
  }

  public OptionType getOptionType() {
    return optionType;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("symbol", symbol)
        .append("contractType", contractType)
        .append("strikeCount", strikeCount)
        .append("includeQuotes", includeQuotes)
        .append("strategy", strategy)
        .append("interval", interval)
        .append("strike", strike)
        .append("range", range)
        .append("fromDate", fromDate)
        .append("toDate", toDate)
        .append("volatility", volatility)
        .append("underlyingPrice", underlyingPrice)
        .append("interestRate", interestRate)
        .append("daysToExpiration", daysToExpiration)
        .append("month", month)
        .append("optionType", optionType)
        .toString();
  }

  public static final class Builder {

    private String symbol;
    private ContractType contractType = ContractType.ALL;
    private Integer strikeCount;
    private Boolean includeQuotes;
    private Strategy strategy = Strategy.SINGLE;
    private Double interval;
    private Double strike;
    private Range range = Range.ALL;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
    private Double volatility;
    private Double underlyingPrice;
    private Double interestRate;
    private Integer daysToExpiration;
    private Month month;
    private OptionType optionType = OptionType.ALL;

    private Builder() {
    }

    public static Builder optionChainReq() {
      return new Builder();
    }

    public Builder withSymbol(String symbol) {
      this.symbol = symbol;
      return this;
    }

    public Builder withContractType(ContractType contractType) {
      this.contractType = contractType;
      return this;
    }

    public Builder withStrikeCount(Integer strikeCount) {
      this.strikeCount = strikeCount;
      return this;
    }

    public Builder withIncludeQuotes(Boolean includeQuotes) {
      this.includeQuotes = includeQuotes;
      return this;
    }

    public Builder withStrategy(Strategy strategy) {
      this.strategy = strategy;
      return this;
    }

    public Builder withInterval(Double interval) {
      this.interval = interval;
      return this;
    }

    public Builder withStrike(Double strike) {
      this.strike = strike;
      return this;
    }

    public Builder withRange(Range range) {
      this.range = range;
      return this;
    }

    public Builder withFromDate(LocalDateTime fromDate) {
      this.fromDate = fromDate;
      return this;
    }

    public Builder withToDate(LocalDateTime toDate) {
      this.toDate = toDate;
      return this;
    }

    public Builder withVolatility(Double volatility) {
      this.volatility = volatility;
      return this;
    }

    public Builder withUnderlyingPrice(Double underlyingPrice) {
      this.underlyingPrice = underlyingPrice;
      return this;
    }

    public Builder withInterestRate(Double interestRate) {
      this.interestRate = interestRate;
      return this;
    }

    public Builder withDaysToExpiration(Integer daysToExpiration) {
      this.daysToExpiration = daysToExpiration;
      return this;
    }

    public Builder withMonth(Month month) {
      this.month = month;
      return this;
    }

    public Builder withOptionType(OptionType optionType) {
      this.optionType = optionType;
      return this;
    }

    public OptionChainReq build() {
      OptionChainReq priceHistReq = new OptionChainReq();
      priceHistReq.symbol = this.symbol;
      priceHistReq.contractType = this.contractType;
      priceHistReq.strikeCount = this.strikeCount;
      priceHistReq.includeQuotes = this.includeQuotes;
      priceHistReq.strategy = this.strategy;
      priceHistReq.interval = this.interval;
      priceHistReq.strike = this.strike;
      priceHistReq.range = this.range;
      priceHistReq.fromDate = this.fromDate;
      priceHistReq.toDate = this.toDate;
      priceHistReq.volatility = this.volatility;
      priceHistReq.underlyingPrice = this.underlyingPrice;
      priceHistReq.interestRate = this.interestRate;
      priceHistReq.daysToExpiration = this.daysToExpiration;
      priceHistReq.month = this.month;
      priceHistReq.optionType = this.optionType;

      return priceHistReq;
    }
  }
  public enum ContractType {
    CALL,
    PUT,
    ALL;
  }

  public enum Strategy {
    SINGLE,
    ANALYTICAL,
    COVERED,
    VERTICAL,
    CALENDAR,
    STRANGLE,
    STRADDLE,
    BUTTERFLY,
    CONDOR,
    DIAGONAL,
    COLLAR,
    ROLL;
  }

  public enum Range {
    ITM,
    NTM,
    OTM,
    SAK,
    SBK,
    SNK,
    ALL;
  }

  public enum OptionType {
    S,
    NS,
    ALL;
  }
}
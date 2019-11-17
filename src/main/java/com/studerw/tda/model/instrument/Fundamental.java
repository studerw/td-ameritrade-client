package com.studerw.tda.model.instrument;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Fundamental Data
 */
@JsonInclude(Include.NON_EMPTY)
public class Fundamental implements Serializable {

  private final static long serialVersionUID = 6299707742045480855L;
  @JsonProperty("symbol")
  private String symbol;
  @JsonProperty("high52")
  private BigDecimal high52;
  @JsonProperty("low52")
  private BigDecimal low52;
  @JsonProperty("dividendAmount")
  private BigDecimal dividendAmount;
  @JsonProperty("dividendYield")
  private BigDecimal dividendYield;
  @JsonProperty("dividendDate")
  private String dividendDate;
  @JsonProperty("peRatio")
  private BigDecimal peRatio;
  @JsonProperty("pegRatio")
  private BigDecimal pegRatio;
  @JsonProperty("pbRatio")
  private BigDecimal pbRatio;
  @JsonProperty("prRatio")
  private BigDecimal prRatio;
  @JsonProperty("pcfRatio")
  private BigDecimal pcfRatio;
  @JsonProperty("grossMarginTTM")
  private BigDecimal grossMarginTTM;
  @JsonProperty("grossMarginMRQ")
  private BigDecimal grossMarginMRQ;
  @JsonProperty("netProfitMarginTTM")
  private BigDecimal netProfitMarginTTM;
  @JsonProperty("netProfitMarginMRQ")
  private BigDecimal netProfitMarginMRQ;
  @JsonProperty("operatingMarginTTM")
  private BigDecimal operatingMarginTTM;
  @JsonProperty("operatingMarginMRQ")
  private BigDecimal operatingMarginMRQ;
  @JsonProperty("returnOnEquity")
  private BigDecimal returnOnEquity;
  @JsonProperty("returnOnAssets")
  private BigDecimal returnOnAssets;
  @JsonProperty("returnOnInvestment")
  private BigDecimal returnOnInvestment;
  @JsonProperty("quickRatio")
  private BigDecimal quickRatio;
  @JsonProperty("currentRatio")
  private BigDecimal currentRatio;
  @JsonProperty("interestCoverage")
  private BigDecimal interestCoverage;
  @JsonProperty("totalDebtToCapital")
  private BigDecimal totalDebtToCapital;
  @JsonProperty("ltDebtToEquity")
  private BigDecimal ltDebtToEquity;
  @JsonProperty("totalDebtToEquity")
  private BigDecimal totalDebtToEquity;
  @JsonProperty("epsTTM")
  private BigDecimal epsTTM;
  @JsonProperty("epsChangePercentTTM")
  private BigDecimal epsChangePercentTTM;
  @JsonProperty("epsChangeYear")
  private BigDecimal epsChangeYear;
  @JsonProperty("epsChange")
  private BigDecimal epsChange;
  @JsonProperty("revChangeYear")
  private BigDecimal revChangeYear;
  @JsonProperty("revChangeTTM")
  private BigDecimal revChangeTTM;
  @JsonProperty("revChangeIn")
  private BigDecimal revChangeIn;
  @JsonProperty("sharesOutstanding")
  private BigDecimal sharesOutstanding;
  @JsonProperty("marketCapFloat")
  private BigDecimal marketCapFloat;
  @JsonProperty("marketCap")
  private BigDecimal marketCap;
  @JsonProperty("bookValuePerShare")
  private BigDecimal bookValuePerShare;
  @JsonProperty("shortIntToFloat")
  private BigDecimal shortIntToFloat;
  @JsonProperty("shortIntDayToCover")
  private BigDecimal shortIntDayToCover;
  @JsonProperty("divGrowthRate3Year")
  private BigDecimal divGrowthRate3Year;
  @JsonProperty("dividendPayAmount")
  private BigDecimal dividendPayAmount;
  @JsonProperty("dividendPayDate")
  private String dividendPayDate;
  @JsonProperty("beta")
  private BigDecimal beta;
  @JsonProperty("vol1DayAvg")
  private BigDecimal vol1DayAvg;
  @JsonProperty("vol10DayAvg")
  private BigDecimal vol10DayAvg;
  @JsonProperty("vol3MonthAvg")
  private BigDecimal vol3MonthAvg;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public String getSymbol() {
    return symbol;
  }

  public BigDecimal getHigh52() {
    return high52;
  }

  public BigDecimal getLow52() {
    return low52;
  }

  public BigDecimal getDividendAmount() {
    return dividendAmount;
  }

  public BigDecimal getDividendYield() {
    return dividendYield;
  }

  public String getDividendDate() {
    return dividendDate;
  }

  public BigDecimal getPeRatio() {
    return peRatio;
  }

  public BigDecimal getPegRatio() {
    return pegRatio;
  }

  public BigDecimal getPbRatio() {
    return pbRatio;
  }

  public BigDecimal getPrRatio() {
    return prRatio;
  }

  public BigDecimal getPcfRatio() {
    return pcfRatio;
  }

  public BigDecimal getGrossMarginTTM() {
    return grossMarginTTM;
  }

  public BigDecimal getGrossMarginMRQ() {
    return grossMarginMRQ;
  }

  public BigDecimal getNetProfitMarginTTM() {
    return netProfitMarginTTM;
  }

  public BigDecimal getNetProfitMarginMRQ() {
    return netProfitMarginMRQ;
  }

  public BigDecimal getOperatingMarginTTM() {
    return operatingMarginTTM;
  }

  public BigDecimal getOperatingMarginMRQ() {
    return operatingMarginMRQ;
  }

  public BigDecimal getReturnOnEquity() {
    return returnOnEquity;
  }

  public BigDecimal getReturnOnAssets() {
    return returnOnAssets;
  }

  public BigDecimal getReturnOnInvestment() {
    return returnOnInvestment;
  }

  public BigDecimal getQuickRatio() {
    return quickRatio;
  }

  public BigDecimal getCurrentRatio() {
    return currentRatio;
  }

  public BigDecimal getInterestCoverage() {
    return interestCoverage;
  }

  public BigDecimal getTotalDebtToCapital() {
    return totalDebtToCapital;
  }

  public BigDecimal getLtDebtToEquity() {
    return ltDebtToEquity;
  }

  public BigDecimal getTotalDebtToEquity() {
    return totalDebtToEquity;
  }

  public BigDecimal getEpsTTM() {
    return epsTTM;
  }

  public BigDecimal getEpsChangePercentTTM() {
    return epsChangePercentTTM;
  }

  public BigDecimal getEpsChangeYear() {
    return epsChangeYear;
  }

  public BigDecimal getEpsChange() {
    return epsChange;
  }

  public BigDecimal getRevChangeYear() {
    return revChangeYear;
  }

  public BigDecimal getRevChangeTTM() {
    return revChangeTTM;
  }

  public BigDecimal getRevChangeIn() {
    return revChangeIn;
  }

  public BigDecimal getSharesOutstanding() {
    return sharesOutstanding;
  }

  public BigDecimal getMarketCapFloat() {
    return marketCapFloat;
  }

  public BigDecimal getMarketCap() {
    return marketCap;
  }

  public BigDecimal getBookValuePerShare() {
    return bookValuePerShare;
  }

  public BigDecimal getShortIntToFloat() {
    return shortIntToFloat;
  }

  public BigDecimal getShortIntDayToCover() {
    return shortIntDayToCover;
  }

  public BigDecimal getDivGrowthRate3Year() {
    return divGrowthRate3Year;
  }

  public BigDecimal getDividendPayAmount() {
    return dividendPayAmount;
  }

  public String getDividendPayDate() {
    return dividendPayDate;
  }

  public BigDecimal getBeta() {
    return beta;
  }

  public BigDecimal getVol1DayAvg() {
    return vol1DayAvg;
  }

  public BigDecimal getVol10DayAvg() {
    return vol10DayAvg;
  }

  public BigDecimal getVol3MonthAvg() {
    return vol3MonthAvg;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("symbol", symbol)
        .append("high52", high52)
        .append("low52", low52)
        .append("dividendAmount", dividendAmount)
        .append("dividendYield", dividendYield)
        .append("dividendDate", dividendDate)
        .append("peRatio", peRatio)
        .append("pegRatio", pegRatio)
        .append("pbRatio", pbRatio)
        .append("prRatio", prRatio)
        .append("pcfRatio", pcfRatio)
        .append("grossMarginTTM", grossMarginTTM)
        .append("grossMarginMRQ", grossMarginMRQ)
        .append("netProfitMarginTTM", netProfitMarginTTM)
        .append("netProfitMarginMRQ", netProfitMarginMRQ)
        .append("operatingMarginTTM", operatingMarginTTM)
        .append("operatingMarginMRQ", operatingMarginMRQ)
        .append("returnOnEquity", returnOnEquity)
        .append("returnOnAssets", returnOnAssets)
        .append("returnOnInvestment", returnOnInvestment)
        .append("quickRatio", quickRatio)
        .append("currentRatio", currentRatio)
        .append("interestCoverage", interestCoverage)
        .append("totalDebtToCapital", totalDebtToCapital)
        .append("ltDebtToEquity", ltDebtToEquity)
        .append("totalDebtToEquity", totalDebtToEquity)
        .append("epsTTM", epsTTM)
        .append("epsChangePercentTTM", epsChangePercentTTM)
        .append("epsChangeYear", epsChangeYear)
        .append("epsChange", epsChange)
        .append("revChangeYear", revChangeYear)
        .append("revChangeTTM", revChangeTTM)
        .append("revChangeIn", revChangeIn)
        .append("sharesOutstanding", sharesOutstanding)
        .append("marketCapFloat", marketCapFloat)
        .append("marketCap", marketCap)
        .append("bookValuePerShare", bookValuePerShare)
        .append("shortIntToFloat", shortIntToFloat)
        .append("shortIntDayToCover", shortIntDayToCover)
        .append("divGrowthRate3Year", divGrowthRate3Year)
        .append("dividendPayAmount", dividendPayAmount)
        .append("dividendPayDate", dividendPayDate)
        .append("beta", beta)
        .append("vol1DayAvg", vol1DayAvg)
        .append("vol10DayAvg", vol10DayAvg)
        .append("vol3MonthAvg", vol3MonthAvg)
        .append("otherFields", otherFields)
        .toString();
  }
}

package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Current Balances of a Margin Account
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MarginCurrentBalances implements Serializable {

  private final static long serialVersionUID = 1776988333725646930L;
  @JsonProperty("accruedInterest")
  private BigDecimal accruedInterest;
  @JsonProperty("cashBalance")
  private BigDecimal cashBalance;
  @JsonProperty("cashReceipts")
  private BigDecimal cashReceipts;
  @JsonProperty("longOptionMarketValue")
  private BigDecimal longOptionMarketValue;
  @JsonProperty("liquidationValue")
  private BigDecimal liquidationValue;
  @JsonProperty("longMarketValue")
  private BigDecimal longMarketValue;
  @JsonProperty("moneyMarketFund")
  private BigDecimal moneyMarketFund;
  @JsonProperty("savings")
  private BigDecimal savings;
  @JsonProperty("shortMarketValue")
  private BigDecimal shortMarketValue;
  @JsonProperty("pendingDeposits")
  private BigDecimal pendingDeposits;
  @JsonProperty("availableFunds")
  private BigDecimal availableFunds;
  @JsonProperty("availableFundsNonMarginableTrade")
  private BigDecimal availableFundsNonMarginableTrade;
  @JsonProperty("buyingPower")
  private BigDecimal buyingPower;
  @JsonProperty("buyingPowerNonMarginableTrade")
  private BigDecimal buyingPowerNonMarginableTrade;
  @JsonProperty("dayTradingBuyingPower")
  private BigDecimal dayTradingBuyingPower;
  @JsonProperty("dayTradingBuyingPowerCall")
  private BigDecimal dayTradingBuyingPowerCall;
  @JsonProperty("equity")
  private BigDecimal equity;
  @JsonProperty("equityPercentage")
  private BigDecimal equityPercentage;
  @JsonProperty("longMarginValue")
  private BigDecimal longMarginValue;
  @JsonProperty("maintenanceCall")
  private BigDecimal maintenanceCall;
  @JsonProperty("maintenanceRequirement")
  private BigDecimal maintenanceRequirement;
  @JsonProperty("marginBalance")
  private BigDecimal marginBalance;
  @JsonProperty("regTCall")
  private BigDecimal regTCall;
  @JsonProperty("shortBalance")
  private BigDecimal shortBalance;
  @JsonProperty("shortMarginValue")
  private BigDecimal shortMarginValue;
  @JsonProperty("shortOptionMarketValue")
  private BigDecimal shortOptionMarketValue;
  @JsonProperty("sma")
  private BigDecimal sma;
  @JsonProperty("mutualFundValue")
  private BigDecimal mutualFundValue;
  @JsonProperty("bondValue")
  private BigDecimal bondValue;
  @JsonProperty("isInCall")
  private Boolean isInCall;
  @JsonProperty("stockBuyingPower")
  private BigDecimal stockBuyingPower;
  @JsonProperty("optionBuyingPower")
  private BigDecimal optionBuyingPower;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public BigDecimal getAccruedInterest() {
    return accruedInterest;
  }

  public BigDecimal getCashBalance() {
    return cashBalance;
  }

  public BigDecimal getCashReceipts() {
    return cashReceipts;
  }

  public BigDecimal getLongOptionMarketValue() {
    return longOptionMarketValue;
  }

  public BigDecimal getLiquidationValue() {
    return liquidationValue;
  }

  public BigDecimal getLongMarketValue() {
    return longMarketValue;
  }

  public BigDecimal getMoneyMarketFund() {
    return moneyMarketFund;
  }

  public BigDecimal getSavings() {
    return savings;
  }

  public BigDecimal getShortMarketValue() {
    return shortMarketValue;
  }

  public BigDecimal getPendingDeposits() {
    return pendingDeposits;
  }

  public BigDecimal getAvailableFunds() {
    return availableFunds;
  }

  public BigDecimal getAvailableFundsNonMarginableTrade() {
    return availableFundsNonMarginableTrade;
  }

  public BigDecimal getBuyingPower() {
    return buyingPower;
  }

  public BigDecimal getBuyingPowerNonMarginableTrade() {
    return buyingPowerNonMarginableTrade;
  }

  public BigDecimal getDayTradingBuyingPower() {
    return dayTradingBuyingPower;
  }

  public BigDecimal getDayTradingBuyingPowerCall() {
    return dayTradingBuyingPowerCall;
  }

  public BigDecimal getEquity() {
    return equity;
  }

  public BigDecimal getEquityPercentage() {
    return equityPercentage;
  }

  public BigDecimal getLongMarginValue() {
    return longMarginValue;
  }

  public BigDecimal getMaintenanceCall() {
    return maintenanceCall;
  }

  public BigDecimal getMaintenanceRequirement() {
    return maintenanceRequirement;
  }

  public BigDecimal getMarginBalance() {
    return marginBalance;
  }

  public BigDecimal getRegTCall() {
    return regTCall;
  }

  public BigDecimal getShortBalance() {
    return shortBalance;
  }

  public BigDecimal getShortMarginValue() {
    return shortMarginValue;
  }

  public BigDecimal getShortOptionMarketValue() {
    return shortOptionMarketValue;
  }

  public BigDecimal getSma() {
    return sma;
  }

  public BigDecimal getMutualFundValue() {
    return mutualFundValue;
  }

  public BigDecimal getBondValue() {
    return bondValue;
  }

  public Boolean getInCall() {
    return isInCall;
  }

  public BigDecimal getStockBuyingPower() {
    return stockBuyingPower;
  }

  public BigDecimal getOptionBuyingPower() {
    return optionBuyingPower;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("accruedInterest", accruedInterest)
        .append("cashBalance", cashBalance)
        .append("cashReceipts", cashReceipts)
        .append("longOptionMarketValue", longOptionMarketValue)
        .append("liquidationValue", liquidationValue)
        .append("longMarketValue", longMarketValue)
        .append("moneyMarketFund", moneyMarketFund)
        .append("savings", savings)
        .append("shortMarketValue", shortMarketValue)
        .append("pendingDeposits", pendingDeposits)
        .append("availableFunds", availableFunds)
        .append("availableFundsNonMarginableTrade", availableFundsNonMarginableTrade)
        .append("buyingPower", buyingPower)
        .append("buyingPowerNonMarginableTrade", buyingPowerNonMarginableTrade)
        .append("dayTradingBuyingPower", dayTradingBuyingPower)
        .append("dayTradingBuyingPowerCall", dayTradingBuyingPowerCall)
        .append("equity", equity)
        .append("equityPercentage", equityPercentage)
        .append("longMarginValue", longMarginValue)
        .append("maintenanceCall", maintenanceCall)
        .append("maintenanceRequirement", maintenanceRequirement)
        .append("marginBalance", marginBalance)
        .append("regTCall", regTCall)
        .append("shortBalance", shortBalance)
        .append("shortMarginValue", shortMarginValue)
        .append("shortOptionMarketValue", shortOptionMarketValue)
        .append("sma", sma)
        .append("mutualFundValue", mutualFundValue)
        .append("bondValue", bondValue)
        .append("inCall", isInCall)
        .append("stockBuyingPower", stockBuyingPower)
        .append("optionBuyingPower", optionBuyingPower)
        .append("otherFields", otherFields)
        .toString();
  }
}

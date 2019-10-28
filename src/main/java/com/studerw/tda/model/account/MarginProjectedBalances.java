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
 * Projected Balances of a Margin Account
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MarginProjectedBalances implements Serializable {

  private final static long serialVersionUID = -8049645023475195214L;

  @JsonProperty("accruedInterest")
  private BigDecimal accruedInterest;
  @JsonProperty("availableFunds")
  private BigDecimal availableFunds;
  @JsonProperty("availableFundsNonMarginableTrade")
  private BigDecimal availableFundsNonMarginableTrade;
  @JsonProperty("buyingPower")
  private BigDecimal buyingPower;
  @JsonProperty("bondValue")
  private BigDecimal bondValue;
  @JsonProperty("buyingPowerNonMarginableTrade")
  private BigDecimal buyingPowerNonMarginableTrade;
  @JsonProperty("cashBalance")
  private BigDecimal cashBalance;
  @JsonProperty("cashReceipts")
  private BigDecimal cashReceipts;
  @JsonProperty("shortMarketValue")
  private BigDecimal shortMarketValue;
  @JsonProperty("dayTradingBuyingPower")
  private BigDecimal dayTradingBuyingPower;
  @JsonProperty("dayTradingBuyingPowerCall")
  private BigDecimal dayTradingBuyingPowerCall;
  @JsonProperty("equity")
  private BigDecimal equity;
  @JsonProperty("equityPercentage")
  private BigDecimal equityPercentage;
  @JsonProperty("isInCall")
  private Boolean isInCall;
  @JsonProperty("liquidationValue")
  private BigDecimal liquidationValue;
  @JsonProperty("longOptionMarketValue")
  private BigDecimal longOptionMarketValue;
  @JsonProperty("longMarketValue")
  private BigDecimal longMarketValue;
  @JsonProperty("longMarginValue")
  private BigDecimal longMarginValue;
  @JsonProperty("maintenanceCall")
  private BigDecimal maintenanceCall;
  @JsonProperty("maintenanceRequirement")
  private BigDecimal maintenanceRequirement;
  @JsonProperty("marginBalance")
  private BigDecimal marginBalance;
  @JsonProperty("moneyMarketFund")
  private BigDecimal moneyMarketFund;
  @JsonProperty("mutualFundValue")
  private BigDecimal mutualFundValue;
  @JsonProperty("pendingDeposits")
  private BigDecimal pendingDeposits;
  @JsonProperty("optionBuyingPower")
  private BigDecimal optionBuyingPower;
  @JsonProperty("regTCall")
  private BigDecimal regTCall;
  @JsonProperty("savings")
  private BigDecimal savings;
  @JsonProperty("shortBalance")
  private BigDecimal shortBalance;
  @JsonProperty("shortMarginValue")
  private BigDecimal shortMarginValue;
  @JsonProperty("shortOptionMarketValue")
  private BigDecimal shortOptionMarketValue;
  @JsonProperty("sma")
  private BigDecimal sma;
  @JsonProperty("stockBuyingPower")
  private BigDecimal stockBuyingPower;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public BigDecimal getAccruedInterest() {
    return accruedInterest;
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

  public BigDecimal getBondValue() {
    return bondValue;
  }

  public BigDecimal getBuyingPowerNonMarginableTrade() {
    return buyingPowerNonMarginableTrade;
  }

  public BigDecimal getCashBalance() {
    return cashBalance;
  }

  public BigDecimal getCashReceipts() {
    return cashReceipts;
  }

  public BigDecimal getShortMarketValue() {
    return shortMarketValue;
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

  public Boolean getInCall() {
    return isInCall;
  }

  public BigDecimal getLiquidationValue() {
    return liquidationValue;
  }

  public BigDecimal getLongOptionMarketValue() {
    return longOptionMarketValue;
  }

  public BigDecimal getLongMarketValue() {
    return longMarketValue;
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

  public BigDecimal getMoneyMarketFund() {
    return moneyMarketFund;
  }

  public BigDecimal getMutualFundValue() {
    return mutualFundValue;
  }

  public BigDecimal getPendingDeposits() {
    return pendingDeposits;
  }

  public BigDecimal getOptionBuyingPower() {
    return optionBuyingPower;
  }

  public BigDecimal getRegTCall() {
    return regTCall;
  }

  public BigDecimal getSavings() {
    return savings;
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

  public BigDecimal getStockBuyingPower() {
    return stockBuyingPower;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("accruedInterest", accruedInterest)
        .append("availableFunds", availableFunds)
        .append("availableFundsNonMarginableTrade", availableFundsNonMarginableTrade)
        .append("buyingPower", buyingPower)
        .append("bondValue", bondValue)
        .append("buyingPowerNonMarginableTrade", buyingPowerNonMarginableTrade)
        .append("cashBalance", cashBalance)
        .append("cashReceipts", cashReceipts)
        .append("shortMarketValue", shortMarketValue)
        .append("dayTradingBuyingPower", dayTradingBuyingPower)
        .append("dayTradingBuyingPowerCall", dayTradingBuyingPowerCall)
        .append("equity", equity)
        .append("equityPercentage", equityPercentage)
        .append("isInCall", isInCall)
        .append("liquidationValue", liquidationValue)
        .append("longOptionMarketValue", longOptionMarketValue)
        .append("longMarketValue", longMarketValue)
        .append("longMarginValue", longMarginValue)
        .append("maintenanceCall", maintenanceCall)
        .append("maintenanceRequirement", maintenanceRequirement)
        .append("marginBalance", marginBalance)
        .append("moneyMarketFund", moneyMarketFund)
        .append("mutualFundValue", mutualFundValue)
        .append("pendingDeposits", pendingDeposits)
        .append("optionBuyingPower", optionBuyingPower)
        .append("regTCall", regTCall)
        .append("savings", savings)
        .append("shortBalance", shortBalance)
        .append("shortMarginValue", shortMarginValue)
        .append("shortOptionMarketValue", shortOptionMarketValue)
        .append("sma", sma)
        .append("stockBuyingPower", stockBuyingPower)
        .append("otherFields", otherFields)
        .toString();
  }
}

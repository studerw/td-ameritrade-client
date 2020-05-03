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
 * Initial Balances of a Margin Account
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MarginInitialBalances implements Serializable {
  private final static long serialVersionUID = -7328609525719064258L;

  @JsonProperty("accruedInterest")
  private BigDecimal accruedInterest;
  @JsonProperty("availableFundsNonMarginableTrade")
  private BigDecimal availableFundsNonMarginableTrade;
  @JsonProperty("bondValue")
  private BigDecimal bondValue;
  @JsonProperty("buyingPower")
  private BigDecimal buyingPower;
  @JsonProperty("cashBalance")
  private BigDecimal cashBalance;
  @JsonProperty("cashAvailableForTrading")
  private BigDecimal cashAvailableForTrading;
  @JsonProperty("cashReceipts")
  private BigDecimal cashReceipts;
  @JsonProperty("dayTradingBuyingPower")
  private BigDecimal dayTradingBuyingPower;
  @JsonProperty("dayTradingBuyingPowerCall")
  private BigDecimal dayTradingBuyingPowerCall;
  @JsonProperty("dayTradingEquityCall")
  private BigDecimal dayTradingEquityCall;
  @JsonProperty("equity")
  private BigDecimal equity;
  @JsonProperty("equityPercentage")
  private BigDecimal equityPercentage;
  @JsonProperty("liquidationValue")
  private BigDecimal liquidationValue;
  @JsonProperty("longMarginValue")
  private BigDecimal longMarginValue;
  @JsonProperty("longOptionMarketValue")
  private BigDecimal longOptionMarketValue;
  @JsonProperty("longStockValue")
  private BigDecimal longStockValue;
  @JsonProperty("maintenanceCall")
  private BigDecimal maintenanceCall;
  @JsonProperty("maintenanceRequirement")
  private BigDecimal maintenanceRequirement;
  @JsonProperty("margin")
  private BigDecimal margin;
  @JsonProperty("marginEquity")
  private BigDecimal marginEquity;
  @JsonProperty("moneyMarketFund")
  private BigDecimal moneyMarketFund;
  @JsonProperty("mutualFundValue")
  private BigDecimal mutualFundValue;
  @JsonProperty("regTCall")
  private BigDecimal regTCall;
  @JsonProperty("shortMarginValue")
  private BigDecimal shortMarginValue;
  @JsonProperty("shortOptionMarketValue")
  private BigDecimal shortOptionMarketValue;
  @JsonProperty("shortStockValue")
  private BigDecimal shortStockValue;
  @JsonProperty("totalCash")
  private BigDecimal totalCash;
  @JsonProperty("isInCall")
  private Boolean isInCall;
  @JsonProperty("unsettledCash")
  private BigDecimal unsettledCash;
  @JsonProperty("pendingDeposits")
  private BigDecimal pendingDeposits;
  @JsonProperty("marginBalance")
  private BigDecimal marginBalance;
  @JsonProperty("shortBalance")
  private BigDecimal shortBalance;
  @JsonProperty("accountValue")
  private BigDecimal accountValue;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public BigDecimal getAccruedInterest() {
    return accruedInterest;
  }

  public BigDecimal getAvailableFundsNonMarginableTrade() {
    return availableFundsNonMarginableTrade;
  }

  public BigDecimal getBondValue() {
    return bondValue;
  }

  public BigDecimal getBuyingPower() {
    return buyingPower;
  }

  public BigDecimal getCashBalance() {
    return cashBalance;
  }

  public BigDecimal getCashAvailableForTrading() {
    return cashAvailableForTrading;
  }

  public BigDecimal getCashReceipts() {
    return cashReceipts;
  }

  public BigDecimal getDayTradingBuyingPower() {
    return dayTradingBuyingPower;
  }

  public BigDecimal getDayTradingBuyingPowerCall() {
    return dayTradingBuyingPowerCall;
  }

  public BigDecimal getDayTradingEquityCall() {
    return dayTradingEquityCall;
  }

  public BigDecimal getEquity() {
    return equity;
  }

  public BigDecimal getEquityPercentage() {
    return equityPercentage;
  }

  public BigDecimal getLiquidationValue() {
    return liquidationValue;
  }

  public BigDecimal getLongMarginValue() {
    return longMarginValue;
  }

  public BigDecimal getLongOptionMarketValue() {
    return longOptionMarketValue;
  }

  public BigDecimal getLongStockValue() {
    return longStockValue;
  }

  public BigDecimal getMaintenanceCall() {
    return maintenanceCall;
  }

  public BigDecimal getMaintenanceRequirement() {
    return maintenanceRequirement;
  }

  public BigDecimal getMargin() {
    return margin;
  }

  public BigDecimal getMarginEquity() {
    return marginEquity;
  }

  public BigDecimal getMoneyMarketFund() {
    return moneyMarketFund;
  }

  public BigDecimal getMutualFundValue() {
    return mutualFundValue;
  }

  public BigDecimal getRegTCall() {
    return regTCall;
  }

  public BigDecimal getShortMarginValue() {
    return shortMarginValue;
  }

  public BigDecimal getShortOptionMarketValue() {
    return shortOptionMarketValue;
  }

  public BigDecimal getShortStockValue() {
    return shortStockValue;
  }

  public BigDecimal getTotalCash() {
    return totalCash;
  }

  public Boolean getInCall() {
    return isInCall;
  }

  public BigDecimal getUnsettledCash() {
    return unsettledCash;
  }

  public BigDecimal getPendingDeposits() {
    return pendingDeposits;
  }

  public BigDecimal getMarginBalance() {
    return marginBalance;
  }

  public BigDecimal getShortBalance() {
    return shortBalance;
  }

  public BigDecimal getAccountValue() {
    return accountValue;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("accruedInterest", accruedInterest)
        .append("availableFundsNonMarginableTrade", availableFundsNonMarginableTrade)
        .append("bondValue", bondValue)
        .append("buyingPower", buyingPower)
        .append("cashBalance", cashBalance)
        .append("cashAvailableForTrading", cashAvailableForTrading)
        .append("cashReceipts", cashReceipts)
        .append("dayTradingBuyingPower", dayTradingBuyingPower)
        .append("dayTradingBuyingPowerCall", dayTradingBuyingPowerCall)
        .append("dayTradingEquityCall", dayTradingEquityCall)
        .append("equity", equity)
        .append("equityPercentage", equityPercentage)
        .append("liquidationValue", liquidationValue)
        .append("longMarginValue", longMarginValue)
        .append("longOptionMarketValue", longOptionMarketValue)
        .append("longStockValue", longStockValue)
        .append("maintenanceCall", maintenanceCall)
        .append("maintenanceRequirement", maintenanceRequirement)
        .append("margin", margin)
        .append("marginEquity", marginEquity)
        .append("moneyMarketFund", moneyMarketFund)
        .append("mutualFundValue", mutualFundValue)
        .append("regTCall", regTCall)
        .append("shortMarginValue", shortMarginValue)
        .append("shortOptionMarketValue", shortOptionMarketValue)
        .append("shortStockValue", shortStockValue)
        .append("totalCash", totalCash)
        .append("isInCall", isInCall)
        .append("unsettledCash", unsettledCash)
        .append("pendingDeposits", pendingDeposits)
        .append("marginBalance", marginBalance)
        .append("shortBalance", shortBalance)
        .append("accountValue", accountValue)
        .append("otherFields", otherFields)
        .toString();
  }
}
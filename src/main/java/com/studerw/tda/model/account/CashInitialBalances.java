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
 * Initial Balances of a Cash Account
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CashInitialBalances implements Serializable {

  private final static long serialVersionUID = -7275683076169553980L;

  @JsonProperty("accruedInterest")
  private BigDecimal accruedInterest;
  @JsonProperty("cashAvailableForTrading")
  private BigDecimal cashAvailableForTrading;
  @JsonProperty("cashAvailableForWithdrawal")
  private BigDecimal cashAvailableForWithdrawal;
  @JsonProperty("cashBalance")
  private BigDecimal cashBalance;
  @JsonProperty("bondValue")
  private BigDecimal bondValue;
  @JsonProperty("cashReceipts")
  private BigDecimal cashReceipts;
  @JsonProperty("liquidationValue")
  private BigDecimal liquidationValue;
  @JsonProperty("longOptionMarketValue")
  private BigDecimal longOptionMarketValue;
  @JsonProperty("longStockValue")
  private BigDecimal longStockValue;
  @JsonProperty("moneyMarketFund")
  private BigDecimal moneyMarketFund;
  @JsonProperty("mutualFundValue")
  private BigDecimal mutualFundValue;
  @JsonProperty("shortOptionMarketValue")
  private BigDecimal shortOptionMarketValue;
  @JsonProperty("shortStockValue")
  private BigDecimal shortStockValue;
  @JsonProperty("isInCall")
  private Boolean isInCall;
  @JsonProperty("unsettledCash")
  private BigDecimal unsettledCash;
  @JsonProperty("cashDebitCallValue")
  private BigDecimal cashDebitCallValue;
  @JsonProperty("pendingDeposits")
  private BigDecimal pendingDeposits;
  @JsonProperty("accountValue")
  private BigDecimal accountValue;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public BigDecimal getAccruedInterest() {
    return accruedInterest;
  }

  public BigDecimal getCashAvailableForTrading() {
    return cashAvailableForTrading;
  }

  public BigDecimal getCashAvailableForWithdrawal() {
    return cashAvailableForWithdrawal;
  }

  public BigDecimal getCashBalance() {
    return cashBalance;
  }

  public BigDecimal getBondValue() {
    return bondValue;
  }

  public BigDecimal getCashReceipts() {
    return cashReceipts;
  }

  public BigDecimal getLiquidationValue() {
    return liquidationValue;
  }

  public BigDecimal getLongOptionMarketValue() {
    return longOptionMarketValue;
  }

  public BigDecimal getLongStockValue() {
    return longStockValue;
  }

  public BigDecimal getMoneyMarketFund() {
    return moneyMarketFund;
  }

  public BigDecimal getMutualFundValue() {
    return mutualFundValue;
  }

  public BigDecimal getShortOptionMarketValue() {
    return shortOptionMarketValue;
  }

  public BigDecimal getShortStockValue() {
    return shortStockValue;
  }

  public Boolean getInCall() {
    return isInCall;
  }

  public BigDecimal getUnsettledCash() {
    return unsettledCash;
  }

  public BigDecimal getCashDebitCallValue() {
    return cashDebitCallValue;
  }

  public BigDecimal getPendingDeposits() {
    return pendingDeposits;
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
        .append("cashAvailableForTrading", cashAvailableForTrading)
        .append("cashAvailableForWithdrawal", cashAvailableForWithdrawal)
        .append("cashBalance", cashBalance)
        .append("bondValue", bondValue)
        .append("cashReceipts", cashReceipts)
        .append("liquidationValue", liquidationValue)
        .append("longOptionMarketValue", longOptionMarketValue)
        .append("longStockValue", longStockValue)
        .append("moneyMarketFund", moneyMarketFund)
        .append("mutualFundValue", mutualFundValue)
        .append("shortOptionMarketValue", shortOptionMarketValue)
        .append("shortStockValue", shortStockValue)
        .append("isInCall", isInCall)
        .append("unsettledCash", unsettledCash)
        .append("cashDebitCallValue", cashDebitCallValue)
        .append("pendingDeposits", pendingDeposits)
        .append("accountValue", accountValue)
        .append("otherFields", otherFields)
        .toString();
  }
}

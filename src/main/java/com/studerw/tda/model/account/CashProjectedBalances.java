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
 * Projected Balances of a Cash Account
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CashProjectedBalances implements Serializable {

  private final static long serialVersionUID = 709713249137088431L;
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
  @JsonProperty("cashAvailableForTrading")
  private BigDecimal cashAvailableForTrading;
  @JsonProperty("cashAvailableForWithdrawal")
  private BigDecimal cashAvailableForWithdrawal;
  @JsonProperty("cashCall")
  private BigDecimal cashCall;
  @JsonProperty("longNonMarginableMarketValue")
  private BigDecimal longNonMarginableMarketValue;
  @JsonProperty("totalCash")
  private BigDecimal totalCash;
  @JsonProperty("shortOptionMarketValue")
  private BigDecimal shortOptionMarketValue;
  @JsonProperty("mutualFundValue")
  private BigDecimal mutualFundValue;
  @JsonProperty("bondValue")
  private BigDecimal bondValue;
  @JsonProperty("cashDebitCallValue")
  private BigDecimal cashDebitCallValue;
  @JsonProperty("unsettledCash")
  private BigDecimal unsettledCash;
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

    public BigDecimal getCashAvailableForTrading() {
        return cashAvailableForTrading;
    }

    public BigDecimal getCashAvailableForWithdrawal() {
        return cashAvailableForWithdrawal;
    }

    public BigDecimal getCashCall() {
        return cashCall;
    }

    public BigDecimal getLongNonMarginableMarketValue() {
        return longNonMarginableMarketValue;
    }

    public BigDecimal getTotalCash() {
        return totalCash;
    }

    public BigDecimal getShortOptionMarketValue() {
        return shortOptionMarketValue;
    }

    public BigDecimal getMutualFundValue() {
        return mutualFundValue;
    }

    public BigDecimal getBondValue() {
        return bondValue;
    }

    public BigDecimal getCashDebitCallValue() {
        return cashDebitCallValue;
    }

    public BigDecimal getUnsettledCash() {
        return unsettledCash;
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
            .append("cashAvailableForTrading", cashAvailableForTrading)
            .append("cashAvailableForWithdrawal", cashAvailableForWithdrawal)
            .append("cashCall", cashCall)
            .append("longNonMarginableMarketValue", longNonMarginableMarketValue)
            .append("totalCash", totalCash)
            .append("shortOptionMarketValue", shortOptionMarketValue)
            .append("mutualFundValue", mutualFundValue)
            .append("bondValue", bondValue)
            .append("cashDebitCallValue", cashDebitCallValue)
            .append("unsettledCash", unsettledCash)
            .append("otherFields", otherFields)
            .toString();
    }
}

package com.studerw.tda.model.transaction;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.studerw.tda.parse.LocalDateDeserializer;
import com.studerw.tda.parse.ZonedDateTimeDeserializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Transactions for a specific account.
 */
public class Transaction implements Serializable {

  private final static long serialVersionUID = -8809730378232169985L;

  @JsonProperty("type")
  private Transaction.Type type;

  @JsonProperty("clearingReferenceNumber")
  private String clearingReferenceNumber;

  @JsonProperty("subAccount")
  private String subAccount;

  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonProperty("settlementDate")
  private LocalDate settlementDate;

  @JsonProperty("orderId")
  private String orderId;

  @JsonProperty("sma")
  private BigDecimal sma;

  @JsonProperty("requirementReallocationAmount")
  private BigDecimal requirementReallocationAmount;

  @JsonProperty("dayTradeBuyingPowerEffect")
  private BigDecimal dayTradeBuyingPowerEffect;

  @JsonProperty("netAmount")
  private BigDecimal netAmount;

  @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
  @JsonProperty("transactionDate")
  private ZonedDateTime transactionDate;

  @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
  @JsonProperty("orderDate")
  private ZonedDateTime orderDate;

  @JsonProperty("transactionSubType")
  private String transactionSubType;

  @JsonProperty("transactionId")
  private Long transactionId;

  @JsonProperty("cashBalanceEffectFlag")
  private Boolean cashBalanceEffectFlag = false;

  @JsonProperty("description")
  private String description;

  @JsonProperty("achStatus")
  private Transaction.AchStatus achStatus;

  @JsonProperty("accruedInterest")
  private BigDecimal accruedInterest;

  @JsonProperty("fees")
  private Fees fees;

  @JsonProperty("transactionItem")
  private TransactionItem transactionItem;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public Type getType() {
    return type;
  }

  public String getClearingReferenceNumber() {
    return clearingReferenceNumber;
  }

  public String getSubAccount() {
    return subAccount;
  }

  public LocalDate getSettlementDate() {
    return settlementDate;
  }

  public String getOrderId() {
    return orderId;
  }

  public BigDecimal getSma() {
    return sma;
  }

  public BigDecimal getRequirementReallocationAmount() {
    return requirementReallocationAmount;
  }

  public BigDecimal getDayTradeBuyingPowerEffect() {
    return dayTradeBuyingPowerEffect;
  }

  public BigDecimal getNetAmount() {
    return netAmount;
  }

  public ZonedDateTime getTransactionDate() {
    return transactionDate;
  }

  public ZonedDateTime getOrderDate() {
    return orderDate;
  }

  public String getTransactionSubType() {
    return transactionSubType;
  }

  public Long getTransactionId() {
    return transactionId;
  }

  public Boolean getCashBalanceEffectFlag() {
    return cashBalanceEffectFlag;
  }

  public String getDescription() {
    return description;
  }

  public AchStatus getAchStatus() {
    return achStatus;
  }

  public BigDecimal getAccruedInterest() {
    return accruedInterest;
  }

  public Fees getFees() {
    return fees;
  }

  public TransactionItem getTransactionItem() {
    return transactionItem;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("type", type)
        .append("clearingReferenceNumber", clearingReferenceNumber)
        .append("subAccount", subAccount)
        .append("settlementDate", settlementDate)
        .append("orderId", orderId)
        .append("sma", sma)
        .append("requirementReallocationAmount", requirementReallocationAmount)
        .append("dayTradeBuyingPowerEffect", dayTradeBuyingPowerEffect)
        .append("netAmount", netAmount)
        .append("transactionDate", transactionDate)
        .append("orderDate", orderDate)
        .append("transactionSubType", transactionSubType)
        .append("transactionId", transactionId)
        .append("cashBalanceEffectFlag", cashBalanceEffectFlag)
        .append("description", description)
        .append("achStatus", achStatus)
        .append("accruedInterest", accruedInterest)
        .append("fees", fees)
        .append("transactionItem", transactionItem)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum AchStatus {
    APPROVED,
    REJECTED,
    CANCEL,
    ERROR
  }

  public enum Type {
    TRADE,
    RECEIVE_AND_DELIVER,
    DIVIDEND_OR_INTEREST,
    ACH_RECEIPT,
    ACH_DISBURSEMENT,
    CASH_RECEIPT,
    CASH_DISBURSEMENT,
    ELECTRONIC_FUND,
    WIRE_OUT,
    WIRE_IN,
    JOURNAL,
    MEMORANDUM,
    MARGIN_CALL,
    MONEY_MARKET,
    SMA_ADJUSTMENT
  }

}

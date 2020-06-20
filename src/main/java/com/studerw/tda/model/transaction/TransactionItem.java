package com.studerw.tda.model.transaction;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TransactionItem implements Serializable {

  private final static long serialVersionUID = 5181974187922897164L;

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("cost")
  private BigDecimal cost;

  @JsonProperty("parentOrderKey")
  private Long parentOrderKey;

  @JsonProperty("parentChildIndicator")
  private String parentChildIndicator;

  @JsonProperty("instruction")
  private TransactionItem.Instruction instruction;

  @JsonProperty("positionEffect")
  private TransactionItem.PositionEffect positionEffect;

  @JsonProperty("instrument")
  private Instrument instrument;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

    public Long getAccountId() {
        return accountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public Long getParentOrderKey() {
        return parentOrderKey;
    }

    public String getParentChildIndicator() {
        return parentChildIndicator;
    }

    public Instruction getInstruction() {
        return instruction;
    }

    public PositionEffect getPositionEffect() {
        return positionEffect;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @JsonIgnore
    public Map<String, Object> getOtherFields() {
        return otherFields;
    }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("accountId", accountId)
        .append("amount", amount)
        .append("price", price)
        .append("cost", cost)
        .append("parentOrderKey", parentOrderKey)
        .append("parentChildIndicator", parentChildIndicator)
        .append("instruction", instruction)
        .append("positionEffect", positionEffect)
        .append("instrument", instrument)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum Instruction {
    BUY,
    SELL
  }

  public enum PositionEffect {
    OPENING,
    CLOSING,
    AUTOMATIC
  }
}

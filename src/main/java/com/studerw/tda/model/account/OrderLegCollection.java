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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderLegCollection implements Serializable {

  private final static long serialVersionUID = -6019542088004898750L;

  @JsonProperty("orderLegType")
  private OrderLegType orderLegType;
  @JsonProperty("legId")
  private Long legId;
  @JsonProperty("instruction")
  private Instruction instruction;
  @JsonProperty("positionEffect")
  private PositionEffect positionEffect;
  @JsonProperty("quantity")
  private BigDecimal quantity;
  @JsonProperty("quantityType")
  private QuantityType quantityType;
  @JsonProperty("instrument")
  private Instrument instrument;
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public OrderLegType getOrderLegType() {
    return orderLegType;
  }

  public Long getLegId() {
    return legId;
  }

  public Instruction getInstruction() {
    return instruction;
  }

  public PositionEffect getPositionEffect() {
    return positionEffect;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public QuantityType getQuantityType() {
    return quantityType;
  }

  public Instrument getInstrument() {
    return instrument;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  public void setOrderLegType(OrderLegType orderLegType) {
    this.orderLegType = orderLegType;
  }

  public void setLegId(Long legId) {
    this.legId = legId;
  }

  public void setInstruction(Instruction instruction) {
    this.instruction = instruction;
  }

  public void setPositionEffect(
      PositionEffect positionEffect) {
    this.positionEffect = positionEffect;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public void setQuantityType(QuantityType quantityType) {
    this.quantityType = quantityType;
  }

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("orderLegType", orderLegType)
        .append("legId", legId)
        .append("instruction", instruction)
        .append("positionEffect", positionEffect)
        .append("quantity", quantity)
        .append("quantityType", quantityType)
        .append("instrument", instrument)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum Instruction {
    BUY,
    SELL,
    BUY_TO_COVER,
    SELL_SHORT,
    BUY_TO_OPEN,
    BUY_TO_CLOSE,
    SELL_TO_OPEN,
    SELL_TO_CLOSE,
    EXCHANGE
  }

  public enum OrderLegType {
    CASH_EQUIVALENT,
    CURRENCY,
    EQUITY,
    FIXED_INCOME,
    INDEX,
    MUTUAL_FUND,
    OPTION,
  }

  public enum PositionEffect {
    OPENING,
    CLOSING,
    AUTOMATIC
  }

  public enum QuantityType {
    ALL_SHARES,
    DOLLARS,
    SHARES
  }
}

package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.studerw.tda.parse.LocalDateDeserializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderStrategy implements Serializable {

  private final static long serialVersionUID = 8230751877078177259L;

  @JsonProperty("session")
  private Session session;

  @JsonProperty("duration")
  private Duration duration;

  @JsonProperty("orderType")
  private OrderType orderType;

  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonProperty("cancelTime")
  private LocalDate cancelTime;

  @JsonProperty("complexOrderStrategyType")
  private ComplexOrderStrategyType complexOrderStrategyType;

  @JsonProperty("quantity")
  private BigDecimal quantity;

  @JsonProperty("filledQuantity")
  private BigDecimal filledQuantity;

  @JsonProperty("remainingQuantity")
  private BigDecimal remainingQuantity;

  @JsonProperty("requestedDestination")
  private RequestedDestination requestedDestination;

  @JsonProperty("destinationLinkName")
  private String destinationLinkName;

  @JsonProperty("releaseTime")
  private String releaseTime;

  @JsonProperty("stopPrice")
  private BigDecimal stopPrice;

  @JsonProperty("stopPriceLinkBasis")
  private StopPriceLinkBasis stopPriceLinkBasis;

  @JsonProperty("stopPriceLinkType")
  private StopPriceLinkType stopPriceLinkType;

  @JsonProperty("stopPriceOffset")
  private BigDecimal stopPriceOffset;

  @JsonProperty("stopType")
  private StopType stopType;

  @JsonProperty("priceLinkBasis")
  private PriceLinkBasis priceLinkBasis;

  @JsonProperty("priceLinkType")
  private PriceLinkType priceLinkType;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("taxLotMethod")
  private TaxLotMethod taxLotMethod;

  @JsonProperty("orderLegCollection")
  private List<OrderLegCollection> orderLegCollection = new ArrayList<>();

  @JsonProperty("activationPrice")
  private BigDecimal activationPrice;

  @JsonProperty("specialInstruction")
  private SpecialInstruction specialInstruction;

  @JsonProperty("orderStrategyType")
  private OrderStrategyType orderStrategyType;

  @JsonProperty("orderId")
  private Long orderId;

  @JsonProperty("cancelable")
  private Boolean cancelable;

  @JsonProperty("editable")
  private Boolean editable;

  @JsonProperty("status")
  private Status status;

  @JsonProperty("enteredTime")
  private String enteredTime;

  @JsonProperty("closeTime")
  private String closeTime;

  @JsonProperty("tag")
  private String tag;

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("orderActivityCollection")
  private List<OrderActivity> orderActivityCollection = new ArrayList<>();

  @JsonProperty("replacingOrderCollection")
  private List<Object> replacingOrderCollection = new ArrayList<>();

  @JsonProperty("childOrderStrategies")
  private List<OrderStrategy> childOrderStrategies = new ArrayList<>();

  @JsonProperty("statusDescription")
  private String statusDescription;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public Session getSession() {
    return session;
  }

  public Duration getDuration() {
    return duration;
  }

  public OrderType getOrderType() {
    return orderType;
  }

  public LocalDate getCancelTime() {
    return cancelTime;
  }

  public ComplexOrderStrategyType getComplexOrderStrategyType() {
    return complexOrderStrategyType;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public BigDecimal getFilledQuantity() {
    return filledQuantity;
  }

  public BigDecimal getRemainingQuantity() {
    return remainingQuantity;
  }

  public RequestedDestination getRequestedDestination() {
    return requestedDestination;
  }

  public String getDestinationLinkName() {
    return destinationLinkName;
  }

  public String getReleaseTime() {
    return releaseTime;
  }

  public BigDecimal getStopPrice() {
    return stopPrice;
  }

  public StopPriceLinkBasis getStopPriceLinkBasis() {
    return stopPriceLinkBasis;
  }

  public StopPriceLinkType getStopPriceLinkType() {
    return stopPriceLinkType;
  }

  public BigDecimal getStopPriceOffset() {
    return stopPriceOffset;
  }

  public StopType getStopType() {
    return stopType;
  }

  public PriceLinkBasis getPriceLinkBasis() {
    return priceLinkBasis;
  }

  public PriceLinkType getPriceLinkType() {
    return priceLinkType;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public TaxLotMethod getTaxLotMethod() {
    return taxLotMethod;
  }

  public List<OrderLegCollection> getOrderLegCollection() {
    return orderLegCollection;
  }

  public BigDecimal getActivationPrice() {
    return activationPrice;
  }

  public SpecialInstruction getSpecialInstruction() {
    return specialInstruction;
  }

  public OrderStrategyType getOrderStrategyType() {
    return orderStrategyType;
  }

  public Long getOrderId() {
    return orderId;
  }

  public Boolean getCancelable() {
    return cancelable;
  }

  public Boolean getEditable() {
    return editable;
  }

  public Status getStatus() {
    return status;
  }

  public String getEnteredTime() {
    return enteredTime;
  }

  public String getCloseTime() {
    return closeTime;
  }

  public String getTag() {
    return tag;
  }

  public Long getAccountId() {
    return accountId;
  }

  public List<OrderActivity> getOrderActivityCollection() {
    return orderActivityCollection;
  }

  public List<Object> getReplacingOrderCollection() {
    return replacingOrderCollection;
  }

  public List<OrderStrategy> getChildOrderStrategies() {
    return childOrderStrategies;
  }

  public String getStatusDescription() {
    return statusDescription;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("session", session)
        .append("duration", duration)
        .append("orderType", orderType)
        .append("cancelTime", cancelTime)
        .append("complexOrderStrategyType", complexOrderStrategyType)
        .append("quantity", quantity)
        .append("filledQuantity", filledQuantity)
        .append("remainingQuantity", remainingQuantity)
        .append("requestedDestination", requestedDestination)
        .append("destinationLinkName", destinationLinkName)
        .append("releaseTime", releaseTime)
        .append("stopPrice", stopPrice)
        .append("stopPriceLinkBasis", stopPriceLinkBasis)
        .append("stopPriceLinkType", stopPriceLinkType)
        .append("stopPriceOffset", stopPriceOffset)
        .append("stopType", stopType)
        .append("priceLinkBasis", priceLinkBasis)
        .append("priceLinkType", priceLinkType)
        .append("price", price)
        .append("taxLotMethod", taxLotMethod)
        .append("orderLegCollection", orderLegCollection)
        .append("activationPrice", activationPrice)
        .append("specialInstruction", specialInstruction)
        .append("orderStrategyType", orderStrategyType)
        .append("orderId", orderId)
        .append("cancelable", cancelable)
        .append("editable", editable)
        .append("status", status)
        .append("enteredTime", enteredTime)
        .append("closeTime", closeTime)
        .append("tag", tag)
        .append("accountId", accountId)
        .append("orderActivityCollection", orderActivityCollection)
        .append("replacingOrderCollection", replacingOrderCollection)
        .append("childOrderStrategies", childOrderStrategies)
        .append("statusDescription", statusDescription)
        .append("otherFields", otherFields)
        .toString();
  }
}


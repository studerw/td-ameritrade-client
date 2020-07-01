package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.studerw.tda.parse.LocalDateDeserializer;
import com.studerw.tda.parse.ZonedDateTimeDeserializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Order both sent and received when making trades. Some of the easier examples are described on the
 * TDA Developer page.
 *
 * @see <a href="https://developer.tdameritrade.com/content/place-order-samples">Place Order Samples</a>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Order implements Serializable {

  private final static long serialVersionUID = 8347583371582106837L;

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
  private Date releaseTime;

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

  @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
  @JsonProperty("enteredTime")
  private ZonedDateTime enteredTime;

  @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
  @JsonProperty("closeTime")
  private ZonedDateTime closeTime;

  @JsonProperty("tag")
  private String tag;

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("orderActivityCollection")
  private List<OrderActivity> orderActivityCollection = new ArrayList<>();

  @JsonProperty("replacingOrderCollection")
  private List<Object> replacingOrderCollection = new ArrayList<>();

  @JsonProperty("childOrderStrategies")
  private List<Object> childOrderStrategies = new ArrayList<>();

  @JsonProperty("statusDescription")
  private String statusDescription;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public Session getSession() {
    return session;
  }

  public void setSession(Session session) {
    this.session = session;
  }

  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  public OrderType getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderType orderType) {
    this.orderType = orderType;
  }

  public LocalDate getCancelTime() {
    return cancelTime;
  }

  public void setCancelTime(LocalDate cancelTime) {
    this.cancelTime = cancelTime;
  }

  public ComplexOrderStrategyType getComplexOrderStrategyType() {
    return complexOrderStrategyType;
  }

  public void setComplexOrderStrategyType(
      ComplexOrderStrategyType complexOrderStrategyType) {
    this.complexOrderStrategyType = complexOrderStrategyType;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public BigDecimal getFilledQuantity() {
    return filledQuantity;
  }

  public void setFilledQuantity(BigDecimal filledQuantity) {
    this.filledQuantity = filledQuantity;
  }

  public BigDecimal getRemainingQuantity() {
    return remainingQuantity;
  }

  public void setRemainingQuantity(BigDecimal remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }

  public RequestedDestination getRequestedDestination() {
    return requestedDestination;
  }

  public void setRequestedDestination(
      RequestedDestination requestedDestination) {
    this.requestedDestination = requestedDestination;
  }

  public String getDestinationLinkName() {
    return destinationLinkName;
  }

  public void setDestinationLinkName(String destinationLinkName) {
    this.destinationLinkName = destinationLinkName;
  }

  public Date getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }

  public BigDecimal getStopPrice() {
    return stopPrice;
  }

  public void setStopPrice(BigDecimal stopPrice) {
    this.stopPrice = stopPrice;
  }

  public StopPriceLinkBasis getStopPriceLinkBasis() {
    return stopPriceLinkBasis;
  }

  public void setStopPriceLinkBasis(
      StopPriceLinkBasis stopPriceLinkBasis) {
    this.stopPriceLinkBasis = stopPriceLinkBasis;
  }

  public StopPriceLinkType getStopPriceLinkType() {
    return stopPriceLinkType;
  }

  public void setStopPriceLinkType(StopPriceLinkType stopPriceLinkType) {
    this.stopPriceLinkType = stopPriceLinkType;
  }

  public BigDecimal getStopPriceOffset() {
    return stopPriceOffset;
  }

  public void setStopPriceOffset(BigDecimal stopPriceOffset) {
    this.stopPriceOffset = stopPriceOffset;
  }

  public StopType getStopType() {
    return stopType;
  }

  public void setStopType(StopType stopType) {
    this.stopType = stopType;
  }

  public PriceLinkBasis getPriceLinkBasis() {
    return priceLinkBasis;
  }

  public void setPriceLinkBasis(PriceLinkBasis priceLinkBasis) {
    this.priceLinkBasis = priceLinkBasis;
  }

  public PriceLinkType getPriceLinkType() {
    return priceLinkType;
  }

  public void setPriceLinkType(PriceLinkType priceLinkType) {
    this.priceLinkType = priceLinkType;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public TaxLotMethod getTaxLotMethod() {
    return taxLotMethod;
  }

  public void setTaxLotMethod(TaxLotMethod taxLotMethod) {
    this.taxLotMethod = taxLotMethod;
  }

  public List<OrderLegCollection> getOrderLegCollection() {
    return orderLegCollection;
  }

  public void setOrderLegCollection(
      List<OrderLegCollection> orderLegCollection) {
    this.orderLegCollection = orderLegCollection;
  }

  public BigDecimal getActivationPrice() {
    return activationPrice;
  }

  public void setActivationPrice(BigDecimal activationPrice) {
    this.activationPrice = activationPrice;
  }

  public SpecialInstruction getSpecialInstruction() {
    return specialInstruction;
  }

  public void setSpecialInstruction(SpecialInstruction specialInstruction) {
    this.specialInstruction = specialInstruction;
  }

  public OrderStrategyType getOrderStrategyType() {
    return orderStrategyType;
  }

  public void setOrderStrategyType(OrderStrategyType orderStrategyType) {
    this.orderStrategyType = orderStrategyType;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Boolean getCancelable() {
    return cancelable;
  }

  public void setCancelable(Boolean cancelable) {
    this.cancelable = cancelable;
  }

  public Boolean getEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public ZonedDateTime getEnteredTime() {
    return enteredTime;
  }

  public void setEnteredTime(ZonedDateTime enteredTime) {
    this.enteredTime = enteredTime;
  }

  public ZonedDateTime getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(ZonedDateTime closeTime) {
    this.closeTime = closeTime;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public List<OrderActivity> getOrderActivityCollection() {
    return orderActivityCollection;
  }

  public void setOrderActivityCollection(
      List<OrderActivity> orderActivityCollection) {
    this.orderActivityCollection = orderActivityCollection;
  }

  public List<Object> getReplacingOrderCollection() {
    return replacingOrderCollection;
  }

  public void setReplacingOrderCollection(List<Object> replacingOrderCollection) {
    this.replacingOrderCollection = replacingOrderCollection;
  }

  public List<Object> getChildOrderStrategies() {
    return childOrderStrategies;
  }

  public void setChildOrderStrategies(List<Object> childOrderStrategies) {
    this.childOrderStrategies = childOrderStrategies;
  }

  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
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

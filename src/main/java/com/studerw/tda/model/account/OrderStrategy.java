package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderStrategy implements Serializable {

  private final static long serialVersionUID = 8230751877078177259L;

  @JsonProperty("session")
  private Session session;
  @JsonProperty("duration")
  private Duration duration;
  @JsonProperty("orderType")
  private OrderType orderType;
  @JsonProperty("cancelTime")
  private CancelTime cancelTime;
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
  private Boolean cancelable = false;
  @JsonProperty("editable")
  private Boolean editable = false;
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
  private List<OrderActivityCollection> orderActivityCollection = new ArrayList<OrderActivityCollection>();
  @JsonProperty("replacingOrderCollection")
  private List<Object> replacingOrderCollection = new ArrayList<Object>();
  @JsonProperty("childOrderStrategies")
  private List<OrderStrategy> childOrderStrategies = new ArrayList<>();
  @JsonProperty("statusDescription")
  private String statusDescription;

  public Session getSession() {
    return session;
  }

  public Duration getDuration() {
    return duration;
  }

  public OrderType getOrderType() {
    return orderType;
  }

  public CancelTime getCancelTime() {
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

  public List<OrderActivityCollection> getOrderActivityCollection() {
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
        .toString();
  }

  public enum ComplexOrderStrategyType {
    NONE,
    COVERED,
    VERTICAL,
    BACK_RATIO,
    CALENDAR,
    DIAGONAL,
    STRADDLE,
    STRANGLE,
    COLLAR_SYNTHETIC,
    BUTTERFLY,
    CONDOR,
    IRON_CONDOR,
    VERTICAL_ROLL,
    COLLAR_WITH_STOCK,
    DOUBLE_DIAGONAL,
    UNBALANCED_BUTTERFLY,
    UNBALANCED_CONDOR,
    UNBALANCED_IRON_CONDOR,
    UNBALANCED_VERTICAL_ROLL,
    CUSTOM
  }

  public enum Duration {
    DAY,
    GOOD_TILL_CANCEL,
    FILL_OR_KILL
  }

  public enum OrderStrategyType {
    SINGLE,
    OCO,
    TRIGGER
  }

  public enum OrderType {
    MARKET,
    LIMIT,
    STOP,
    STOP_LIMIT,
    TRAILING_STOP,
    MARKET_ON_CLOSE,
    EXERCISE,
    TRAILING_STOP_LIMIT,
    NET_DEBIT,
    NET_CREDIT,
    NET_ZERO
  }

  public enum PriceLinkBasis {
    MANUAL,
    BASE,
    TRIGGER,
    LAST,
    BID,
    ASK,
    ASK_BID,
    MARK,
    AVERAGE
  }

  public enum PriceLinkType {
    VALUE,
    PERCENT,
    TICK,
  }

  public enum RequestedDestination {
    INET,
    ECN_ARCA,
    CBOE,
    AMEX,
    PHLX,
    ISE,
    BOX,
    NYSE,
    NASDAQ,
    BATS,
    C_2,
    AUTO
  }

  public enum Session {
    NORMAL,
    AM,
    PM,
    SEAMLESS
  }

  public enum SpecialInstruction {
    ALL_OR_NONE,
    DO_NOT_REDUCE,
    ALL_OR_NONE_DO_NOT_REDUCE
  }

  public enum Status {
    AWAITING_PARENT_ORDER,
    AWAITING_CONDITION,
    AWAITING_MANUAL_REVIEW,
    ACCEPTED,
    AWAITING_UR_OUT,
    PENDING_ACTIVATION,
    QUEUED,
    WORKING,
    REJECTED,
    PENDING_CANCEL,
    CANCELED,
    PENDING_REPLACE,
    REPLACED,
    FILLED,
    EXPIRED
  }

  public enum StopPriceLinkBasis {
    MANUAL,
    BASE,
    TRIGGER,
    LAST,
    BID,
    ASK,
    ASK_BID,
    MARK,
    AVERAGE
  }

  public enum StopPriceLinkType {
    VALUE,
    PERCENT,
    TICK
  }

  public enum StopType {
    STANDARD,
    BID,
    ASK,
    LAST,
    MARK
  }

  public enum TaxLotMethod {
    FIFO,
    LIFO,
    HIGH_COST,
    LOW_COST,
    AVERAGE_COST,
    SPECIFIC_LOT
  }
}

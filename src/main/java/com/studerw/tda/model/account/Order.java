package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.studerw.tda.parse.LocalDateDeserializer;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;


/**
 * Order both sent and received when making trades. Some of the easier examples are described on the
 * TDA Developer page.
 *
 * @see <a href="https://developer.tdameritrade.com/content/place-order-samples">Place Order Samples</a>
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Order implements Serializable {

  Session session;

  Duration duration;

  OrderType orderType;

  @JsonDeserialize(using = LocalDateDeserializer.class)
  LocalDate cancelTime;

  ComplexOrderStrategyType complexOrderStrategyType;

  BigDecimal quantity;

  BigDecimal filledQuantity;

  BigDecimal remainingQuantity;

  RequestedDestination requestedDestination;

  String destinationLinkName;

  Date releaseTime;

  BigDecimal stopPrice;

  StopPriceLinkBasis stopPriceLinkBasis;

  StopPriceLinkType stopPriceLinkType;

  BigDecimal stopPriceOffset;

  StopType stopType;

  PriceLinkBasis priceLinkBasis;

  PriceLinkType priceLinkType;

  BigDecimal price;

  TaxLotMethod taxLotMethod;

  List<OrderLegCollection> orderLegCollection = new ArrayList<>();

  BigDecimal activationPrice;

  SpecialInstruction specialInstruction;

  OrderStrategyType orderStrategyType;

  Long orderId;

  Boolean cancelable;

  Boolean editable;

  Status status;

  Date enteredTime;

  Date closeTime;

  String tag;

  Long accountId;

  List<OrderActivityCollection> orderActivityCollection = new ArrayList<>();

  List<Object> replacingOrderCollection = new ArrayList<>();

  List<Object> childOrderStrategies = new ArrayList<>();

  String statusDescription;

  @JsonAnySetter
  @JsonIgnore
  Map<String, Object> otherFields = new HashMap<>();

}

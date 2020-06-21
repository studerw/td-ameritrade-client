package com.studerw.tda.model.user;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * APIs to access user-authorized accounts and their preferences
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Preferences implements Serializable {

  private final static long serialVersionUID = 367415922626236109L;

  @JsonProperty("expressTrading")
  private Boolean expressTrading = false;
  @JsonProperty("directOptionsRouting")
  private Boolean directOptionsRouting = false;
  @JsonProperty("directEquityRouting")
  private Boolean directEquityRouting = false;
  @JsonProperty("defaultEquityOrderLegInstruction")
  private Preferences.DefaultEquityOrderLegInstruction defaultEquityOrderLegInstruction;
  @JsonProperty("defaultEquityOrderType")
  private Preferences.DefaultEquityOrderType defaultEquityOrderType;
  @JsonProperty("defaultEquityOrderPriceLinkType")
  private Preferences.DefaultEquityOrderPriceLinkType defaultEquityOrderPriceLinkType;
  @JsonProperty("defaultEquityOrderDuration")
  private Preferences.DefaultEquityOrderDuration defaultEquityOrderDuration;
  @JsonProperty("defaultEquityOrderMarketSession")
  private Preferences.DefaultEquityOrderMarketSession defaultEquityOrderMarketSession;
  @JsonProperty("defaultEquityQuantity")
  private Long defaultEquityQuantity;
  @JsonProperty("mutualFundTaxLotMethod")
  private Preferences.MutualFundTaxLotMethod mutualFundTaxLotMethod;
  @JsonProperty("optionTaxLotMethod")
  private Preferences.OptionTaxLotMethod optionTaxLotMethod;
  @JsonProperty("equityTaxLotMethod")
  private Preferences.EquityTaxLotMethod equityTaxLotMethod;
  @JsonProperty("defaultAdvancedToolLaunch")
  private Preferences.DefaultAdvancedToolLaunch defaultAdvancedToolLaunch;
  @JsonProperty("authTokenTimeout")
  private Preferences.AuthTokenTimeout authTokenTimeout;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public Boolean isExpressTrading() {
    return expressTrading;
  }

  public Boolean isDirectOptionsRouting() {
    return directOptionsRouting;
  }

  public Boolean isDirectEquityRouting() {
    return directEquityRouting;
  }

  public Preferences.DefaultEquityOrderLegInstruction getDefaultEquityOrderLegInstruction() {
    return defaultEquityOrderLegInstruction;
  }

  public Preferences.DefaultEquityOrderType getDefaultEquityOrderType() {
    return defaultEquityOrderType;
  }

  public Preferences.DefaultEquityOrderPriceLinkType getDefaultEquityOrderPriceLinkType() {
    return defaultEquityOrderPriceLinkType;
  }

  public Preferences.DefaultEquityOrderDuration getDefaultEquityOrderDuration() {
    return defaultEquityOrderDuration;
  }

  public Preferences.DefaultEquityOrderMarketSession getDefaultEquityOrderMarketSession() {
    return defaultEquityOrderMarketSession;
  }

  public Long getDefaultEquityQuantity() {
    return defaultEquityQuantity;
  }

  public Preferences.MutualFundTaxLotMethod getMutualFundTaxLotMethod() {
    return mutualFundTaxLotMethod;
  }

  public Preferences.OptionTaxLotMethod getOptionTaxLotMethod() {
    return optionTaxLotMethod;
  }

  public Preferences.EquityTaxLotMethod getEquityTaxLotMethod() {
    return equityTaxLotMethod;
  }

  public Preferences.DefaultAdvancedToolLaunch getDefaultAdvancedToolLaunch() {
    return defaultAdvancedToolLaunch;
  }

  public Preferences.AuthTokenTimeout getAuthTokenTimeout() {
    return authTokenTimeout;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("expressTrading", expressTrading)
        .append("directOptionsRouting", directOptionsRouting)
        .append("directEquityRouting", directEquityRouting)
        .append("defaultEquityOrderLegInstruction", defaultEquityOrderLegInstruction)
        .append("defaultEquityOrderType", defaultEquityOrderType)
        .append("defaultEquityOrderPriceLinkType", defaultEquityOrderPriceLinkType)
        .append("defaultEquityOrderDuration", defaultEquityOrderDuration)
        .append("defaultEquityOrderMarketSession", defaultEquityOrderMarketSession)
        .append("defaultEquityQuantity", defaultEquityQuantity)
        .append("mutualFundTaxLotMethod", mutualFundTaxLotMethod)
        .append("optionTaxLotMethod", optionTaxLotMethod)
        .append("equityTaxLotMethod", equityTaxLotMethod)
        .append("defaultAdvancedToolLaunch", defaultAdvancedToolLaunch)
        .append("authTokenTimeout", authTokenTimeout)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum AuthTokenTimeout {
    FIFTY_FIVE_MINUTES,
    TWO_HOURS,
    FOUR_HOURS,
    EIGHT_HOURS
  }

  public enum DefaultAdvancedToolLaunch {
    TA,
    N,
    Y,
    TOS,
    NONE,
    CC_2
  }

  public enum DefaultEquityOrderDuration {
    DAY,
    GOOD_TILL_CANCEL,
    NONE
  }

  public enum DefaultEquityOrderLegInstruction {
    BUY,
    SELL,
    BUY_TO_COVER,
    SELL_SHORT,
    NONE
  }

  public enum DefaultEquityOrderMarketSession {
    AM,
    PM,
    NORMAL,
    SEAMLESS,
    NONE
  }

  public enum DefaultEquityOrderPriceLinkType {
    VALUE,
    PERCENT,
    NONE
  }

  public enum DefaultEquityOrderType {
    MARKET,
    LIMIT,
    STOP,
    STOP_LIMIT,
    TRAILING_STOP,
    MARKET_ON_CLOSE,
    NONE
  }

  public enum EquityTaxLotMethod {
    FIFO,
    LIFO,
    HIGH_COST,
    LOW_COST,
    MINIMUM_TAX,
    AVERAGE_COST,
    NONE
  }

  public enum MutualFundTaxLotMethod {
    FIFO,
    LIFO,
    HIGH_COST,
    LOW_COST,
    MINIMUM_TAX,
    AVERAGE_COST,
    NONE
  }

  public enum OptionTaxLotMethod {
    FIFO,
    LIFO,
    HIGH_COST,
    LOW_COST,
    MINIMUM_TAX,
    AVERAGE_COST,
    NONE
  }
}

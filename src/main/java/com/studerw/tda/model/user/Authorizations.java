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

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Authorizations implements Serializable {

  private final static long serialVersionUID = 4389034125369772986L;

  @JsonProperty("apex")
  private Boolean apex = false;

  @JsonProperty("levelTwoQuotes")
  private Boolean levelTwoQuotes = false;

  @JsonProperty("stockTrading")
  private Boolean stockTrading = false;

  @JsonProperty("marginTrading")
  private Boolean marginTrading = false;

  @JsonProperty("streamingNews")
  private Boolean streamingNews = false;

  @JsonProperty("optionTradingLevel")
  private Authorizations.OptionTradingLevel optionTradingLevel;

  @JsonProperty("streamerAccess")
  private Boolean streamerAccess = false;

  @JsonProperty("advancedMargin")
  private Boolean advancedMargin = false;

  @JsonProperty("scottradeAccount")
  private Boolean scottradeAccount = false;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public Boolean getApex() {
    return apex;
  }

  public Boolean getLevelTwoQuotes() {
    return levelTwoQuotes;
  }

  public Boolean getStockTrading() {
    return stockTrading;
  }

  public Boolean getMarginTrading() {
    return marginTrading;
  }

  public Boolean getStreamingNews() {
    return streamingNews;
  }

  public Authorizations.OptionTradingLevel getOptionTradingLevel() {
    return optionTradingLevel;
  }

  public Boolean getStreamerAccess() {
    return streamerAccess;
  }

  public Boolean getAdvancedMargin() {
    return advancedMargin;
  }

  public Boolean getScottradeAccount() {
    return scottradeAccount;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("apex", apex)
        .append("levelTwoQuotes", levelTwoQuotes)
        .append("stockTrading", stockTrading)
        .append("marginTrading", marginTrading)
        .append("streamingNews", streamingNews)
        .append("optionTradingLevel", optionTradingLevel)
        .append("streamerAccess", streamerAccess)
        .append("advancedMargin", advancedMargin)
        .append("scottradeAccount", scottradeAccount)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum OptionTradingLevel {
    COVERED,
    FULL,
    LONG,
    SPREAD,
    NONE
  }

}

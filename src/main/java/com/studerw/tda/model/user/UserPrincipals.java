package com.studerw.tda.model.user;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.studerw.tda.parse.ZonedDateTimeDeserializer;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * User Principal Details
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserPrincipals implements Serializable {

  private final static long serialVersionUID = 705289594017933997L;

  @JsonProperty("authToken")
  private String authToken;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("userCdDomainId")
  private String userCdDomainId;

  @JsonProperty("primaryAccountId")
  private String primaryAccountId;

  @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
  @JsonProperty("lastLoginTime")
  private ZonedDateTime lastLoginTime;

  @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
  @JsonProperty("tokenExpirationTime")
  private ZonedDateTime tokenExpirationTime;

  @JsonDeserialize(using = ZonedDateTimeDeserializer.class)
  @JsonProperty("loginTime")
  private ZonedDateTime loginTime;

  @JsonProperty("accessLevel")
  private String accessLevel;

  @JsonProperty("stalePassword")
  private Boolean stalePassword = false;

  @JsonProperty("streamerInfo")
  private StreamerInfo streamerInfo;

  @JsonProperty("professionalStatus")
  private UserPrincipals.ProfessionalStatus professionalStatus;

  @JsonProperty("quotes")
  private Quotes quotes;

  @JsonProperty("streamerSubscriptionKeys")
  private StreamerSubscriptionKeys streamerSubscriptionKeys;

  @JsonProperty("accounts")
  private List<Account> accounts = new ArrayList<Account>();

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public String getAuthToken() {
    return authToken;
  }

  public String getUserId() {
    return userId;
  }

  public String getUserCdDomainId() {
    return userCdDomainId;
  }

  public String getPrimaryAccountId() {
    return primaryAccountId;
  }

  public ZonedDateTime getLastLoginTime() {
    return lastLoginTime;
  }

  public ZonedDateTime getTokenExpirationTime() {
    return tokenExpirationTime;
  }

  public ZonedDateTime getLoginTime() {
    return loginTime;
  }

  public String getAccessLevel() {
    return accessLevel;
  }

  public Boolean getStalePassword() {
    return stalePassword;
  }

  public StreamerInfo getStreamerInfo() {
    return streamerInfo;
  }

  public UserPrincipals.ProfessionalStatus getProfessionalStatus() {
    return professionalStatus;
  }

  public Quotes getQuotes() {
    return quotes;
  }

  public StreamerSubscriptionKeys getStreamerSubscriptionKeys() {
    return streamerSubscriptionKeys;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("authToken", authToken)
        .append("userId", userId)
        .append("userCdDomainId", userCdDomainId)
        .append("primaryAccountId", primaryAccountId)
        .append("lastLoginTime", lastLoginTime)
        .append("tokenExpirationTime", tokenExpirationTime)
        .append("loginTime", loginTime)
        .append("accessLevel", accessLevel)
        .append("stalePassword", stalePassword)
        .append("streamerInfo", streamerInfo)
        .append("professionalStatus", professionalStatus)
        .append("quotes", quotes)
        .append("streamerSubscriptionKeys", streamerSubscriptionKeys)
        .append("accounts", accounts)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum ProfessionalStatus {
    PROFESSIONAL,
    NON_PROFESSIONAL,
    UNKNOWN_STATUS
  }
}

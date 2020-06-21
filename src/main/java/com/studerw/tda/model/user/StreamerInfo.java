package com.studerw.tda.model.user;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StreamerInfo implements Serializable {

  private final static long serialVersionUID = -4803888206156657934L;
  @JsonProperty("streamerBinaryUrl")
  private String streamerBinaryUrl;
  @JsonProperty("streamerSocketUrl")
  private String streamerSocketUrl;
  @JsonProperty("token")
  private String token;
  @JsonProperty("tokenTimestamp")
  private Date tokenTimestamp;
  @JsonProperty("userGroup")
  private String userGroup;
  @JsonProperty("accessLevel")
  private String accessLevel;
  @JsonProperty("acl")
  private String acl;
  @JsonProperty("appId")
  private String appId;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public String getStreamerBinaryUrl() {
    return streamerBinaryUrl;
  }

  public String getStreamerSocketUrl() {
    return streamerSocketUrl;
  }

  public String getToken() {
    return token;
  }

  public Date getTokenTimestamp() {
    return tokenTimestamp;
  }

  public String getUserGroup() {
    return userGroup;
  }

  public String getAccessLevel() {
    return accessLevel;
  }

  public String getAcl() {
    return acl;
  }

  public String getAppId() {
    return appId;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("streamerBinaryUrl", streamerBinaryUrl)
        .append("streamerSocketUrl", streamerSocketUrl)
        .append("token", token)
        .append("tokenTimestamp", tokenTimestamp)
        .append("userGroup", userGroup)
        .append("accessLevel", accessLevel)
        .append("acl", acl)
        .append("appId", appId)
        .append("otherFields", otherFields)
        .toString();
  }
}

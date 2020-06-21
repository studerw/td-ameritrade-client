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
public class Account implements Serializable {

  private final static long serialVersionUID = -909478113797558160L;

  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("accountCdDomainId")
  private String accountCdDomainId;

  @JsonProperty("company")
  private String company;

  @JsonProperty("segment")
  private String segment;

  @JsonProperty("surrogateIds")
  private SurrogateIds surrogateIds;

  @JsonProperty("preferences")
  private Preferences preferences;

  @JsonProperty("acl")
  private String acl;

  @JsonProperty("authorizations")
  private Authorizations authorizations;

  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public String getAccountId() {
    return accountId;
  }

  public String getDescription() {
    return description;
  }

  public String getDisplayName() {
    return displayName;
  }

  public String getAccountCdDomainId() {
    return accountCdDomainId;
  }

  public String getCompany() {
    return company;
  }

  public String getSegment() {
    return segment;
  }

  public SurrogateIds getSurrogateIds() {
    return surrogateIds;
  }

  public Preferences getPreferences() {
    return preferences;
  }

  public String getAcl() {
    return acl;
  }

  public Authorizations getAuthorizations() {
    return authorizations;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("accountId", accountId)
        .append("description", description)
        .append("displayName", displayName)
        .append("accountCdDomainId", accountCdDomainId)
        .append("company", company)
        .append("segment", segment)
        .append("surrogateIds", surrogateIds)
        .append("preferences", preferences)
        .append("acl", acl)
        .append("authorizations", authorizations)
        .append("otherFields", otherFields)
        .toString();
  }
}

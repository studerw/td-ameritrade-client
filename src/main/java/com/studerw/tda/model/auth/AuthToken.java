package com.studerw.tda.model.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * OAUTH2 response for acquiring new auth or refresh token
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AuthToken implements Serializable {

  private final static long serialVersionUID = -7714855788981020534L;
  public final static String GRANT_TYPE_PARAM = "grant_type";
  public final static String GRANT_TYPE_REFRESH = "refresh_token";
  public final static String GRANT_TYPE_AUTH = "authorization_code";
  public final static String ACCESS_TYPE_PARAM = "access_type";
  public final static String ACCESS_TYPE_OFFLINE = "offline";
  public final static String CLIENT_ID_PARAM = "client_id";
  public final static String REFRESH_TOKEN_PARAM = "refresh_token";

  @JsonProperty("access_token")
  private String accessToken;
  @JsonProperty("refresh_token")
  private String refreshToken;
  @JsonProperty("token_type")
  private String tokenType;
  @JsonProperty("expires_in")
  private Long expiresIn;
  @JsonProperty("scope")
  private String scope;
  @JsonProperty("refresh_token_expires_in")
  private Long refreshTokenExpiresIn;

  public String getAccessToken() {
    return accessToken;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public String getTokenType() {
    return tokenType;
  }

  public Long getExpiresIn() {
    return expiresIn;
  }

  public String getScope() {
    return scope;
  }

  public Long getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("accessToken", accessToken)
        .append("refreshToken", refreshToken)
        .append("tokenType", tokenType)
        .append("expiresIn", expiresIn)
        .append("scope", scope)
        .append("refreshTokenExpiresIn", refreshTokenExpiresIn)
        .toString();
  }
}

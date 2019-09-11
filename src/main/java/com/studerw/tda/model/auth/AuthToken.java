
package com.studerw.tda.model.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;


/**
 * OAUTH2 response for acquiring new auth or refresh token
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "access_token",
    "refresh_token",
    "token_type",
    "expires_in",
    "scope",
    "refresh_token_expires_in"
})
public class AuthToken implements Serializable {

    public static String GRANT_TYPE_PARAM = "grant_type";
    public static String GRANT_TYPE_REFRESH = "refresh_token";
    public static String GRANT_TYPE_AUTH = "authorization_code";
    public static String ACCESS_TYPE_PARAM = "access_type";
    public static String ACCESS_TYPE_OFFLINE = "offline";
    public static String CLIENT_ID_PARAM = "client_id";
    public static String REFRESH_TOKEN_PARAM = "refresh_token";

    private final static long serialVersionUID = -7714855788981020534L;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("refresh_token")
    private String refreshToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private Integer expiresIn;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("refresh_token_expires_in")
    private Integer refreshTokenExpiresIn;

    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    @JsonProperty("refresh_token")
    public String getRefreshToken() {
        return refreshToken;
    }

    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }

    @JsonProperty("expires_in")
    public Integer getExpiresIn() {
        return expiresIn;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("refresh_token_expires_in")
    public Integer getRefreshTokenExpiresIn() {
        return refreshTokenExpiresIn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthToken.class.getName()).append('@')
            .append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accessToken");
        sb.append('=');
        sb.append(((this.accessToken == null) ? "<null>" : this.accessToken));
        sb.append(',');
        sb.append("refreshToken");
        sb.append('=');
        sb.append(((this.refreshToken == null) ? "<null>" : this.refreshToken));
        sb.append(',');
        sb.append("tokenType");
        sb.append('=');
        sb.append(((this.tokenType == null) ? "<null>" : this.tokenType));
        sb.append(',');
        sb.append("expiresIn");
        sb.append('=');
        sb.append(((this.expiresIn == null) ? "<null>" : this.expiresIn));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null) ? "<null>" : this.scope));
        sb.append(',');
        sb.append("refreshTokenExpiresIn");
        sb.append('=');
        sb.append(((this.refreshTokenExpiresIn == null) ? "<null>" : this.refreshTokenExpiresIn));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.expiresIn == null) ? 0 : this.expiresIn.hashCode()));
        result = ((result * 31) + ((this.refreshTokenExpiresIn == null) ? 0
            : this.refreshTokenExpiresIn.hashCode()));
        result = ((result * 31) + ((this.scope == null) ? 0 : this.scope.hashCode()));
        result = ((result * 31) + ((this.accessToken == null) ? 0 : this.accessToken.hashCode()));
        result = ((result * 31) + ((this.tokenType == null) ? 0 : this.tokenType.hashCode()));
        result = ((result * 31) + ((this.refreshToken == null) ? 0 : this.refreshToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthToken) == false) {
            return false;
        }
        AuthToken rhs = ((AuthToken) other);
        return (
            ((((((this.expiresIn == rhs.expiresIn) || ((this.expiresIn != null) && this.expiresIn
                .equals(rhs.expiresIn))) && (
                (this.refreshTokenExpiresIn == rhs.refreshTokenExpiresIn) || (
                    (this.refreshTokenExpiresIn != null) && this.refreshTokenExpiresIn
                        .equals(rhs.refreshTokenExpiresIn)))) && ((this.scope == rhs.scope) || (
                (this.scope != null) && this.scope.equals(rhs.scope)))) && (
                (this.accessToken == rhs.accessToken) || ((this.accessToken != null)
                    && this.accessToken.equals(rhs.accessToken)))) && (
                (this.tokenType == rhs.tokenType) || ((this.tokenType != null) && this.tokenType
                    .equals(rhs.tokenType)))) && ((this.refreshToken == rhs.refreshToken) || (
                (this.refreshToken != null) && this.refreshToken.equals(rhs.refreshToken))));
    }

}

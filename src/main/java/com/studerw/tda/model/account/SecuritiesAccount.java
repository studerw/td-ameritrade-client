package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * TDA SecuritiesAccount. This is an abstract class and you need to check the {@link
 * SecuritiesAccount.Type} to cast to either a {@link CashAccount} or {@link MarginAccount}. For
 * example:
 *
 * <pre class="code">
 *   SecuritiesAccount account = tdaClient.getAccount("2342..");
 *   if (account.getType == SecuritiesAccount.Type.Cash){
 *     CashAccount cashAcct = (CashAccount)account;
 *   }
 *   else if (account.getType == SecuritiesAccount.Type.Margin){
 *       MarginAccount marginAcct = (MarginAccount)account;
 *   }
 *   ...
 * </pre>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonRootName("securitiesAccount")
@JsonTypeInfo(
    use = Id.NAME,
    property = "type",
    visible = true
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MarginAccount.class, name = "MARGIN"),
    @JsonSubTypes.Type(value = CashAccount.class, name = "CASH"),
})
public class SecuritiesAccount implements Serializable {

  private final static long serialVersionUID = -3030706788121803012L;

  @JsonProperty("type")
  private SecuritiesAccount.Type type;
  @JsonProperty("accountId")
  private String accountId;
  @JsonProperty("roundTrips")
  private Long roundTrips;
  @JsonProperty("isDayTrader")
  private Boolean isDayTrader;
  @JsonProperty("isClosingOnlyRestricted")
  private Boolean isClosingOnlyRestricted;
  @JsonProperty("positions")
  private List<Position> positions = new ArrayList<>();
  @JsonProperty("orderStrategies")
  private List<OrderStrategy> orderStrategies = new ArrayList<>();
  @JsonAnySetter
  private Map<String, Object> otherFields = new HashMap<>();

  public Type getType() {
    return type;
  }

  public String getAccountId() {
    return accountId;
  }

  public Long getRoundTrips() {
    return roundTrips;
  }

  public Boolean getDayTrader() {
    return isDayTrader;
  }

  public Boolean getIsClosingOnlyRestricted() {
    return isClosingOnlyRestricted;
  }

  public List<Position> getPositions() {
    return positions;
  }

  public List<OrderStrategy> getOrderStrategies() {
    return orderStrategies;
  }

  public Boolean getClosingOnlyRestricted() {
    return isClosingOnlyRestricted;
  }

  @JsonIgnore
  public Map<String, Object> getOtherFields() {
    return otherFields;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("type", type)
        .append("accountId", accountId)
        .append("roundTrips", roundTrips)
        .append("isDayTrader", isDayTrader)
        .append("isClosingOnlyRestricted", isClosingOnlyRestricted)
        .append("positions", positions)
        .append("orderStrategies", orderStrategies)
        .append("otherFields", otherFields)
        .toString();
  }

  public enum Type {
    CASH,
    MARGIN
  }
}

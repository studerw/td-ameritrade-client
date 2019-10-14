package com.studerw.tda.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * TDA MarginAccount. Most calls return an abstract {@link SecuritiesAccount} instead of the concrete
 * account type so you need to cast to either a {@link CashAccount} or
 * {@link MarginAccount}. For example:
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
 *
 */
public class MarginAccount extends SecuritiesAccount implements Serializable {

  @JsonProperty("currentBalances")
  MarginCurrentBalances currentBalances;
  @JsonProperty("initialBalances")
  MarginInitialBalances initialBalances;
  @JsonProperty("projectedBalances")
  MarginProjectedBalances projectedBalances;

  public MarginCurrentBalances getCurrentBalances() {
    return currentBalances;
  }

  public MarginInitialBalances getInitialBalances() {
    return initialBalances;
  }

  public MarginProjectedBalances getProjectedBalances() {
    return projectedBalances;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .appendSuper(super.toString())
        .append("currentBalances", currentBalances)
        .append("initialBalances", initialBalances)
        .append("projectedBalances", projectedBalances)
        .toString();
  }

}

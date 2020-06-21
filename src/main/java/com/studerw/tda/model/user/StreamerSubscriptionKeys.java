package com.studerw.tda.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StreamerSubscriptionKeys implements Serializable {

  private final static long serialVersionUID = -637282248561104982L;

  @JsonProperty("keys")
  private List<Key> keys = new ArrayList<Key>();

  public List<Key> getKeys() {
    return keys;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("keys", keys)
        .toString();
  }
}

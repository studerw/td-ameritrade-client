
package com.studerw.tda.model.markethours;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonRootName("sessionHours")
public class SessionHours implements Serializable {

    @JsonProperty("preMarket")
    private List<SessionStartEnd> preMarket;
    @JsonProperty("regularMarket")
    private List<SessionStartEnd> regularMarket;
    @JsonProperty("postMarket")
    private List<SessionStartEnd> postMarket;
    @JsonAnySetter
    private Map<String, Object> otherFields = new HashMap<>();

    public List<SessionStartEnd> getPreMarket() {
    return preMarket;
    }

    public void setPreMarket(List<SessionStartEnd> preMarket) {
    this.preMarket = preMarket;
    }

    public List<SessionStartEnd> getRegularMarket() {
    return regularMarket;
    }

    public void setRegularMarket(List<SessionStartEnd> regularMarket) {
    this.regularMarket = regularMarket;
    }

    public List<SessionStartEnd> getPostMarket() {
    return postMarket;
    }

    public void setPostMarket(List<SessionStartEnd> postMarket) {
    this.postMarket = postMarket;
    }

    @JsonIgnore
    public Map<String, Object> getOtherFields() {
        return otherFields;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("preMarket", preMarket).append("regularMarket", regularMarket).append("postMarket", postMarket).toString();
    }
}
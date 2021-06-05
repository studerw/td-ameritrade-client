
package com.studerw.tda.model.markethours;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonRootName("sessionStartEnd")
public class SessionStartEnd implements Serializable {

    @JsonProperty("start")
    private String start;
    @JsonProperty("end")
    private String end;
    @JsonAnySetter
    private Map<String, Object> otherFields = new HashMap<>();

    public String getStart() {
    return start;
    }

    public void setStart(String start) {
    this.start = start;
    }

    public String getEnd() {
    return end;
    }

    public void setEnd(String end) {
    this.end = end;
    }

    @JsonIgnore
    public Map<String, Object> getOtherFields() {
        return otherFields;
    }

    @Override
    public String toString() {
    return new ToStringBuilder(this)
            .append("start", start)
            .append("end", end)
            .toString();
    }
}

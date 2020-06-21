package com.studerw.tda.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurrogateIds implements Serializable {

  private final static long serialVersionUID = 6058893322472833778L;
}

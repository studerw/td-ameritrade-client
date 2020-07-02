package com.studerw.tda.model.stream;

import java.util.concurrent.atomic.AtomicInteger;

public class StreamingRequest {

  private static AtomicInteger requestId = new AtomicInteger(1);
  private Service service;
  private Integer requestid;

}

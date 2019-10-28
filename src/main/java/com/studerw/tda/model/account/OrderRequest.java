package com.studerw.tda.model.account;

import java.time.ZonedDateTime;

/**
 * Class used for simple order requests. If an empty request is sent, then all orders
 * from all valid dates will be returned for the account.
 *
 * If a {@code fromEnteredTime} is used, a {@code toEnteredTime} must also be used, and vice versa.
 * There is a 60 day max from today's date for the {@code fromEnteredTime} param.
 */
public class OrderRequest {
  private Integer maxResults;
  private ZonedDateTime fromEnteredTime;
  private ZonedDateTime toEnteredTime;
  private Status status;

  public OrderRequest() {
  }

  public OrderRequest(ZonedDateTime fromEnteredTime, ZonedDateTime toEnteredTime) {
    this.fromEnteredTime = fromEnteredTime;
    this.toEnteredTime = toEnteredTime;
  }

  public OrderRequest(Integer maxResults, ZonedDateTime fromEnteredTime, ZonedDateTime toEnteredTime,
      Status status) {
    this.maxResults = maxResults;
    this.fromEnteredTime = fromEnteredTime;
    this.toEnteredTime = toEnteredTime;
    this.status = status;
  }

  /**
   * @return The maximum number of orders to retrieve.
   */
  public Integer getMaxResults() {
    return maxResults;
  }

  /**
   * @param maxResults The maximum number of orders to retrieve.
   */
  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  /**
   * @return fromEnteredTime
   */
  public ZonedDateTime getFromEnteredTime() {
    return fromEnteredTime;
  }

  /**
   * @param fromEnteredTime Specifies that no orders entered before this time should be returned.
   * Date must be within 60 days from today's date. 'toEnteredTime' must also be set.
   */
  public void setFromEnteredTime(ZonedDateTime fromEnteredTime) {
    this.fromEnteredTime = fromEnteredTime;
  }

  /**
   * @return toEnteredTime
   */
  public ZonedDateTime getToEnteredTime() {
    return toEnteredTime;
  }

  /**
   * @param toEnteredTime Specifies that no orders entered after this time should be returned.
   * 'FromEnteredTime' must also be
   * set.
   */
  public void setToEnteredTime(ZonedDateTime toEnteredTime) {
    this.toEnteredTime = toEnteredTime;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }
}

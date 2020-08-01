package com.studerw.tda.model.transaction;

import com.studerw.tda.model.transaction.Transaction.Type;
import java.time.LocalDate;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Request class for account transactions.
 *
 * If an empty request is sent, then all transactions from all valid dates will be returned for the
 * account, as allowed by TDA.
 *
 * If a {@code startDate} is used, an {@code endDate} must also be used, and vice versa. The maximum
 * date range is one year, according to TDA's documents.
 */
public class TransactionRequest {

  private Transaction.Type type;
  private String symbol;
  private LocalDate startDate;
  private LocalDate endDate;

  public TransactionRequest() {
  }

  public TransactionRequest(Transaction.Type type) {
    this.type = type;
  }

  public TransactionRequest(String symbol) {
    this.symbol = symbol;
  }

  public TransactionRequest(Transaction.Type type, String symbol) {
    this.type = type;
    this.symbol = symbol;
  }

  public TransactionRequest(LocalDate startDate, LocalDate endDate) {
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public TransactionRequest(Transaction.Type type, String symbol, LocalDate startDate,
      LocalDate endDate) {
    this.type = type;
    this.symbol = symbol;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public TransactionRequest(String symbol, LocalDate startDate, LocalDate endDate) {
    this.symbol = symbol;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public Type getType() {
    return type;
  }

  public String getSymbol() {
    return symbol;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
        .append("type", type)
        .append("symbol", symbol)
        .append("startDate", startDate)
        .append("endDate", endDate)
        .toString();
  }
}

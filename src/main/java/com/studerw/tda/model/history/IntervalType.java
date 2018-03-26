package com.studerw.tda.model.history;

/**
 * Used in various price history requests and responses.
 * Indicates how the <em>intervalDuration</em> (frequency) will be specified.
 *
 * According to TDA docs with regard to the {@link PeriodType}:
 * <p>
 *   if the periodType is
 *   <ul>
 *     <li><em>DAY</em> - the interval type can be <em>MINUTE</em> only</li>
 *     <li><em>MONTH</em> - the interval type can be <em>DAILY</em> or <em>WEEKLY</em></li>
 *     <li><em>YEAR</em> - the interval type can be <em>DAILY</em> or <em>WEEKLY</em> or <em>MONTHLY</em></li>
 *     <li><em>YTD</em> - the interval type can be <em>DAILY</em> or <em>WEEKLY</em></li>
 *   </ul>
 * </p>
 * <p>
 *   With regard to the <em>intervalDuration</em> parameter:
 *   The valid values are dependent on the specified intervalType:
 *   <ul>
 *     <li>MINUTE - 1, 5, 10, 15, 30</li>
 *     <li>DAILY - 1</li>
 *     <li>WEEKLY - 1</li>
 *     <li>MONTHLY - 1</li>
 *   </ul>
 * </p>
 */
public enum IntervalType {
  MINUTE,DAILY,WEEKLY,MONTHLY

}

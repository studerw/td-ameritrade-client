package com.studerw.tda.model.history;

/**
 * Used in various price history requests and responses.
 * Indicates the units in which the <em>period</em> parameter will be specified
 *
 * According to TDA docs with regard to {@link IntervalType}
 * <p>
 *   if the {@link PeriodType} is:
 *   <ul>
 *     <li><em>DAY</em> - the interval type can be <em>MINUTE</em> only</li>
 *     <li><em>MONTH</em> - the interval type can be <em>DAILY</em> or <em>WEEKLY</em></li>
 *     <li><em>YEAR</em> - the interval type can be <em>DAILY</em> or <em>WEEKLY</em> or <em>MONTHLY</em></li>
 *     <li><em>YTD</em> - the interval type can be <em>DAILY</em> or <em>WEEKLY</em></li>
 *   </ul>
 * </p>
 * <p>
 *   With regard to the <em>period</em>parameter:
 *   If the period is NOT SPECIFIED and the periodtype is:
 *   <ul>
 *     <li>DAY - Then default period is 10.</li>
 *     <li>MONTH - Then default period is 1.</li>
 *     <li>YEAR - Then default period is 1.</li>
 *     <li>YTD - Then default period is 1.</li>
 *   </ul>
 * </p>
 */
public enum PeriodType {
  DAY,MONTH,YEAR,YTD

}

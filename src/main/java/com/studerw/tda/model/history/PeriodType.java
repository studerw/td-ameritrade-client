package com.studerw.tda.model.history;

/**
 * <p>
 * Used in various price history requests and responses. Indicates the units in which the
 * <em>period</em> parameter will be specified.
 * </p>
 *
 * According to TDA docs with regard to {@link FrequencyType}, if the {@link PeriodType} is:
 * <ul>
 *   <li><em>day</em> or <em>null</em>- the frequency type can be <em>minute</em> only</li>
 *   <li><em>month</em> - the frequency type can be <em>DAILY</em> or <em>WEEKLY</em></li>
 *   <li><em>year</em> - the frequency type can be <em>DAILY</em> or <em>WEEKLY</em> or <em>MONTHLY</em></li>
 *   <li><em>ytd</em> - the frequency type can be <em>DAILY</em> or <em>WEEKLY</em></li>
 * </ul>
 *
 * <p>
 *   With regard to the <em>period</em> parameter:
 *   If the period is NOT SPECIFIED and the {@link PeriodType} is:
 * </p>
 *
 * <ul>
 *   <li>day - Then default period is 10.</li>
 *   <li>month - Then default period is 1.</li>
 *   <li>year - Then default period is 1.</li>
 *   <li>t- Then default period is 1.</li>
 * </ul>
 *
 * <p>
 * Check that period follows TDA rules. Valid periods based on PeriodTypes:
 * </p>
 *<ul>
 *  <li>day: 1, 2, 3, 4, 5, 10*</li>
 *  <li>month: 1*, 2, 3, 6</li>
 *  <li>year - 1, 2, 3, 5 10, 15, 20</li>
 *  <li>ytd - 1</li>
 *</ul>
 */
public enum PeriodType {
  day,
  month,
  year,
  ytd
}

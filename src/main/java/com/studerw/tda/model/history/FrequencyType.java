package com.studerw.tda.model.history;

/**
 * Used in various price history requests and responses.
 * Indicates how the <em>intervalDuration</em> (frequency) will be specified.
 *
 * According to TDA docs with regard to the {@link PeriodType}:
 * <p>
 *   if the periodType is
 *   <ul>
 *     <li><em>DAY</em> - the frequency type can be <em>minute</em> only</li>
 *     <li><em>MONTH</em> - the frequency type can be <em>daily</em> or <em>weekly</em></li>
 *     <li><em>YEAR</em> - the frequency type can be <em>daily</em> or <em>weekly</em> or <em>monthly</em></li>
 *     <li><em>YTD</em> - the frequency type can be <em>daily</em> or <em>weekly</em></li>
 *   </ul>
 * </p>
 *
 * <p>
 *   With regard to the <em>frequency</em> parameter, the valid values are dependent on the specified {@link FrequencyType}:
 *   <ul>
 *     <li>minute - 1, 5, 10, 15, 30</li>
 *     <li>daily - 1</li>
 *     <li>weekly - 1</li>
 *     <li>monthly - 1</li>
 *   </ul>
 * </p>
 */
public enum FrequencyType {
  minute,
  daily,
  weekly,
  monthly
}

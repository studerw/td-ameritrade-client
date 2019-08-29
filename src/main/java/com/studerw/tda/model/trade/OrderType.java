package com.studerw.tda.model.trade;

/**
 * Order types for equity trades.
 * <ul>
 *   <li>market: An order seeking execution of a buy or sell transaction immediately at the next available market price.</li>
 *   <li>limit: An order seeking execution of a buy or sell transaction at a specified price or better.</li>
 *   <li>stop_market: An order to buy or sell a security at the next available price if the price reaches or surpasses a designated level.</li>
 *   <li>stop_limit: - An order to buy or sell a security at the next available price if the price reaches or surpasses a designated level.</li>
 *   <li>tstoppercent: Trailing Stop by a percent, An order to buy or sell a security that automatically adjusts the stop price at a fixed percent below or above the current market price.</li>
 *   <li>tstopdollar: Trailing Stop by Dollar, An order to buy or sell a security that automatically adjusts the stop price at a dollar amount below or above the current market price.</li>
 * </ul>
 * Choices are <em>Market price</em>, <em>Limit</em>, <em>Stop Market</em>, <em>Stop Limit</em>,
 * <em>Trailing Stop by percent</em>, or <em>Trailing Stop by dollar amount</em>.
 */
public enum OrderType {
  market,
  limit,
  stop_market,
  stop_limit,
  tstoppercent,
  tstopdollar
}

package com.studerw.tda.model.trade;

/**
 * Option expiration.
 * Either expire at the end of the trading day or <em>Good till Cancelled</em>.
 */
public enum OptionExpire {
  day,
  gtc
}

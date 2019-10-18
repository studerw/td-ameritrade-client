/**
 * <p>The {@link com.studerw.tda.client.TdaClient TdaClient} is your main interface into the API.</p>
 * <pre class="code">
 *   //create tda-api.properties in your classpath with your TDA client id and refresh token set.
 *
 *   TdaClient tdaClient = new HttpTdaClient();
 *   final Quote quote = tdaClient.fetchQuote("msft");
 *   EquityQuote equityQuote = (EquityQuote) quote;
 *
 *   System.out.println("Current price of MSFT: " + equityQuote.getAskPrice());
 * </pre>
 *
 * See {@link com.studerw.tda.client.HttpTdaClient HttpTdaClient}.
 */
package com.studerw.tda;

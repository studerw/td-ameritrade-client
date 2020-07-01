/**
 * <p>The {@link com.studerw.tda.client.TdaClient TdaClient} is your main interface into the API.</p>
 * <pre class="code">
 *   //create tda-api.properties in your classpath with your TDA client id (consumer key) and refresh token set.
 *   // Note that the client id should not have the '@AMER.OAUTHAP' part that is used when refreshing your OAuth token.
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

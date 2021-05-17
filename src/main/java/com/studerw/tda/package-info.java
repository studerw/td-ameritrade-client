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
 * <p>Or, if you don't want to deal with a properties file, you can just set them manually</p>
 * <pre class="code">
 *
 *   Properties props = new Properties();
 *   props.setProperty("tda.client_id", "...");
 *   props.setProperty("tda.token.refresh", "...");
 *
 *   TdaClient client = new HttpTdaClient(props);
 *   final Quote quote = tdaClient.fetchQuote("msft");
 *   EquityQuote equityQuote = (EquityQuote) quote;
 *
 *   System.out.println("Current price of MSFT: " + equityQuote.getAskPrice());
 * </pre>
 *
 *
 * <p>More information in the <a href="https://github.com/studerw/td-ameritrade-client/wiki/how-to">How-To</a></p>
 * See {@link com.studerw.tda.client.HttpTdaClient HttpTdaClient}.
 *
 */
package com.studerw.tda;

/**
 * <p>The {@link com.studerw.tda.client.TdaClient TdaClient} is your main interface into the API.</p>
 * <pre class="code">
 *   //create tda-api.properties in your classpath with your TDA client id (consumer key) and refresh token set.
 *   // Note that the client id should not have the '@AMER.OAUTHAP' part that is used when refreshing your OAuth token.
 *
 *   TdaClient client = new HttpTdaClient();
 *   final Quote quote = client.fetchQuote("msft");
 *   EquityQuote equityQuote = (EquityQuote) quote;
 *
 *   System.out.println("Current price of MSFT: " + equityQuote.getAskPrice());
 * </pre>
 *
 * <p>Or you can just create a client with the required client id and refresh token properties hard coded</p>
 *
 * <pre class="code">
 *
 *   Properties props = new Properties();
 *   props.setProperty("tda.client_id", "...");
 *   props.setProperty("tda.token.refresh", "...");
 *
 *   TdaClient client = new HttpTdaClient(props);
 *   final Quote quote = client.fetchQuote("msft");
 *   EquityQuote equityQuote = (EquityQuote) quote;
 *
 *   System.out.println("Current price of MSFT: " + equityQuote.getAskPrice());
 * </pre>
 *
 * <p>If you only need to fetch quotes and do not want to deal with generating OAuth tokens,
 * you can do so with just a valid Client ID (customer key). The interface to this
 * is the {@link com.studerw.tda.client.TdaQuoteClient}.
 * </p>
 *
 * <pre class="code">
 *
 *   TdaQuoteClient quoteClient = new HttpTdaQuoteClient("123456789ABCDEF")
 *   final Quote quote = tdaClient.fetchQuote("msft");
 *   EquityQuote equityQuote = (EquityQuote) quote;
 *
 *   System.out.println("Current price of MSFT: " + equityQuote.getAskPrice());
 *</pre>
 *
 * See {@link com.studerw.tda.client.HttpTdaClient HttpTdaClient}.
 * See {@link com.studerw.tda.client.HttpTdaQuoteClient HttpTdaQuoteClient}.
 */
package com.studerw.tda;

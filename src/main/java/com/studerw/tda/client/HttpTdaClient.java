package com.studerw.tda.client;

import com.studerw.http.LoggingInterceptor;
import com.studerw.http.cookie.CookieJarImpl;
import com.studerw.http.cookie.store.MemoryCookieStore;
import com.studerw.tda.model.*;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HttpTdaClient implements TdaClient {

    public static final String RESULT_FAIL = "<result>FAIL</result>";
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpTdaClient.class);

    protected final OkHttpClient httpClient;
    protected Properties tdProperties;
    Login currentLogin;
    final String user;
    final byte[] password;
    final private TdaXmlParser tdaXmlParser;

    /**
     *
     * @param user TDA user account name
     * @param password TDA user account password
     */
    public HttpTdaClient(String user, byte[] password) {
        LOGGER.info("Initiating HttpTdaClient...");
        this.tdaXmlParser = new TdaXmlParser(this);

        this.user = user;
        this.password = password;
        initTdaProps();
        httpClient = new OkHttpClient.Builder().
                cookieJar(new CookieJarImpl(new MemoryCookieStore())).
                addInterceptor(new TdaLoginInterceptor(this, tdProperties)).
                addInterceptor(new LoggingInterceptor("TDA_HTTP")).
//                connectTimeout(15, TimeUnit.SECONDS).
//                readTimeout(15, TimeUnit.SECONDS).    // socket timeout
                build();

//        this.currentLogin = this.doLogin();
//        LOGGER.info("Logged in with account: {}", currentLogin.getXmlLogIn().getAssociatedAccountId());
    }

    protected HttpUrl baseUrl() {
        return new HttpUrl.Builder()
                .scheme(tdProperties.getProperty("ameritrade.http.schema"))
                .host(tdProperties.getProperty("ameritrade.http.host"))
                .addPathSegment(tdProperties.getProperty("ameritrade.http.path"))
                .build();
    }

    @Override
    public QuoteResponse fetchQuote(String symbol) {
        LOGGER.debug("Fetching quote: {}", symbol);
        HttpUrl url = baseUrl().newBuilder().addPathSegments("100/Quote")
                .addQueryParameter("source", tdProperties.getProperty("ameritrade.source"))
                .addQueryParameter("symbol", symbol)
                .build();
        Request request = new Request.Builder().url(url).build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            return tdaXmlParser.parseQuoteResponse(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public BalancesAndPositions fetchBalancesAndPositions(String accountId) {
        LOGGER.debug("Fetching account balance for ID: {}", accountId);
        HttpUrl url = baseUrl().newBuilder().addPathSegments("100/BalancesAndPositions")
                .addQueryParameter("source", tdProperties.getProperty("ameritrade.source"))
                .addQueryParameter("accountid", accountId)
//                .addQueryParameter("type", "b")
                .build();

        Request request = new Request.Builder().url(url).build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            return tdaXmlParser.parseBalances(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean cancelOptionOrder(String orderId) {
        HttpUrl url = baseUrl().newBuilder().addPathSegments("100/OrderCancel")
                .addQueryParameter("source", tdProperties.getProperty("ameritrade.source"))
                .addQueryParameter("orderid", orderId)
                .build();
        Request request = new Request.Builder().url(url).build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            final String xml = response.body().string();
            LOGGER.debug(xml);
            return StringUtils.containsIgnoreCase(xml, "<result>OK</result>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public OrderStatus fetchOrderStatus(String...orderIds) {
        final HttpUrl.Builder urlBuilder = baseUrl().newBuilder().addPathSegments("100/OrderStatus")
                .addQueryParameter("source", tdProperties.getProperty("ameritrade.source"));
        for (String orderId : orderIds) {
            urlBuilder.addQueryParameter("orderid", orderId);
        }
        final HttpUrl url = urlBuilder.build();
        Request request = new Request.Builder().url(url).build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            return tdaXmlParser.parseOrderStatus(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public OptionChain fetchOptionChain(String symbol) {
        HttpUrl url = baseUrl().newBuilder().addPathSegments("200/OptionChain")
                .addQueryParameter("source", tdProperties.getProperty("ameritrade.source"))
                .addQueryParameter("symbol", symbol)
                .build();

        Request request = new Request.Builder().url(url).build();

        try (Response response = this.httpClient.newCall(request).execute()) {
            return tdaXmlParser.parseOptionChain(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public OrderStatus fetchAllOrderStatuses() {
        HttpUrl url = baseUrl().newBuilder().addPathSegments("100/OrderStatus")
                .addQueryParameter("source", tdProperties.getProperty("ameritrade.source"))
                .build();
        Request request = new Request.Builder().url(url).build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            return tdaXmlParser.parseOrderStatus(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void sendKeepAlive() {
        HttpUrl url = baseUrl().newBuilder().addPathSegment("KeepAlive")
                .addQueryParameter("source", tdProperties.getProperty("ameritrade.source"))
                .build();
        Request request = new Request.Builder().url(url).build();

        try (Response response = this.httpClient.newCall(request).execute()) {
            if (!StringUtils.containsIgnoreCase("LoggedOn", response.body().string())) {
                throw new RuntimeException("Cannot send keep-alive");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Login getCurrentLogin(){
        return this.currentLogin;
    }

    private void initTdaProps(){
        try (InputStream in = getClass().getClassLoader().getResourceAsStream("com/studerw/tda/tda-api.properties")){
            tdProperties = new Properties();
            tdProperties.load(in);
        }
        catch(IOException e){
            throw new IllegalStateException("Could not load default properties from com.studerw.tda.tda-api.properties in classpath");
        }
    }
}

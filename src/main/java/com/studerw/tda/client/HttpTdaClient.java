package com.studerw.tda.client;

import com.studerw.http.LoggingInterceptor;
import com.studerw.http.cookie.CookieJarImpl;
import com.studerw.http.cookie.store.MemoryCookieStore;
import com.studerw.tda.model.Balances;
import com.studerw.tda.model.OptionChain;
import com.studerw.tda.model.OrderStatus;
import com.studerw.tda.model.QuoteResponse;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

public class HttpTdaClient extends BaseTdaClient {

    public static final String RESULT_FAIL = "<result>FAIL</result>";
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpTdaClient.class);
    private final OkHttpClient httpClient;
    private Properties properties;
//    private final Login currentLogin;

    public HttpTdaClient(Properties properties) {
        LOGGER.info("Initiating HttpTdaClient...");
        this.properties = properties;
        httpClient = new OkHttpClient.Builder().
                cookieJar(new CookieJarImpl(new MemoryCookieStore())).
                addInterceptor(new TdaLoginInterceptor(this, properties)).
                addInterceptor(new LoggingInterceptor("TDA_HTTP")).
//                connectTimeout(15, TimeUnit.SECONDS).
//                readTimeout(15, TimeUnit.SECONDS).    // socket timeout
                build();

//        this.currentLogin = this.doLogin();
//        LOGGER.info("Logged in with account: {}", currentLogin.getXmlLogIn().getAssociatedAccountId());
    }

    static HttpUrl baseUrl() {
        return new HttpUrl.Builder()
                .scheme("https")
                .host("apis.tdameritrade.com")
                .addPathSegment("apps")
                .build();
    }

    @Override
    public QuoteResponse fetchQuote(String symbol) {
        LOGGER.debug("Fetching quote: {}", symbol);
        HttpUrl url = baseUrl().newBuilder().addPathSegments("100/Quote")
                .addQueryParameter("source", properties.getProperty("ameritrade.source"))
                .addQueryParameter("symbol", symbol)
                .build();
        Request request = new Request.Builder().url(url).build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            return parseQuoteResponse(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public Balances fetchBalancesAndPositions(String accountId) {
        LOGGER.debug("Fetching account balance for ID: {}", accountId);
        HttpUrl url = baseUrl().newBuilder().addPathSegments("100/BalancesAndPositions")
                .addQueryParameter("source", properties.getProperty("ameritrade.source"))
                .addQueryParameter("accountid", accountId)
//                .addQueryParameter("type", "b")
                .build();

        Request request = new Request.Builder().url(url).build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            return parseBalances(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean cancelOptionOrder(String orderId) {
        HttpUrl url = baseUrl().newBuilder().addPathSegments("100/OrderCancel")
                .addQueryParameter("source", properties.getProperty("ameritrade.source"))
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
                .addQueryParameter("source", properties.getProperty("ameritrade.source"));
        for (String orderId : orderIds) {
            urlBuilder.addQueryParameter("orderid", orderId);
        }
        final HttpUrl url = urlBuilder.build();
        Request request = new Request.Builder().url(url).build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            return parseOrderStatus(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public OptionChain fetchOptionChain(String symbol) {
        HttpUrl url = baseUrl().newBuilder().addPathSegments("200/OptionChain")
                .addQueryParameter("source", properties.getProperty("ameritrade.source"))
                .addQueryParameter("symbol", symbol)
                .build();

        Request request = new Request.Builder().url(url).build();

        try (Response response = this.httpClient.newCall(request).execute()) {
            return parseOptionChain(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public OrderStatus fetchAllOrderStatuses() {
        HttpUrl url = baseUrl().newBuilder().addPathSegments("100/OrderStatus")
                .addQueryParameter("source", properties.getProperty("ameritrade.source"))
                .build();
        Request request = new Request.Builder().url(url).build();
        try (Response response = this.httpClient.newCall(request).execute()) {
            return parseOrderStatus(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void sendKeepAlive() {
        HttpUrl url = baseUrl().newBuilder().addPathSegment("KeepAlive")
                .addQueryParameter("source", properties.getProperty("ameritrade.source"))
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

}

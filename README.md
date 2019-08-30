# TD Ameritrade Java Client
![travisci-passing](https://api.travis-ci.org/studerw/td-ameritrade-client.svg?branch=master)
----
![TDA_LOGO](https://github.com/studerw/td-ameritrade-client/blob/master/td_logo.png)

## Deprecated in 2019

Java rest client for TD Ameritrade Api. Uses [OKHttp 3](https://github.com/square/okhttp) under the hood.

See the new TDA OAuth2 Rest based [API](https://developer.tdameritrade.com/).
__
[API Documentation](http://td-ameritrade-client.studerw.com.s3-website-us-east-1.amazonaws.com/)

I'm happy to collaborate contractually or OSS with other devs. 

## 2019 Deprecation Notes

Sometime in-between the beginning of this project (based on TDA's older XML API) and now, TDA released a restful [API](https://developer.tdameritrade.com/). 
TDA's server backend is still similar, as far as I can tell. Unfortunately the old API is being deprecated in 2020 and so this
project is being archived. Perhaps a new repo using the JSON API will be created as the models and calls are very
similar (and probably come from the same backend Java XML system).

## Build

To build the jar, checkout the source and run:

```bash
mvn clean install
```
Note that beginning with JDK 11, the JAXB classes are [no longer included by default](https://openjdk.java.net/jeps/320) in the standard JDK.
So you will need to build with a JDK under 11. The *pom.xml* file states that JDK 8 should be used, and that is what has so far been tested.   

## Usage
Until the project is finished, you will need to have built this locally in order to put the necessary jars in your local Maven repo.
Once we have a 1.0.0 version, it will be submitted to Maven Central. 

Add the following to your Maven build file:

```
  <dependency>
    <groupId>com.studerw.tda</groupId>
    <artifactId>td-ameritrade-client</artifactId>
    <version>1.0-SNAPSHOT</version>
  </dependency>
```

You need a valid TDA user and password which is the same that is used when logging into the [TDA Home Page](https://www.tdameritrade.com/home.page)

```
  TdaClient tdaClient = new HttpTdaClient("user", "pass".getBytes());
  QuoteResponse response = tdaClient.fetchQuotes(Arrays.asList("AMTD"));
  String askPrice = response.getResults.getQuotes().get(0).getAsk();
  System.out.println("Current price of TDA: " + askPrice);
```

## Response Types
The actual responses returned from TDA are in rather verbose XML. For example, a call to get several ticker quotes
will return something like this:

```Java
QuoteResponse response = httpTdaClient.fetchQuotes(Arrays.asList("msft", "xom"));
System.out.println(response.getOriginalXml());
```

```xml
<?xml version="1.0"?>
<amtd>
    <result>OK</result>
    <error></error>
    <quote-list>
        <error></error>
        <quote>
            <error></error>
            <symbol>MSFT</symbol>
            <description>Microsoft Corporation - Common Stock</description>
            <bid>93.52</bid>
            <ask>93.64</ask>
            <bid-ask-size>1100X100</bid-ask-size>
            <last>93.64</last>
            <last-trade-size>47600</last-trade-size>
            <last-trade-date>2018-03-05 16:00:02 EST</last-trade-date>
            <open>92.34</open>
            <high>94.27</high>
            <low>92.26</low>
            <close>93.05</close>
            <volume>23901578</volume>
            <year-high>96.07</year-high>
            <year-low>63.62</year-low>
            <real-time>true</real-time>
            <exchange>NASDAQ</exchange>
            <asset-type>E</asset-type>
            <change>0.59</change>
            <change-percent>0.63%</change-percent>
        </quote>
        <quote>
            <error></error>
            <symbol>XOM</symbol>
            <description>Exxon Mobil Corporation Common Stock</description>
            <bid>76.29</bid>
            <ask>76.93</ask>
            <bid-ask-size>1500X200</bid-ask-size>
            <last>76.27</last>
            <last-trade-size>2384300</last-trade-size>
            <last-trade-date>2018-03-05 16:00:49 EST</last-trade-date>
            <open>75.23</open>
            <high>76.56</high>
            <low>75.121</low>
            <close>75.55</close>
            <volume>14890975</volume>
            <year-high>89.30</year-high>
            <year-low>73.90</year-low>
            <real-time>true</real-time>
            <exchange>NYSE</exchange>
            <asset-type>E</asset-type>
            <change>0.72</change>
            <change-percent>0.95%</change-percent>
        </quote>
    </quote-list>
</amtd>
```

In java, you will get a `QuoteResponse` pojo. All of the response objects extend the base `BaseTda`
which has convenience methods:

* `getOriginalXml` - get the XML as above, though shouldn't be needed except for special purposes.
* `isTdaError` - did the response return a processing error.

Getting the data out of the response objects is a bit complex because of the generated types. Above, to
get the `askPrice` for Exxon, it looks like this:

```java
response.getResult().getQuotes().get(1).getAsk();
```
Or for example, fetching the date of your last order: 

```java
response.getLastOrderStatus(0).getLast()
```
## Error Handling

Before the call is even made, validator or other exceptions can be thrown. Usually you won't have to catch these in your program, they'll be helpful
when testing, though.

Once the call is made, the TDA server returns 200 success responses **even if the call was not successful**, for example you've sent an invalid request type 
or some other issue. Instead of a bad response, there is always an `error` field filled in with something
like `OK` for successful calls and `error` or otherwise, along with possibly an error message, when something
has gone wrong. 

The rules are this within the Client:

* All non 200 HTTP responses throw unchecked `RuntimeExceptions` since there is no way to recover, usually.
 
* The client (i.e. you) should always call the convenience method included on all responses: `response.isTdaError`

* If the response returns an inner list of responses, you will usually need to check each one for a non-blank error. Often the top level status will be `OK`
(i.e. `isTdaError=false`) but one or more of the inner response objects does have an error.

The  error check is important because no calls throw checked exceptions, but instead `RuntimeExceptions` which
you may or may not check for. These are only called for errors we cannot recover from (bad internet connect, server is down, etc).

The only exception to this rule is if we cannot login - either due to bad credentials, locked account, or otherwise.
When this occurs, an `IllegalStateException` is thrown. 

To state again - be very careful with error checking. Many times a response will give an indication of OK except that one piece of the request
has failed. For example, when making an equity trade, you might get a response of:
```xml
<amtd>
  <result>OK</result>
  <order-wrapper>
    <orderstring>
      accountid=xyz~routing=auto~symbol=MSFT~quantity=1~expire=gtc~ordtype=market~action=buy~spinstructions=none
    </orderstring>
    <error>For a market order, the expiration must be Day or MOC.</error>
  </order-wrapper>
</amtd>
```

If you check your response object's `response.isTdaError()` it will return false (as the main response code from TDA is `OK`) and no exception will be thrown. 
However, the order did **NOT* go through successfully, and the error message explains why.

So the correct way to error check is to do something like: 
```java
EquityTrade result = client.tradeEquity(....)
if (result.isTdaError()){
  //do something about the main error
}
if (StringUtils.isNotBlank(result.getOrderWrapper().getError()){
  //do something about the inner error
}
```

## Integration Tests
Integration tests do require a TDA user and password, though are not needed to build the jar.

To run integration tests, you will need to rename this file *src/test/resources/com/studerw/tda/client/my-test.properties.changeme* to *my-test.properties* and add your own TDA user and pw.
Then run the following command.

```
mvn failsafe:integration-test
```

Don't worry - no purchases or transfers (to @studerw's account) will be made :/. Basically we just check login and quote methods only.

## API Completed and TODO

### Authentication
* ~~Login~~
* ~~Logout~~
* ~~KeepAlive~~

### Lookup 
* ~~Quotes~~
* ~~SymbolLookup~~
* ~~PriceHistory~~
* ~~VolatilityHistory~~
* OptionChain - PARTIAL
* BinaryOptionChain - TODO
* ~~BalanceAndPosition~~
* ~~OrderStatus~~
* ~~LastOrderStatus~~
* ~~PriceHistory~~

### News
* ~~MarketOverview~~
* News - TODO
* FullStoryNews - TODO
* QuoteNews - TODO

### Trading
* ~~EquityTrade - TODO~~
* OptionTrade - TODO
* EditOrder - TODO
* ~~CancelOrder~~

### Conditional Trading
* ConditionalEquityTrade - TODO
* ConditionalOptionTrade - TODO

### Option Trading
* BuyWriteOptionTrade - TODO
* SpreadOptionTrade - TODO
* StraddleOptionTrade - TODO
* StrangleOptionTrade - TODO
* ComboOptionTrade - TODO
* MultiLegOptionTrade - TODO

### Saved Orders
* SavedOrders - TODO
* SaveEquityTrade - TODO
* SaveOptionTrade - TODO
* DeleteSavedOrders - TODO

### WatchLists
* GetWatchList - TODO
* CreateWatchList - TODO
* EditWatchlist - TODO
* DeleteWatchList - TODO

### Status
* BankingStatus - TODO
* CreateBankTransaction - TODO
* EditBankTransaction - TODO
* EditInternalTransaction - TODO
* DeleteBankTransaction - TODO

### Settings
* GetWebSettings - TODO
* EditWebSettings - TODO

### Streaming Data 
* All - TODO
* StreamerInfo - TODO
* MessageKey - TODO

## Issues / Todo
* pass around inputstreams instead of XML to parses, and get rid of XML strings stored in POJOs. 
* Need a validator for PriceHistory
* converting floats to BigDecimal causes loss of precision
* javadoc check and see if working correctly with package html
* remove xml from generated models, add better javadoc, possibly convenience methods
* Add full validation for OptionOrder, EquityOrder, etc.

## Login Parameters
The client only requires a username and password. The actual call to TDA, though, also
requires a `source` and `version`. Because I have not seen these change, they are
hardcoded, as are all other properties, in the `src/main/resources/com/studerw/tda/tda-api.properties`
file. You can change these there if needed, and rebuild as they are included in the output jar.





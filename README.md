# TD Ameritrade API
Java rest client for TD Ameritrade Api. Uses [OKHttp 3](https://github.com/square/okhttp) under the hood.

** 2018 Notes

Sometime in-between use of this API and now, TDA released a 'better' [API](https://developer.tdameritrade.com/). The backend is still similar, as far as I can tell. I'm happy to colloborate contractually or OSS with other devs...

## Build

To build the jar, checkout the source and run:

```bash
mvn clean install
```

## Usage
Until the project is finished, you will need to have built this locally in order to put the necessary jars in your local Maven repo.
Once we have a 1.0.0 version, we will submit it to Maven Central. 

Add the following to your Maven build file:

```
  <dependency>
    <groupId>com.studerw</groupId>
    <artifactId>tdameritrade-api</artifactId>
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


## Integration Tests
Integration tests do require a TDA user and password, though are not needed to just build.

To run integration tests, you will need to rename this file *src/test/resources/com/studerw/tda/client/my-test.properties.changeme* to *my-test.properties* and add your own TDA user and pw.
Then run the following command.

```
mvn failsafe:integration-test
```

Don't worry - no purchases or transfers (to @studerw's account) will be made :/. Basicallyl we just check login and quote methods only.

## API Completed and TODO

### Authentication
* Login - DONE
* Logout - DONE
* KeepAlive - DONE

### Lookup 
* Quotes - DONE
* SymbolLookup - DONE
* PriceHistory - DONE
* VolatilityHistory - TODO
* OptionChain - PARTIAL
* BinaryOptionChain - TODO
* BalanceAndPosition - DONE
* OrderStatus - DONE
* PriceHistory - DONE

### Newes
* MarketOverview - TODO
* News - TODO
* FullStoryNews - TODO
* QuoteNews - TODO

### Trading
* EquityTrade - TODO
* OptionTrade - TODO
* EditOrder - TODO
* CancelOrder - TODO

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

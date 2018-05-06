# tdameritrade-api
Java rest client for TD Ameritrade Api. Uses [OKHttp 3](https://github.com/square/okhttp) under the hood.

## Usage

```java
  TdaClient tdaClient = new TdaClient("user", "pass".getBytes());
  QuoteResponse response = httpTdaClient.fetchQuotes(Arrays.asList("AMTD"));
  String askPrice = response.getResults.getQuotes().get(0).getAsk();
  System.out.println("Current price of TDA: "+askPrice);
```

### Build

To build the jar, run the following. Integration tests which require a TDA user and password are not needed to build.

```bash
mvn clean install
```

### Integration Tests

To run integration tests, you will need to rename this file *src/test/resources/com/studerw/tda/client/my-test.properties.changeme* to *my-test.properties* and add your own TDA user and pw.
Then run the following command.

```bash
mvn failsafe:integration-test
```

## Issues / Todo

* Need a validator for PriceHistory
* converting floats to BigDecimal causes loss of precision
* javadoc check and see if working correctly with package html
* Build Amazon API Gateway, S3 bucket Vue.js app for demo purposes


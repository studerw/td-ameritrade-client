# TD Ameritrade API
Java rest client for TD Ameritrade Api. Uses [OKHttp 3](https://github.com/square/okhttp) under the hood.

## Build

To build the jar, checkout the source and run:

```bash
mvn clean install
```

## Usage
Until the project is finished, you will need to have build this locally in order to put the necessary jars in your local Maven repo.

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
Integration tests do require a TDA user and password are not needed to build.

To run integration tests, you will need to rename this file *src/test/resources/com/studerw/tda/client/my-test.properties.changeme* to *my-test.properties* and add your own TDA user and pw.
Then run the following command.

```
mvn failsafe:integration-test
```

## Issues / Todo
* pass around inputstreams instead of XML to parses, and get rid of XML strings stored in POJOs. 
* Need a validator for PriceHistory
* converting floats to BigDecimal causes loss of precision
* javadoc check and see if working correctly with package html
* Build Amazon API Gateway, S3 bucket Vue.js app for demo purposes

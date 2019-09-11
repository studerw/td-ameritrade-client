# TD Ameritrade Java Client
![TDA_LOGO](https://github.com/studerw/td-ameritrade-client/blob/master/td_logo.png)

![travisci-passing](https://api.travis-ci.org/studerw/td-ameritrade-client.svg?branch=old-xml-api)
[![APL v2](https://img.shields.io/badge/license-Apache%202-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

----

[Javadoc API Documentation](http://td-ameritrade-client.studerw.com.s3-website-us-east-1.amazonaws.com/)

Java rest client for TD Ameritrade Api. Uses [OKHttp 3](https://github.com/square/okhttp) under the hood.

Uses the new [TDA OAuth2 API](https://developer.tdameritrade.com/).

I'm happy to collaborate contractually or OSS with other devs. 

## 2019 

See the [old-xml-api](https://github.com/studerw/td-ameritrade-client/tree/old-xml-api) branch for the previous project based on the soon-to-be-deprecated TDA XML API.
Old [API Documentation](http://td-ameritrade-client.studerw.com.s3-website-us-east-1.amazonaws.com/).

Sometime in-between the beginning of this project (based on TDA's older XML API) and now, TDA released a restful [API](https://developer.tdameritrade.com/). 
Unfortunately the old API is being [deprecated in 2020](https://apiforums.tdameritrade.com/tda-board/ubbthreads.php) and so the
original source code for this project has been moved to the [old-xml-api](https://github.com/studerw/td-ameritrade-client/tree/old-xml-api) branch.

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
    <version>2.0-SNAPSHOT</version>
  </dependency>
```
----
You need to obtain a valid TDA Developer *refresh token* every 90 days. See TDA's [Simple Auth for Local Apps](https://developer.tdameritrade.com/content/simple-auth-local-apps).

```
  TdaClient tdaClient = new HttpTdaClient();
  final Quote quote = tdaClient.fetchQuote("msft");
  EquityQuote equityQuote = (EquityQuote) quote;
  System.out.println("Current price of MSFT: " + equityQuote.getAskPrice());
```

In java, you will get a `Quote` pojo. All of the response objects extend the base `Quote`
which can then be casted to its actual type.

## Error Handling

Before the call is even made, validator or other exceptions can be thrown. Usually you won't have to catch these in your program, they'll be helpful
when testing, though.

Once the call is made, the TDA server returns 200 success responses **even if the call was not successful**, for example you've sent an invalid request type 
or some other issue. Often this means the body is an empty JSON string.

The rules are this within the Client:

* All non 200 HTTP responses throw unchecked `RuntimeExceptions` since there is no way to recover, usually.
 
The  error check is important because no calls throw checked exceptions, but instead `RuntimeExceptions` which
you may or may not check for. These are only called for errors we cannot recover from (bad internet connect, server is down, etc).

The only exception to this rule is if we cannot login - either due to bad credentials, locked account, or otherwise.
When this occurs, an `IllegalStateException` is thrown. 


## Integration Tests
Integration tests do require a Client App ID user and refresh token, though are not needed to build the jar.

To run integration tests, you will need to rename this file *src/test/resources/my-test.properties.changeme* to *my-test.properties* and add your own TDA properties.
Then run the following command.

```
mvn failsafe:integration-test
```

## Login Parameters
The client only requires a Client ID and Refresh Token. The refresh token expires every 90 days.
See the [Simple Auth for Local Apps](https://developer.tdameritrade.com/content/simple-auth-local-apps) for help.


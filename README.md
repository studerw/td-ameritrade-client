# TD Ameritrade Java Client
![TDA_LOGO](https://github.com/studerw/td-ameritrade-client/blob/master/td_logo.png)

![travisci-passing](https://api.travis-ci.org/studerw/td-ameritrade-client.svg?branch=master)
[![APL v2](https://img.shields.io/badge/license-Apache%202-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

----
Java rest client for [OAuth2 TD Ameritrade Api](https://developer.tdameritrade.com/). 
Uses [OKHttp 3](https://github.com/square/okhttp) under the hood.

* [Javadoc API](http://td-ameritrade-client.studerw.com.s3-website-us-east-1.amazonaws.com/)
* [How-To](https://github.com/studerw/td-ameritrade-client/wiki/how-to) on the Wiki.

I'm happy to collaborate contractually or OSS with other developers. 

## Required TDA Properties

The client only requires a TDA client ID and current OAuth refresh token. The refresh token expires every 90 days.
See the [Getting Started](https://developer.tdameritrade.com/content/getting-started) and [Simple Auth for Local Apps](https://developer.tdameritrade.com/content/simple-auth-local-apps) for help.

## Build

To build the jar, checkout the source and run:

```bash
mvn clean install
```

## Usage
Until the project is finished, you will need to have built this locally in order to put the necessary jars in your local Maven repo.
Once we have a ~~1.0.0~~ 2.0.0 version, it will be submitted to Maven Central. 

Add the following to your Maven build file:

```
  <dependency>
    <groupId>com.studerw.tda</groupId>
    <artifactId>td-ameritrade-client</artifactId>
    <version>2.0.0-SNAPSHOT</version>
  </dependency>
```
----
You need to obtain a valid TDA Developer *refresh token* every 90 days. See TDA's [Simple Auth for Local Apps](https://developer.tdameritrade.com/content/simple-auth-local-apps).

```
  Properties props = new Properties();
  props.setProperty("tda.client_id", "...");
  props.setProperty("tda.token.refresh", "...")

  TdaClient tdaClient = new HttpTdaClient(props);
  final Quote quote = tdaClient.fetchQuote("msft");
  EquityQuote equityQuote = (EquityQuote) quote;

  System.out.println("Current price of MSFT: " + equityQuote.getAskPrice());
```

## Integration Tests
Integration tests do require a Client App ID user and refresh token, though are not needed to build the jar.

To run integration tests, you will need to rename this file *src/test/resources/my-test.properties.changeme* 
to *my-test.properties* and fill in the necessary TDA properties.

Then run the following command.

```
mvn failsafe:integration-test
```

## POJO `otherfields` Property
The TDA API seems to be in a constant state of change, and some of the documentation is out of sync with the actual responses.
Thus, in order to ensure that all properties are deserialized from the returned JSON into our Java pojos,
an `otherfields` Map is contained in most types. You can get any new or undocumented fields using code similar
to the following:

```java
Quote quote = tdaClient.fetchQuote("msft");
String someField = (String)quote.getOtherFields().get("someField"))
```

## DateTime Handling
Most TDA dates and times are returned as longs (i.e. milliseconds since the epoch UTC).
An easy way to convert them to Java's new [DateTime](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html) 
is via the following:

```java
long someMilliseconds= ...
ZonedDateTime dateTime = Instant.ofEpochMilli(someDateTime)
  .atZone(ZoneId.systemDefault());
```
Or you could use the deprecated _java.util.Date_.

```java
long someDateTime = ...
Date date = new Date(someDateTime);
```

To convert a long to human readable ISO 8601 String, use the following:
```java
long currentTime = System.currentTimeMillis();
String formattedDate = FormatUtils.epochToStr(currentTime);
System.out.println(formattedDate) //   2019-09-13T19:59-04:00[America/New_York]
```

## Error Handling

Only **unchecked exceptions** are called to avoid having to litter your code with `try catch` blocks.

Before the call is made, request parameter validation exceptions can be thrown. Usually you won't have to catch these in your program, though they'll be helpful
when testing.

Once the call is made, the TDA server can return 200 success responses **even if the call was not successful**, for example, you've sent an invalid request type 
or set of parameters. Often this means the body is an empty JSON string.

The rules are this:

* OAuth authentication problems, explicitly signalled by a 401 response codes, usually mean an invalid TDA 
client id or an expired refresh token, and this will throw an `IllegalStateException`.

* Validation issues that are known before the call is made, e.g. null or empty required parameters, will throw unchecked `IllegalArgumentException`.

* All non 200 HTTP responses throw unchecked `RuntimeExceptions` since there is no way for the API to recover.

* Responses that are completely empty but should have returned a full json body throw a `RunTimeException` also.

* If there is an error parsing the JSON into a Java pojo, the `RuntimeException` wrapping the `IOException` from Jackson will be thrown.
 
## Logging
The API uses [SLF4J](http://www.slf4j.org/) as does [OKHttp 3](https://github.com/square/okhttp).
You can use any implementation like Logback or Log4j.

Specific Loggers that you can tune:

* `TDA_HTTP` - set this to _INFO_ for basic request / response info, or _DEBUG_ to see full headers and body.
* `com.studerw.tda.client.OauthInterceptor` - detailed info on OAUTH can be seen using either _INFO_ or _DEBUG_
* `com.studerw.tda` - basic API logging with either _INFO_ or _DEBUG_
* `com.squareup.okhttp3` - low-level OKHTTP library.

### Logback
Add `Logback` to your pom:
```xml
<dependency>
  <groupId>ch.qos.logback</groupId>
  <artifactId>logback-classic</artifactId>
  <version>1.2.3</version>
</dependency>

```
Add a `logback-config.xml` to you classpath (e.g. _src/main/resources/_)
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<configuration scan="false" scanPeriod="3 seconds" debug="false">
  <contextName>main</contextName>

  <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
    <encoder>
      <pattern>
        %d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger - %msg%n
      </pattern>
    </encoder>
  </appender>

  <logger name="TDA_HTTP" level="INFO"/>
  <logger name="com.studerw.tda" level="INFO"/>
  <logger name="com.studerw.tda.client.OauthInterceptor" level="INFO"/>
  <logger name="com.squareup.okhttp3" level="INFO"/>

  <root level="WARN">
    <appender-ref ref="STDOUT"/>
  </root>

</configuration>

```

## 2019 Update - Old API Deprecated

See the [old-xml-api](https://github.com/studerw/td-ameritrade-client/tree/old-xml-api) branch for the previous project based on the soon-to-be-deprecated TDA XML API.

Sometime in-between the beginning of this project (based on TDA's older XML API) and now, TDA released a restful [API](https://developer.tdameritrade.com/). 
Unfortunately the old API is being [deprecated in 2020](https://apiforums.tdameritrade.com/tda-board/ubbthreads.php) and so the
original source code for this project has been moved to the [old-xml-api](https://github.com/studerw/td-ameritrade-client/tree/old-xml-api) branch and is now known as version 1.0.0.

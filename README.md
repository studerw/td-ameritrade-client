# tdameritrade-api
Java rest client for TD Ameritrade Api. Uses [OKHttp 3](https://github.com/square/okhttp) under the hood.

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

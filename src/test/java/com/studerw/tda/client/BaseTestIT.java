package com.studerw.tda.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class BaseTestIT {

  static protected HttpTdaClient httpTdaClient;
  static protected Properties props = null;

  @BeforeClass
  public static void beforeClass() {
    try (InputStream in = BaseTestIT.class.getClassLoader().
        getResourceAsStream("my-test.properties")) {
      props = new Properties();
      props.load(in);
    } catch (IOException e) {
      throw new IllegalStateException(
          "Could not load default properties from classpath at com.studerw.my-test.properties");
    }

    httpTdaClient = new HttpTdaClient(props);
  }

  @AfterClass
  public static void afterClass () {
//    httpTdaClient.logout();
    httpTdaClient = null;
  }


}
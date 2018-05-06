package com.studerw.tda.client;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import org.junit.BeforeClass;

public abstract class BaseTestIT {

  static HttpTdaClient httpTdaClient;
  static Properties props = null;

  @BeforeClass
  public static void beforeClass() {
    try (InputStream in = LoginTestIT.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/client/my-test.properties")) {
      props = new Properties();
      props.load(in);
    } catch (IOException e) {
      throw new IllegalStateException(
          "Could not load default properties from classpath at com.studerw.my-test.properties");
    }

    String user = props.getProperty("user");
    byte[] pw = props.getProperty("pw").getBytes(StandardCharsets.UTF_8);
    httpTdaClient = new HttpTdaClient(user, pw);
  }

}

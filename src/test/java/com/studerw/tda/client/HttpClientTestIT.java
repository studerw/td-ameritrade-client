package com.studerw.tda.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Fail.fail;

import com.studerw.tda.model.Login;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpClientTestIT {

  private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientTestIT.class);
  private static String user;
  private static byte[] pw;
  Properties properties;

  @BeforeClass
  public static void beforeClass(){
      try (InputStream in = LoginTestIT.class.getClassLoader().
          getResourceAsStream("com/studerw/tda/client/my-test.properties")) {
        Properties props = new Properties();
        props.load(in);
        user = props.getProperty("user");
        pw = props.getProperty("pw").getBytes(StandardCharsets.UTF_8);
      } catch (IOException e) {
        throw new IllegalStateException(
            "Could not load default properties from classpath at com.studerw.my-test.properties");
      }
  }

  @Test
  public void testSimpleConstructor() {
    HttpTdaClient client = new HttpTdaClient(user, pw);
    Login currentLogin = client.getCurrentLogin();
    assertThat(currentLogin).isNotNull();
    assertThat(currentLogin.isTdaError()).isFalse();
    assertThat(currentLogin.getXmlLogIn().getAssociatedAccountId()).isNotBlank();
    LOGGER.debug("Default acct id: {}", currentLogin.getXmlLogIn().getAssociatedAccountId());
  }

  @Test
  public void testSourceConstructor(){
    Properties properties = HttpTdaClient.initTdaProps();
    HttpTdaClient client = new HttpTdaClient(user, pw, properties.getProperty("tda.source"));
    Login currentLogin = client.getCurrentLogin();
    assertThat(currentLogin).isNotNull();
    assertThat(currentLogin.isTdaError()).isFalse();
    assertThat(currentLogin.getXmlLogIn().getAssociatedAccountId()).isNotBlank();
    LOGGER.debug("Default acct id: {}", currentLogin.getXmlLogIn().getAssociatedAccountId());
  }

  @Test
  public void testSourceConstructorEmptySource(){
    Properties properties = HttpTdaClient.initTdaProps();
    HttpTdaClient client = new HttpTdaClient(user, pw, "");
    Login currentLogin = client.getCurrentLogin();
    assertThat(currentLogin).isNotNull();
    assertThat(currentLogin.isTdaError()).isFalse();
    assertThat(currentLogin.getXmlLogIn().getAssociatedAccountId()).isNotBlank();
    LOGGER.debug("Default acct id: {}", currentLogin.getXmlLogIn().getAssociatedAccountId());
  }

  @Test
  public void testSourceConstructorWithSource(){
    HttpTdaClient client = new HttpTdaClient(user, pw, "foobar");
    Login currentLogin = client.getCurrentLogin();
    assertThat(currentLogin.isTdaError()).isTrue();
  }

  @Test
  public void testCustomProps(){
    Properties properties = HttpTdaClient.initTdaProps();
    HttpTdaClient client = new HttpTdaClient(user, pw, properties);
    Login currentLogin = client.getCurrentLogin();
    assertThat(currentLogin.isTdaError()).isFalse();
  }

  @Test(expected = Exception.class)
  public void testBadProps(){
    HttpTdaClient client = new HttpTdaClient(user, pw, new Properties());
    Login currentLogin = client.getCurrentLogin();
    fail("Shold not have got here due to bad props");
  }
}


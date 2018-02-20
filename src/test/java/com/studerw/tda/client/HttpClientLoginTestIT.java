package com.studerw.tda.client;

import com.studerw.tda.model.Login;
import com.studerw.tda.model.QuoteResponse;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;


public class HttpClientLoginTestIT {
	private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientLoginTestIT.class);
	static Properties props = null;

	@BeforeClass
	public static void beforeClass(){
		try (InputStream in = HttpClientLoginTestIT.class.getClassLoader().
				getResourceAsStream("com/studerw/tda/client/my-test.properties")){
			props = new Properties();
			props.load(in);
		}
		catch(IOException e){
			throw new IllegalStateException("Could not load default properties from com.studerw.tda.tda-api.properties in classpath");
		}

	}
	@Test
	public void testLogin(){
		String user = props.getProperty("user");
		byte[] pw = props.getProperty("pw").getBytes(StandardCharsets.UTF_8);
		HttpTdaClient httpTdaClient = new HttpTdaClient(user, pw);
		final QuoteResponse msft = httpTdaClient.fetchQuote("msft");
		assertNotNull("should have got order", msft);

		final Login currentLogin = httpTdaClient.getCurrentLogin();
		assertNotNull("should have got login", currentLogin);
		String mainAcct = currentLogin.getXmlLogIn().getAssociatedAccountId();
		final Login.XmlLogIn.Accounts accounts = currentLogin.getXmlLogIn().getAccounts();
		LOGGER.debug(currentLogin.toString());
	}
}

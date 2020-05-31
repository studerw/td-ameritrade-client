package com.studerw.tda.http;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryBuilderTest {
  private static final Logger LOGGER = LoggerFactory.getLogger(QueryBuilderTest.class);

  @Test
  public void testQueryBuildMulti(){
    List<String> params = Arrays.asList("a", "b", "c", "d");
    Builder builder = new HttpUrl.Builder().scheme("https").host("www.google.com")
        .addPathSegment("foo");

    params.forEach(k -> builder.addQueryParameter("orderid", k));
    HttpUrl url = builder.build();
    assertThat(url.toString()).isEqualTo("https://www.google.com/foo?orderid=a&orderid=b&orderid=c&orderid=d");
    LOGGER.debug(url.toString());
  }

}

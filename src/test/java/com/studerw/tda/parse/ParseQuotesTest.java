package com.studerw.tda.parse;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.studerw.tda.model.AssetType;
import com.studerw.tda.model.quote.EquityQuote;
import com.studerw.tda.model.quote.EtfQuote;
import com.studerw.tda.model.quote.ForexQuote;
import com.studerw.tda.model.quote.FutureOptionQuote;
import com.studerw.tda.model.quote.FutureQuote;
import com.studerw.tda.model.quote.IndexQuote;
import com.studerw.tda.model.quote.MutualFundQuote;
import com.studerw.tda.model.quote.OptionQuote;
import com.studerw.tda.model.quote.Quote;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParseQuotesTest {

  //vtsax,msft,NOK/JPY,$SPX.X,msft_061821P65,spy,SIZ9
  private static final Logger LOGGER = LoggerFactory.getLogger(ParseQuotesTest.class);

  @SuppressWarnings(value="unchecked")
  @Test
  @Ignore
  public void parseQuoteTest1() throws IOException {

    Map<String, EquityQuote> map = new HashMap<>();
    try (InputStream in = ParseQuotesTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/parse/equity-quote-resp.json")) {
      map = DefaultMapper.fromJson(in, map.getClass());
      assertThat(map).size().isEqualTo(1);
      EquityQuote equityQuote = map.get("MSFT");
      assertThat(equityQuote).isNotNull();
      assertThat(equityQuote.getAssetType()).isEqualTo(AssetType.EQUITY);
      LOGGER.debug(equityQuote.toString());
    }
  }

  @Test
  @Ignore
  //This isn't needed with the correct Jackson annotations
  public void parseMultiTest() throws IOException {
    try (InputStream in = ParseQuotesTest.class.getClassLoader()
        .getResourceAsStream("com/studerw/tda/parse/quotes-resp.json")) {
      List<Quote> quotes = new ArrayList<>();
      ObjectMapper mapper = new ObjectMapper();

      JsonNode root = mapper.readTree(in);
      Iterator<Entry<String, JsonNode>> iter = root.fields();
      while (iter.hasNext()) {
        Entry<String, JsonNode> next = iter.next();
        LOGGER.debug("{} -> {}", next.getKey(), next.getValue().toString());
        JsonNode jsonNode = next.getValue();
        JsonNode assetType = jsonNode.get("assetType");
        String at = assetType.asText();
        LOGGER.debug("AssetType: {}", at);
        AssetType AT = AssetType.valueOf(at);
        switch (AT) {
          case EQUITY:
            EquityQuote eq = mapper.convertValue(jsonNode, EquityQuote.class);
            quotes.add(eq);
            break;
          case MUTUAL_FUND:
            MutualFundQuote mfq = mapper.convertValue(jsonNode, MutualFundQuote.class);
            quotes.add(mfq);
            break;
          case INDEX:
            IndexQuote iq = mapper.convertValue(jsonNode, IndexQuote.class);
            quotes.add(iq);
            break;
          case ETF:
            EtfQuote etfq = mapper.convertValue(jsonNode, EtfQuote.class);
            quotes.add(etfq);
            break;
          case FOREX:
            ForexQuote fq = mapper.convertValue(jsonNode, ForexQuote.class);
            quotes.add(fq);
            break;
          case OPTION:
            OptionQuote oq = mapper.convertValue(jsonNode, OptionQuote.class);
            quotes.add(oq);
            break;
          case FUTURE:
            FutureQuote fuq = mapper.convertValue(jsonNode, FutureQuote.class);
            quotes.add(fuq);
            break;
          case FUTURE_OPTION:
            FutureOptionQuote foq = mapper.convertValue(jsonNode, FutureOptionQuote.class);
            quotes.add(foq);
            break;
        }
      }

      assertThat(quotes).size().isEqualTo(6);
      assertThat(quotes.get(1).getAssetType()).isEqualTo(AssetType.EQUITY);
    }
  }

  @Test
  public void parseMultiTest2() throws IOException {
    try (InputStream in = ParseQuotesTest.class.getClassLoader()
        .getResourceAsStream("com/studerw/tda/parse/quotes-resp.json")) {

      ObjectMapper mapper = new ObjectMapper();
      Map<String, Quote> map = mapper.readValue(in,
              new TypeReference<LinkedHashMap<String, Quote>>() {});

      LOGGER.debug("{}", map);
      List<Quote> quotes = new ArrayList<>();
      map.forEach((k, v) -> quotes.add(v));
      assertThat(quotes).size().isEqualTo(6);
      assertThat(quotes.get(0).getAssetType()).isEqualTo(AssetType.MUTUAL_FUND);
      assertThat(quotes.get(0)).isInstanceOf(MutualFundQuote.class);
      assertThat(quotes.get(1).getAssetType()).isEqualTo(AssetType.EQUITY);
      assertThat(quotes.get(1)).isInstanceOf(EquityQuote.class);
      assertThat(quotes.get(2).getSymbol()).isEqualTo("NOK/JPY");
      assertThat(quotes.get(2).getAssetType()).isEqualTo(AssetType.FOREX);
      assertThat(quotes.get(2)).isInstanceOf(ForexQuote.class);
      assertThat(quotes.get(3)).isInstanceOf(IndexQuote.class);
      IndexQuote indexQuote = (IndexQuote) quotes.get(3);
      assertThat(indexQuote.getClosePrice().equals(new BigDecimal("2926.46")));
      assertThat(quotes.get(4)).isInstanceOf(OptionQuote.class);
      assertThat(quotes.get(5)).isInstanceOf(EtfQuote.class);

    }
  }
}

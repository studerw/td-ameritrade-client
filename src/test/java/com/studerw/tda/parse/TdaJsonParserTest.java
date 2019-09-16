package com.studerw.tda.parse;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.AssetType;
import com.studerw.tda.model.ParseQuotesTest;
import com.studerw.tda.model.history.Candle;
import com.studerw.tda.model.history.PriceHistory;
import com.studerw.tda.model.quote.EquityQuote;
import com.studerw.tda.model.quote.EtfQuote;
import com.studerw.tda.model.quote.ForexQuote;
import com.studerw.tda.model.quote.IndexQuote;
import com.studerw.tda.model.quote.MutualFundQuote;
import com.studerw.tda.model.quote.OptionQuote;
import com.studerw.tda.model.quote.Quote;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TdaJsonParserTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(TdaJsonParserTest.class);
  private TdaJsonParser tdaJsonParser = new TdaJsonParser();

  @Test
  public void parseQuoteTest() throws IOException {
    try (InputStream in = ParseQuotesTest.class.getClassLoader().
        getResourceAsStream("com/studerw/tda/parse/equity-quote-resp.json")) {
      List<Quote> quotes = tdaJsonParser.parseQuotes(in);
      assertThat(quotes).size().isEqualTo(1);
      EquityQuote equityQuote = (EquityQuote) quotes.get(0);
      assertThat(equityQuote).isInstanceOf(EquityQuote.class);
      assertThat(equityQuote.getAssetType()).isEqualTo(AssetType.EQUITY);
      assertThat(equityQuote).isNotNull();
      assertThat(equityQuote.getOpenPrice()).isEqualTo(new BigDecimal("139.15"));
      LOGGER.debug(equityQuote.toString());
    }
  }

  @Test
  public void parseQuotesTest() throws IOException {
    try (InputStream in = ParseQuotesTest.class.getClassLoader()
        .getResourceAsStream("com/studerw/tda/parse/quotes-resp.json")) {
      List<Quote> quotes = tdaJsonParser.parseQuotes(in);
      quotes.forEach(quote -> LOGGER.debug(quote.toString()));
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
      assertThat(indexQuote.getClosePrice().equals(new BigDecimal(2926.46)));
      assertThat(quotes.get(4)).isInstanceOf(OptionQuote.class);
      assertThat(quotes.get(5)).isInstanceOf(EtfQuote.class);
    }
  }

  @Test
  public void parsePriceHistoryTest() throws Exception {
    try (InputStream in = ParseQuotesTest.class.getClassLoader()
        .getResourceAsStream("com/studerw/tda/parse/price_history_resp.json")) {
      PriceHistory priceHistory = tdaJsonParser.parsePriceHistory(in);
      assertThat(priceHistory).isNotNull();
      assertThat(priceHistory.getCandles().size()).isEqualTo(5418);
      assertThat(priceHistory.getSymbol()).isEqualTo("MSFT");
      assertThat(priceHistory.isEmpty()).isFalse();
      LOGGER.debug(priceHistory.toString());
      Candle candle = priceHistory.getCandles().get(5416);
      LOGGER.debug(candle.toString());
      assertThat(candle.getOpen()).isEqualTo(new BigDecimal("137.15"));
      assertThat(candle.getHigh()).isEqualTo(new BigDecimal("137.15"));
      assertThat(candle.getLow()).isEqualTo(new BigDecimal("137.15"));
      assertThat(candle.getClose()).isEqualTo(new BigDecimal("137.15"));
      assertThat(candle.getVolume()).isEqualTo(530);
      assertThat(candle.getDatetime()).isEqualTo(1568417880000L);

    }
  }

}
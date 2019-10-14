package com.studerw.tda.parse;

import static org.assertj.core.api.Assertions.assertThat;

import com.studerw.tda.model.AssetType;
import com.studerw.tda.model.ParseQuotesTest;
import com.studerw.tda.model.account.CashEquivalentInstrument;
import com.studerw.tda.model.account.Instrument;
import com.studerw.tda.model.account.MarginAccount;
import com.studerw.tda.model.account.Position;
import com.studerw.tda.model.account.SecuritiesAccount;
import com.studerw.tda.model.account.SecuritiesAccount.Type;
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
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
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
        .getResourceAsStream("com/studerw/tda/parse/price-history-resp.json")) {
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

  @Test
  public void parseAccountTest() throws Exception{
    try (InputStream in = ParseQuotesTest.class.getClassLoader()
        .getResourceAsStream("com/studerw/tda/parse/account-resp.json")) {
      final SecuritiesAccount account = tdaJsonParser.parseAccount(in);
      assertThat(account).isNotNull();
      assertThat(account.getAccountId()).isEqualTo("1234567890");
      assertThat(account.getType()).isEqualTo(Type.MARGIN);
      assertThat(account).isInstanceOf(MarginAccount.class);
      assertThat(account.getDayTrader()).isFalse();
      LOGGER.debug(account.toString());

      MarginAccount marginAccount = (MarginAccount)account;
      assertThat(marginAccount.getInitialBalances().getAvailableFundsNonMarginableTrade())
          .isEqualTo(new BigDecimal("2023.58"));
      assertThat(marginAccount.getInitialBalances().getBuyingPower())
          .isEqualTo(new BigDecimal("4047.16"));
      assertThat(marginAccount.getInitialBalances().getMaintenanceCall())
          .isEqualTo(new BigDecimal("0.0"));

      assertThat(marginAccount.getCurrentBalances().getMaintenanceCall())
          .isEqualTo(new BigDecimal("0.0"));

      assertThat(marginAccount.getCurrentBalances().getMoneyMarketFund())
          .isEqualTo(new BigDecimal("0.0"));

      assertThat(marginAccount.getPositions()).size().isEqualTo(2);

      Position pos1 = marginAccount.getPositions().get(0);
      assertThat(pos1.getMarketValue()).isEqualTo(new BigDecimal("200.72"));
      assertThat(pos1.getAveragePrice()).isEqualTo(new BigDecimal("1"));
      assertThat(pos1.getSettledShortQuantity()).isEqualTo(new BigDecimal("0.0"));

      Instrument inst1 = pos1.getInstrument();
      assertThat(inst1 != null);
      assertThat(inst1 instanceof CashEquivalentInstrument);
      assertThat(inst1.getAssetType().equals(Instrument.AssetType.CASH_EQUIVALENT));
//      assertThat(inst1.type.equals(Instrument.AssetType.CASH_EQUIVALENT));



//        assertThat(account.get)

    }
  }
}


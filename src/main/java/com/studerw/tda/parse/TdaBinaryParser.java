package com.studerw.tda.parse;

import com.studerw.tda.model.PriceHistory;
import com.studerw.tda.model.PriceHistory.ChartBar;
import com.studerw.tda.model.PriceHistory.Result;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TdaBinaryParser {

  private static final Logger LOGGER = LoggerFactory.getLogger(TdaBinaryParser.class);
  byte[] EOF_BYTES ={(byte) 0xff, (byte) 0xff};

  public PriceHistory parsePriceHistory(byte[] bytes) {
    LOGGER.debug("length of bytes: {}", bytes.length);
    PriceHistory priceHistory = new PriceHistory();
    try (DataInputStream in = new DataInputStream(new ByteArrayInputStream(bytes))) {
      int count = in.readInt();
      LOGGER.debug("Count of results: {}", count);

      List<Result> results = new ArrayList<>();
      for (int i = 0; i < count; ++i) {
        Result result = parsePhResult(in);
        results.add(result);
      }
      priceHistory.setResults(results);

      byte[] lastTwo = IOUtils.readFully(in, 2);
      if (!Arrays.equals(lastTwo, EOF_BYTES)){
        throw new IllegalStateException("Expected last two bytes: 0xff 0xff");
      }
      if (in.read() != -1){
        throw new IllegalStateException("Expected EOF (-1) from InputStream");
      }

      return priceHistory;

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private PriceHistory.Result parsePhResult(DataInputStream in) throws IOException {
    PriceHistory.Result result = new PriceHistory.Result();
    short symbolLength = in.readShort();
    LOGGER.debug("SymbolLength: {}", symbolLength);
    String symbol = parseTdaString(symbolLength, in);
    result.setSymbol(symbol);
    LOGGER.debug("symbol: {}", symbol);

    byte errorCode = in.readByte();
    //error
    if (errorCode == 1){
      LOGGER.warn("Got an error code of 1 for symbol: {}", symbol);
      result.setError(true);
      short errorLength  = in.readShort();

      result.setErrorMsg(parseTdaString(errorLength, in));
      LOGGER.debug("errorMsg: {}", result.getErrorMsg());
    }
    //OK
    else if(errorCode == 0) {
      result.setError(false);

      List<ChartBar> chartBars = new ArrayList<>();
      int chartBarCount = in.readInt();
      LOGGER.debug("symbol[{}] - number of chartBars: {}", symbol, chartBarCount);

      for (int i = 0; i < chartBarCount; ++i) {
        ChartBar chartBar = parsePhChartBar(in);
        chartBars.add(chartBar);
      }

      result.setChartBars(chartBars);
    }
    //WTF?
    else {
      throw new IllegalStateException("Expected error code of one byte(0 OR 1)");
    }

    return result;
  }

  private String parseTdaString(int count, DataInputStream dataInputStream) throws IOException {
    byte[] bytes = IOUtils.readFully(dataInputStream, count);
    String str = new String(bytes, StandardCharsets.UTF_8);
    return str;
  }

  private PriceHistory.ChartBar parsePhChartBar(DataInputStream in) throws IOException {
//    byte[] close = IOUtils.readFully(in, 4);
    Float close = in.readFloat();
//    byte[] high = IOUtils.readFully(in, 4);
    Float high = in.readFloat();
//    byte[] low = IOUtils.readFully(in, 4);
    Float low = in.readFloat();
//    byte[] open= IOUtils.readFully(in, 4);
    Float open = in.readFloat();
//    byte[] volume = IOUtils.readFully(in, 4);
    Float volume = in.readFloat();
//    byte[] timestamp = IOUtils.readFully(in, 8);
    Long timestamp = in.readLong();
    LOGGER.debug(String.format("Raw prices: close=%.5f, high=%.5f, low=%.5f, open=%.5f, volume=%.5f, timestamp={}",
        close, high, low, open, volume, timestamp));

    ChartBar chartBar = new ChartBar();
    chartBar.setClose(new BigDecimal(close).setScale(2, RoundingMode.CEILING));
    chartBar.setHigh(new BigDecimal(high).setScale(2, RoundingMode.CEILING));
    chartBar.setLow(new BigDecimal(low).setScale(2, RoundingMode.CEILING));
    chartBar.setOpen(new BigDecimal(open).setScale(2, RoundingMode.CEILING));
    chartBar.setVolume(new BigDecimal(volume * 100.0).setScale(0, RoundingMode.CEILING));
    chartBar.setTimestamp(timestamp);

    return chartBar;
  }
}
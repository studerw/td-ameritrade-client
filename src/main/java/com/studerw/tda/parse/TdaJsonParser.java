package com.studerw.tda.parse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.studerw.tda.model.history.PriceHistory;
import com.studerw.tda.model.quote.Quote;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TdaJsonParser {

  private static final Logger LOGGER = LoggerFactory.getLogger(TdaJsonParser.class);

  /**
   * @param in inputstream of JSON from rest call to TDA. The stream will be closed upon return.
   * @return list of objects that extend Quote.
   */
  public List<Quote> parseQuotes(InputStream in) {
    LOGGER.trace("parsing quotes...");
    try (BufferedInputStream bIn = new BufferedInputStream(in)) {
      LinkedHashMap<String, Quote> quotesMap = new LinkedHashMap<>();
      quotesMap = DefaultMapper.fromJson(in, new TypeReference<LinkedHashMap<String, Quote>>() {
      });
      LOGGER.debug("returned a map of size: {}", quotesMap.size());

      List<Quote> quotes = new ArrayList<>();
      quotesMap.forEach((k, v) -> quotes.add(v));
      return quotes;
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  /**
   *
   * @param in {@link InputStream} of JSON from TDA; the stream will be closed upon return.
   * @return PriceHistory
   */
  public PriceHistory parsePriceHistory(InputStream in) {
    LOGGER.trace("parsing quotes...");
    try (BufferedInputStream bIn = new BufferedInputStream(in)) {
      final PriceHistory priceHistory = DefaultMapper.fromJson(in, PriceHistory.class);
      LOGGER.debug("returned a price history for {} of size: {}", priceHistory.getSymbol(), priceHistory.getCandles().size());
      return priceHistory;
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

//  public <T> T parseTdaJson(InputStream in, Class<T> type){
//    try (BufferedInputStream bIn = new BufferedInputStream(in)) {
//      LOGGER.debug("parsing JSON input to type: {}", type.getName());
//      final T tdaPojo = DefaultMapper.fromJson(in, new TypeReference<T>(){});
//      return tdaPojo;
//    } catch (IOException e) {
//      e.printStackTrace();
//      throw new RuntimeException(e);
//    }
//  }
}

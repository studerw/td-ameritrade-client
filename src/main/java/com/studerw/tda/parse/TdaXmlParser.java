package com.studerw.tda.parse;

import com.studerw.tda.model.BalancesAndPositions;
import com.studerw.tda.model.Logout;
import com.studerw.tda.model.OptionChain;
import com.studerw.tda.model.OptionTradeResponse;
import com.studerw.tda.model.OrderStatus;
import com.studerw.tda.model.QuoteResponse;
import com.studerw.tda.model.QuoteResponseBetter;
import com.studerw.tda.model.SymbolLookupResponse;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is responsible for parsing XML (non-binary) responses
 * from the TDA Server API and converts them to model POJOs.
 * It assumes all XML is well-formed UTF-8.
 *
 * It uses JAXB to convert XML to pojos. None of these methods throw checked exceptions,
 * but if an error occurs, an unchecked IllegalStateException is thrown with the wrapped
 * JAXB or other error.
 */
public class TdaXmlParser {

  private static final Logger LOGGER = LoggerFactory.getLogger(TdaXmlParser.class);

  public TdaXmlParser() {}

//    protected <T> parseXml(T type, String xml){
//        try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)){
//            LOGGER.debug("unmarshalling xml to pojo of type: {}", type.getClass().getName());
//            JAXBContext context = JAXBContext.newInstance(type.getClass());
//            Unmarshaller um = context.createUnmarshaller();
//            final T obj = (T)um.unmarshal(in);
//            login.setOriginalXml(xml);
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new IllegalStateException("Error parsing login");
//        }
//    }


  public QuoteResponse parseQuoteResponse(String xml) {
    try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)) {
      JAXBContext context = JAXBContext.newInstance(QuoteResponse.class);
      Unmarshaller um = context.createUnmarshaller();
      QuoteResponse quoteResponse = (QuoteResponse) um.unmarshal(in);
      quoteResponse.setOriginalXml(xml);
      if (quoteResponse.getResult().equalsIgnoreCase("FAIL")) {
        quoteResponse.setTdaError(true);
      }
      return quoteResponse;
    } catch (Exception e) {
      e.printStackTrace();
      throw new IllegalStateException("Error parsing Quote Response");
    }
  }

  public OrderStatus parseOrderStatus(String xml) {
    try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)) {
      JAXBContext context = JAXBContext.newInstance(OrderStatus.class);
      Unmarshaller um = context.createUnmarshaller();
      OrderStatus orderStatus = (OrderStatus) um.unmarshal(in);
      orderStatus.setOriginalXml(xml);
      return orderStatus;
    } catch (Exception e) {
      e.printStackTrace();
      throw new IllegalStateException("Error parsing Order Status");
    }

  }

  public BalancesAndPositions parseBalances(String xml) {
    try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)) {
      JAXBContext context = JAXBContext.newInstance(BalancesAndPositions.class);
      Unmarshaller um = context.createUnmarshaller();
      BalancesAndPositions balances = (BalancesAndPositions) um.unmarshal(in);
      balances.setOriginalXml(xml);
      return balances;
    } catch (Exception e) {
      e.printStackTrace();
      throw new IllegalStateException("Error parsing balances");
    }
  }

  public OptionTradeResponse parseOptionTradeResponse(String xml) {
    try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)) {
      JAXBContext context = JAXBContext.newInstance(OptionTradeResponse.class);
      Unmarshaller um = context.createUnmarshaller();
      OptionTradeResponse optionTradeResponse = (OptionTradeResponse) um.unmarshal(in);
      optionTradeResponse.setOriginalXml(xml);
      return optionTradeResponse;
    } catch (Exception e) {
      e.printStackTrace();
      throw new IllegalStateException("Error parsing option trade response");
    }
  }

  public OptionChain parseOptionChain(String xml) {
    try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)) {
      JAXBContext context = JAXBContext.newInstance(OptionChain.class);
      Unmarshaller um = context.createUnmarshaller();
      OptionChain optionChain = (OptionChain) um.unmarshal(in);
      optionChain.setOriginalXml(xml);
      return optionChain;
    } catch (Exception e) {
      e.printStackTrace();
      throw new IllegalStateException("Error parsing optionChain");
    }
  }

  public Logout parseLogout(String xml) {
    try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)) {
      JAXBContext context = JAXBContext.newInstance(Logout.class);
      Unmarshaller um = context.createUnmarshaller();
      return (Logout) um.unmarshal(in);
    } catch (Exception e) {
      e.printStackTrace();
      throw new IllegalStateException("Error parsing Logout");
    }
  }

  public SymbolLookupResponse parseSymbolLookupResponse(String xml) {
    try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)) {
      JAXBContext context = JAXBContext.newInstance(SymbolLookupResponse.class);
      Unmarshaller um = context.createUnmarshaller();
      final SymbolLookupResponse result = (SymbolLookupResponse) um.unmarshal(in);
      result.setOriginalXml(xml);
      if (result.getResult().equalsIgnoreCase("FAIL")) {
        result.setTdaError(true);
      }
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      throw new IllegalStateException("Error parsing symbolLookupResponse");
    }
  }

    public QuoteResponseBetter parseQuoteResponseBetter(String xml) {
      try (InputStream in = IOUtils.toInputStream(xml, StandardCharsets.UTF_8)) {
        JAXBContext context = JAXBContext.newInstance(QuoteResponseBetter.class);
        Unmarshaller um = context.createUnmarshaller();
        QuoteResponseBetter quoteResponse = (QuoteResponseBetter) um.unmarshal(in);
        quoteResponse.setOriginalXml(xml);
        if (quoteResponse.getResult().equalsIgnoreCase("FAIL")) {
          quoteResponse.setTdaError(true);
        }
        return quoteResponse;
      } catch (Exception e) {
        e.printStackTrace();
        throw new IllegalStateException("Error parsing QuoteResponseBetter");
      }
    }
}

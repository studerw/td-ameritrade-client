package com.studerw.tda.model;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * TD Ameritrade date format: 2017-12-06 23:06:14 EST
 */
public class ZonedDateTimeAdapter extends XmlAdapter<String, ZonedDateTime> {

  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

  @Override
  public String marshal(ZonedDateTime v) throws Exception {
//        final String format = v.format(formatter);
//        System.out.println(format);
    return formatter.format(v);
  }

  @Override
  public ZonedDateTime unmarshal(String v) throws Exception {
    return ZonedDateTime.parse(v, formatter);
  }
}

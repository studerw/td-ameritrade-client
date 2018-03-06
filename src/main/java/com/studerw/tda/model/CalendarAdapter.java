package com.studerw.tda.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * TD Ameritrade date format: 2017-12-06 23:06:14 EST
 */
public class CalendarAdapter extends XmlAdapter<String, Calendar> {

  @Override
  public String marshal(Calendar v) throws Exception {

    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
    return dateFormat.format(v.getTime());
  }

  @Override
  public Calendar unmarshal(String v) throws Exception {
    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar tCalendar = Calendar.getInstance();
    tCalendar.setTime(dateFormat.parse(v));
    return tCalendar;
  }
}

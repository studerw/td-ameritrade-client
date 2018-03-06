@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(value = CalendarAdapter.class, type = Calendar.class),
    @XmlJavaTypeAdapter(value = ZonedDateTimeAdapter.class, type = ZonedDateTime.class)
})
@XmlAccessorType(XmlAccessType.FIELD)
//@javax.xml.bind.annotation.XmlSchema(namespace = "http://tdameritrade.api.com/")
    package com.studerw.tda.model;

import java.time.ZonedDateTime;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;


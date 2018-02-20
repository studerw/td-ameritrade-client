package com.studerw.tda.model;

import static org.junit.Assert.assertEquals;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZonedDateTimeAdapterTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZonedDateTimeAdapterTest.class);

    @Test
    public void testMarshal() throws Exception {
        final String dateStr = "2017-12-06 23:06:14 EST";
        final ZonedDateTimeAdapter zonedDateTimeAdapter = new ZonedDateTimeAdapter();
        final ZonedDateTime zdt = zonedDateTimeAdapter.unmarshal(dateStr);
        LOGGER.debug(zdt.toString());
        assertEquals("year should be 2017", zdt.getYear(), 2017);
        assertEquals("year should be 23", zdt.getHour(), 23);
        assertEquals("seconds should be 14", zdt.getSecond(), 14);
        LOGGER.debug("zone={}", zdt.getZone());
    }

    @Test
    public void testUnmarshal() throws Exception {
        ZonedDateTime zdt = ZonedDateTime.of(2017,
            12,
            6,
            23,
            6,
            14,
            0,
            ZoneId.of(ZoneId.SHORT_IDS.get("EST")));
        final ZonedDateTimeAdapter zonedDateTimeAdapter = new ZonedDateTimeAdapter();
        final String zdtStr = zonedDateTimeAdapter.marshal(zdt);
        LOGGER.debug(zdtStr);


    }
}

//package com.studerw.tda.model.trade;
//
//import java.math.BigDecimal;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class OptionOrderAgora {
//    private static final Logger LOGGER = LoggerFactory.getLogger(OptionOrderAgora.class);
//
//    private String symbol;
//    private String year;
//    private String month;
//    private String day;
//    private String putOrCall;
//    private BigDecimal strike;
//    private BigDecimal limit;
//    private Integer quantity;
//
//    public BigDecimal getLimit() {
//        return limit;
//    }
//
//    public void setLimit(BigDecimal limit) {
//        this.limit = limit;
//    }
//
//    public String getSymbol() {
//        return symbol;
//    }
//
//    public void setSymbol(String symbol) {
//        this.symbol = symbol;
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//    public void setYear(String year) {
//        this.year = year;
//    }
//
//    public String getMonth() {
//        return month;
//    }
//
//    public void setMonth(String month) {
//        this.month = month;
//    }
//
//    public String getDay() {
//        return day;
//    }
//
//    public void setDay(String day) {
//        this.day = day;
//    }
//
//    public String getPutOrCall() {
//        return putOrCall;
//    }
//
//    public void setPutOrCall(String putOrCall) {
//        this.putOrCall = putOrCall;
//    }
//
//    public BigDecimal getStrike() {
//        return strike;
//    }
//
//    public void setStrike(BigDecimal strike) {
//        this.strike = strike;
//    }
//
//    public boolean isCall(){
//        return "C".equalsIgnoreCase(this.getPutOrCall());
//    }
//
//    public boolean isPut(){
//        return "P".equalsIgnoreCase(this.getPutOrCall());
//    }
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//
//    //APC171117C00049000 -> APC_17111749
//    //APC171117C00049500 -> APC_17111749.5
//    public String getTdaTicker(){
//        StringBuilder temp= new StringBuilder();
//        temp.append(this.getSymbol().toUpperCase());
//        temp.append("_");
//        temp.append(this.getMonth());
//        temp.append(this.getDay());
//        temp.append(this.getYear());
//        temp.append(this.getPutOrCall().toUpperCase());
//        temp.append(this.getStrike().stripTrailingZeros().toPlainString());
//        return temp.toString();
//    }
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("OptionOrder{");
//        sb.append("symbol='").append(symbol).append('\'');
//        sb.append(", year='").append(year).append('\'');
//        sb.append(", month='").append(month).append('\'');
//        sb.append(", day='").append(day).append('\'');
//        sb.append(", putOrCall='").append(putOrCall).append('\'');
//        sb.append(", strike=").append(strike);
//        sb.append(", limit=").append(limit);
//        sb.append(", quantity=").append(quantity);
//        sb.append('}');
//        return sb.toString();
//    }
//}

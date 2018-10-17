package com.example.currencyexchange.exchanger.table;

import java.math.BigDecimal;

public class NbpExchangeTabRateResponse {

    private String code;
    private BigDecimal bid;
    private BigDecimal ask;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }
}

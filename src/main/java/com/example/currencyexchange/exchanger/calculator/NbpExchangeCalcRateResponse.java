package com.example.currencyexchange.exchanger.calculator;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NbpExchangeCalcRateResponse {

    private String no;
    private LocalDate effectiveDate;
    private BigDecimal mid;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }
}

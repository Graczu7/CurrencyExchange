package com.example.currencyexchange.model;

import org.springframework.http.HttpStatus;

import java.math.BigDecimal;

public class ExchangeResult {


    //końcowy wynik, to zwracamy na JSP
    private BigDecimal value;
    private String errror;
    private HttpStatus status;

    public ExchangeResult(BigDecimal value, String errror, HttpStatus status) {
        this.value = value;
        this.errror = errror;
        this.status = status;
    }


    public BigDecimal getValue() {
        return value;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    public String getErrror() {
        return errror;
    }
    public void setErrror(String errror) {
        this.errror = errror;
    }
    public HttpStatus getStatus() {
        return status;
    }
    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}

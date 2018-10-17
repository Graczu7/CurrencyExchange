package com.example.currencyexchange.exchanger.calculator;

import org.springframework.http.HttpStatus;

import java.math.BigDecimal;

public class ExchangeResult {

    //końcowy wynik, to zwracamy na JSP
    private BigDecimal value;
    private String error;
    private HttpStatus status;

    public ExchangeResult(BigDecimal value, String error, HttpStatus status) {
        this.value = value;
        this.error = error;
        this.status = status;
    }

    public ExchangeResult(BigDecimal value, HttpStatus status) {
        this.value = value;
        this.status = status;
    }

    public ExchangeResult(String error, HttpStatus status) {
        this.error = error;
        this.status = status;
    }

    public BigDecimal getValue() {
        return value;
    }
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public HttpStatus getStatus() {
        return status;
    }
    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}

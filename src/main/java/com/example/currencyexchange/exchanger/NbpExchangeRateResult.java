package com.example.currencyexchange.exchanger;

import java.math.BigDecimal;

public class NbpExchangeRateResult {

    private Boolean status;
    private String messeageError;
    private BigDecimal currencyValue;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMesseageError() {
        return messeageError;
    }

    public void setMesseageError(String messeageError) {
        this.messeageError = messeageError;
    }

    public BigDecimal getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(BigDecimal currencyValue) {
        this.currencyValue = currencyValue;
    }
}

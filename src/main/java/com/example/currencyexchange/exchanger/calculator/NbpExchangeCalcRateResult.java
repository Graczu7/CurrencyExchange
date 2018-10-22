package com.example.currencyexchange.exchanger.calculator;

import java.math.BigDecimal;

public class NbpExchangeCalcRateResult {
//?
    private BigDecimal rate;
    private String Error;
    private Boolean success;

    public NbpExchangeCalcRateResult(BigDecimal rate, String error, Boolean success) {
        this.rate = rate;
        Error = error;
        this.success = success;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public NbpExchangeCalcRateResult(BigDecimal rate, Boolean success){
        this.rate = rate;
        this.success = success;
    }
}

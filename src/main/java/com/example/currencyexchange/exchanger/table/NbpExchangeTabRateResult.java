package com.example.currencyexchange.exchanger.table;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class NbpExchangeTabRateResult {

    private List<NbpExchangeTabRateResponse> rates = new LinkedList<>();
    private String Error;
    private Boolean success;

    public NbpExchangeTabRateResult(List<NbpExchangeTabRateResult> rates, String error, Boolean success) {
        this.rates = rates;
        Error = error;
        this.success = success;
    }

    public List<NbpExchangeTabRateResult> getRates() {
        return rates;
    }

    public void setRates(List<NbpExchangeTabRateResult> rates) {
        this.rates = rates;
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
}

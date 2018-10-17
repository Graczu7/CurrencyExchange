package com.example.currencyexchange.exchanger.table;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class NbpExchangeTabRateResult {

    private List<NbpExchangeTabRateResponse> rates;
    private String error;
    private Boolean success;

    public NbpExchangeTabRateResult(List<NbpExchangeTabRateResponse> rates, String error, Boolean success) {
        this.rates = rates;
        this.error = error;
        this.success = success;
    }
}

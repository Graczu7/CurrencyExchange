package com.example.currencyexchange.exchanger.table;

import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
public class NbpExchangeTabRateResult {

    private List<NbpExchangeTabRateResponse> rates;
    private String error;
    private Boolean success;

    public NbpExchangeTabRateResult(List<NbpExchangeTabRateResponse> rates, String error, Boolean success) {
        this.rates = rates;
        this.error = error;
        this.success = success;
    }

    public NbpExchangeTabRateResult(String error) {
        this.error = error;
    }
}

package com.example.currencyexchange.exchanger.calculator;
import java.util.LinkedList;
import java.util.List;

public class NbpExchangeCalcSeriesResponse {

    private String table;
    private String currency;
    private String code;
    private List<NbpExchangeCalcRateResponse> rates = new LinkedList<>();

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<NbpExchangeCalcRateResponse> getRates() {
        return rates;
    }

    public void setRates(List<NbpExchangeCalcRateResponse> rates) {
        this.rates = rates;
    }
}

package com.example.currencyexchange.model;

import java.util.LinkedList;
import java.util.List;

public class NBPJasonModel {

    private String table;
    private String currency;
    private String code;
    private List<NBPJasonRateModel> rates = new LinkedList<>();

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

    public List<NBPJasonRateModel> getRates() {
        return rates;
    }

    public void setRates(List<NBPJasonRateModel> rates) {
        this.rates = rates;
    }
}

package com.example.currencyexchange.model;

public enum Currency {
    ;

    private String code;

    Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

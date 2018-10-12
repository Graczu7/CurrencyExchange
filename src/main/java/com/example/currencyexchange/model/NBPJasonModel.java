package com.example.currencyexchange.model;

import java.util.LinkedList;
import java.util.List;

public class NBPJasonModel {

    public String table;
    public String currency;
    public String code;
    public List<NBPJasonModel> list = new LinkedList<>();

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

    public List<NBPJasonModel> getList() {
        return list;
    }

    public void setList(List<NBPJasonModel> list) {
        this.list = list;
    }
}

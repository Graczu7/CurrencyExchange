package com.example.currencyexchange.controller;

import com.example.currencyexchange.exchanger.calculator.*;
import com.example.currencyexchange.exchanger.table.NbpExchangeTabRateResponse;
import com.example.currencyexchange.exchanger.table.NbpExchangeTabRateResult;
import com.example.currencyexchange.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

    @Autowired
    CurrencyExchangeService currencyExchangeService;

    @PostMapping("/exchange")
    public ResponseEntity<ExchangeResult> exchange(@RequestBody ExchangeRequest exchangeRequest) {
        ExchangeResult exchange = currencyExchangeService.exchange(exchangeRequest);
        return new ResponseEntity<>(exchange, exchange.getStatus());
    }

    @PostMapping("/compareCurrency")
    public ResponseEntity<NbpExchangeTabRateResult> compareCurrency() {
        NbpExchangeTabRateResult compareCurrency = currencyExchangeService.compareCurrency();
        return new ResponseEntity<>(compareCurrency, HttpStatus.OK);
    }

}
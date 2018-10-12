package com.example.currencyexchange.controller;

import com.example.currencyexchange.model.ExchangeRequest;
import com.example.currencyexchange.model.ExchangeResult;
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
        return new ResponseEntity<>(exchange,HttpStatus.OK);
    }
}

//done        Utworzenie serwisu CurrencyExchangeService
// done       Wszystknięcie serwisu do kontrolera @Autowired
// done       Utworzenie metody public ExchangeResult exchange(ExchangeRequest request) w serwisie
//done?       Wywołanie metody exchange w obecnej metodzie w obiekcie ResponseEntity
//   done?     Utworzenie klasy NbpCurrencyExchangeDownloader w ktorym wstrzykniemy obiekt RestTemplate  //najpierw zrobić restTemplate?
//        Utworzenie metody w NbpCurrencyExchangeDownloader o definicji public {BigDecimal rate, String error, Boolean result} download(String currency, LocalDate date)
//        Wszykniecie powyzej klasy do serwisu
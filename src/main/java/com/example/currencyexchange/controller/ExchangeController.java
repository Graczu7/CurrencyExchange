package com.example.currencyexchange.controller;

import com.example.currencyexchange.model.ExchangeRequest;
import com.example.currencyexchange.model.ExchangeResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

    @PostMapping("/exchange")
    public ResponseEntity<ExchangeResult> exchange(@RequestBody ExchangeRequest exchangeRequest) {

//        Utworzenie serwisu CurrencyExchangeService
//        Wszystknięcie serwisu do kontrolera @Autowired
//        Utworzenie metody public ExchangeResult exchange(ExchangeRequest request) w serwisie
//        Wywołanie metody exchange w obecnej metodzie w obiekcie ResponseEntity
//        Utworzenie klasy NbpCurrencyExchangeDownloader w ktorym wstrzykniemy obiekt RestTemplate
//        Utworzenie metody w NbpCurrencyExchangeDownloader o definicji public {BigDecimal rate, String error, Boolean result} download(String currency, LocalDate date)
//        Wszykniecie powyzej klasy do serwisu
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

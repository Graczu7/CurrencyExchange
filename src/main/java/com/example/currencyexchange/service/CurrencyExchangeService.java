package com.example.currencyexchange.service;


import com.example.currencyexchange.model.ExchangeRequest;
import com.example.currencyexchange.model.ExchangeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    @Autowired

    public ExchangeResult exchange(ExchangeRequest request){


        return new ExchangeResult();
    }
}
//        Utworzenie serwisu CurrencyExchangeService
//        Wszystknięcie serwisu do kontrolera @Autowired
//        Utworzenie metody public ExchangeResult exchange(ExchangeRequest request) w serwisie
//        Wywołanie metody exchange w obecnej metodzie w obiekcie ResponseEntity
//        Utworzenie klasy NbpCurrencyExchangeDownloader w ktorym wstrzykniemy obiekt RestTemplate
//        Utworzenie metody w NbpCurrencyExchangeDownloader o definicji public {BigDecimal rate, String error, Boolean result} download(String currency, LocalDate date)
//        Wszykniecie powyzej klasy do serwisu
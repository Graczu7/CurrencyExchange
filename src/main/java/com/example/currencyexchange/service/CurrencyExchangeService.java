package com.example.currencyexchange.service;

import com.example.currencyexchange.exchanger.NbpExchangeRateDownloader;
import com.example.currencyexchange.exchanger.NbpExchangeRateResult;
import com.example.currencyexchange.model.ExchangeRequest;
import com.example.currencyexchange.model.ExchangeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class CurrencyExchangeService {

    @Autowired
    NbpExchangeRateDownloader nbpExchangeRateDownloader;

    public ExchangeResult exchange(ExchangeRequest request){
        NbpExchangeRateResult result = nbpExchangeRateDownloader.download(request.getCurrency(), request.getExchangeDate());
        BigDecimal rateNBP = result.getRate();
        BigDecimal amountToExchange = request.getValue();
        if (result.getSuccess()) {
            BigDecimal amountAfterExchange = amountToExchange.divide(rateNBP);
            return new ExchangeResult(amountAfterExchange, HttpStatus.OK);
        }
        return new ExchangeResult(result.getError(), HttpStatus.BAD_REQUEST);
    }
}
//        Utworzenie serwisu CurrencyExchangdeService
//        Wszystknięcie serwisu do kontrolera @Autowired
//        Utworzenie metody public ExchangeResult exchange(ExchangeRequest request) w serwisie
//        Wywołanie metody exchange w obecnej metodzie w obiekcie ResponseEntity
//        Utworzenie klasy NbpCurrencyExchangeDownloader w ktorym wstrzykniemy obiekt RestTemplate
//        Utworzenie metody w NbpCurrencyExchangeDownloader o definicji public {BigDecimal rate, String error, Boolean result} download(String currency, LocalDate date)
//        Wszykniecie powyzej klasy do serwisu
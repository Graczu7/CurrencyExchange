package com.example.currencyexchange.exchanger;

import com.example.currencyexchange.model.DownloaderRateModel;
import com.example.currencyexchange.model.ExchangeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;
@Component
public class NbpExchangeRateDownloader {

   @Autowired
   RestTemplate restTemplate;

   final String ROOT_URI ="http://localhost:8090/index.jsp";
    public DownloaderRateModel download(String currency, LocalDate date){

        //łączy się z NBP i zwraca dla danej waluty rate do dzielnia
        return new DownloaderRateModel();
    }


}

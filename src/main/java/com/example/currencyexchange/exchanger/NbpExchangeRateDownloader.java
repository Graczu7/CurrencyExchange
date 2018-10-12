package com.example.currencyexchange.exchanger;

import com.example.currencyexchange.model.DownloaderRateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NbpExchangeRateDownloader {

   @Autowired
   RestTemplate restTemplate;


    public DownloaderRateModel download(String currency, LocalDate date){
    
        //łączy się z NBP i zwraca dla danej waluty rate do dzielnia
        return new DownloaderRateModel();
    }
}

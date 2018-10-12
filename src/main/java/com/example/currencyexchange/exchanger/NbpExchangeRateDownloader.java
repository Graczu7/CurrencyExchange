package com.example.currencyexchange.exchanger;

import com.example.currencyexchange.model.DownloaderRateModel;
import com.example.currencyexchange.model.NBPJasonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;
@Component
public class NbpExchangeRateDownloader {
    final String ROOT_URI ="http://api.nbp.pl/api/exchangerates/rates/A/code}/{date}/";

    private final RestTemplate restTemplate;
    boolean setStatus = false;

    @Autowired
    public NbpExchangeRateDownloader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DownloaderRateModel download(String currency, LocalDate date) {
        try {
            NBPJasonModel forObject = restTemplate.getForObject(ROOT_URI, NBPJasonModel.class);
            NbpExchangeRateResult nbpExchangeRateResult = new NbpExchangeRateResult();
            setStatus = true;

            //łączy się z NBP i zwraca dla danej waluty rate do dzielnia

        } catch(HttpClientErrorException e){
           String error = "Connect failure";
            System.out.println(error);
        }
        return ;
    }
}

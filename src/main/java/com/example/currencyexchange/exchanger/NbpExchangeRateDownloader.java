package com.example.currencyexchange.exchanger;

import com.example.currencyexchange.model.DownloaderRateModel;
import com.example.currencyexchange.model.NBPJasonModel;
import com.example.currencyexchange.model.NBPJasonRateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;
@Component
public class NbpExchangeRateDownloader {
    final String ROOT_URI ="http://api.nbp.pl/api/exchangerates/rates/A/code}/{date}/";
    private final RestTemplate restTemplate;
    private boolean setStatus = false;
    private HttpStatus status404 = HttpStatus.valueOf(404);

    @Autowired
    public NbpExchangeRateDownloader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DownloaderRateModel download(String currency, LocalDate date) {
        try {
            NBPJasonModel jasonObject = restTemplate.getForObject(ROOT_URI, NBPJasonModel.class);
            NbpExchangeRateResult nbpExchangeRateResult = new NbpExchangeRateResult();
            setStatus = true;
            BigDecimal setRate = jasonObject.getList().get(0).getMid();
            return new DownloaderRateModel(setRate,setStatus);
        } catch(HttpClientErrorException e){
            NbpExchangeRateResult nbpExchangeRateResultWithError = new NbpExchangeRateResult();
           if (e.getStatusCode().equals(status404) &&)
               return  new DownloaderRateModel();
        }

    }
}

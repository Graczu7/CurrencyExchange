package com.example.currencyexchange.exchanger;

import com.example.currencyexchange.model.NBPJasonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Component
public class NbpExchangeRateDownloader {
    final String ROOT_URI ="http://api.nbp.pl/api/exchangerates/rates/A/{code}/{date}/";
    private final RestTemplate restTemplate;
    private boolean setStatus = false;

    @Autowired
    public NbpExchangeRateDownloader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NbpExchangeRateResult download(String currency, LocalDate date) {
        Map<String, String > params = new HashMap<>();
        params.put("code", currency);
        params.put("date", date.toString());
        try {
            NBPJasonModel jasonObject = restTemplate.getForObject(ROOT_URI, NBPJasonModel.class,params);
            setStatus = true;
            BigDecimal setRate = jasonObject.getRates().get(0).getMid();
            return new NbpExchangeRateResult(setRate,setStatus);
        } catch(HttpClientErrorException e) {
            String error404 = "Błędne zapytanie, sprawdź czy podana data nie wskazuje na niedzielę lub święto";
            return new NbpExchangeRateResult(null, error404, setStatus);
        }
    }
}

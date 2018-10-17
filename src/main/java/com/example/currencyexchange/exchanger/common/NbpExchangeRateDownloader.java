package com.example.currencyexchange.exchanger.common;

import com.example.currencyexchange.exchanger.calculator.NbpExchangeCalcRateResult;
import com.example.currencyexchange.exchanger.calculator.NbpExchangeCalcSeriesResponse;
import com.example.currencyexchange.exchanger.table.NbpExchangeTabRateResponse;
import com.example.currencyexchange.exchanger.table.NbpExchangeTabRateResult;
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
    final String NBP_RATE_URI ="http://api.nbp.pl/api/exchangerates/rates/A/{code}/{date}/";
    final String NBP_RATES_URI ="http://api.nbp.pl/api/exchangerates/tables/C/";
    private final RestTemplate restTemplate;
    private boolean setStatus = false;

    @Autowired
    public NbpExchangeRateDownloader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NbpExchangeCalcRateResult download(String currency, LocalDate date) {
        Map<String, String > params = new HashMap<>();
        params.put("code", currency);
        params.put("date", date.toString());
        try {
            NbpExchangeCalcSeriesResponse jasonObject = restTemplate.getForObject(NBP_RATE_URI, NbpExchangeCalcSeriesResponse.class,params);
            setStatus = true;
            BigDecimal setRate = jasonObject.getRates().get(0).getMid();
            return new NbpExchangeCalcRateResult(setRate,setStatus);
        } catch(HttpClientErrorException e) {
            String error404 = "Wrong requested date";
            return new NbpExchangeCalcRateResult(null, error404, setStatus);
        }
    }

    public NbpExchangeTabRateResult download(LocalDate tradingdate, String rates) {
        Map<String, String > params = new HashMap<>();
        params.put("tradingDate", tradingdate.toString());
        params.put("rates", rates);
        try {
            NbpExchangeTabRateResponse jsonObject = restTemplate.getForObject(NBP_RATES_URI, NbpExchangeTabRateResponse.class,params);
            setStatus = true;
            BigDecimal getRates = jsonObject.getRates().get(0).getMid();
            return new NbpExchangeTabRateResult(getRates, setStatus);
        } catch(HttpClientErrorException e) {
            String error404 = "Wrong requested date";
            return new NbpExchangeTabRateResult(null, error404, setStatus);
        }
    }


}

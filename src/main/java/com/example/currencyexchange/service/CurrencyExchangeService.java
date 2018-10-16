package com.example.currencyexchange.service;

import com.example.currencyexchange.exchanger.NbpExchangeRateDownloader;
import com.example.currencyexchange.exchanger.NbpExchangeRateResult;
import com.example.currencyexchange.model.ExchangeRequest;
import com.example.currencyexchange.model.ExchangeResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CurrencyExchangeService {

    private final NbpExchangeRateDownloader nbpExchangeRateDownloader;

    @Autowired
    public CurrencyExchangeService(NbpExchangeRateDownloader nbpExchangeRateDownloader) {
        this.nbpExchangeRateDownloader = nbpExchangeRateDownloader;
    }

    public ExchangeResult exchange(ExchangeRequest request){
        NbpExchangeRateResult result = nbpExchangeRateDownloader.download(request.getCurrency(), request.getExchangeDate());
        if (result.getSuccess()) {
            BigDecimal amountAfterExchange = request.getValue().divide(result.getRate(), 2, RoundingMode.HALF_UP);
            return new ExchangeResult(amountAfterExchange, HttpStatus.OK);
        }
        return new ExchangeResult(result.getError(), HttpStatus.BAD_REQUEST);
    }


    public ExchangeResult compareCurrency(ExchangeRequest request){
        NbpExchangeRateResult result = nbpExchangeRateDownloader.download(request.getCurrency(), request.getExchangeDate());
        if (result.getSuccess()) {
            BigDecimal amountAfterExchange = request.getValue();
            return new ExchangeResult(amountAfterExchange, HttpStatus.OK);
        }
        return new ExchangeResult(result.getError(), HttpStatus.BAD_REQUEST);
    }


}

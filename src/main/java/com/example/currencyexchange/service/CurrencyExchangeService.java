package com.example.currencyexchange.service;

import com.example.currencyexchange.exchanger.common.NbpExchangeRateDownloader;
import com.example.currencyexchange.exchanger.calculator.NbpExchangeCalcRateResult;
import com.example.currencyexchange.exchanger.calculator.ExchangeRequest;
import com.example.currencyexchange.exchanger.calculator.ExchangeResult;
import com.example.currencyexchange.exchanger.table.NbpExchangeTabRateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Service
public class CurrencyExchangeService {

    private final NbpExchangeRateDownloader nbpExchangeRateDownloader;

    @Autowired
    public CurrencyExchangeService(NbpExchangeRateDownloader nbpExchangeRateDownloader) {
        this.nbpExchangeRateDownloader = nbpExchangeRateDownloader;
    }

    public ExchangeResult exchange(ExchangeRequest request) {
        NbpExchangeCalcRateResult result = nbpExchangeRateDownloader.download(request.getCurrency(), request.getExchangeDate());
        if (result.getSuccess()) {
            BigDecimal amountAfterExchange = request.getValue().divide(result.getRate(), 2, RoundingMode.HALF_UP);
            return new ExchangeResult(amountAfterExchange, HttpStatus.OK);
        }
        return new ExchangeResult(result.getError(), HttpStatus.BAD_REQUEST);
    }

    public NbpExchangeTabRateResult compareCurrency() {    //
        NbpExchangeTabRateResult result = nbpExchangeRateDownloader.downloadCurrentCourses(LocalDate.now());
        return result;
    }

}

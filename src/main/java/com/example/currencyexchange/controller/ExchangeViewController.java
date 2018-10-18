package com.example.currencyexchange.controller;

import com.example.currencyexchange.exchanger.common.Currency;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ExchangeViewController {
    @GetMapping("/")
    public String getReview(Model model){
        model.addAttribute("currencies", Currency.values());
        return "index.jsp";
    }


    @GetMapping("/CompareCurrency") //  @GetMapping("/CompareCurrency")
    public String getReviewSecond (Model model){
        model.addAttribute("currencies", Currency.values() );
        return "CompareCurrency.jsp";

    }

    @GetMapping("/ExchangeMoney")
    public String getExchangeMoneyView(Model model){
        model.addAttribute("currencies", Currency.values() );
        return "ExchangeMoney.jsp";
    }
    //mapowanie na /table
    //comparecurrency.jsp z atrybutami w modelu, do modelu trzeba dodac listę valut które przyjdą do banku
    //
}

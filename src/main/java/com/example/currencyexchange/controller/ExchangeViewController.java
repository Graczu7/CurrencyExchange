package com.example.currencyexchange.controller;

import com.example.currencyexchange.model.Currency;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExchangeViewController {
    @GetMapping("/")
    public String getReview(Model model){
        model.addAttribute("currencies", Currency.values());
        return "/index.jsp";
    }
}

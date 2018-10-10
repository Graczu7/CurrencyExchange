package com.example.currencyexchange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExchangeViewController {
    @GetMapping("/")
    public String getReview(){
        return "index";
    }
}

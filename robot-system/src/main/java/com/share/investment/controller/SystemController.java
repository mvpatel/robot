package com.share.investment.controller;

import com.share.investment.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.MalformedURLException;

@Controller
public class SystemController {

    @Autowired
    private InvestmentService investmentService;



    public void testing() throws MalformedURLException {
        //todo remove
        System.out.println("Testing Method from SystemController.java Start");
//        investmentService.startInvestment(3L);
        investmentService.closeInvestment(18L);
//        todo remove
        System.out.println("Testing Method from SystemController.java End");

    }
}

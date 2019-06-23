package com.share.investment.controller;

import com.share.investment.service.InvestmentService;
import com.share.investment.service.RestrictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.MalformedURLException;

@Controller
public class SystemController {

    @Autowired
    private InvestmentService investmentService;

    @Autowired
    private RestrictionService restrictionService;



    public void testing() throws MalformedURLException {
        //todo remove
        System.out.println("Testing Method from SystemController.java Start");
//        investmentService.startInvestment(3L);
//        investmentService.closeInvestment(18L);
        restrictionService.addRestriction(1L, (byte) 90, (byte) 60, (byte) 10, (byte) 20);
//        todo remove
        System.out.println("Testing Method from SystemController.java End");

    }
}

package com.share.investment.controller;

import com.share.investment.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SystemController {

    @Autowired
    private ShareService shareService;



    public void addShare() {
        System.out.println("hi333");
        shareService.addShare("Test312", "Test412");

    }
}

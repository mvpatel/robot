package com.share.investment.controller;

import com.share.investment.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SystemController {

    @Autowired
    private ShareService shareService;



    public void testing() {
        //todo remove
        System.out.println("Testing Method from SystemController.java Start");

        System.out.println("hi333");
//        shareService.addShare("sharename1121", "companyname1211");
        shareService.listShare();
        shareService.listShareByShareId(1L);
        shareService.updateShare(10L, "shareName23", "companyname23");
//        shareService.deleteShare(27L);

//        todo remove
        System.out.println("Testing Method from SystemController.java End");

    }
}

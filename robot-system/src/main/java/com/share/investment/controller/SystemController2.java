package com.share.investment.controller;

import com.share.investment.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SystemController2 {

    private final ShareService shareService;

    @Autowired
    public SystemController2(ShareService shareService) {
        this.shareService = shareService;
    }

    /**
     * Add Follower
     *
     * @return RestApiResponse.java Response of adding follower
     */
    @RequestMapping(value = "/add-share", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addFollower() {
         this.shareService.addShare("test1","test1");
    }
}

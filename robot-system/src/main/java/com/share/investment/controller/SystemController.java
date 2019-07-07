package com.share.investment.controller;

import com.share.investment.service.InvestmentService;
import com.share.investment.service.RestrictionService;
import com.share.investment.service.SentimentAnalysisAPIService;
import com.share.investment.service.TweetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.TwitterException;

import java.net.MalformedURLException;
import java.util.Calendar;

@Api(value = "Artificial Inelegant API", description = "Description for AI Investment System")
@RestController
@RequestMapping("/api/v1")
public class SystemController {

    @Autowired
    private InvestmentService investmentService;

    @Autowired
    private RestrictionService restrictionService;

    @Autowired
    private TweetService tweetService;

    @Autowired
    private SentimentAnalysisAPIService sentimentAnalysisAPIService;

    @ApiOperation(
            value = "Twitter API Call",
            response = String.class
    )
    @GetMapping(
            value = "/get-twitter-data",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String getTwitterAPIData() throws TwitterException {

        return this.tweetService.getTwitterAPIData();
    }

    @ApiOperation(
            value = "Twitter API CallBack",
            response = String.class
    )
    @GetMapping(
            value = "/get-twitter-callback-data",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String getTwitterAPICallbackDATA() {

        return this.tweetService.getTwitterAPICallbackDATA();
    }

    public void testing() throws MalformedURLException, TwitterException {

        this.tweetService.getTwitterAPIData();

        System.out.println("Testing is called");
//        investmentService.startInvestment(1L, 33L);
//        investmentService.closeInvestment(18L);
//        restrictionService.addRestriction(3L, (byte) 95, (byte) 40, (byte) 5, (byte) 10);

//        this.addRandomTweets();

//        sentimentAnalysisAPIService.updateScoreBySentimentAnalysisAPI();
    }

    private void addRandomTweets() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 07, 04, 18, 00, 01);
        tweetService.addTweet(1031L, "Apple Price is going up today", 1L, calendar);
        tweetService.addTweet(1032L, "Apple Price Looks good today", 1L, calendar);
        tweetService.addTweet(1033L, "Apple is on high today", 1L, calendar);
        tweetService.addTweet(1034L, "Apple is going to down today", 1L, calendar);
        tweetService.addTweet(1035L, "Apple is the market today", 1L, calendar);
        tweetService.addTweet(1006L, "Apple is great today", 1L, calendar);
        tweetService.addTweet(1007L, "Apple Share price is going really very high today", 1L, calendar);
        tweetService.addTweet(1007L, "Apple not seems OK today", 1L, calendar);
        tweetService.addTweet(1008L, "Apple will get trouble today", 1L, calendar);
        tweetService.addTweet(1009L, "Apple are on high buying today", 1L, calendar);
        tweetService.addTweet(1010L, "Apple are going to be sell today", 1L, calendar);
        tweetService.addTweet(1011L, "Apple are going to be low", 1L, calendar);
        tweetService.addTweet(1012L, "Apple is not good idea today", 1L, calendar);
        tweetService.addTweet(1013L, "Apple is backed up ", 1L, calendar);
        tweetService.addTweet(1014L, "Apple is doing miserable fall today", 1L, calendar);
        tweetService.addTweet(1015L, "Apple is hard to understand today", 1L, calendar);
        tweetService.addTweet(1016L, "Apple is going down as MSFT is going up now", 1L, calendar);
        tweetService.addTweet(1017L, "Don't invest in apple today", 1L, calendar);
        tweetService.addTweet(1018L, "Apple is bad choice today", 1L, calendar);
        tweetService.addTweet(1019L, "Apple is last thing to buy today", 1L, calendar);
        tweetService.addTweet(1019L, "Apple share is last thing to buy today", 1L, calendar);
        tweetService.addTweet(1019L, "Don't buy apple share now", 1L, calendar);
        tweetService.addTweet(1020L, "Apple is horrible back down today ", 1L, calendar);
    }
}

package com.share.investment.controller;

import com.share.investment.service.InvestmentService;
import com.share.investment.service.RestrictionService;
import com.share.investment.service.SentimentAnalysisAPIService;
import com.share.investment.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.MalformedURLException;

@Controller
public class SystemController {

    @Autowired
    private InvestmentService investmentService;

    @Autowired
    private RestrictionService restrictionService;

    @Autowired
    private TweetService tweetService;

    @Autowired
    private SentimentAnalysisAPIService sentimentAnalysisAPIService;



    public void testing() throws MalformedURLException {
//        investmentService.startInvestment(3L);
//        investmentService.closeInvestment(18L);
//        restrictionService.addRestriction(3L, (byte) 95, (byte) 40, (byte) 5, (byte) 10);
//        tweetService.addTweet(1001L, "Apple Price is going up today", 1L);
//        tweetService.addTweet(1002L, "Apple Price Looks good today", 1L);
//        tweetService.addTweet(1003L, "Apple is on high today", 1L);
//        tweetService.addTweet(1004L, "Apple is going to down today", 1L);
//        tweetService.addTweet(1005L, "Apple is the market today", 1L);
//        tweetService.addTweet(1006L, "Apple is great today", 1L);
//        tweetService.addTweet(1007L, "Apple not seems OK today", 1L);
//        tweetService.addTweet(1008L, "Apple will get trouble today", 1L);
//        tweetService.addTweet(1009L, "Apple are on high buying today", 1L);
//        tweetService.addTweet(1010L, "Apple are going to be sell today", 1L);
//        tweetService.addTweet(1011L, "Apple are going to be low", 1L);
//        tweetService.addTweet(1012L, "Apple is not good idea today", 1L);
//        tweetService.addTweet(1013L, "Apple is backed up ", 1L);
//        tweetService.addTweet(1014L, "Apple is doing miserable fall today", 1L);
//        tweetService.addTweet(1015L, "Apple is hard to understand today", 1L);
//        tweetService.addTweet(1016L, "Apple is going down as MSFT is going up now", 1L);
//        tweetService.addTweet(1017L, "Don't invest in apple today", 1L);
//        tweetService.addTweet(1018L, "Apple is bad choice today", 1L);
//        tweetService.addTweet(1019L, "Apple is last thing to buy today", 1L);
//        tweetService.addTweet(1020L, "Apple is horrible back down today ", 1L);
        sentimentAnalysisAPIService.updateScoreBySentimentAnalysisAPI();
    }
}

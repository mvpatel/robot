package com.share.investment.service.impl;

import com.share.investment.model.dao.Tweet;
import com.share.investment.repository.ShareRepository;
import com.share.investment.repository.TweetRepository;
import com.share.investment.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TweetServiceImpl implements TweetService {

    @Autowired
    TweetRepository tweetRepository;

    @Autowired
    ShareRepository shareRepository;

    @Override
    public Tweet addTweet(Long userId, String tweetString, Long shareId, Calendar tweetDateTime) {
        Tweet tweet = new Tweet();
        tweet.setShare(shareRepository.findOne(shareId));
        tweet.setTweetString(tweetString);
        tweet.setUserId(userId);
        tweet.setTweetDateTime(tweetDateTime);
        tweetRepository.save(tweet);
        return tweet;
    }

    @Override
    public Tweet updateTweet(Long tweetId, Long userId, String tweet, Long shareId, Calendar tweetDateTime) {
        return null;
    }

    @Override
    public List<Tweet> listTweet() {
        return null;
    }

    @Override
    public Tweet getTweetByTweetId(Long tweetId) {

        return tweetRepository.findOne(tweetId);
    }

    @Override
    public List<Tweet> listTweetByShareId(Long shareId) {
        return null;
    }

    @Override
    public List<Tweet> getNotAnalysedTweets() {
        return tweetRepository.getNotAnalysedTweets();
    }

    @Override
    public String getTwitterAPIData() throws TwitterException {

        List<String> serachedTweet = getSearchedTweets();
        String result = "Twitter API Data";
        return  result;
    }

    @Override
    public String getTwitterAPICallbackDATA() {
        String result = "Twitter Call back API";
        return result;
    }

    private Twitter getTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("PoOUDSZ6YxBajLkCQuev3CsN0")
                .setOAuthConsumerSecret("hltlggHI3Afyx7KbFAFH5KiEWH7J7kzz9v94OZQhQe4QGF27LM")
                .setOAuthAccessToken("515230950-owmZ2y8DS7aAYC7mQDrjPDw5Dvc8poAQ2VW9d8rH")
                .setOAuthAccessTokenSecret("F7uG7gSB4qApBvJ191eJuGPtLWTuFQ3hVoaOauDdAmccS");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return  twitter;
    }

    private List<String> getSearchedTweets() throws TwitterException {

        Twitter twitter = getTwitterInstance();
        Query query = new Query("google");
        QueryResult result = twitter.search(query);

        return result.getTweets().stream()
                .map(item -> item.getText())
                .collect(Collectors.toList());
    }
}

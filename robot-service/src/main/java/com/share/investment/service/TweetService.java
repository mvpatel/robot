package com.share.investment.service;

import com.share.investment.model.dao.Tweet;

import java.util.Calendar;
import java.util.List;

public interface TweetService {

    /**
     * It will be used to add Tweet in the tweet table.
     * @param userId : Tweet api will return user id for each tweet so this will be saved in database for
     *               future use.
     * @param tweet: Normal texts for the tweet which will be taken from the Twitter.
     * @param shareId: twitter table is connected with share table by ManyToOne Relationship so share
     *               id will be id of the share table
     * @return: Tweet class object will be returned by this method.
     */
    Tweet addTweet(Long userId, String tweet, Long shareId, Calendar tweetDateTime);

    /**
     * It will be used to update the Tweet by given parameters.
     * @param tweetId
     * @param userId
     * @param tweet
     * @param shareId
     * @return
     */
    Tweet updateTweet(Long tweetId, Long userId, String tweet, Long shareId, Calendar tweetDateTime);

    /**
     * It will be used to list all Tweets
     * @return
     */
    List<Tweet> listTweet();

    /**
     * It will be used to list all tweets by tweetId
     * @param tweetId
     * @return
     */
    Tweet getTweetByTweetId(Long tweetId);

    /**
     * It will be used to list all Tweets by shareId
     * @param shareId
     * @return
     */
    List<Tweet> listTweetByShareId(Long shareId);

    List<Tweet> getNotAnalysedTweets();

    String getTwitterAPIData();

    String getTwitterAPICallbackDATA();
}
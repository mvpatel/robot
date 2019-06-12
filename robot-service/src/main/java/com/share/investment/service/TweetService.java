package com.share.investment.service;

import com.share.investment.model.dao.Tweet;

import java.util.List;

public interface TweetService {

    /**
     * It will be used to add Tweet
     * @param userId
     * @param tweet
     * @param shareId
     * @return
     */
    Tweet addTweet(Long userId, String tweet, Long shareId);

    /**
     * It will be used to update the Tweet by given parameters.
     * @param tweetId
     * @param userId
     * @param tweet
     * @param shareId
     * @return
     */
    Tweet updateTweet(Long tweetId, Long userId, String tweet, Long shareId);

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
    List<Tweet> listTweetByTweetId(Long tweetId);

    /**
     * It will be used to list all Tweets by shareId
     * @param shareId
     * @return
     */
    List<Tweet> listTweetByShareId(Long shareId);
}
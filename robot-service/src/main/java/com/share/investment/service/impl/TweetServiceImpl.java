package com.share.investment.service.impl;

import com.share.investment.model.dao.Tweet;
import com.share.investment.service.TweetService;

import java.util.List;

public class TweetServiceImpl implements TweetService {

    @Override
    public Tweet addTweet(Long userId, String tweet, Long shareId) {
        return null;
    }

    @Override
    public Tweet updateTweet(Long tweetId, Long userId, String tweet, Long shareId) {
        return null;
    }

    @Override
    public List<Tweet> listTweet() {
        return null;
    }

    @Override
    public List<Tweet> listTweetByTweetId(Long tweetId) {
        return null;
    }

    @Override
    public List<Tweet> listTweetByShareId(Long shareId) {
        return null;
    }
}

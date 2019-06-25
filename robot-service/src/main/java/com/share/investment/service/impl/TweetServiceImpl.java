package com.share.investment.service.impl;

import com.share.investment.model.dao.Tweet;
import com.share.investment.repository.ShareRepository;
import com.share.investment.repository.TweetRepository;
import com.share.investment.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetServiceImpl implements TweetService {

    @Autowired
    TweetRepository tweetRepository;

    @Autowired
    ShareRepository shareRepository;

    @Override
    public Tweet addTweet(Long userId, String tweetString, Long shareId) {
        Tweet tweet = new Tweet();
        tweet.setShare(shareRepository.findOne(shareId));
        tweet.setTweetString(tweetString);
        tweet.setUserId(userId);
        tweetRepository.save(tweet);
        return tweet;
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
    public Tweet getTweetByTweetId(Long tweetId) {

        return tweetRepository.findOne(tweetId);
    }

    @Override
    public List<Tweet> listTweetByShareId(Long shareId) {
        return null;
    }
}

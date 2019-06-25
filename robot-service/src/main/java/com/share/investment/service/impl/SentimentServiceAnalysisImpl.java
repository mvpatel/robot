package com.share.investment.service.impl;


import com.share.investment.model.dao.SentimentAnalysis;
import com.share.investment.model.dao.Tweet;
import com.share.investment.repository.SentimentAnalysisRepository;
import com.share.investment.service.SentimentAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SentimentServiceAnalysisImpl implements SentimentAnalysisService {

    @Autowired
    SentimentAnalysisRepository sentimentAnalysisRepository;

    @Override
    public SentimentAnalysis addSentimentAnalysis(Tweet tweet, Float score) {

        SentimentAnalysis sentimentAnalysis = new SentimentAnalysis();
        sentimentAnalysis.setTweet(tweet);
        sentimentAnalysis.setScore(score);
        sentimentAnalysisRepository.save(sentimentAnalysis);

        return sentimentAnalysis;
    }

    @Override
    public SentimentAnalysis updateAnalysis(Long sentimentAnalysisId, Long tweetId, byte score) {
        return null;
    }

    @Override
    public List<SentimentAnalysis> listSentimentAnalysis() {
        return null;
    }

    @Override
    public List<SentimentAnalysis> listSentimentAnalysisBySentimentAnalysisId(Long sentimentAnalysisId) {
        return null;
    }

    @Override
    public List<SentimentAnalysis> listSentimentAnalysisByTweetId(Long tweetId) {
        return null;
    }
}
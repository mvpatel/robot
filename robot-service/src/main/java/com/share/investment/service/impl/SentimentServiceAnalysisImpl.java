package com.share.investment.service.impl;


import com.share.investment.model.dao.SentimentAnalysis;
import com.share.investment.service.SentimentAnalysisService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentimentServiceAnalysisImpl implements SentimentAnalysisService {

    @Override
    public SentimentAnalysis addSentimentAnalysis(Long tweetId, byte score) {
        return null;
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
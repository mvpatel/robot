package com.share.investment.service;

import com.share.investment.model.dao.SentimentAnalysis;

import java.util.List;

public interface SentimentAnalysisService {

    /**
     * Add Sentimental Analysis
     * @return
     */
    SentimentAnalysis addSentimentAnalysis(Long tweetId, byte score);

    /**
     * Update Sentimental Analysis
     * @return
     */
    SentimentAnalysis updateAnalysis(Long sentimentAnalysisId, Long tweetId, byte score);

    /**
     * List Sentimental Analysis
     * @return
     */
    List<SentimentAnalysis> listSentimentAnalysis();

    /**
     * List Sentimental Analysis by sentimentalAnalysisId
     * @return
     */
    List<SentimentAnalysis> listSentimentAnalysisBySentimentAnalysisId(Long sentimentAnalysisId);

    /**
     * List Sentimental Analysis by tweetId
     * @return
     */
    List<SentimentAnalysis> listSentimentAnalysisByTweetId(Long tweetId);
}
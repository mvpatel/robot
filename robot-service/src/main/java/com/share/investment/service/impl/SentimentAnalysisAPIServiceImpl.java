package com.share.investment.service.impl;

import com.share.investment.SentimentAnalysis.DocumentsForLanguage;
import com.share.investment.SentimentAnalysis.DocumentsForSentimentAnalysis;
import com.share.investment.model.dao.Tweet;
import com.share.investment.service.SentimentAnalysisAPIService;
import com.share.investment.service.SentimentAnalysisService;
import com.share.investment.service.TweetService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static com.share.investment.SentimentAnalysis.DetectLanguage.GetLanguage;
import static com.share.investment.SentimentAnalysis.GetSentiment.getTheSentiment;

@Service
public class SentimentAnalysisAPIServiceImpl implements SentimentAnalysisAPIService {

    @Autowired
    SentimentAnalysisService sentimentAnalysisService;

    @Autowired
    TweetService tweetService;

    @Override
    public void updateScoreBySentimentAnalysisAPI() {
        String id, languageCode, text;
        id = "1";
        text = "This is a document written in English.";

        List<Tweet> notAnalysedTweets = getNotAnalysedTweets();

        //todo for loop for all tweets
        // add below code in the loop

        languageCode = getLanguageCodeByAPI(id, text);

        getSentimentAnalysisScoreByAPI(id, languageCode, text);

        Float sentimentScore = getSentimentAnalysisScoreByAPI(id, languageCode, text);

        sentimentAnalysisService.addSentimentAnalysis(tweetService.getTweetByTweetId(25L), sentimentScore);
    }

    private List<Tweet> getNotAnalysedTweets() {
        return null;
    }


    private String getLanguageCodeByAPI(String id, String text) {

        try {
            DocumentsForLanguage documentsForLanguage = new DocumentsForLanguage();
            documentsForLanguage.add(id, text);

            String response = GetLanguage(documentsForLanguage);

            JSONObject jsonResponse = new JSONObject(response);

            return jsonResponse.getJSONArray("documents").getJSONObject(0).getJSONArray("detectedLanguages").getJSONObject(0).getString("iso6391Name");

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

    private Float getSentimentAnalysisScoreByAPI(String id, String languageCode, String text) {
        try {
            DocumentsForSentimentAnalysis documents = new DocumentsForSentimentAnalysis();
            documents.add(id, languageCode, text);

            String response = getTheSentiment(documents);

            JSONObject jsonResponse = new JSONObject(response);

            return new BigDecimal(jsonResponse.getJSONArray("documents")
                    .getJSONObject(0).getDouble("score") * 100)
                    .setScale(2, RoundingMode.HALF_UP)
                    .floatValue();

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }


}

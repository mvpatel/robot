package com.share.investment.repository;

import com.share.investment.model.dao.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {

    @Query(
            value = "SELECT t.* FROM tweet t LEFT JOIN sentiment_analysis sa ON t.tweet_id = sa.tweet_id WHERE sa.tweet_id is NULL",
//            value = "SELECT * FROM tweet",
            nativeQuery = true
    )
    List<Tweet> getNotAnalysedTweets();
}

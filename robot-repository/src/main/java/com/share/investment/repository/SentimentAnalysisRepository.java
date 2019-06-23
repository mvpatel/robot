package com.share.investment.repository;

import com.share.investment.model.dao.SentimentAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentimentAnalysisRepository extends JpaRepository<SentimentAnalysis, Long> {
    
}

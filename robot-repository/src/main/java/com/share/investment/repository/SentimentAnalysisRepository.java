package com.share.investment.repository;

import com.share.investment.model.dao.SentimentAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentimentAnalysisRepository extends JpaRepository<SentimentAnalysis, Long> {
}

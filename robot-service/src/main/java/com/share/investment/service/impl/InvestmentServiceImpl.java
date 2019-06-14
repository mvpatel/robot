package com.share.investment.service.impl;

import com.share.investment.model.dao.Investment;
import com.share.investment.service.InvestmentService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class InvestmentServiceImpl implements InvestmentService {

    @Override
    public Investment addInvestment(Long shareId, byte buySell, BigDecimal startPrice, BigDecimal closePrice, LocalDateTime startDateTime, LocalDateTime closeDateTime, byte live, byte startSentimentAnalysisScore, byte endSentimentAnalysisScore) {
        return null;
    }

    @Override
    public Investment updateInvestment(Long investmentId, Long shareId, byte buySell, BigDecimal startPrice, BigDecimal closePrice, LocalDateTime startDateTime, LocalDateTime closeDateTime, byte live, byte startSentimentAnalysisScore, byte endSentimentAnalysisScore) {
        return null;
    }

    @Override
    public List<Investment> listInvestment() {
        return null;
    }

    @Override
    public List<Investment> listInvestmentByInvestmentId(Long investmentId) {
        return null;
    }

    @Override
    public List<Investment> listInvestmentByShareId(Long shareId) {
        return null;
    }
}

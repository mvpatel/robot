package com.share.investment.service;

import com.share.investment.model.dao.Investment;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface InvestmentService {

    /**
     * Add Investment
     * @param shareId
     * @param buySell
     * @param startPrice
     * @param closePrice
     * @param startDateTime
     * @param closeDateTime
     * @param live
     * @param startSentimentAnalysisScore
     * @param endSentimentAnalysisScore
     * @return
     */
    Investment addInvestment(Long shareId,
                             byte buySell,
                             BigDecimal startPrice,
                             BigDecimal closePrice,
                             LocalDateTime startDateTime,
                             LocalDateTime closeDateTime,
                             byte live,
                             byte startSentimentAnalysisScore,
                             byte endSentimentAnalysisScore);

    /**
     * Update Investment
     * @param investmentId
     * @param shareId
     * @param buySell
     * @param startPrice
     * @param closePrice
     * @param startDateTime
     * @param closeDateTime
     * @param live
     * @param startSentimentAnalysisScore
     * @param endSentimentAnalysisScore
     * @return
     */
    Investment updateInvestment(Long investmentId,
                                Long shareId,
                                byte buySell,
                                BigDecimal startPrice,
                                BigDecimal closePrice,
                                LocalDateTime startDateTime,
                                LocalDateTime closeDateTime,
                                byte live,
                                byte startSentimentAnalysisScore,
                                byte endSentimentAnalysisScore);

    /**
     * List Investment
     * @return
     */
    List<Investment> listInvestment();

    /**
     * List Investment by investmentId
     * @param investmentId
     * @return
     */
    List<Investment> listInvestmentByInvestmentId(Long investmentId);

    /**
     * List Investment by shareId
     * @param shareId
     * @return
     */
    List<Investment> listInvestmentByShareId(Long shareId);
}
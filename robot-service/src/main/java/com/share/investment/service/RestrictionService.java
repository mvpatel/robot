package com.share.investment.service;

import com.share.investment.model.dao.Restriction;

import java.util.List;

public interface RestrictionService {

    /**
     * Add restriction
     * @return
     */
    Restriction addRestriction(Long shareId,
                               byte startSentimentAnalysisVal,
                               byte closeSentimentAnalysisVal,
                               byte maxLoss,
                               byte maxProfit);

    /**
     * update Restriction
     * @return
     */
    Restriction updateRestriction(Long restrictionId,
                                  Long shareId,
                                  byte startSentimentAnalysisVal,
                                  byte closeSentimentAnalysisVal,
                                  byte maxLoss,
                                  byte maxProfit);

    /**
     * List Restriction
     * @return
     */
    List<Restriction> listRestriction();

    /**
     * List Restriction by restrictionId
     * @return
     */
    List<Restriction>listRestrictionByRestrictionId(Long restrictionId);

    /**
     * List Restriction by shareId
     * @return
     */
    List<Restriction>listRestrictionByShareId(Long shareId);
}
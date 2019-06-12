package com.share.investment.service.impl;

import com.share.investment.model.dao.Restriction;
import com.share.investment.service.RestrictionService;

import java.util.List;

public class RestrictionImpl implements RestrictionService {

    @Override
    public Restriction addRestriction(Long shareId, byte startSentimentAnalysisVal, byte closeSentimentAnalysisVal, byte maxLoss, byte maxProfit) {
        return null;
    }

    @Override
    public Restriction updateRestriction(Long restrictionId, Long shareId, byte startSentimentAnalysisVal, byte closeSentimentAnalysisVal, byte maxLoss, byte maxProfit) {
        return null;
    }

    @Override
    public List<Restriction> listRestriction() {
        return null;
    }

    @Override
    public List<Restriction> listRestrictionByRestrictionId(Long restrictionId) {
        return null;
    }

    @Override
    public List<Restriction> listRestrictionByShareId(Long shareId) {
        return null;
    }
}
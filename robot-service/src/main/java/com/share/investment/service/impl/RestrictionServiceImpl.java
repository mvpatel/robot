package com.share.investment.service.impl;

import com.share.investment.model.dao.Restriction;
import com.share.investment.model.dao.Share;
import com.share.investment.repository.RestrictionRepository;
import com.share.investment.repository.ShareRepository;
import com.share.investment.service.RestrictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestrictionServiceImpl implements RestrictionService {

    @Autowired
    RestrictionRepository restrictionRepository;

    @Autowired
    ShareRepository shareRepository;

    @Override
    public Restriction addRestriction(Long shareId,
                                      byte startSentimentAnalysisVal,
                                      byte closeSentimentAnalysisVal,
                                      byte maxLoss,
                                      byte maxProfit) {
        Share share = shareRepository.findOne(shareId);
        Restriction restriction = new Restriction();
        restriction.setStartSentimentAnalysisVal(startSentimentAnalysisVal);
        restriction.setCloseSentimentAnalysisVal(closeSentimentAnalysisVal);
        restriction.setMaxLoss(maxLoss);
        restriction.setMaxProfit(maxProfit);
        restriction.setShare(share);
        restrictionRepository.save(restriction);
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

    @Override
    public Restriction getRestrictionByRestrictionID(Long restrictionId) {
        return restrictionRepository.findOne(restrictionId);
    }
}
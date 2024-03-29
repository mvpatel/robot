package com.share.investment.service.impl;

import com.share.investment.model.dao.Investment;
import com.share.investment.model.dao.Price;
import com.share.investment.model.dao.Share;
import com.share.investment.repository.InvestmentRepository;
import com.share.investment.repository.ShareRepository;
import com.share.investment.service.InvestmentService;
import com.share.investment.service.PriceService;
import com.share.investment.service.ProfitService;
import com.share.investment.service.RestrictionService;
import com.share.investment.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class InvestmentServiceImpl implements InvestmentService {

    @Autowired
    InvestmentRepository investmentRepository;

    @Autowired
    PriceService priceService;

    @Autowired
    ShareService shareService;

    @Autowired
    InvestmentService investmentService;

    @Autowired
    ShareRepository shareRepository;

    @Autowired
    ProfitService profitService;

    @Autowired
    RestrictionService restrictionService;

    @Override
    public Investment startInvestment(Long shareId, Long restrictionId) {

        Share share = shareService.getShareByShareId(shareId);
        Price price = share.getPrice();
        Investment investment = new Investment();
        investment.setShare(share);
        investment.setBuySell((byte) 1);
        investment.setStartPrice(price.getPrice());
        investment.setLive((byte) 1);
        investment.setStartSentimentAnalysisScore((byte) 99);
        investment.setStartDateTime(Calendar.getInstance());
        //todo getting Restriction is not working
//        investment.setRestriction(restrictionService.getRestrictionByRestrictionID(restrictionId));
        investmentRepository.save(investment);
        return investment;
    }

    @Override
    public Investment closeInvestment(Long investmentId) {

        Investment investment = investmentService.getInvestmentByInvestmentId(investmentId);
        Price price = investment.getShare().getPrice();
        investment.setClosePrice(price.getPrice());
        investment.setLive((byte) 0);
        investment.setEndSentimentAnalysisScore((byte) 50);
        investment.setCloseDateTime(Calendar.getInstance());
        investmentRepository.save(investment);
        profitService.addProfit(investment );
        return investment;
    }

    @Override
    public List<Investment> listInvestment() {
        return investmentRepository.findAll();
    }

    @Override
    public Investment getInvestmentByInvestmentId(Long investmentId) {
        return investmentRepository.findOne(investmentId);
    }

    @Override
    public Investment getInvestmentByShareId(Long shareId) {
        return investmentRepository.findOne(shareId);
    }
}

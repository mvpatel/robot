package com.share.investment.service.impl;

import com.share.investment.model.dao.Investment;
import com.share.investment.model.dao.Profit;
import com.share.investment.repository.ProfitRepository;
import com.share.investment.service.ProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProfitServiceImpl implements ProfitService {

    @Autowired
    ProfitRepository profitRepository;

    @Override
    public Profit addProfit(Investment investment) {

        Profit profit = new Profit();
        profit.setInvestment(investment);
        profit.setProfit(getProfit(investment));
        profitRepository.save(profit);
        return null;
    }

    @Override
    public BigDecimal getProfit(Investment investment) {
        return investment.getClosePrice().subtract(investment.getStartPrice());
    }

    @Override
    public Profit updateProfit(Long profitId, Long investmentId, BigDecimal profit) {
        return null;
    }

    @Override
    public List<Profit> listProfit() {
        return null;
    }

    @Override
    public List<Profit> listProfitByProfitId(Long profitId) {
        return null;
    }

    @Override
    public List<Profit> listProfitByInvestmentId(Long investmentId) {
        return null;
    }
}
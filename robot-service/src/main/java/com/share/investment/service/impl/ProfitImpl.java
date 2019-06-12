package com.share.investment.service.impl;

import com.share.investment.model.dao.Profit;
import com.share.investment.service.ProfitService;

import java.math.BigDecimal;
import java.util.List;

public class ProfitImpl implements ProfitService {

    @Override
    public Profit addProfit(Long investmentId, BigDecimal profit) {
        return null;
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
package com.share.investment.service;

import com.share.investment.model.dao.Investment;
import com.share.investment.model.dao.Profit;

import java.math.BigDecimal;
import java.util.List;

public interface ProfitService {

    /**
     * Add Profit
     * @return
     */
    Profit addProfit(Investment investment);

    /**
     *
     * @param investment
     * @return
     */
    BigDecimal getProfit(Investment investment);
    /**
     *
     * @return
     */
    Profit updateProfit(Long profitId, Long investmentId, BigDecimal profit);

    /**
     * List Profit
     * @return
     */
    List<Profit> listProfit();

    /**
     * list Profit by profitId
     * @return
     */
    List<Profit> listProfitByProfitId(Long profitId);

    /**
     * List Profit by investmentId
     * @return
     */
    List<Profit> listProfitByInvestmentId(Long investmentId);
}
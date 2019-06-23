package com.share.investment.service;

import com.share.investment.model.dao.Investment;

import java.util.List;

public interface InvestmentService {

    /**
     * Add Investment
     *
     * @param shareId
     * @return
     */
    Investment startInvestment(Long shareId);

    /**
     * Update Investment
     *
     * @return
     */
    Investment closeInvestment(Long investmentId);

    /**
     * List Investment
     *
     * @return
     */
    List<Investment> listInvestment();

    /**
     * List Investment by investmentId
     *
     * @param investmentId
     * @return
     */
    Investment getInvestmentByInvestmentId(Long investmentId);

    /**
     * List Investment by shareId
     *
     * @param shareId
     * @return
     */
    Investment getInvestmentByShareId(Long shareId);
}
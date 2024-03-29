package com.share.investment.service;

import com.share.investment.model.dao.Price;

import java.math.BigDecimal;
import java.util.List;

public interface PriceService {

    /**
     * Add Price
     * @param shareId
     * @param price
     * @return
     */
    Price addPrice(Long shareId, BigDecimal price);

    /**
     * Update Price
     * @param priceId
     * @param shareId
     * @param price
     * @return
     */
    Price updatePrice(Long priceId, Long shareId, BigDecimal price);

    /**
     * List Price
     * @return
     */
    List<Price> listPrice();

    /**
     * List Price by priceId
     * @param priceId
     * @return
     */
    Price getPriceByPriceId(Long priceId);

    /**
     * List Price by shareId
     * @param shareId
     * @return
     */
    Price getPriceByShareId(Long shareId);


    /**
     *
     * @param priceId
     */
    void deletePrice(Long priceId);
}
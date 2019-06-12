package com.share.investment.service.impl;

import com.share.investment.model.dao.Price;
import com.share.investment.service.PriceService;

import java.math.BigDecimal;
import java.util.List;

public class PriceImpl implements PriceService {

    @Override
    public Price addPrice(Long shareId, BigDecimal price) {
        return null;
    }

    @Override
    public Price updatePrice(Long priceId, Long shareId, BigDecimal price) {
        return null;
    }

    @Override
    public List<Price> listPrice() {
        return null;
    }

    @Override
    public List<Price> listPriceByPriceId(Long priceId) {
        return null;
    }

    @Override
    public List<Price> listPriceByShareId(Long shareId) {
        return null;
    }
}

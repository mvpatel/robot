package com.share.investment.service.impl;

import com.share.investment.model.dao.Price;
import com.share.investment.repository.PriceRepository;
import com.share.investment.repository.ShareRepository;
import com.share.investment.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PriceRepository priceRepository;

    @Autowired
    ShareRepository shareRepository;

    @Override
    public Price addPrice(Long shareId, BigDecimal sharePrice) {

        Price price = new Price();
        price.setPrice(sharePrice);
        price.setShare(shareRepository.findOne(shareId));
        priceRepository.save(price);
        return price;
    }

    @Override
    public Price updatePrice(Long priceId, Long shareId, BigDecimal sharePrice) {

        Price price = priceRepository.findOne(priceId);
        price.setShare(shareRepository.findOne(shareId));
        price.setPrice(sharePrice);
        priceRepository.save(price);
        return price;
    }

    @Override
    public List<Price> listPrice() {
        return priceRepository.findAll();
    }

    @Override
    public Price getPriceByPriceId(Long priceId) {

//        priceRepository.findOne(Share.class, 1L);
        return priceRepository.findOne(priceId);
    }

    @Override
    public Price getPriceByShareId(Long shareId) {

        return shareRepository.findOne(shareId).getPrice();
    }

    @Override
    public void deletePrice(Long priceId) {

        priceRepository.delete(priceId);

    }

}

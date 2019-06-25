package com.share.investment.service.impl;

import com.share.investment.model.dao.Share;
import com.share.investment.repository.ShareRepository;
import com.share.investment.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareServiceImpl implements ShareService {

    @Autowired
    private  ShareRepository shareRepository;

    @Override
    public Share addShare(String shareName, String companyName) {
        Share share = new Share();
        share.setShareName(shareName);
        share.setCompanyName(companyName);
        shareRepository.save(share);
        return share;
    }

    @Override
    public Share updateShare(Long shareId, String shareName, String companyName) {
        Share share = shareRepository.findOne(shareId);
        share.setShareName(shareName);
        share.setCompanyName(companyName);
        shareRepository.save(share);
        return share;
    }

    @Override
    public List<Share> listShare() {

        return shareRepository.findAll();

    }

    @Override
    public Share getShareByShareId(Long shareId) {

        return shareRepository.findOne(shareId);
    }

    @Override
    public void deleteShare(Long shareId) {

        shareRepository.delete(shareId);
    }
}

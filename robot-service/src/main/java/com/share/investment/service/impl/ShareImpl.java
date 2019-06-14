package com.share.investment.service.impl;

import com.share.investment.model.dao.Share;
import com.share.investment.repository.ShareRepository;
import com.share.investment.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareImpl implements ShareService {

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
        return null;
    }

    @Override
    public List<Share> listShare() {
        return null;
    }

    @Override
    public List<Share> listShareByShareId(Long shareId) {
        return null;
    }
}

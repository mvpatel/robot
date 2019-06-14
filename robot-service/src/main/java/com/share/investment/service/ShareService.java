package com.share.investment.service;

import com.share.investment.model.dao.Share;

import java.util.List;

public interface ShareService {

    /**
     * It will be used to add Share
     * @return
     */
    Share addShare(String shareName, String companyName);

    /**
     * It will be used to update share by given parameters.
     * @return
     */
    Share updateShare(Long shareId, String shareName, String companyName);

    /**
     * It will be used to list all shares
     * @return
     */
    List<Share> listShare();

    /**
     * It will be used to list all shares by shareId
     * @return
     */
    List<Share> listShareByShareId(Long shareId);


}
package com.share.investment.service;

import org.springframework.stereotype.Repository;

@Repository
public interface ShareService {

    void addShare();
    void listShare();
    void listShareByShareId();


}

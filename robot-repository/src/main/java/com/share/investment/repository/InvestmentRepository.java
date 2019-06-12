package com.share.investment.repository;

import com.share.investment.model.dao.Investment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}

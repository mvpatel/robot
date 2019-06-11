package com.share.investment.repository;

import com.share.investment.model.dao.Profit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfitRepository extends JpaRepository<Profit, Long> {
}

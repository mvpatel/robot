package com.share.investment.repository;

import com.share.investment.model.dao.Profit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfitRepository extends JpaRepository<Profit, Long> {

}

package com.share.investment.repository;

import com.share.investment.model.dao.Restriction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestrictionRepository extends JpaRepository<Restriction, Long> {
}

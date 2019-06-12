package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(
        name = "profit"
)
@Data
@Entity
public class Profit {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long profitId;

    @Column(
            unique = true,
            nullable = false
    )
    private Long investmentId;

    @Column(
            nullable = false
    )
    private BigDecimal profit;

    private LocalDateTime dateTime;

}

package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.*;
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
            name = "investmentId",
            unique = true,
            nullable = false
    )
    private Long investmentId;

    @Column(
            name = "profit",
            nullable = false
    )
    private BigDecimal profit;

    @Column(
            name = "dateTime"
    )
    private LocalDateTime dateTime;

}

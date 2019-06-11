package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(
        name = "price"
)
@Data
@Entity
public class Price {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long priceId;

    @Column(
            name = "shareId",
            unique = true,
            nullable = false
    )
    private Long shareId;

    @Column(
            name = "price"
    )
    private BigDecimal price;

    @Column(
            name = "dateTime"
    )
    private LocalDateTime dateTime;
}

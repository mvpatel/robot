package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(
        name = "price"
)
@Data
@Entity (
        name = "Price"
)
public class Price {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long priceId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "share_id",
            nullable = false,
            unique = true
    )
    private Share share;

    private BigDecimal price;

    private LocalDateTime dateTime;
}

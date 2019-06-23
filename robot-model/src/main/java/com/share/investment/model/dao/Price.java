package com.share.investment.model.dao;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Calendar;

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

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dateTime;
}

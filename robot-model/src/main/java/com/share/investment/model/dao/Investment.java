package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(
        name = "investment"
)
@Data
@Entity
public class Investment {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long investmentId;

    private byte buySell;

    private BigDecimal startPrice;

    private BigDecimal closePrice;

    private LocalDateTime startDateTime;

    private LocalDateTime closeDateTime;

    private byte live;

    private byte startSentimentAnalysisScore;

    private byte endSentimentAnalysisScore;

    @ManyToOne(
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            name = "share_id",
            nullable = false
    )
    private Share share;

}

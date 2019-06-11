package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.*;
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

    @Column(
            name = "shareId",
            unique = true,
            nullable = false
    )
    private Long shareId;

    @Column(
            name = "buySell"
    )
    private byte buySell;

    @Column(
            name = "closePrice"
    )
    private BigDecimal startPrice;

    @Column(
            name = "closePrice"
    )
    private BigDecimal closePrice;

    @Column(
            name = "startDateTime"
    )
    private LocalDateTime startDateTime;

    @Column(
            name = "closeDateTime"
    )
    private LocalDateTime closeDateTime;

    @Column(
            name = "live"
    )
    private byte live;

    @Column(
            name = "startSentimentAnalysisScore"
    )
    private byte startSentimentAnalysisScore;

    @Column(
            name = "endSentimentAnalysisScore"
    )
    private byte endSentimentAnalysisScore;
}

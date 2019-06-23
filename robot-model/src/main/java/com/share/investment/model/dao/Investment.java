package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Calendar;

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

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar startDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar closeDateTime;

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

    @OneToOne(
            fetch = FetchType.LAZY,
            mappedBy = "investment"
    )
    private Profit profit;

}

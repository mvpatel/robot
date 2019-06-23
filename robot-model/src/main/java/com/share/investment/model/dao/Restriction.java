package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(
        name = "restriction"
)
@Data
@Entity
public class Restriction {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long restrictionId;

    @Column(
            nullable = false
    )
    private byte startSentimentAnalysisVal;

    @Column(
            nullable = false
    )
    private byte closeSentimentAnalysisVal;

    private byte maxLoss;

    private byte maxProfit;

    @OneToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "share_id",
            nullable = false,
            unique = true
    )
    private Share share;

}

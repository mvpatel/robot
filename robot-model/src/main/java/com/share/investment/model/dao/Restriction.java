package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.*;

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
            name = "shareId",
            unique = true,
            nullable = false
    )
    private Long shareId;

    @Column(
            name = "startSentimentAnalysisVal",
            nullable = false
    )
    private byte startSentimentAnalysisVal;

    @Column(
            name = "closeSentimentAnalysisVal",
            nullable = false
    )
    private byte closeSentimentAnalysisVal;

    @Column(
            name = "maxLoss"
    )
    private byte maxLoss;

    @Column(
            name = "maxProfit"
    )
    private byte maxProfit;

}

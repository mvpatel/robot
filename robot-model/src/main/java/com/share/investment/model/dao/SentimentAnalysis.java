package com.share.investment.model.dao;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(
        name = "sentimentAnalysis"
)
@Data
@Entity
public class SentimentAnalysis {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long sentimentAnalysisId;

    @Column(
            unique = true,
            nullable = false
    )
    private Long tweetId;

    @Column(
            nullable = false
    )
    private byte score;

    private LocalDateTime dateTime;
}

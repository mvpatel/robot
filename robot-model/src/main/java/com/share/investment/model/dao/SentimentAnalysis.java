package com.share.investment.model.dao;


import lombok.Data;

import javax.persistence.*;
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
            name = "tweetId",
            unique = true,
            nullable = false
    )
    private Long tweetId;

    @Column(
            name = "score",
            nullable = false
    )
    private byte score;

    @Column(
            name = "dateTime"
    )
    private LocalDateTime dateTime;
}

package com.share.investment.model.dao;


import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(
        name = "tweet"
)
@Entity
@Data
public class Tweet {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long tweetId;

    @Column(
            unique = true,
            nullable = false
    )
    private Long userId;

    private String tweetString;

    private LocalDateTime dateTime;

    @OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "tweet"
    )
    private SentimentAnalysis sentimentAnalysis;

    @ManyToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "share_id",
            nullable = false
    )
    private Share share;
}

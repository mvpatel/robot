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
        name = "tweet"
)
@Data
@Entity
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

    private String tweet;

    @Column(
            unique = true,
            nullable = false
    )
    private Long shareId;

    private LocalDateTime dateTime;
}

package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.*;
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
            name = "userId",
            unique = true,
            nullable = false
    )
    private Long userId;

    @Column(
            name = "tweet"
    )
    private String tweet;

    @Column(
            name = "shareId",
            unique = true,
            nullable = false
    )
    private Long shareId;

    @Column(
            name = "dateTime"
    )
    private LocalDateTime dateTime;
}

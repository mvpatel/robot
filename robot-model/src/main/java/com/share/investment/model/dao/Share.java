package com.share.investment.model.dao;

import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(
        name = "share"
)
@Entity
@Setter
public class Share {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long shareId;


    @Column(
            unique = true,
            nullable = false
    )
    private String shareName;

    @Column(
            unique = true,
            nullable = false
    )
    private String companyName;
}

package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Data
@Table(
        name = "share"
)
@Entity(
        name = "Share"
)
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

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "share")
    private Price price;

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "share"
    )
    private List<Investment> investments;

    @OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "share"
    )
    private Restriction restriction;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "share"
    )
    private List<Tweet> tweets;

}

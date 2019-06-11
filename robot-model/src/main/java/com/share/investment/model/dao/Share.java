package com.share.investment.model.dao;

import lombok.Data;

import javax.persistence.*;

@Table(
        name = "share"
)

@Data
@Entity
public class Share {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long shareId;


    @Column(
            name = "shareName",
            unique = true,
            nullable = false
    )
    private String shareName;

    @Column(
            name = "companyName",
            unique = true,
            nullable = false
    )
    private String companyName;

}

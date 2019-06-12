package com.share.investment.model.dao;

import lombok.Data;
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

@Data
@Setter
@Entity
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

    public void setShareId(Long shareId) {
        this.shareId = shareId;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

package com.vektorel.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Musteri_GNL")
public class Musteri implements Serializable {

    public Musteri() {
    }

    private Long id;
    private String ad;
    private String soyad;
@Id
@SequenceGenerator(name="SEQ_Musteri",sequenceName="SEQ_Musteri",allocationSize=1,initialValue=1)
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_Musteri")
@Column(name="Musteri_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
}

  
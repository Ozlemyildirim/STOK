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
import javax.persistence.Temporal;

@Entity
@Table(name="Skart_GNL")
public class Skart implements Serializable {

    private int id;
    private String tanım;
    private String kod;
    private Long Barkod;
    private Long BirimFiyat;
    private Date Gelistarihi;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_Skart")
    @SequenceGenerator(name="SEQ_Skart",sequenceName="SEQ_Skart",allocationSize=1,initialValue=1)
    @Column(name="Skart_ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanım() {
        return tanım;
    }

    public void setTanım(String tanım) {
        this.tanım = tanım;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public Long getBarkod() {
        return Barkod;
    }

    public void setBarkod(Long Barkod) {
        this.Barkod = Barkod;
    }

    public Long getBirimFiyat() {
        return BirimFiyat;
    }

    public void setBirimFiyat(Long BirimFiyat) {
        this.BirimFiyat = BirimFiyat;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getGelistarihi() {
        return Gelistarihi;
    }

    public void setGelistarihi(Date Gelistarihi) {
        this.Gelistarihi = Gelistarihi;
    }

    @Override
    public String toString() {
        return "Skart{" + "id=" + id + ", tan\u0131m=" + tanım + ", kod=" + kod + ", Barkod=" + Barkod + ", BirimFiyat=" + BirimFiyat + ", Gelistarihi=" + Gelistarihi + '}';
    }

    

    
}
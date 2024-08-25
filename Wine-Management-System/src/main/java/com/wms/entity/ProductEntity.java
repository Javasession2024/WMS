package com.wms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Speficy data type as per prodcut type....sr change into lond
    private int id;
    private String sr;
    private String item; //product
    private String price;
    private String mL;
    private String quentity;
    private String flavours;

    public ProductEntity(){}

    public ProductEntity( String sr, String item, String price, String mL, String quentity, String flavours) {

        this.sr = sr;
        this.item = item;
        this.price = price;
        this.mL = mL;
        this.quentity = quentity;
        this.flavours = flavours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getmL() {
        return mL;
    }

    public void setmL(String mL) {
        this.mL = mL;
    }

    public String getQuentity() {
        return quentity;
    }

    public void setQuentity(String quentity) {
        this.quentity = quentity;
    }

    public String getFlavours() {
        return flavours;
    }

    public void setFlavours(String flavours) {
        this.flavours = flavours;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", sr='" + sr + '\'' +
                ", item='" + item + '\'' +
                ", price='" + price + '\'' +
                ", mL='" + mL + '\'' +
                ", quentity='" + quentity + '\'' +
                ", flavours='" + flavours + '\'' +
                '}';
    }
}

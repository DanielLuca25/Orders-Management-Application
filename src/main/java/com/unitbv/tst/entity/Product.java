package com.unitbv.tst.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "PRODUCTS")
@SequenceGenerator(name="product_seq", initialValue=6)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="product_seq")
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LAST_UPDATE")
    private Date lastUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

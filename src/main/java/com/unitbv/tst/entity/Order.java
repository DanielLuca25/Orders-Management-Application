package com.unitbv.tst.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ORDERS")
@SequenceGenerator(name="orders_seq", initialValue=5)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="orders_seq")
    @Column(name = "ID")
    private Integer id;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "ORDER_DATE")
    private Date date;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getOrderDate() {
        return date;
    }

    public void setOrderDate(Date orderDate) {
        this.date = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}

package com.hellojava.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "shopping_order")
public class Order implements Serializable {
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "order_business")
    private int orderBusiness;
    @Column(name = "current_user")
    private String currentUser;
    @Column(name = "order_address")
    private String orderAddress;
    @Column(name = "order_phone")
    private int orderPhone;
    @Column(name = "total_price")
    private double totalPrice;
    @Column(name = "order_time")
    private double order_time;
    @Column(name = "order_state")
    private double orderState;
    @Column(name = "user_id")
    private double userId;

}

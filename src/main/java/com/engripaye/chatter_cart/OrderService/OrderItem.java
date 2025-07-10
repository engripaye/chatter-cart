package com.engripaye.chatter_cart.OrderService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;
    private Long product;
    private int quantity;
    private double price;
}

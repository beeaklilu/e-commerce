package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Order order;

    private OrderStatus orderStatus;

    @ManyToOne
    private Product product;
}

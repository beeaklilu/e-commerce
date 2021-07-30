package com.example.ecommerce.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany
    private List<OrderDetail> orderDetails;

    @OneToOne
    private Address address;
}

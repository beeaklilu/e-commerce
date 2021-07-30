package com.example.ecommerce.model;

import javax.persistence.*;

@Entity
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int count;

    @ManyToOne
    private Buyer buyer;

    @ManyToOne
    private Product product;
}

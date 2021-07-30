package com.example.ecommerce.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Seller extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany
    @JoinTable(name = "seller_product")
    private List<Product> products;
}

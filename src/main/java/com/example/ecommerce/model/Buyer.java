package com.example.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Buyer extends User{

    @OneToMany
    private List<ProductDetail> productDetailList;
}

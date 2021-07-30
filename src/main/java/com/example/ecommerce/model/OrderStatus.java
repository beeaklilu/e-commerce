package com.example.ecommerce.model;

public enum OrderStatus {

    SHIPPED("Shipped"), CANCELLED("Cancelled"), DELIVERED("Delivered");

    private String status;

    private OrderStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}

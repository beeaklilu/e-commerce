package com.example.ecommerce.model;


public enum Role {
    BUYER("Buyer"), SELLER("Seller"), ADMIN("Admin");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

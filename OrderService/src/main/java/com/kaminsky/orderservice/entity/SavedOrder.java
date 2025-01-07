package com.kaminsky.orderservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class SavedOrder {
    @Id
    private Long id;

    @Column(name = "product_name")
    private String productName;

    private Long quantity;

    @Column(name = "user_email")
    private String userEmail;

    public SavedOrder(Long id, String productName, Long quantity, String userEmail) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.userEmail = userEmail;
    }

    public SavedOrder() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}

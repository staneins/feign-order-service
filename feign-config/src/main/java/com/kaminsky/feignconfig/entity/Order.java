package com.kaminsky.feignconfig.entity;

public class Order {
    private Long id;
    private String productName;
    private Long quantity;
    private String userEmail;
    private Status status;

    public Order(Long id, String productName, Long quantity, String userEmail, Status status) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.userEmail = userEmail;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

package com.kaminsky.feignconfig.entity;

public class NotificationRequest {
    private Long orderId;
    private String productName;
    private String userEmail;

    public NotificationRequest(Long orderId, String productName, String userEmail) {
        this.orderId = orderId;
        this.productName = productName;
        this.userEmail = userEmail;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}

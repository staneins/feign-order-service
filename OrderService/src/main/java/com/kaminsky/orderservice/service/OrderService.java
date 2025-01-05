package com.kaminsky.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderClient orderClient;

    public void createOrder(OrderRequest orderRequest) {
        // Логика создания заказа
        NotificationRequest notificationRequest = new NotificationRequest(orderRequest.getId(), orderRequest.getProductName(), orderRequest.getUserEmail());
        notificationClient.sendNotification(notificationRequest);
    }
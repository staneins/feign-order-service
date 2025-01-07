package com.kaminsky.orderservice.service;

import com.kaminsky.feignconfig.config.OrderClient;
import com.kaminsky.feignconfig.entity.NotificationRequest;
import com.kaminsky.feignconfig.entity.OrderRequest;
import com.kaminsky.feignconfig.entity.Status;
import com.kaminsky.orderservice.entity.SavedOrder;
import com.kaminsky.orderservice.repo.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderClient orderClient;
    private final OrderRepository orderRepository;

    public OrderService(OrderClient orderClient, OrderRepository orderRepository) {
        this.orderClient = orderClient;
        this.orderRepository = orderRepository;
    }

    public void createOrder(OrderRequest orderRequest) {
        try {
            orderRepository.save(new SavedOrder(orderRequest.getId(), orderRequest.getProductName(), orderRequest.getQuantity(), orderRequest.getUserEmail()));
            orderRequest.setStatus(Status.FINISHED);
            NotificationRequest notificationRequest = new NotificationRequest(orderRequest.getId(), orderRequest.getProductName(), orderRequest.getUserEmail());
            orderClient.sendNotification(notificationRequest);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
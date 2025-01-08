package com.kaminsky.notificationsservice.controller;

import com.kaminsky.feignconfig.entity.NotificationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @PostMapping
    public ResponseEntity<String> receiveNotification(@RequestBody NotificationRequest notificationRequest) {
        log.info("Received order request: {} {} {} {}", notificationRequest.getOrderId(), notificationRequest.getProductName(), notificationRequest.getUserEmail());
        return ResponseEntity.ok().body("Order request received");
    }
}

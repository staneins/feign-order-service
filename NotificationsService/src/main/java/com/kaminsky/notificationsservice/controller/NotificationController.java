package com.kaminsky.notificationsservice.controller;

import com.kaminsky.feignconfig.entity.OrderRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private Logger log = LoggerFactory.getLogger(this.getClass().getName());

    public ResponseEntity<String> ceceiveNotification(@RequestBody OrderRequest orderRequest) {
        log.info("Received order request: {} {} {} {}", orderRequest.getId(), orderRequest.getProductName(), orderRequest.getQuantity(), orderRequest.getUserEmail());
        return ResponseEntity.ok().body("Order request received");
    }
}

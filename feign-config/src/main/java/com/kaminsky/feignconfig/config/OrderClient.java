package com.kaminsky.feignconfig.config;

import com.kaminsky.feignconfig.FeignConfig;
import com.kaminsky.feignconfig.entity.NotificationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "notification-service", url = "http://localhost:8081", configuration = FeignConfig.class)
public interface OrderClient {

    @PostMapping("/notifications")
    void sendNotification(NotificationRequest request);
}

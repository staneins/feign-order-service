package com.kaminsky.feignconfig.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        return switch (response.status()) {
            case 404 -> new RuntimeException("Notification Service not found (404)");
            case 500 -> new RuntimeException("Notification Service internal server error (500)");
            default -> new RuntimeException("Unknown error occurred during Feign Client call");
        };
    }
}

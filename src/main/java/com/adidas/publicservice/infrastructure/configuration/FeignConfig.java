package com.adidas.publicservice.infrastructure.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.adidas.publicservice.adapters.rest")
public class FeignConfig {
}

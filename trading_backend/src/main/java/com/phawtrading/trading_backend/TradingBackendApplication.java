package com.phawtrading.trading_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.phawtrading.trading_backend")
@SpringBootApplication
public class TradingBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradingBackendApplication.class, args);
    }
}

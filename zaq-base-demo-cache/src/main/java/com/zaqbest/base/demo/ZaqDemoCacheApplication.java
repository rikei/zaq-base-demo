package com.zaqbest.base.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication(scanBasePackages = {"com.zaqbest"})
public class ZaqDemoCacheApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ZaqDemoCacheApplication.class, args);

        new CountDownLatch(1).await();
    }
}

package com.zaqbest.demo.dubbo.order.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication(
        scanBasePackages = {"com.zaqbest"},
        exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class}
)
@ImportResource({"classpath:applicationContext-customer.xml"})
public class ZaqDemoRpcDubboCustomerApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ZaqDemoRpcDubboCustomerApplication.class, args);

        new CountDownLatch(1).await();
    }
}

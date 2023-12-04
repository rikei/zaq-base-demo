package com.zaqbest.demo.dubbo.order.provider;

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
@ImportResource({"classpath:applicationContext-provider.xml"})
public class ZaqDemoRpcDubboProviderApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ZaqDemoRpcDubboProviderApplication.class, args);

        new CountDownLatch(1).await();
    }
}

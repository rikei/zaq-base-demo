package com.zaqbest.demo.dubbo;

import com.zaqbest.demo.dubbo.order.customer.ZaqDemoRpcDubboCustomerApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = ZaqDemoRpcDubboCustomerApplication.class)
@TestPropertySource(locations={"classpath:application.properties"})
public class BaseTest {
}

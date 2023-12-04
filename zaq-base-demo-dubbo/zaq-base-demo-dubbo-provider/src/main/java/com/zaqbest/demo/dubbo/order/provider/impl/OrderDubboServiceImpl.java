package com.zaqbest.demo.dubbo.order.provider.impl;

import com.zaqbest.base.comm.domain.CommonResult;
import com.zaqbest.demo.dubbo.order.api.domain.OrderDomain;
import com.zaqbest.demo.dubbo.order.api.service.OrderDubboService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service("orderDubboService")
@Slf4j
public class OrderDubboServiceImpl implements OrderDubboService {
    @Override
    public CommonResult<OrderDomain> getOrder() {
        log.info("OrderDubboService Provider: 查询订单");
        return CommonResult.success(new OrderDomain(1, 10086, LocalDateTime.now()));
    }
}

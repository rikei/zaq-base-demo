package com.zaqbest.demo.dubbo.order.api.service;


import com.zaqbest.base.comm.domain.CommonResult;
import com.zaqbest.demo.dubbo.order.api.domain.OrderDomain;

public interface OrderDubboService {
    CommonResult<OrderDomain> getOrder();
}

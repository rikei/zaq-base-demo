package com.zaqbest.demo.dubbo.customer;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;
import com.zaqbest.base.comm.domain.CommonResult;
import com.zaqbest.demo.dubbo.BaseTest;
import com.zaqbest.demo.dubbo.order.api.domain.OrderDomain;
import com.zaqbest.demo.dubbo.order.api.service.OrderDubboService;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

public class ZaqDemoDubboTest extends BaseTest {

    @Resource(name = "orderFacade")
    private OrderDubboService orderFacade;

    @Test
    public void getOrderTest(){
        for (int i = 0; i < 100; i++) {
            CommonResult<OrderDomain> result = orderFacade.getOrder();
            System.out.println(JSONUtil.toJsonStr(result));
            System.out.println(DateUtil.now());
        }
    }
}

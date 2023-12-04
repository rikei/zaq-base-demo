package com.zaqbest.demo.dubbo.order.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class OrderDomain implements Serializable {

    private Integer id;
    private Integer orderNum;
    private LocalDateTime gmtCreate;
}

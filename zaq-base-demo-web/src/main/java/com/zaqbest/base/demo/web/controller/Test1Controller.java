package com.zaqbest.base.demo.web.controller;

import com.zaqbest.base.demo.web.support.log.annotation.WebLog;
import com.zaqbest.base.web.domain.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试1")
@Tag(name = "测试1", description = "测试1")
@RestController
@RequestMapping("/test1")
public class Test1Controller {
    @RequestMapping(value = "/url1",method = RequestMethod.GET)
    @WebLog
    public CommonResult<String> url1(){
        return CommonResult.success("ok");
    }

    @RequestMapping(value = "/url2", method = RequestMethod.GET)
    @ResponseBody
    public String url2(){
        return "ok";
    }
}

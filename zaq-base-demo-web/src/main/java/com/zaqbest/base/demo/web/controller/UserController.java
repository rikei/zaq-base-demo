package com.zaqbest.base.demo.web.controller;

import com.zaqbest.base.comm.domain.CommonResult;
import com.zaqbest.base.demo.web.data.entity.SysUserEntity;
import com.zaqbest.base.demo.web.service.UserService;
import com.zaqbest.base.demo.web.support.log.annotation.WebLog;
import com.zaqbest.base.web.domain.CommonPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户管理")
@Tag(name = "用户管理", description = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询所有")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @WebLog
    public CommonResult<List<SysUserEntity>> listAll() {
        return CommonResult.success(userService.listAll());
    }

    @ApiOperation(value = "分页查询")
    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    @WebLog
    public CommonResult<CommonPage<SysUserEntity>> page(@RequestParam(value = "keyword", required = false) String keyword,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<SysUserEntity> userList = userService.list(keyword, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(userList));
    }
}

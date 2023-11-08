package com.zaqbest.base.demo.web.service;

import com.zaqbest.base.demo.web.data.model.SysUser;

import java.util.List;

public interface UserService {
    List<SysUser> listAll();

    List<SysUser> list(String keyword, Integer pageNum, Integer pageSize);
}

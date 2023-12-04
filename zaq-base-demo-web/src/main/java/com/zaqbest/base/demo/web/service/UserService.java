package com.zaqbest.base.demo.web.service;

import com.zaqbest.base.demo.web.data.entity.SysUserEntity;

import java.util.List;

public interface UserService {
    List<SysUserEntity> listAll();

    List<SysUserEntity> list(String keyword, Integer pageNum, Integer pageSize);
}

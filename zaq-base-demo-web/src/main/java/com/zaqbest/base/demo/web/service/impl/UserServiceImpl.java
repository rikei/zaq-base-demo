package com.zaqbest.base.demo.web.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.zaqbest.base.demo.web.data.entity.SysUserEntity;
import com.zaqbest.base.demo.web.data.mapper.SysUserMapper;
import com.zaqbest.base.demo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUserEntity> listAll() {
        return sysUserMapper.selectList(null);
    }

    @Override
    public List<SysUserEntity> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        return sysUserMapper.selectList(Wrappers.<SysUserEntity>lambdaQuery().like(SysUserEntity::getUserName, keyword));
    }
}

package com.zaqbest.base.demo.web.service.impl;

import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.zaqbest.base.demo.web.data.mapper.SysUserMapper;
import com.zaqbest.base.demo.web.data.model.SysUser;
import com.zaqbest.base.demo.web.data.model.SysUserExample;
import com.zaqbest.base.demo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> listAll() {
        return sysUserMapper.selectByExample(null);
    }

    @Override
    public List<SysUser> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        if (!StrUtil.isEmpty(keyword)) {
            criteria.andUserNameLike("%" + keyword + "%");
        }
        return sysUserMapper.selectByExample(example);
    }
}

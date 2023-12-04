package com.zaqbest.base.demo.web;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.zaqbest.base.demo.web.data.mapper.SysUserMapper;
import com.zaqbest.base.demo.web.data.model.SysUser;
import com.zaqbest.base.demo.web.data.model.SysUserExample;
import org.bouncycastle.util.encoders.Base64;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ZaqBaseDemoWebApplicationTests {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testSnowFlake(){
        Snowflake snowflake = IdUtil.getSnowflake(1,1);

        for (int i = 0; i < 100; i++){
            System.out.println(snowflake.nextIdStr());
        }
    }

    @Test
    void insert(){
        Snowflake snowflake = IdUtil.getSnowflake(1,1);

        for (int i = 0; i < 100; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(snowflake.nextId());
            sysUser.setUserName("pp");
            sysUser.setPassword("xx");
            sysUser.setCreateUser(0L);
            sysUser.setCreateTime(new Date());
            sysUser.setUpdateUser(0L);
            sysUser.setUpdateTime(new Date());
            sysUser.setIsDelete(0);
            sysUserMapper.insert(sysUser);
        }
    }

}

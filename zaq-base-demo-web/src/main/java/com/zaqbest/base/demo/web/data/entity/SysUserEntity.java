package com.zaqbest.base.demo.web.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author mbp-generator
 * @since 2023-12-04
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sys_user")
public class SysUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId("id")
    private Long id;

    /**
     * 用户账号
     */
    @TableField("user_name")
    private String userName;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @TableField("is_delete")
    private Byte isDelete;

    /**
     * 创建者
     */
    @TableField("create_user")
    private Long createUser;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Timestamp createTime;

    /**
     * 更新者
     */
    @TableField("update_user")
    private Long updateUser;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Timestamp updateTime;
}

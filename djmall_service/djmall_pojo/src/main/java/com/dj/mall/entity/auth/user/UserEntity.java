package com.dj.mall.entity.auth.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.dozer.Mapping;

import java.io.Serializable;

/**
 * 用户实体
 * @描述
 * @创建人 zhangbo
 * @创建时间 2020/3/24
 */
@Data
@TableName("djmall_auth_user")
public class UserEntity implements Serializable {

    /**
     * 用户id
     */
    @TableId(type = IdType.AUTO)
    @Mapping("userId")
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 用户状态
     */
    private Integer status;
}

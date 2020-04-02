package com.dj.mall.entity.auth.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.dozer.Mapping;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

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
     * 昵称
     */
    private String nickName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别 1男 2女
     */
    private Integer userSex;

    /**
     * 用户状态：-1未激活, 1激活
     */
    private Integer status;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    /**
     * 盐
     */
    private String salt;

    /**
     * 验证码
     */
    private String code;

    /**
     * 验证时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date codeTime;

    /**
     * 重置密码
     */
    private String resetUserPwd;
}

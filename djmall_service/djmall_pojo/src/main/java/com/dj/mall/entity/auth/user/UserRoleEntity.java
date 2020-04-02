package com.dj.mall.entity.auth.user;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户角色表
 * @Date: 2020/4/2 17:07
 * @author: zhangbo
 * @version: 1.0
 */
@Data
@TableName("djmall_auth_user_role")
public class UserRoleEntity  implements Serializable {

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 伪删除 -1已删除 1正常
     */
    private Integer isDel;

}
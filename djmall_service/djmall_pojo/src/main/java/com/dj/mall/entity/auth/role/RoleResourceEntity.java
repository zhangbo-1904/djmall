package com.dj.mall.entity.auth.role;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 角色资源实体类
 * @Date: 2020/4/2 17:12
 * @author: zhangbo
 * @version: 1.0
 */
@Data
@TableName("djmall_auth_role_resource")
public class RoleResourceEntity  implements Serializable {

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 资源ID
     */
    private Integer resourceId;

    /**
     * 伪删除 -1已删除 1正常
     */
    private Integer isDel;
}
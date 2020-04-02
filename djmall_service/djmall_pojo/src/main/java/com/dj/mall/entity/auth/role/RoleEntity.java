package com.dj.mall.entity.auth.role;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.dozer.Mapping;

/**
 * @description: 角色实体
 * @Date: 2020/4/2 17:10
 * @author: zhangbo
 * @version: 1.0
 */
@Data
@TableName("djmall_auth_role")
public class RoleEntity {

    /**
     * 角色id
     */
    @TableId(type = IdType.AUTO)
    @Mapping("roleId")
    private Integer id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 1展示 2伪删除
     */
    private Integer isDel;

}
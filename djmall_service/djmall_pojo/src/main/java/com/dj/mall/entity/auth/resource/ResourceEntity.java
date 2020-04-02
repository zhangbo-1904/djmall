package com.dj.mall.entity.auth.resource;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.dozer.Mapping;

import java.io.Serializable;

/**
 * @description: 资源实体类
 * @Date: 2020/4/2 17:16
 * @author: zhangbo
 * @version: 1.0
 */
@Data
@TableName("djmall_auth_resource")
public class ResourceEntity implements Serializable {

    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    @Mapping("resourceId")
    private Integer id;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源路径
     */
    private String url;

    /**
     * 状态:-1伪删除,1删除
     */
    private Integer isDel;

    /**
     * 父级id
     */
    private Integer pId;

    /**
     * 菜单展示 1
     */
    private Integer resourceType;

    /**
     * 资源编码
     */
    private String resourceCode;
}
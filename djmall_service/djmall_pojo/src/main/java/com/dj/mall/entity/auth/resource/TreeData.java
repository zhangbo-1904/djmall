package com.dj.mall.entity.auth.resource;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 资源树
 * @Date: 2020/4/2 17:20
 * @author: zhangbo
 * @version: 1.0
 */
@Data
public class TreeData implements Serializable {

    /**
     * 资源id
     */
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
     * 是否开启复选框
     */
    private Boolean checked = false;
}
package com.dj.mall.entity.auth.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.dozer.Mapping;

import java.io.Serializable;

/**
 * @description: 基础数据实体
 * @Date: 2020/4/2 17:21
 * @author: zhangbo
 * @version: 1.0
 */
@Data
@TableName("djmall_auth_base_data")
public class BaseDataEntity implements Serializable {

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    @Mapping("baseDataId")
    private Integer id;

    /**
     * 基础数据编码
     */
    private String code;

    /**
     * 基础数据名
     */
    private String name;

    /**
     * 基础数据父级编码
     */
    private String pCode;
}
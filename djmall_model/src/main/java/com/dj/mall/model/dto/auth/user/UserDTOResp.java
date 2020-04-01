package com.dj.mall.model.dto.auth.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @描述 用户DTO-Resp对象
 * @创建人 zhangjq
 * @创建时间 2020/3/24
 */
@Data
public class UserDTOResp implements Serializable {

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

}

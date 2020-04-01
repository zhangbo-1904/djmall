package com.dj.mall.admin.vo.auth.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户视图对象
 */
@Data
public class UserVOReq implements Serializable {

    /**
     * 用户名
     */
    private String username;

}

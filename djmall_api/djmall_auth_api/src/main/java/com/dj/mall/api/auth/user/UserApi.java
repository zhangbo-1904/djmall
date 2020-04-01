package com.dj.mall.api.auth.user;

import com.dj.mall.model.dto.auth.user.UserDTOReq;
import com.dj.mall.model.dto.auth.user.UserDTOResp;

import java.util.List;

/**
 * @描述
 * @创建人 zhangjq
 * @创建时间 2020/3/24
 */
public interface UserApi {

    /**
     * 根据用户id获取用户信息
     * @param userId 用户id
     * @return
     * @throws Exception
     */
    UserDTOResp getUser(Integer userId) throws Exception;

    /**
     * 查询用户
     * @param userDTOReq 查询条件
     * @return
     * @throws Exception
     */
    List<UserDTOResp> queryUser(UserDTOReq userDTOReq) throws Exception;
}

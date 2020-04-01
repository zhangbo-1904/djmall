package com.dj.mall.pro.auth.impl.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dj.mall.api.auth.user.UserApi;
import com.dj.mall.entity.auth.user.UserEntity;
import com.dj.mall.mapper.auth.user.UserMapper;
import com.dj.mall.model.dto.auth.user.UserDTOReq;
import com.dj.mall.model.dto.auth.user.UserDTOResp;
import com.dj.mall.model.util.DozerUtil;

import java.io.Serializable;
import java.util.List;

/**
 * @描述
 * @创建人 zhangjq
 * @创建时间 2020/3/24
 */
@Service
public class UserApiImpl extends ServiceImpl<UserMapper, UserEntity> implements UserApi {

    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return
     * @throws Exception
     */
    @Override
    public UserDTOResp getUser(Integer userId) throws Exception {
        return DozerUtil.map(this.getById(userId), UserDTOResp.class);
    }

    /**
     * 查询用户
     *
     * @param userDTOReq 查询条件
     * @return
     * @throws Exception
     */
    @Override
    public List<UserDTOResp> queryUser(UserDTOReq userDTOReq) throws Exception {
        return DozerUtil.mapList(this.list(), UserDTOResp.class);
    }
}

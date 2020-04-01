package com.dj.mall.admin.web.auth.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dj.mall.admin.vo.auth.user.UserVOReq;
import com.dj.mall.admin.vo.auth.user.UserVOResp;
import com.dj.mall.api.auth.user.UserApi;
import com.dj.mall.model.base.ResultModel;
import com.dj.mall.model.dto.auth.user.UserDTOReq;
import com.dj.mall.model.dto.auth.user.UserDTOResp;
import com.dj.mall.model.util.DozerUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @描述
 * @创建人 zhangbo
 * @创建时间 2020/3/24
 */
@RestController
@RequestMapping("/auth/user/")
public class UserController {

    @Reference
    private UserApi userApi;

    @GetMapping("{userId}")
    public ResultModel getUser(@PathVariable Integer userId) {
        try {
            UserDTOResp userDTOResp = userApi.getUser(userId);
            return new ResultModel().success(DozerUtil.map(userDTOResp, UserVOResp.class));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultModel().error(e.getMessage());
        }
    }

    @GetMapping
    public ResultModel getUser(UserVOReq userVOReq) {
        try {
            List<UserDTOResp> userDTORespList = userApi.queryUser(DozerUtil.map(userVOReq, UserDTOReq.class));
            return new ResultModel().success(DozerUtil.mapList(userDTORespList, UserVOResp.class));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultModel().error(e.getMessage());
        }
    }
}

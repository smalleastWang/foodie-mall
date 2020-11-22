package com.smalleast.controller;

import com.smalleast.bo.UserBo;
import com.smalleast.pojo.Users;
import com.smalleast.utils.BaseResponse;
import com.smalleast.service.UsersService;
import com.smalleast.bo.LoginRequestVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.controller
 * @Description : TODO
 * @Date 2020/11/19 下午3:35
 **/

@Api(tags = "用户相关接口")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UsersService usersService;


    @GetMapping("/usernameIsExist")
    public BaseResponse login(@RequestParam String username) {
        if (StringUtils.isEmpty(username)) {
            return BaseResponse.error("用户名不能为空");
        }
        boolean isExist = usersService.queryUserNameIsExist(username);
        if (isExist) {
            return BaseResponse.error("用户名已存在");
        }
        return BaseResponse.success(true, "请求成功 用户名没有重复");
    }

    @PostMapping("/login")
    public BaseResponse login(@RequestBody LoginRequestVo req) {
        return BaseResponse.success(true, "登录成功");
    }
    @PostMapping("/register")
    public BaseResponse register(@RequestBody UserBo userBo) {

        String username = userBo.getUsername();
        String password = userBo.getPassword();
        String confirmPwd = userBo.getConfirmPassword();

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password) || StringUtils.isEmpty(confirmPwd)) {
            return BaseResponse.error("用户名或密码不能为空");
        }

        boolean isExist = usersService.queryUserNameIsExist(username);
        if (isExist) {
            return BaseResponse.error("用户名已存在");
        }

        if (password.length() < 6) {
            return BaseResponse.error("密码长度不能小于6");
        }

        if (!password.equals(confirmPwd)) {
            return BaseResponse.error("两次密码输入不一致");
        }

        Users user =  usersService.createUser(userBo);

        return BaseResponse.success(user, "注册成功");
    }
}

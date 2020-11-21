package com.smalleast.controller;

import com.smalleast.utils.BaseResponse;
import com.smalleast.service.UsersService;
import com.smalleast.user.LoginRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.controller
 * @Description : TODO
 * @Date 2020/11/19 下午3:35
 **/

@RestController
@RequestMapping(value = "user")
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
    public BaseResponse register() {
        return BaseResponse.success(true, "注册成功");
    }
}

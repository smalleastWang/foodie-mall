package com.smalleast.controller;

import com.smalleast.base.Response;
import com.smalleast.user.LoginRequestVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.controller
 * @Description : TODO
 * @Date 2020/11/19 下午3:35
 **/

@RestController
@RequestMapping(value = "user")
public class User {
    @PostMapping("/login")
    public Response login(@RequestBody LoginRequestVo req) {

        return Response.success(true, "登录成功");
    }
    @PostMapping("/register")
    public Response register() {
        return Response.success(true, "注册成功");
    }
}

package com.smalleast.controller;

import com.smalleast.bo.UserBo;
import com.smalleast.pojo.Users;
import com.smalleast.utils.BaseResponse;
import com.smalleast.service.UsersService;
import com.sun.istack.internal.NotNull;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.controller
 * @Description : TODO
 * @Date 2020/11/19 下午3:35
 **/

@Api(tags = "用户登录注册相关接口")
@RestController
@RequestMapping(value = "/user")
@Validated
public class UserController {

    @Autowired
    private UsersService usersService;

    @ApiOperation(value = "验证用户名是否存在", notes = "验证用户名是否存在")
    @GetMapping("/usernameIsExist")
    public BaseResponse usernameIsExist(@RequestParam @NotNull String username) {
        if (StringUtils.isEmpty(username)) {
            return BaseResponse.error("用户名不能为空");
        }
        boolean isExist = usersService.queryUserNameIsExist(username);
        if (isExist) {
            return BaseResponse.error("用户名已存在");
        }
        return BaseResponse.success(true, "请求成功 用户名没有重复");
    }

    @ApiOperation(value = "用户登录", notes = "用户登录")
    @PostMapping("/login")
    public BaseResponse login(@RequestBody @Validated UserBo userBo) {

        boolean isExist = usersService.queryUserNameIsExist(userBo.getUsername());
        if (!isExist)
            return BaseResponse.error("用户名不存在");

        Users user =  usersService.loginUser(userBo);
        if (user == null)
            return BaseResponse.error("用户名或密码错误");

        return BaseResponse.success(user, "登录成功");
    }
    @ApiOperation(value = "用户注册", notes = "用户注册")
    @PostMapping("/register")
    public BaseResponse register(@RequestBody @Validated UserBo userBo) {

        String username = userBo.getUsername();
        String password = userBo.getPassword();
        String confirmPwd = userBo.getConfirmPassword();

        boolean isExist = usersService.queryUserNameIsExist(username);
        if (isExist) {
            return BaseResponse.error("用户名已存在");
        }

        if (!password.equals(confirmPwd)) {
            return BaseResponse.error("两次密码输入不一致");
        }

        Users user =  usersService.createUser(userBo);

        return BaseResponse.success(user, "注册成功");
    }

    @ApiOperation(value = "退出登录", notes = "退出登录")
    @GetMapping("/logout")
    public BaseResponse logout(@RequestParam String userId, HttpServletRequest req, HttpServletResponse res) {
        return BaseResponse.success();
    }
}

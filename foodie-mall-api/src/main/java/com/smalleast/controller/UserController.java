package com.smalleast.controller;

import com.smalleast.bo.UserBo;
import com.smalleast.pojo.Users;
import com.smalleast.utils.BaseResponse;
import com.smalleast.service.UsersService;
import com.smalleast.utils.CookieUtils;
import com.smalleast.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;

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
    public BaseResponse login(@RequestBody @Validated UserBo userBo, HttpServletRequest request, HttpServletResponse response) throws Exception {

        boolean isExist = usersService.queryUserNameIsExist(userBo.getUsername());
        if (!isExist) return BaseResponse.error("用户名不存在");

        Users result =  usersService.loginUser(userBo);
        if (result == null) return BaseResponse.error("用户名或密码错误");

        result = setNUllProperty(result);

        // 设置登录信息
        CookieUtils.setCookie(request, response, "user", JsonUtils.objectToJson(result), true);

        return BaseResponse.success(result, "登录成功");

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
    @PostMapping("/logout")
    public BaseResponse logout(@RequestParam @NotNull String userId, HttpServletRequest request, HttpServletResponse response) {
        // 清除cookie
        CookieUtils.deleteCookie(request, response, "user");

        return BaseResponse.success();
    }

    /**
     * 设置空属性
     * @param userResult
     * @return
     */
    private Users setNUllProperty(Users userResult) {
        userResult.setPassword(null);
        userResult.setMobile(null);
        userResult.setEmail(null);
        userResult.setCreateTime(null);
        userResult.setUpdatedTime(null);
        userResult.setBirthday(null);
        return userResult;
    }
}

package com.smalleast.controller;

import com.smalleast.utils.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.controller
 * @Description : TODO
 * @Date 2020/12/11 下午9:33
 **/

@Api(value = "地址", tags = "地址模块相关接口")
@RestController
@RequestMapping(value = "/address")
@Validated
public class AddressController {
    @ApiOperation(value = "用户地址列表", notes = "用户地址列表", httpMethod = "GET")
    @GetMapping("/list")
    public BaseResponse queryAddressList() {

        return null;
    }
}

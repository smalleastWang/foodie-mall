package com.smalleast.controller;

import com.smalleast.base.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.controller
 * @Description : TODO
 * @Date 11/14/20 6:38 下午
 **/

@RestController
@RequestMapping(value = "hello")
public class Hello {

    @GetMapping("")
    public Response hello() {
        return Response.success();
    }
}

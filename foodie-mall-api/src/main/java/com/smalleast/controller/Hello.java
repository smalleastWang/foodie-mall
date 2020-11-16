package com.smalleast.controller;

import com.smalleast.base.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.controller
 * @Description : TODO
 * @Date 11/14/20 6:38 下午
 **/

@RestController
public class Hello {

    @GetMapping("hello")
    public Response hello() {
        return Response.success("asdas");
    }
}

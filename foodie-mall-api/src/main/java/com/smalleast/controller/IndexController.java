package com.smalleast.controller;

import com.smalleast.enums.YesOrNo;
import com.smalleast.pojo.Carousel;
import com.smalleast.service.CarouselService;
import com.smalleast.utils.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "首页", tags = "首页展示相关的接口")
@RestController
@RequestMapping("index")
public class IndexController {
    @Autowired
    private CarouselService carouselService;

    @ApiOperation(value = "首页轮播图", notes = "首页轮播图")
    @GetMapping("/carousel")
    public BaseResponse carousel() {
        List<Carousel> result = carouselService.queryAll(YesOrNo.YES.type);
        return BaseResponse.success(result);
    }
}

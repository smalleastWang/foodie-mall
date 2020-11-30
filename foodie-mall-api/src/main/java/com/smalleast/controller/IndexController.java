package com.smalleast.controller;

import com.smalleast.enums.YesOrNo;
import com.smalleast.pojo.Carousel;
import com.smalleast.pojo.Category;
import com.smalleast.pojo.Items;
import com.smalleast.service.CarouselService;
import com.smalleast.service.CategoryService;
import com.smalleast.service.ItemService;
import com.smalleast.utils.BaseResponse;
import com.smalleast.vo.SecondLevelCategoryVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "首页", tags = "首页展示相关的接口")
@RestController
@RequestMapping("index")
public class IndexController {
    @Autowired
    private CarouselService carouselService;

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;

    @ApiOperation(value = "首页轮播图", notes = "首页轮播图")
    @GetMapping("/carousel")
    public BaseResponse queryAllCarousel() {
        List<Carousel> result = carouselService.queryAll(YesOrNo.YES.type);
        return BaseResponse.success(result);
    }

    @ApiOperation(value = "一级分类查询", notes = "一级分类查询")
    @GetMapping("/cats")
    public BaseResponse queryCategory() {
        List<Category> result = categoryService.queryRootCategoryList();
        return BaseResponse.success(result);
    }

    @ApiOperation(value = "子分类查询", notes = "子分类查询")
    @GetMapping("/subCat/{rootCatId}")
    public BaseResponse querySubCategory(
            @ApiParam(name = "rootCatId", value = "一级分类ID", required = true)
            @PathVariable("rootCatId") Integer rootCatId) {

        List<SecondLevelCategoryVO> result = categoryService.querySubCategoryList(rootCatId);
        return BaseResponse.success(result);
    }

    @ApiOperation(value = "推荐商品", notes = "首页各一级分类最新六款商品", httpMethod = "GET")
    @GetMapping("/sixNewItems/{rootCatId}")
    public BaseResponse querySixNewItems(
            @ApiParam(name = "rootCatId", value = "一级分类ID", required = true)
            @PathVariable("rootCatId") Integer rootCatId) {

        List<Items> items = itemService.queryItemsByCategory(rootCatId);
        return BaseResponse.success(items);
    }
}

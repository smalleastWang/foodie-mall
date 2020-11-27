package com.smalleast.controller;

import com.smalleast.bo.ItemCreateBo;
import com.smalleast.bo.ItemSearchBo;
import com.smalleast.pojo.Items;
import com.smalleast.service.ItemService;
import com.smalleast.utils.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.controller
 * @Description : TODO
 * @Date 2020/11/24 下午3:11
 **/

@Api(tags = "商品相关接口")
@RestController
@RequestMapping(value = "items")
@Validated
public class ItemController {

    @Autowired
    ItemService itemService;

    @ApiOperation(value = "商品列表接口", notes = "商品列表接口")
    @GetMapping("list")
    public BaseResponse getList(@RequestBody @Validated ItemSearchBo itemSearchBo) {
        // if (itemBo)
        List<Items> result = itemService.queryItems(itemSearchBo);
        return BaseResponse.success(result);
    }

    @ApiOperation(value = "创建商品接口", notes = "商品列表接口")
    @PostMapping("create")
    public BaseResponse createItem(@RequestBody @Validated ItemCreateBo itemCreateBo) {
        Items result = itemService.createItem(itemCreateBo);
        return BaseResponse.success(result);
    }
}

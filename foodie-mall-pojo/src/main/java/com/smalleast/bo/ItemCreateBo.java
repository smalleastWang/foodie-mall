package com.smalleast.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.bo
 * @Description : TODO
 * @Date 2020/11/27 上午10:58
 **/

@Getter
@Setter
@ApiModel(value = "商品创建类", description = "商品输入的数据封装在次entity中")
public class ItemCreateBo {

    @NotEmpty
    @ApiModelProperty(value = "商品名称", name = "商品名称", required = true)
    private String itemName;

    @NotEmpty
    @ApiModelProperty(value = "分类外键ID", name = "分类外键ID", required = true)
    private String catId;

    @NotEmpty
    @ApiModelProperty(value = "一级分类外键ID", name = "一级分类外键ID", required = true)
    private String rootCatId;

    @NotEmpty
    @ApiModelProperty(value = "累计销售", name = "累计销售", required = true)
    private String sellCount;

    @NotEmpty
    @ApiModelProperty(value = "上下架状态", name = "上下架状态", required = true)
    private String onOffStatus;

    @NotEmpty
    @ApiModelProperty(value = "商品内容", name = "商品内容", required = true)
    private String content;



}
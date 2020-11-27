package com.smalleast.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.bo
 * @Description : TODO
 * @Date 2020/11/24 下午3:19
 **/

@Getter
@Setter
@ApiModel(value = "商品搜索类", description = "商品输入的数据封装在次entity中")
public class ItemSearchBo {

    @ApiModelProperty(value = "商品ID", name = "商品ID")
    private String id;

    @ApiModelProperty(value = "商品名称", name = "商品名称")
    private String itemName;

    @ApiModelProperty(value = "分类外键ID", name = "分类外键ID")
    private String catId;

    @ApiModelProperty(value = "一级分类外键ID", name = "一级分类外键ID")
    private String rootCatId;

    @ApiModelProperty(value = "累计销售", name = "累计销售")
    private String sellCount;

    @ApiModelProperty(value = "上下架状态", name = "上下架状态")
    private String onOffStatus;

    @ApiModelProperty(value = "商品内容", name = "商品内容")
    private String content;

    @ApiModelProperty(value = "创建时间", name = "创建时间")
    private String createTime;

    @ApiModelProperty(value = "更新时间", name = "更新时间")
    private String updatedTime;

}

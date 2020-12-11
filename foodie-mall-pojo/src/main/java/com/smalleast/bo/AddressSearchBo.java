package com.smalleast.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.bo
 * @Description : TODO
 * @Date 2020/12/11 下午9:44
 **/

@Getter
@Setter
@ApiModel(value = "地址搜索类", description = "地址搜索类")
public class AddressSearchBo {

    @ApiModelProperty(value = "地址ID", name = "地址ID")
    private String id;

    @ApiModelProperty(value = "关联用户ID", name = "关联用户ID")
    private String userId;

    @ApiModelProperty(value = "收件人姓名", name = "收件人姓名")
    private String receiver;

    @ApiModelProperty(value = "收件人手机号", name = "收件人手机号")
    private String mobile;

    @ApiModelProperty(value = "省份", name = "省份")
    private String province;

    @ApiModelProperty(value = "城市", name = "城市")
    private String city;

    @ApiModelProperty(value = "区县", name = "区县")
    private String district;

    @ApiModelProperty(value = "详细地址", name = "详细地址")
    private String detail;

    @ApiModelProperty(value = "是否默认", name = "是否默认")
    private String isDefault;

    @ApiModelProperty(value = "创建时间", name = "创建时间")
    private String createTime;

    @ApiModelProperty(value = "更新时间", name = "更新时间")
    private String updatedTime;

}

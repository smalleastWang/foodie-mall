package com.smalleast.bo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ApiModel(value = "用户", description = "用户输入的数据封装在次entity中")
public class UserBo {

    @ApiModelProperty(value = "用户名", name = "用户名", example = "root", required = true)
    @NotNull(message = "用户名不能为空")
    private String username;


    @ApiModelProperty(value = "密码", name = "密码", example = "123456", required = true)
    @NotNull(message = "密码不能为空")
    @Length(min = 6, message = "密码不能小于6位")
    private String password;

    @ApiModelProperty(value = "确认密码", name = "确认密码", example = "123456")
    @Length(min = 6, message = "密码不能小于6位")
    private String confirmPassword;
}

package com.smalleast.utils;

import lombok.Getter;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.base
 * @Description : TODO 响应码枚举，对应HTTP状态码
 * @Date 11/16/20 2:53 下午
 **/

@Getter
public enum ResponseCode {
    SUCCESS(200, "成功"),
    FAIL(400, "失败"),
    UNAUTHORIZED(401, "未认证（签名错误"),
    NOT_FOUND(404, "接口不存在"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误");

    public Integer code;
    public String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}

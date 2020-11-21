package com.smalleast.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.base
 * @Description : TODO
 * @Date 11/16/20 2:52 下午
 **/

@Data
public class BaseResponse {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 200 -> 成功
     * 400 -> 失败
     * 401 -> 未认证（签名错误)
     * 404 -> 接口不存在
     * 500 -> 服务器内部错误
     * 501 -> 参数验证错误
     */
    private Integer code = 200;

    private String message = "请求成功";

    private Object data;

    BaseResponse() {}

    public BaseResponse(Object data) {
        this.data = data;
    }

    public BaseResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public BaseResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 请求成功
     * @return BaseResponse
     */
    public static BaseResponse success() {
        return new BaseResponse();
    }

    /**
     * 请求成功
     * @param data
     * @return BaseResponse
     */
    public static BaseResponse success(Object data) {
       return new BaseResponse(data);
    }

    /**
     * 请求成功
     * @param data
     * @param message
     * @return BaseResponse
     */
    public static BaseResponse success(Object data, String message) {
        return new BaseResponse(message, data);
    }

    /**
     * 请求失败
     * @return BaseResponse
     */
    public static BaseResponse error() {
        return new BaseResponse(400, "请求失败");
    }
    /**
     * 请求失败
     * @param message
     * @return BaseResponse
     */
    public static BaseResponse error(String message) {
        return new BaseResponse(400, message);
    }

    /**
     * 无效的权限验证
     * @return BaseResponse
     */
    public static BaseResponse unauthorized() {
        return new BaseResponse(401, "无效的权限验证");
    }
    /**
     * 接口不存在
     * @return BaseResponse
     */
    public static BaseResponse notFound() {
        return new BaseResponse(404, "接口不存在");
    }

    /**
     * 服务端错误
     * @return BaseResponse
     */
    public static BaseResponse serverError() {
        return new BaseResponse(500, "服务端错误");
    }
    /**
     * 服务端错误
     * @param message
     * @return BaseResponse
     */
    public static BaseResponse serverError(String message) {
        return new BaseResponse(500, message);
    }
}

package com.smalleast.base;

import lombok.Data;

/**
 * @Author : wangxiaodong
 * @Program : com.smalleast.base
 * @Description : TODO
 * @Date 11/16/20 2:52 下午
 **/

@Data
public class Response {

    private Integer code;

    private String message = "请求成功";

    private Object data;

    // 后面result生成器需要以下方法
    public void setCode(ResponseCode ResponseCode){
        this.code = ResponseCode.code;
    }

    /**
     * 请求成功
     * @return Response
     */
    public static Response success() {
        Response response = new Response();
        response.setCode(ResponseCode.SUCCESS);
        return response;
    }

    /**
     * 请求成功
     * @param data
     * @return Response
     */
    public static Response success(Object data) {
        Response response = new Response();
        response.setCode(ResponseCode.SUCCESS);
        response.setData(data);
        return response;
    }

    /**
     * 请求成功
     * @param data
     * @param message
     * @return Response
     */
    public static Response success(Object data, String message) {
        Response response = new Response();
        response.setCode(ResponseCode.SUCCESS);
        response.setMessage(message);
        response.setData(data);
        return response;
    }

    /**
     * 请求失败
     * @return Response
     */
    public static Response fail() {
        Response response = new Response();
        response.setCode(ResponseCode.FAIL);
        response.setMessage("请求失败");
        return response;
    }
    /**
     * 请求失败
     * @param message
     * @return Response
     */
    public static Response fail(String message) {
        Response response = new Response();
        response.setCode(ResponseCode.FAIL);
        response.setMessage(message);
        return response;
    }

    /**
     * 无效的权限验证
     * @return Response
     */
    public static Response unauthorized() {
        Response response = new Response();
        response.setCode(ResponseCode.UNAUTHORIZED);
        response.setMessage("无效的权限验证");
        return response;
    }
    /**
     * 接口不存在
     * @return Response
     */
    public static Response notFound() {
        Response response = new Response();
        response.setCode(ResponseCode.NOT_FOUND);
        response.setMessage("接口不存在");
        return response;
    }

    /**
     * 服务端错误
     * @return Response
     */
    public static Response serverError() {
        Response response = new Response();
        response.setCode(ResponseCode.INTERNAL_SERVER_ERROR);
        response.setMessage("服务端错误");
        return response;
    }
    /**
     * 服务端错误
     * @param message
     * @return Response
     */
    public static Response serverError(String message) {
        Response response = new Response();
        response.setCode(ResponseCode.INTERNAL_SERVER_ERROR);
        response.setMessage(message);
        return response;
    }
}

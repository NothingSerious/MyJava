package org.example.mygateway.common;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Setter
@Slf4j
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 6686419048438176898L;

    public static final Integer SUCCESS = 0;
    public static final String SUCCESS_MSG = "处理成功";

    public static final Integer ERROR = -1;
    public static final String ERROR_MSG = "处理失败";

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 请求ID
     */
    private String requestId;

    /**
     * 返回内容
     */
    private T data;

    private Response() {

    }

    private Response(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Response<T> code(Integer code) {
        this.code = code;
        return this;
    }

    public Response<T> msg(String msg) {
        this.msg = msg;
        return this;
    }

    public Response<T> requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public Response<T> data(T data) {
        this.data = data;
        return this;
    }

    public boolean hasError() {
        if (code != null && code != 0) {
            return true;
        }
        return false;
    }

    public static Response success() {
        return new Response().code(SUCCESS).msg(SUCCESS_MSG);
    }

    public static <T> Response success(T data) {
        return new Response().code(SUCCESS).msg(SUCCESS_MSG).data(data);
    }

    public static <T> Response success(String message, T data) {
        return new Response().code(SUCCESS).msg(message).data(data);
    }

    public static <T> Response success(Integer code, String message, T data) {
        return new Response().code(code).msg(message).data(data);
    }

    public static Response error() {
        return new Response().code(ERROR).msg(ERROR_MSG);
    }

    public static Response error(String msg) {
        return new Response().code(ERROR).msg(msg);
    }

    public static Response error(Integer code, String msg) {
        return new Response().code(code).msg(msg);
    }

    public static <T> Response error(Integer code, String msg, T data) {
        return new Response().code(code).msg(msg).data(data);
    }

    @Override
    public String toString() {
        if (null == this.data) {
            this.data((T) new Object());
        }
        return JSON.toJSONString(this);
    }

}

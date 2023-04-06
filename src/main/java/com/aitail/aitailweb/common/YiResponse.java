package com.aitail.aitailweb.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * @author liushengbin1
 * @date 2022/8/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YiResponse<T> {
    private String msg;
    private Integer code;
    private T data;

    public static YiResponse success() {
        return new YiResponse("success", 200, "ok");
    }

    public static<T> YiResponse success(T data) {

        return new YiResponse("success", 200, data);
    }

    public static YiResponse fail() {
        return new YiResponse("fail", 500, "fail");
    }

    public static<T> YiResponse fail(T data) {
        return new YiResponse("fail", 500, data);
    }
    public static<T> YiResponse fail(int code,String msg,T data) {
        return new YiResponse(msg, code, data);
    }
    public static<T> YiResponse fail(int code,String msg) {
        return new YiResponse(msg, code, null);
    }
}

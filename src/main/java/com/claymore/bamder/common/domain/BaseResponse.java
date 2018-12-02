package com.claymore.bamder.common.domain;

import lombok.*;

import java.io.Serializable;

/**
 * @author li.zhuo
 * @create 2018/10/26 下午11:34
 * @since 1.0.0
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {
    private String message;
    private boolean success;
    private T data;

    public BaseResponse(T t) {
        this.data = t;
        this.success = true;
    }

    public BaseResponse() {
        this.success = true;
    }

    public static BaseResponse instance() {
        return new BaseResponse();
    }

}

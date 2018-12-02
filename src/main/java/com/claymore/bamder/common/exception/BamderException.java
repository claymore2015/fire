package com.claymore.bamder.common.exception;

import lombok.*;

/**
 * @author li.zhuo
 * @create 2018/10/26 下午11:45
 * @since 1.0.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BamderException extends RuntimeException {


    private transient Object[] args;
    private String code;

    public BamderException(String code, Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public BamderException(String code, Object[] args, Throwable throwable) {
        super(throwable);
        this.code = code;
        this.args = args;
    }

}

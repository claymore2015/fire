package com.claymore.fire.common.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author li.zhuo
 * @create 2018/10/29 下午11:28
 * @since 1.0.0
 */
@Getter
@Setter
@ToString
public class PageRequest implements Serializable {
    private Integer pageNo;
    private Integer pageSize;
}


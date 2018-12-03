package com.claymore.fire.common.domain;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/10/26 下午11:42
 * @since 1.0.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PageResult<T> implements Serializable {
    private Integer pageNo;
    private Integer pageSize;
    private Long totalRecords;
    private List<T> content;
}

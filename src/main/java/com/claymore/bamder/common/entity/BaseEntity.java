package com.claymore.bamder.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author li.zhuo
 * @create 2018/10/25 下午5:15
 * @since 1.0.0
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    private Long id;
    private String updatedBy;
    private String createdBy;
    private Date updateTime;
    private Date createTime;
}

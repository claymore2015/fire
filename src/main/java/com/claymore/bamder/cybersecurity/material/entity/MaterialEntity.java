package com.claymore.bamder.cybersecurity.material.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author li.zhuo
 * @create 2018/11/19 11:35 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "material")
@Data
public class MaterialEntity {
    @Id
    private Long id;
    private String path;
}

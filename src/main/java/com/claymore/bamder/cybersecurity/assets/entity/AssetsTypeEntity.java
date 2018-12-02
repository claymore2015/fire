package com.claymore.bamder.cybersecurity.assets.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/18 10:59 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "assets_type")
@Data
public class AssetsTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String desc;
    private String module;
}

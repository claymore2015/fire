package com.claymore.bamder.cybersecurity.assets.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/18 11:02 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "assets")
@Data
public class AssetsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long assetsType;
    private String name;
    private String level;
    private String icon;
    private Integer highlight;
    private Integer display;
    private Integer enable;
    private String catagory;
}

package com.claymore.bamder.cybersecurity.ipaddressglobal.domain;

import lombok.Data;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Data
public class IpAddressGlobalDomain {
    private Long auId;
    private String startIp;
    private String endIp;
    private String province;
    private String city;
    private String unit;
    private Integer provinceId;
}

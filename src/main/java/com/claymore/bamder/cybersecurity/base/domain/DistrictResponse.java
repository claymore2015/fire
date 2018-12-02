package com.claymore.bamder.cybersecurity.base.domain;

import lombok.Data;

/**
 * @author li.zhuo
 * @create 2018/12/1 4:21 PM
 * @since 1.0.0
 */
@Data
public class DistrictResponse {
    private Long districtId;
    private String districtName;
    private Long zipCode;
    private Long cityId;
    private Byte rn;
}

package com.claymore.bamder.cybersecurity.base.domain;

import lombok.Data;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/12/1 4:21 PM
 * @since 1.0.0
 */
@Data
public class CityResponse {
    private Long cityId;
    private String cityName;
    private Long zipCode;
    private Long provinceId;
    private Byte rn;
    private List<DistrictResponse> districts;
}

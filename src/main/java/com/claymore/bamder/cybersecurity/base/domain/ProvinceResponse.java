package com.claymore.bamder.cybersecurity.base.domain;

import lombok.Data;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/12/1 4:20 PM
 * @since 1.0.0
 */
@Data
public class ProvinceResponse {
    private Long provinceId;
    private String provinceName;
    private Long zipCode;
    private Long zipKiloMega;
    private Long zipCity;
    private Long zipDst;
    private List<CityResponse> cities;
}

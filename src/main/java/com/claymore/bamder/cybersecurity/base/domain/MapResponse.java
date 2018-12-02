package com.claymore.bamder.cybersecurity.base.domain;

import lombok.Data;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/12/1 4:13 PM
 * @since 1.0.0
 */
@Data
public class MapResponse {
    List<ProvinceResponse> provinceResponses;
}

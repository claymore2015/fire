package com.claymore.bamder.cybersecurity.assets.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author li.zhuo
 * @create 2018/11/3 9:14 AM
 * @since 1.0.0
 * cumulate_count  NUMERIC(10,2),  --  累积数据量（GB）
week_avg_count	NUMERIC(10,2), -- 周平均数据量（GB）
week_count 	NUMERIC(10,2), -- 最近一周的数据量（GB）
 */
@ApiModel("采集/监控数据")
@Getter
@Setter
@ToString
public class AssetDataResponse {
    @ApiModelProperty(value = "类型Id")
    private Integer assetDataTypeId;
    @ApiModelProperty(value = "类型名")
    private String assetDataTypeName;
    @ApiModelProperty(value = "累计数据量")
    private Double cumulateCount;
    @ApiModelProperty(value = "平均周数据")
    private Double weekAvgCount;
    @ApiModelProperty(value = "最近一周数据")
    private Double weekCount;
}

package com.claymore.bamder.cybersecurity.wgxm.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author li.zhuo
 * @create 2018/11/29 10:51 PM
 * @since 1.0.0
 */
@ApiModel
@Data
public class UnitNumber {
    @ApiModelProperty("单位")
    private String unit;
    @ApiModelProperty("数量")
    private Long number;

    public UnitNumber(String unit, Long number) {
        this.unit = unit;
        this.number = number;
    }
}

package com.claymore.bamder.common.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author li.zhuo
 * @create 2018/11/11 9:47 PM
 * @since 1.0.0
 */
@Data
@ApiModel
public class CyberRequest {
    @NotNull
    @ApiModelProperty("省Id")
    private String provinceId;
    @ApiModelProperty("市Id")
    private String cityId;
    @ApiModelProperty("区域Id")
    private String districtId;
}

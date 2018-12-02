package com.claymore.bamder.cybersecurity.assets.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author li.zhuo
 * @create 2018/11/3 8:54 AM
 * @since 1.0.0
 */
@ApiModel("资产概况")
@Getter
@Setter
@ToString
public class AssetsSurvayResponse {
    @ApiModelProperty(value = "资产ID")
    private Integer assetsTypeId;
    @ApiModelProperty(value = "资产名称")
    private String assetsTypeName;
    @ApiModelProperty(value = "总量")
    private Integer amount;
    @ApiModelProperty(value = "启用数量")
    private Integer runningAmount;
    @ApiModelProperty(value = "禁用数量")
    private Integer stopAmount;
}

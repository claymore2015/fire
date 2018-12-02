package com.claymore.bamder.cybersecurity.gjts.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author li.zhuo
 * @create 2018/11/3 8:23 AM
 * @since 1.0.0
 */
@ApiModel("未知攻击比例分布")
@Setter
@Getter
@ToString
public class UnknownDistributionResponse {
    @ApiModelProperty("未知名称")
    private String unknownName;
    @ApiModelProperty("攻击次数")
    private Long amonut;
    @ApiModelProperty("占比")
    private String percent;
}

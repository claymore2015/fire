package com.claymore.bamder.cybersecurity.gjts.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author li.zhuo
 * @create 2018/11/2 11:24 PM
 * @since 1.0.0
 */
@Getter
@Setter
@ApiModel("攻击目标IP")
public class TargetIpResponse {
    @ApiModelProperty
    private String ip;
    @ApiModelProperty
    private Long amount;
}

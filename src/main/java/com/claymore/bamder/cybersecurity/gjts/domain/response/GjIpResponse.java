package com.claymore.bamder.cybersecurity.gjts.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author li.zhuo
 * @create 2018/11/2 11:17 PM
 * @since 1.0.0
 */
@ApiModel("境外攻击IP")
@Setter
@Getter
@ToString
public class GjIpResponse {
    @ApiModelProperty("IP")
    private String ip;
    @ApiModelProperty("数量")
    private Long amount;
}

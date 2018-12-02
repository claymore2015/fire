package com.claymore.bamder.cybersecurity.gjts.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author li.zhuo
 * @create 2018/11/2 11:14 PM
 * @since 1.0.0
 */
@Getter
@Setter
@ApiModel("境外攻击源")
public class GjSoureResponse {
    @ApiModelProperty("区域")
    private String source;
    @ApiModelProperty("数量")
    private Long amount;
}

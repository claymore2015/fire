package com.claymore.bamder.cybersecurity.gjts.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author li.zhuo
 * @create 2018/11/3 8:16 AM
 * @since 1.0.0
 */
@ApiModel("攻击行为Top10")
@Getter
@Setter
@ToString
public class GjActionResponse {
    @ApiModelProperty(value = "木马名称")
    private String trojanName;
    @ApiModelProperty(value = "危害")
    private String damage;
    @ApiModelProperty(value = "攻击次数")
    private Long amount;
}

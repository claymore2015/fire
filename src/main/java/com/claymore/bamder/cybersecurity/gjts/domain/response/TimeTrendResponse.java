package com.claymore.bamder.cybersecurity.gjts.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author li.zhuo
 * @create 2018/11/3 8:27 AM
 * @since 1.0.0
 */
@ApiModel("基于时间的告警趋势")
@Getter
@Setter
@ToString
public class TimeTrendResponse {
    @ApiModelProperty(value = "一般级")
    private Long level1;
    @ApiModelProperty(value = "关注级")
    private Long level2;
    @ApiModelProperty(value = "严重级")
    private Long level3;
    @ApiModelProperty(value = "紧急级")
    private Long level4;
    @ApiModelProperty(value = "时间")
    private Date time;
}

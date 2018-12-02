package com.claymore.bamder.cybersecurity.gj.domain.event.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author li.zhuo
 * @create 2018/12/1 4:59 PM
 * @since 1.0.0
 */
@Data
@ApiModel("事件转换数据")
public class PointTransfer {
    @ApiModelProperty("起始点")
    private int sourcePoint;
    @ApiModelProperty("目标点")
    private int TargetPoint;
    @ApiModelProperty("值")
    private long  pointValue;
}

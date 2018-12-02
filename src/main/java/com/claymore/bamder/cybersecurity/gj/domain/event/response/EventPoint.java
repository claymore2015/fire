package com.claymore.bamder.cybersecurity.gj.domain.event.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author li.zhuo
 * @create 2018/12/1 4:56 PM
 * @since 1.0.0
 */
@ApiModel("事件点")
@Data
public class EventPoint {
    @ApiModelProperty("点ID")
    private Integer pointId;
    @ApiModelProperty("点名称")
    private String pointName;
}

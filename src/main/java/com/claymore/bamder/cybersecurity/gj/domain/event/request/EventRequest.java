package com.claymore.bamder.cybersecurity.gj.domain.event.request;

import com.claymore.bamder.common.domain.CyberRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @author li.zhuo
 * @create 2018/10/31 10:33 PM
 * @since 1.0.0
 */
@ApiModel
@Getter
@Setter
@ToString
public class EventRequest extends CyberRequest {
    @ApiModelProperty(value = "统计时间天数")
    @NotNull
    private Integer days;
}

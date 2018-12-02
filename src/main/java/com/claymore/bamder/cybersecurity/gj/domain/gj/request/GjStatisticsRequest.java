package com.claymore.bamder.cybersecurity.gj.domain.gj.request;

import com.claymore.bamder.common.domain.CyberRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author li.zhuo
 * @create 2018/10/29 下午11:18
 * @since 1.0.0
 */
@Data
@ApiModel
public class GjStatisticsRequest extends CyberRequest {
    @NotNull(message = "统计天数为必传字段")
    @ApiModelProperty(value = "统计天数")
    private Integer days;
}

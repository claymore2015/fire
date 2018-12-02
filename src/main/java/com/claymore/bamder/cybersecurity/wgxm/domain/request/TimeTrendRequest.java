package com.claymore.bamder.cybersecurity.wgxm.domain.request;

import com.claymore.bamder.common.domain.CyberRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author li.zhuo
 * @create 2018/11/2 10:27 PM
 * @since 1.0.0
 */
@Getter
@Setter
@NoArgsConstructor
@ApiModel
public class TimeTrendRequest extends CyberRequest {

    @ApiModelProperty("开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startTime;
    @ApiModelProperty("结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

}

package com.claymore.bamder.cybersecurity.gj.domain.gj.request;

import com.claymore.bamder.common.domain.CyberRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author li.zhuo
 * @create 2018/10/31 10:14 PM
 * @since 1.0.0
 */
@ApiModel
@Getter
@Setter
@ToString
@NoArgsConstructor
public class SjgjczRequest extends CyberRequest {
    @ApiModelProperty(value = "时间告警处置查询开始时间")
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @ApiModelProperty(value = "时间告警处置查询结束时间")
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
}

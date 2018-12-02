package com.claymore.bamder.cybersecurity.gj.domain.gj.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @author li.zhuo
 * @create 2018/10/29 下午10:37
 * @since 1.0.0
 * 告警总量，包含告警总数以及违规行为、攻击窃密、目标审计、通信阻断分别的数量以及占比
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "告警总量，包含告警总数以及违规行为、攻击窃密、目标审计、通信阻断分别的数量以及占比")
public class GjzlResponse {
    @ApiModelProperty(value = "告警总数")
    private Long totalNumber;
    @ApiModelProperty(value = "违规行为数量")
    private Long wgxwNumber;
    @ApiModelProperty(value = "违规行为百分比")
    private String wgxwPercent;
    @ApiModelProperty(value = "攻击窃密数量")
    private Long gjqmNumber;
    @ApiModelProperty(value = "攻击窃密百分比")
    private String gjqmPercent;
    @ApiModelProperty(value = "目标审计数量")
    private Long mbsjNumber;
    @ApiModelProperty(value = "目标审计百分比")
    private String mbsjPercent;
    @ApiModelProperty(value = "通讯阻断数量")
    private Long txzdNumber;
    @ApiModelProperty(value = "通讯阻断百分比")
    private String txzdPercent;
}

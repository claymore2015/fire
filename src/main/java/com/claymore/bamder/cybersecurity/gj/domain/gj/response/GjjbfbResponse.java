package com.claymore.bamder.cybersecurity.gj.domain.gj.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @author li.zhuo
 * @create 2018/10/29 下午10:37
 * @since 1.0.0
 * 告警级别分布，分别返回5个级别的违规行为、攻击窃密、目标审计、通信阻断数量
 * 告警处置概况也可使用该数据进行显示
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "告警级别分布", description = "告警级别分布，分别返回5个级别的违规行为、攻击窃密、目标审计、通信阻断数量,告警处置概况也可使用该数据进行显示")
public class GjjbfbResponse {
    @ApiModelProperty(value = "违规行为_无风险")
    private Long wgxw1;
    @ApiModelProperty(value = "违规行为_一般级")
    private Long wgxw2;
    @ApiModelProperty(value = "违规行为_关注级")
    private Long wgxw3;
    @ApiModelProperty(value = "违规行为_严重级")
    private Long wgxw4;
    @ApiModelProperty(value = "违规行为_紧急级")
    private Long wgxw5;
    @ApiModelProperty(value = "攻击窃密_无风险")
    private Long gjqm1;
    @ApiModelProperty(value = "攻击窃密_一般级")
    private Long gjqm2;
    @ApiModelProperty(value = "攻击窃密_关注级")
    private Long gjqm3;
    @ApiModelProperty(value = "攻击窃密_严重级")
    private Long gjqm4;
    @ApiModelProperty(value = "攻击窃密_紧急级")
    private Long gjqm5;
    @ApiModelProperty(value = "目标审计_无关级")
    private Long mbsj1;
    @ApiModelProperty(value = "目标审计_一般级")
    private Long mbsj2;
    @ApiModelProperty(value = "目标审计_关注级")
    private Long mbsj3;
    @ApiModelProperty(value = "目标审计_严重级")
    private Long mbsj4;
    @ApiModelProperty(value = "目标审计_紧急级")
    private Long mbsj5;
    @ApiModelProperty(value = "通信阻断_无风险")
    private Long txzd1;
    @ApiModelProperty(value = "通信阻断_一般级")
    private Long txzd2;
    @ApiModelProperty(value = "通信阻断_关注级")
    private Long txzd3;
    @ApiModelProperty(value = "通信阻断_严重级")
    private Long txzd4;
    @ApiModelProperty(value = "通信阻断_紧急级")
    private Long txzd5;
}

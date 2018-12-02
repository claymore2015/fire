package com.claymore.bamder.cybersecurity.gj.domain.gj.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @author li.zhuo
 * @create 2018/10/29 下午10:48
 * @since 1.0.0
 * 告警处置率返回数据，包含了非攻击窃密行为、非涉密内容、攻击窃密行为、涉密内容的数量以及总的告警处置率
 * 同时返回了违规行为、攻击窃密、目标审计、通信阻断各种类别的告警总数和处置总数
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "告警处置率")
public class GjczlResponse {
    @ApiModelProperty(value = "非攻击窃密行为数量")
    private Long fgjqmNumber;
    @ApiModelProperty(value = "非涉密内容数量")
    private Long fsmnrNumber;
    @ApiModelProperty(value = "正常总数量")
    private Long normalTotal;
    //@ApiModelProperty(value = "攻击窃密行为数量")
    //private Long gjqmNumber;
    //@ApiModelProperty(value = "涉密内容的数量")
    //private Long smnrNumber;

    @ApiModelProperty(value = "攻击窃密行为数量_秘密")
    private Long gjqmNumberMimi;
    @ApiModelProperty(value = "攻击窃密行为数量_机密")
    private Long gjqmNumberJimi;
    @ApiModelProperty(value = "攻击窃密行为数量_绝密")
    private Long gjqmNumberJuemi;


    @ApiModelProperty(value = "涉密内容的数量_秘密")
    private Long smnrNumberMimi;
    @ApiModelProperty(value = "涉密内容的数量_机密")
    private Long smnrNumberJimi;
    @ApiModelProperty(value = "涉密内容的数量_绝密")
    private Long smnrNumberJuemi;

    @ApiModelProperty(value = "异常总数量")
    private Long exceptionNumber;

    @ApiModelProperty(value = "告警处置率")
    private String gjczlPercent;

    /*@ApiModelProperty(value = "违规行为总数量")
    private Long wgxwTotal;
    @ApiModelProperty(value = "违规行为处置总数量")
    private Long wgxwCz;
    @ApiModelProperty(value = "攻击窃密总数量")
    private Long gjqmTotal;
    @ApiModelProperty(value = "攻击窃密处置总数量")
    private Long gjqmCz;
    @ApiModelProperty(value = "目标审计总数量")
    private Long mbsjTotal;
    @ApiModelProperty(value = "目标审计处置数量")
    private Long mbsjCz;
    @ApiModelProperty(value = "通信阻断总数量")
    private Long txzdTotal;
    @ApiModelProperty(value = "通信阻断处置")
    private Long txzdCz;*/


}

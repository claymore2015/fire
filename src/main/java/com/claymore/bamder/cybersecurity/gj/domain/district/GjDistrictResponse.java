package com.claymore.bamder.cybersecurity.gj.domain.district;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author li.zhuo
 * @create 2018/12/1 2:38 PM
 * @since 1.0.0
 */
@Data
@ApiModel("区域告警处置情况")
public class GjDistrictResponse {
    @ApiModelProperty("区域Id")
    private String districtId;
    @ApiModelProperty("违规行为总数")
    private long wgxwNumber;
    @ApiModelProperty("违规行为处置")
    private long wgxwChuzhi;
    @ApiModelProperty("目标审计总数")
    private long mbsjNumber;
    @ApiModelProperty("目标审计处置")
    private long mbsjChuzhi;
    @ApiModelProperty("攻击窃密总数")
    private long gjqmNumber;
    @ApiModelProperty("攻击窃密处置")
    private long gjqmChuzhi;
    @ApiModelProperty("通讯中断总数")
    private long txzdNumber;
    @ApiModelProperty("通讯中断处置")
    private long txzdChuzhi;
    @ApiModelProperty("无风险总数")
    private long level1;
    @ApiModelProperty("无风险处置数")
    private long level1Chuzhi;
    @ApiModelProperty("一般级总数")
    private long level2;
    @ApiModelProperty("一般级处置数量")
    private long level2Chuzhi;
    @ApiModelProperty("关注级总数")
    private long level3;
    @ApiModelProperty("关注级处置数量")
    private long level3Chuzhi;
    @ApiModelProperty("严重级总数")
    private long level4;
    @ApiModelProperty("严重级处置数量")
    private long level4Chuzhi;
    @ApiModelProperty("紧急级总数")
    private long level5;
    @ApiModelProperty("紧急级处置数量")
    private long level5Chuzhi;

}

package com.claymore.bamder.cybersecurity.gj.domain.event.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author li.zhuo
 * @create 2018/10/31 10:54 PM
 * @since 1.0.0
 */
@Data
@ApiModel
public class EventTransfer {
    @ApiModelProperty(value = "告警到事件总量")
    private Long gjToEventTotal;
    @ApiModelProperty(value = "异常到事件总量")
    private Long ycToEventTotal;
    @ApiModelProperty(value = "告警到正常总量")
    private Long gjToZcTotal;
    @ApiModelProperty(value = "告警到异常总量")
    private Long gjToYcTotal;
    @ApiModelProperty(value = "正常到异常总量")
    private Long zcToYcTotal;

    @ApiModelProperty(value = "违规行为_告警到事件")
    private Long gjToEventWgxw;
    @ApiModelProperty(value = "违规行为_异常到事件")
    private Long ycToEventWgxw;
    @ApiModelProperty(value = "违规行为_告警到正常")
    private Long gjToZcWgxw;
    @ApiModelProperty(value = "违规行为_告警到异常")
    private Long gjToYcWgxw;
    @ApiModelProperty(value = "违规行为_正常到异常")
    private Long zcToYcWgxw;

    @ApiModelProperty(value = "攻击窃密_告警到事件")
    private Long gjToEventGjqm;
    @ApiModelProperty(value = "攻击窃密_异常到事件")
    private Long ycToEventGjqm;
    @ApiModelProperty(value = "攻击窃密_告警到正常")
    private Long gjToZcGjqm;
    @ApiModelProperty(value = "攻击窃密_告警到异常")
    private Long gjToYcGjqm;
    @ApiModelProperty(value = "攻击窃密_告警到异常")
    private Long zcToYcGjqm;

    @ApiModelProperty(value = "目标审计_告警到事件")
    private Long gjToEventMbsj;
    @ApiModelProperty(value = "目标审计_告警到正常")
    private Long gjToZcMbsj;
    @ApiModelProperty(value = "目标审计_告警到异常")
    private Long gjToYcMbsj;
    @ApiModelProperty(value = "目标审计_正常到异常")
    private Long zcToYcMbsj;

    @ApiModelProperty(value = "通讯阻断_告警到事件")
    private Long gjToEventTxzd;
    @ApiModelProperty(value = "通讯阻断_异常到事件")
    private Long ycToEventTxzd;
    @ApiModelProperty(value = "通讯阻断_告警到正常")
    private Long gjToZcTxzd;
    @ApiModelProperty(value = "通讯阻断_告警到异常")
    private Long gjToYcTxzd;
    @ApiModelProperty(value = "通讯阻断_正常到异常")
    private Long zcToTcTxzd;
}

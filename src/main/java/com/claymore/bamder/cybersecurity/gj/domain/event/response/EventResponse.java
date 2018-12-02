package com.claymore.bamder.cybersecurity.gj.domain.event.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/10/31 10:37 PM
 * @since 1.0.0
 */
@Setter
@Getter
@ToString
@ApiModel
public class EventResponse {
    @ApiModelProperty(value = "事件总数")
    private Long totalEvents;

    @ApiModelProperty(value = "违规泄密事件")
    private Long eventType1;

    @ApiModelProperty(value = "攻击泄密事件")
    private Long eventType2;

    @ApiModelProperty(value = "绝密级")
    private Long eventLevel1;

    @ApiModelProperty(value = "机密级")
    private Long eventLevel2;

    @ApiModelProperty(value = "秘密级")
    private Long eventLevel3;

    //@ApiModelProperty(value = "转换关系")
    //private EventTransfer eventTransfer;

    private List<EventPoint> points;

    @ApiModelProperty(value = "总事件转换关系")
    private List<PointTransfer> totalTransfer;
    @ApiModelProperty(value = "违规行为转换关系")
    private List<PointTransfer> wgxwTransfer;
    @ApiModelProperty("攻击窃密转换关系")
    private List<PointTransfer> gjqmTransfer;
    @ApiModelProperty("目标审计转换关系")
    private List<PointTransfer> mbsjTransfer;
    @ApiModelProperty("通讯中断转换关系")
    private List<PointTransfer> txzdTransfer;


    @ApiModelProperty(value = "事件时间轴")
    private List<Event> events;

}

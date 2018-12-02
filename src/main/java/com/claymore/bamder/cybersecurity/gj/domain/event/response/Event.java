package com.claymore.bamder.cybersecurity.gj.domain.event.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author li.zhuo
 * @create 2018/10/31 10:44 PM
 * @since 1.0.0
 */
@ApiModel
@Getter
@Setter
@ToString
public class Event {
    @ApiModelProperty(value = "事件时间")
    private Date eventTime;
    @ApiModelProperty(value = "事件名称")
    private String eventName;
    @ApiModelProperty(value = "事件内容")
    private String content;
    @ApiModelProperty(value = "处置状态，0未处置 1正在处置 2已完成")
    private String chuzhiStatus;
    @ApiModelProperty(value = "事件处置等级，1秘密 2机密 3绝密")
    private String eventLevel;
    @ApiModelProperty(value = "事件类型，1违规泄密，2攻击泄密")
    private String eventType;
}

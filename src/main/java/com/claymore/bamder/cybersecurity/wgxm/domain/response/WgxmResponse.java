package com.claymore.bamder.cybersecurity.wgxm.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/10/31 11:38 PM
 * @since 1.0.0
 * trans bigint,		#传输涉密
file bigint,		#标密文件
efile bigint,   #电子标密文件
keyword bigint, #关键字
encrypt bigint, #加密文件
zip bigint,			#多层压缩
pic bigint,			#图片
bfile bigint,		#版式文件
store bigint,		#违规存储
outline bigint,	#违规外联
 */
@Getter
@Setter
@ToString
@ApiModel
public class WgxmResponse {
    @ApiModelProperty(value = "违规行为总数")
    private Long total;
    @ApiModelProperty("无风险")
    private Long level1;
    @ApiModelProperty(value = "一般级")
    private Long level2;
    @ApiModelProperty(value = "关注级")
    private Long level3;
    @ApiModelProperty(value = "严重级")
    private Long level4;
    @ApiModelProperty(value = "紧急级")
    private Long level5;

    @ApiModelProperty(value = "无风险百分比")
    private String level1Percent;
    @ApiModelProperty(value = "一般级百分比")
    private String level2Percent;
    @ApiModelProperty(value = "关注级百分比")
    private String level3Percent;
    @ApiModelProperty(value = "严重级百分比")
    private String level4Percent;
    @ApiModelProperty(value = "紧急级百分比")
    private String level5Percent;

    @ApiModelProperty(value = "传输涉密")
    private Long trans;
    @ApiModelProperty(value = "标密文件")
    private Long file;
    @ApiModelProperty(value = "电子标密")
    private Long efile;
    @ApiModelProperty(value = "关键字")
    private Long keyword;
    @ApiModelProperty(value = "加密文件")
    private Long encrypt;
    @ApiModelProperty(value = "多层压缩")
    private Long zip;
    @ApiModelProperty(value = "图片告警")
    private Long pic;
    @ApiModelProperty(value = "版式文件")
    private Long bfile;
    @ApiModelProperty(value = "违规存储")
    private Long store;
    @ApiModelProperty(value = "违规外联")
    private Long outline;

    @ApiModelProperty
    private String transPercent;
    @ApiModelProperty
    private String filePercent;
    @ApiModelProperty
    private String efilePercent;
    @ApiModelProperty
    private String keywordPercent;
    @ApiModelProperty
    private String encryptPercent;
    @ApiModelProperty
    private String zipPercent;
    @ApiModelProperty
    private String picPercent;
    @ApiModelProperty
    private String bfilePercent;
    @ApiModelProperty
    private String storePercent;
    @ApiModelProperty
    private String outlinePercent;


    private List<SourObjNumber> sourObjNumberList;

    private List<UnitNumber> unitNumberList;


}

package com.claymore.bamder.cybersecurity.assets.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author li.zhuo
 * @create 2018/11/3 9:17 AM
 * @since 1.0.0
 */
@ApiModel("文件分类统计")
@Getter
@Setter
@ToString
public class AssetsFileResponse {
    @ApiModelProperty("文件类型ID")
    private Integer fileTypeId;
    @ApiModelProperty("文件类型名称")
    private String fileTypeName;
    @ApiModelProperty("数量")
    private Long count;
    @ApiModelProperty("百分比")
    private String percent;
}

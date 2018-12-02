package com.claymore.bamder.cybersecurity.wgxm.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author li.zhuo
 * @create 2018/11/29 10:49 PM
 * @since 1.0.0
 */
@ApiModel
@Data
public class SourObjNumber {
    @ApiModelProperty(value = "违规途径")
    private String sourceObjSubject;
    @ApiModelProperty(value = "数量")
    private Long number;

    public SourObjNumber(String sourceObjSubject, Long number) {
        this.sourceObjSubject = sourceObjSubject;
        this.number = number;
    }
}

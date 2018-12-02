package com.claymore.bamder.cybersecurity.gjts.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author li.zhuo
 * @create 2018/11/3 8:18 AM
 * @since 1.0.0
 */
@ApiModel("恶意程序Top10")
@Getter
@Setter
@ToString
public class EyiProsResponse {
    @ApiModelProperty(value = "恶意程序名称")
    private String eyiProName;
    @ApiModelProperty(value = "危害")
    private String damage;
    @ApiModelProperty(value = "感染次数")
    private Long amount;
    @ApiModelProperty(value = "仿真分支")
    private String isSim;
}

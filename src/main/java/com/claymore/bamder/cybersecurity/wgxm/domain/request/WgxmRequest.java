package com.claymore.bamder.cybersecurity.wgxm.domain.request;

import com.claymore.bamder.common.domain.CyberRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @author li.zhuo
 * @create 2018/10/31 11:34 PM
 * @since 1.0.0
 */
@ApiModel
@Data
public class WgxmRequest extends CyberRequest {
    @ApiParam("查询天数")
    private int days;

}

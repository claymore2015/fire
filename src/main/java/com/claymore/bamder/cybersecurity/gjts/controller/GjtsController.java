package com.claymore.bamder.cybersecurity.gjts.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.cybersecurity.gjts.domain.request.GjtsRequest;
import com.claymore.bamder.cybersecurity.gjts.domain.response.GjtsResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author li.zhuo
 * @create 2018/11/3 8:30 AM
 * @since 1.0.0
 */
@RestController
@RequestMapping("gjts")
public class GjtsController {

    @PostMapping("/dashboard")
    @ApiOperation(value = "攻击态势dashboard页面所有数据", produces = "POST", response = GjtsResponse.class)
    public BaseResponse<GjtsResponse> dashboard(@RequestBody @Valid GjtsRequest request) {
        return new BaseResponse<>(new GjtsResponse());
    }
}

package com.claymore.bamder.cybersecurity.gj.domain.gj.response;

import io.swagger.annotations.ApiModel;
import lombok.*;

/**
 * @author li.zhuo
 * @create 2018/10/29 下午10:28
 * @since 1.0.0
 * 告警统计，包括了告警总量、告警级别分布、告警处置概况，告警处置率
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "告警统计，包括了告警总量、告警级别分布、告警处置概况，告警处置率")
public class GjStatisticsResponse {
    private GjzlResponse gjzlResponse;
    private GjjbfbResponse gjjbfbResponse;
    private GjczlResponse gjczlResponse;
}
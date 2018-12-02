package com.claymore.bamder.cybersecurity.gj.domain.gj.response;

import io.swagger.annotations.ApiModel;
import lombok.*;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/10/29 下午11:00
 * @since 1.0.0
 * 时间告警处置，基于时间统计每日的告警处置情况
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel
public class SjgjczListResponse {
    private List<SjgjzcResponse> sjgjzcResponses;
}

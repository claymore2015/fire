package com.claymore.bamder.cybersecurity.wgxm.domain.response;

import lombok.Data;

import java.util.Date;

/**
 * @author li.zhuo
 * @create 2018/11/2 10:30 PM
 * @since 1.0.0
 */
@Data
public class WgxmTimeTrendResponse {
    private Date sj;
    private Long level1;
    private Long level2;
    private Long level3;
    private Long level4;
    private Long level5;
}

package com.claymore.fire.common.util;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @author li.zhuo
 * @create 2018/11/25 10:41 PM
 * @since 1.0.0
 */
public class PercentUtil {

    public static NumberFormat numberFormat = NumberFormat.getPercentInstance();
    static {
        numberFormat.setMaximumFractionDigits(2);
    }

    public static String format(double d) {
        return numberFormat.format(d);
    }

    public static String longDivideFormat(Long x, Long y) {
        if (y == 0) {
            return "0%";
        }
        return format(new BigDecimal(x).divide(new BigDecimal(y), 2, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

}

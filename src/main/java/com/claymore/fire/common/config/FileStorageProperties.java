package com.claymore.fire.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author li.zhuo
 * @create 2018/11/19 11:52 PM
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "file")
@Data
public class FileStorageProperties {
    private String uploadDir;
}

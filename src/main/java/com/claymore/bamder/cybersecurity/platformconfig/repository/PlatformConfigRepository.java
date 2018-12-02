package com.claymore.bamder.cybersecurity.platformconfig.repository;

import com.claymore.bamder.cybersecurity.platformconfig.entity.PlatformConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author li.zhuo
 * @create 2018/11/18 11:19 PM
 * @since 1.0.0
 */
public interface PlatformConfigRepository extends JpaRepository<PlatformConfigEntity, Long> {
}

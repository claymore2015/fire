package com.claymore.bamder.cybersecurity.assets.repository;

import com.claymore.bamder.cybersecurity.assets.entity.AssetsTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author li.zhuo
 * @create 2018/11/18 11:24 PM
 * @since 1.0.0
 */
public interface AssetsTypeRepository extends JpaRepository<AssetsTypeEntity, Long> {
}

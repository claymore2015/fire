package com.claymore.bamder.cybersecurity.city.repository;

import com.claymore.bamder.cybersecurity.city.entity.MCityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/11/19 10:14 PM
 * @since 1.0.0
 */
public interface CityRepository extends JpaRepository<MCityEntity, Integer> {

    List<MCityEntity> findByProvinceId(Long provinceId);
}

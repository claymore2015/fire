package com.claymore.bamder.cybersecurity.district.repository;

import com.claymore.bamder.cybersecurity.district.entity.MDistrictEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/11/19 9:38 PM
 * @since 1.0.0
 */
public interface DistrictRepository extends JpaRepository<MDistrictEntity, Integer> {

    List<MDistrictEntity> findByCityId(Long cityId);
}

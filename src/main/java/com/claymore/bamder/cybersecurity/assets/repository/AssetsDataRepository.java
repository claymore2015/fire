package com.claymore.bamder.cybersecurity.assets.repository;

import com.claymore.bamder.cybersecurity.assets.entity.AssetsDataEntity;
import com.claymore.bamder.cybersecurity.assets.entity.AssetsDataEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssetsDataRepository extends JpaRepository<AssetsDataEntity, AssetsDataEntityPK> {
    @Query(value = "select e from AssetsDataEntity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) ")
    List<AssetsDataEntity> findByProvinceAndCityAndDistrict(@Param("province") String province, @Param("city") String city, @Param("district") String district);
}

package com.claymore.bamder.cybersecurity.assets.repository;

import com.claymore.bamder.cybersecurity.assets.entity.AssetsUnitEntity;
import com.claymore.bamder.cybersecurity.assets.entity.AssetsUnitEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssetsUnitRepository extends JpaRepository<AssetsUnitEntity, AssetsUnitEntityPK> {

    @Query(value = "select e from AssetsUnitEntity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) ")
    List<AssetsUnitEntity> findByProvinceAndCityAndDistrict(@Param("province") String province, @Param("city") String city, @Param("district") String district);
}

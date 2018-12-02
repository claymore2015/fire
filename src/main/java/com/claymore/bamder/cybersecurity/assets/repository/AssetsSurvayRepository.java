package com.claymore.bamder.cybersecurity.assets.repository;

import com.claymore.bamder.cybersecurity.assets.entity.AssetsSurvayEntity;
import com.claymore.bamder.cybersecurity.assets.entity.AssetsSurvayEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssetsSurvayRepository extends JpaRepository<AssetsSurvayEntity, AssetsSurvayEntityPK> {

    @Query(value = "select e from AssetsSurvayEntity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) ")
    List<AssetsSurvayEntity> findByProvinceAndCityAndDistrict(@Param("province") String province, @Param("city") String city, @Param("district") String district);

}

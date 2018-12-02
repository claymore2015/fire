package com.claymore.bamder.cybersecurity.gj.respository;

import com.claymore.bamder.cybersecurity.gj.entity.ChuzhiMbsjEntity;
import com.claymore.bamder.cybersecurity.gj.entity.ChuzhiMbsjEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ChuzhiMbsjRepository extends JpaRepository<ChuzhiMbsjEntity, ChuzhiMbsjEntityPK> {
    @Query(value = "select e from ChuzhiMbsjEntity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) and e.day >=:day ")
    List<ChuzhiMbsjEntity> findByProvinceAndCityAndDistrictAndDay(@Param("province") String province, @Param("city") String city, @Param("district") String district, @Param("day") Date day);

    @Query(value = "select e from ChuzhiMbsjEntity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) and e.day >=:startDay and e.day <=:endDay ")
    List<ChuzhiMbsjEntity> findByProvinceAndCityAndDistrictBetweenDay(@Param("province") String province, @Param("city") String city, @Param("district") String district, @Param("startDay") Date startDay, @Param("endDay") Date endDay);
}

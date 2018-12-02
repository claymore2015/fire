package com.claymore.bamder.cybersecurity.wgxm.repository;

import com.claymore.bamder.cybersecurity.wgxm.entity.AlarmWgxwEntity;
import com.claymore.bamder.cybersecurity.wgxm.entity.AlarmWgxwEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface AlarmWgxwRepository extends JpaRepository<AlarmWgxwEntity, AlarmWgxwEntityPK> {

    @Query(value = "select e from AlarmWgxwEntity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) and e.day >=:day ")
    List<AlarmWgxwEntity> findByProvinceAndCityAndDistrictAndDay(@Param("province") String province, @Param("city") String city, @Param("district") String district, @Param("day") Date day);

    @Query(value = "select e from AlarmWgxwEntity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) and e.day >=:startDay and e.day <=:endDay ")
    List<AlarmWgxwEntity> findByProvinceAndCityAndDistrictBetweenDay(@Param("province") String province, @Param("city") String city, @Param("district") String district, @Param("startDay") Date startDay, @Param("endDay") Date endDay);
}

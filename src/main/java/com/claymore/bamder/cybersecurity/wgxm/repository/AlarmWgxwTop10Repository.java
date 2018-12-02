package com.claymore.bamder.cybersecurity.wgxm.repository;

import com.claymore.bamder.cybersecurity.wgxm.entity.AlarmWgxwTop10Entity;
import com.claymore.bamder.cybersecurity.wgxm.entity.AlarmWgxwTop10EntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface AlarmWgxwTop10Repository extends JpaRepository<AlarmWgxwTop10Entity, AlarmWgxwTop10EntityPK> {

    @Query(value = "select e from AlarmWgxwTop10Entity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) and e.day >=:day ")
    List<AlarmWgxwTop10Entity> findByProvinceAndCityAndDistrictAndDay(@Param("province") String province, @Param("city") String city, @Param("district") String district, @Param("day") Date day);
}

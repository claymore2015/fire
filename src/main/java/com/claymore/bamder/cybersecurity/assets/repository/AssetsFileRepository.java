package com.claymore.bamder.cybersecurity.assets.repository;

import com.claymore.bamder.cybersecurity.assets.entity.AssetsFileEntity;
import com.claymore.bamder.cybersecurity.assets.entity.AssetsFileEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/11/25 4:56 PM
 * @since 1.0.0
 */
public interface AssetsFileRepository extends JpaRepository<AssetsFileEntity, AssetsFileEntityPK> {

    @Query(value = "select e from AssetsFileEntity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) ")
    List<AssetsFileEntity> findByProvinceAndCityAndDistrict(@Param("province") String province, @Param("city") String city, @Param("district") String district);
}

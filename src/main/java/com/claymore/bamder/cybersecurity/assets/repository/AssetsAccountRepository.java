package com.claymore.bamder.cybersecurity.assets.repository;

import com.claymore.bamder.cybersecurity.assets.entity.AssetsAccountEntity;
import com.claymore.bamder.cybersecurity.assets.entity.AssetsAccountEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AssetsAccountRepository extends JpaRepository<AssetsAccountEntity, AssetsAccountEntityPK> {

    @Query(value = "select e from AssetsAccountEntity e where e.province=:province and (:city is null or e.city=:city) and (:district is null or e.district=:district) ")
    List<AssetsAccountEntity> findByProvinceAndCityAndDistrict(@Param("province") String province, @Param("city") String city, @Param("district") String district);

}

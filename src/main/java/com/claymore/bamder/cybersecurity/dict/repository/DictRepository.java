package com.claymore.bamder.cybersecurity.dict.repository;

import com.claymore.bamder.cybersecurity.dict.entity.DictEntity;
import com.claymore.bamder.cybersecurity.dict.entity.DictEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/11/24 2:51 PM
 * @since 1.0.0
 */
public interface DictRepository extends JpaRepository<DictEntity, DictEntityPK> {

    List<DictEntity> findByKey(String key);
}

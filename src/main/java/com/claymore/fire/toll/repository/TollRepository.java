package com.claymore.fire.toll.repository;

import com.claymore.fire.roadlineinfo.entity.RoadLineInfoEntity;
import com.claymore.fire.toll.entity.TollEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TollRepository extends JpaRepository<TollEntity, Integer>{
}

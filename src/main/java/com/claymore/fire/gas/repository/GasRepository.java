package com.claymore.fire.gas.repository;

import com.claymore.fire.gas.entity.GasEntity;
import com.claymore.fire.roadlineinfo.entity.RoadLineInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GasRepository extends JpaRepository<GasEntity, Integer>{
}

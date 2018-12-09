package com.claymore.fire.bridge.repository;

import com.claymore.fire.bridge.entity.BridgeEntity;
import com.claymore.fire.roadlineinfo.entity.RoadLineInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BridgeRepository extends JpaRepository<BridgeEntity, Integer>{
}

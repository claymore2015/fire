package com.claymore.fire.tunnel.repository;

import com.claymore.fire.roadlineinfo.entity.RoadLineInfoEntity;
import com.claymore.fire.toll.entity.TollEntity;
import com.claymore.fire.tunnel.entity.TunnelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TunnelRepository extends JpaRepository<TunnelEntity, Integer>{
}

package com.claymore.fire.servicezone.repository;

import com.claymore.fire.servicezone.entity.ServiceZoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceZoneRepository extends JpaRepository<ServiceZoneEntity, Integer> {
}

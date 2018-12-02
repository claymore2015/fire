package com.claymore.bamder.cybersecurity.material.repository;

import com.claymore.bamder.cybersecurity.material.entity.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {
}

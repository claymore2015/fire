package com.claymore.bamder.cybersecurity.assets.repository;

import com.claymore.bamder.cybersecurity.assets.entity.AssetsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetsRepository extends JpaRepository<AssetsEntity, Long> {
}

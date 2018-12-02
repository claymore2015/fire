package com.claymore.bamder.cybersecurity.trojan.repository;

import com.claymore.bamder.cybersecurity.trojan.entity.TrojanProsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author li.zhuo
 * @create 2018/11/15 8:50 PM
 * @since 1.0.0
 */
public interface TrojanRepository extends JpaRepository<TrojanProsEntity, Long> {
}

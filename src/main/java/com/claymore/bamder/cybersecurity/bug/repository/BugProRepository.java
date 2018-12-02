package com.claymore.bamder.cybersecurity.bug.repository;

import com.claymore.bamder.cybersecurity.bug.entity.BugProsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author li.zhuo
 * @create 2018/11/15 9:18 PM
 * @since 1.0.0
 */
public interface BugProRepository extends JpaRepository<BugProsEntity, Long> {
}

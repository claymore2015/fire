package com.claymore.bamder.cybersecurity.ipaddressglobal.repository;

import com.claymore.bamder.cybersecurity.ipaddressglobal.entity.IpAddressGlobalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author li.zhuo
 * @create 2018/11/15 11:09 PM
 * @since 1.0.0
 */
public interface IpAddressGlobalRepository extends JpaRepository<IpAddressGlobalEntity, Long> {
}

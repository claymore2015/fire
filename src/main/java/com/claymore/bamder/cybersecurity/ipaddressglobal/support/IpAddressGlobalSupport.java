package com.claymore.bamder.cybersecurity.ipaddressglobal.support;

import com.claymore.bamder.common.util.IpUtil;
import com.claymore.bamder.cybersecurity.ipaddressglobal.domain.IpAddressGlobalDomain;
import com.claymore.bamder.cybersecurity.ipaddressglobal.entity.IpAddressGlobalEntity;

/**
 * @author li.zhuo
 * @create 2018/11/15 11:14 PM
 * @since 1.0.0
 */
public class IpAddressGlobalSupport {

    public static IpAddressGlobalDomain transferToDomain(IpAddressGlobalEntity entity) {
        IpAddressGlobalDomain domain = new IpAddressGlobalDomain();
        domain.setAuId(entity.getAuId());
        domain.setCity(entity.getCity());
        domain.setEndIp(IpUtil.longToIP(entity.getEndIp()));
        domain.setStartIp(IpUtil.longToIP(entity.getStartIp()));
        domain.setProvince(entity.getProvince());
        domain.setProvinceId(entity.getProvinceId());
        return domain;
    }

    public static IpAddressGlobalEntity transferToEntity(IpAddressGlobalDomain domain) {
        IpAddressGlobalEntity entity = new IpAddressGlobalEntity();
        entity.setAuId(domain.getAuId());
        entity.setCity(domain.getCity());
        entity.setEndIp(IpUtil.ipToLong(domain.getEndIp()));
        entity.setStartIp(IpUtil.ipToLong(domain.getStartIp()));
        entity.setProvince(domain.getProvince());
        entity.setProvinceId(domain.getProvinceId());
        return entity;
    }

}

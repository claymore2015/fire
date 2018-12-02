package com.claymore.bamder.cybersecurity.ipaddressglobal.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "ip_address_global")
public class IpAddressGlobalEntity {
    private Long auId;
    private Long startIp;
    private Long endIp;
    private String province;
    private String city;
    private String unit;
    private Integer provinceId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "au_id")
    public Long getAuId() {
        return auId;
    }

    public void setAuId(Long auId) {
        this.auId = auId;
    }


    @Column(name = "start_ip")
    public Long getStartIp() {
        return startIp;
    }

    public void setStartIp(Long startIp) {
        this.startIp = startIp;
    }

    @Column(name = "end_ip")
    public Long getEndIp() {
        return endIp;
    }

    public void setEndIp(Long endIp) {
        this.endIp = endIp;
    }

    @Basic
    @Column(name = "Province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "Unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "ProvinceID")
    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IpAddressGlobalEntity that = (IpAddressGlobalEntity) o;

        if (auId != that.auId) return false;
        if (startIp != that.startIp) return false;
        if (endIp != that.endIp) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (provinceId != null ? !provinceId.equals(that.provinceId) : that.provinceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (auId ^ (auId >>> 32));
        result = 31 * result + (int) (startIp ^ (startIp >>> 32));
        result = 31 * result + (int) (endIp ^ (endIp >>> 32));
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        return result;
    }
}

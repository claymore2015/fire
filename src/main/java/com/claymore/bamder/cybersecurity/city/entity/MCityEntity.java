package com.claymore.bamder.cybersecurity.city.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "m_city")
public class MCityEntity {
    private int cityId;
    private String cityName;
    private Long zipCode;
    private Long provinceId;
    private Byte rn;

    @Id
    @Column(name = "CityID")
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "CityName")
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "ZipCode")
    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "ProvinceID")
    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "RN")
    public Byte getRn() {
        return rn;
    }

    public void setRn(Byte rn) {
        this.rn = rn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MCityEntity that = (MCityEntity) o;

        if (cityId != that.cityId) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (provinceId != null ? !provinceId.equals(that.provinceId) : that.provinceId != null) return false;
        if (rn != null ? !rn.equals(that.rn) : that.rn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        result = 31 * result + (rn != null ? rn.hashCode() : 0);
        return result;
    }
}

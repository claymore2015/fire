package com.claymore.bamder.cybersecurity.district.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "m_district")
public class MDistrictEntity {
    private int districtId;
    private String districtName;
    private Long zipCode;
    private Long cityId;
    private Byte rn;

    @Id
    @Column(name = "DistrictID")
    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    @Basic
    @Column(name = "DistrictName")
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
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
    @Column(name = "CityID")
    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
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

        MDistrictEntity that = (MDistrictEntity) o;

        if (districtId != that.districtId) return false;
        if (districtName != null ? !districtName.equals(that.districtName) : that.districtName != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (rn != null ? !rn.equals(that.rn) : that.rn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = districtId;
        result = 31 * result + (districtName != null ? districtName.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (rn != null ? rn.hashCode() : 0);
        return result;
    }
}

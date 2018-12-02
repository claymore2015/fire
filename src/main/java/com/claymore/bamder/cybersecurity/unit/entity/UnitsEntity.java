package com.claymore.bamder.cybersecurity.unit.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "units")
public class UnitsEntity {
    private Long unitId;
    private String province;
    private String city;
    private String district;
    private String area;
    private Double lon;
    private Double lat;
    private Integer unitType;
    private String remark;
    private String unitName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id")
    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
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
    @Column(name = "District")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "Area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "lon")
    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Basic
    @Column(name = "lat")
    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "unit_type")
    public Integer getUnitType() {
        return unitType;
    }

    public void setUnitType(Integer unitType) {
        this.unitType = unitType;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "unit_name")
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnitsEntity that = (UnitsEntity) o;

        if (unitId != null ? !unitId.equals(that.unitId) : that.unitId != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (lon != null ? !lon.equals(that.lon) : that.lon != null) return false;
        if (lat != null ? !lat.equals(that.lat) : that.lat != null) return false;
        if (unitType != null ? !unitType.equals(that.unitType) : that.unitType != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (unitName != null ? !unitName.equals(that.unitName) : that.unitName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unitId != null ? unitId.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (unitType != null ? unitType.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (unitName != null ? unitName.hashCode() : 0);
        return result;
    }
}

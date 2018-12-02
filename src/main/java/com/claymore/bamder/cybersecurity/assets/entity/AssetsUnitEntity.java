package com.claymore.bamder.cybersecurity.assets.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "assets_unit")
@IdClass(AssetsUnitEntityPK.class)
public class AssetsUnitEntity {
    private String province;
    private String city;
    private String district;
    private String unit;
    private int assetsType;
    private Integer count;

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

    @Id
    @Column(name = "Unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Id
    @Column(name = "assets_type")
    public int getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(int assetsType) {
        this.assetsType = assetsType;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssetsUnitEntity that = (AssetsUnitEntity) o;

        if (assetsType != that.assetsType) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = province != null ? province.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + assetsType;
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }
}

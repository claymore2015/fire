package com.claymore.bamder.cybersecurity.assets.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "assets_survay")
@IdClass(AssetsSurvayEntityPK.class)
public class AssetsSurvayEntity {
    private int assetsType;
    private int assetsStatus;
    private String province;
    private String city;
    private String district;
    private Integer count;
    private Integer countS1;
    private Integer countS2;

    @Id
    @Column(name = "assets_type")
    public int getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(int assetsType) {
        this.assetsType = assetsType;
    }

    @Id
    @Column(name = "assets_status")
    public int getAssetsStatus() {
        return assetsStatus;
    }

    public void setAssetsStatus(int assetsStatus) {
        this.assetsStatus = assetsStatus;
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

    @Id
    @Column(name = "District")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "count_s1")
    public Integer getCountS1() {
        return countS1;
    }

    public void setCountS1(Integer countS1) {
        this.countS1 = countS1;
    }

    @Basic
    @Column(name = "count_s2")
    public Integer getCountS2() {
        return countS2;
    }

    public void setCountS2(Integer countS2) {
        this.countS2 = countS2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssetsSurvayEntity that = (AssetsSurvayEntity) o;

        if (assetsType != that.assetsType) return false;
        if (assetsStatus != that.assetsStatus) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = assetsType;
        result = 31 * result + assetsStatus;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }
}

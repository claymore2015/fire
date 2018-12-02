package com.claymore.bamder.cybersecurity.assets.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "assets_data")
@IdClass(AssetsDataEntityPK.class)
public class AssetsDataEntity {
    private int assetsDataType;
    private String province;
    private String city;
    private String district;
    private BigDecimal cumulateCount;
    private BigDecimal weekAvgCount;
    private BigDecimal weekCount;

    @Id
    @Column(name = "assets_data_type")
    public int getAssetsDataType() {
        return assetsDataType;
    }

    public void setAssetsDataType(int assetsDataType) {
        this.assetsDataType = assetsDataType;
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
    @Column(name = "cumulate_count")
    public BigDecimal getCumulateCount() {
        return cumulateCount;
    }

    public void setCumulateCount(BigDecimal cumulateCount) {
        this.cumulateCount = cumulateCount;
    }

    @Basic
    @Column(name = "week_avg_count")
    public BigDecimal getWeekAvgCount() {
        return weekAvgCount;
    }

    public void setWeekAvgCount(BigDecimal weekAvgCount) {
        this.weekAvgCount = weekAvgCount;
    }

    @Basic
    @Column(name = "week_count")
    public BigDecimal getWeekCount() {
        return weekCount;
    }

    public void setWeekCount(BigDecimal weekCount) {
        this.weekCount = weekCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssetsDataEntity that = (AssetsDataEntity) o;

        if (assetsDataType != that.assetsDataType) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (cumulateCount != null ? !cumulateCount.equals(that.cumulateCount) : that.cumulateCount != null)
            return false;
        if (weekAvgCount != null ? !weekAvgCount.equals(that.weekAvgCount) : that.weekAvgCount != null) return false;
        if (weekCount != null ? !weekCount.equals(that.weekCount) : that.weekCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = assetsDataType;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (cumulateCount != null ? cumulateCount.hashCode() : 0);
        result = 31 * result + (weekAvgCount != null ? weekAvgCount.hashCode() : 0);
        result = 31 * result + (weekCount != null ? weekCount.hashCode() : 0);
        return result;
    }
}

package com.claymore.bamder.cybersecurity.assets.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
public class AssetsDataEntityPK implements Serializable {
    private int assetsDataType;
    private String district;

    @Column(name = "assets_data_type")
    @Id
    public int getAssetsDataType() {
        return assetsDataType;
    }

    public void setAssetsDataType(int assetsDataType) {
        this.assetsDataType = assetsDataType;
    }

    @Column(name = "District")
    @Id
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssetsDataEntityPK that = (AssetsDataEntityPK) o;

        if (assetsDataType != that.assetsDataType) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = assetsDataType;
        result = 31 * result + (district != null ? district.hashCode() : 0);
        return result;
    }
}

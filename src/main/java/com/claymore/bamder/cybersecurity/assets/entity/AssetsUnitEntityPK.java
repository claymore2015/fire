package com.claymore.bamder.cybersecurity.assets.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
public class AssetsUnitEntityPK implements Serializable {
    private String unit;
    private int assetsType;

    @Column(name = "Unit")
    @Id
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Column(name = "assets_type")
    @Id
    public int getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(int assetsType) {
        this.assetsType = assetsType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssetsUnitEntityPK that = (AssetsUnitEntityPK) o;

        if (assetsType != that.assetsType) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unit != null ? unit.hashCode() : 0;
        result = 31 * result + assetsType;
        return result;
    }
}

package com.claymore.bamder.cybersecurity.assets.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
public class AssetsAccountEntityPK implements Serializable {
    private int accountType;
    private String district;

    @Column(name = "account_type")
    @Id
    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
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

        AssetsAccountEntityPK that = (AssetsAccountEntityPK) o;

        if (accountType != that.accountType) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountType;
        result = 31 * result + (district != null ? district.hashCode() : 0);
        return result;
    }
}

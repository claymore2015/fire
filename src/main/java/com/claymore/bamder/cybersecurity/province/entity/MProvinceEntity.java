package com.claymore.bamder.cybersecurity.province.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "m_province")
public class MProvinceEntity {
    private int provinceId;
    private String provinceName;
    private Long zipCode;
    private Long zipKiloMega;
    private Long zipCity;
    private Long zipDst;

    @Id
    @Column(name = "ProvinceID")
    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "ProvinceName")
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
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
    @Column(name = "Zip_kiloMega")
    public Long getZipKiloMega() {
        return zipKiloMega;
    }

    public void setZipKiloMega(Long zipKiloMega) {
        this.zipKiloMega = zipKiloMega;
    }

    @Basic
    @Column(name = "Zip_city")
    public Long getZipCity() {
        return zipCity;
    }

    public void setZipCity(Long zipCity) {
        this.zipCity = zipCity;
    }

    @Basic
    @Column(name = "Zip_dst")
    public Long getZipDst() {
        return zipDst;
    }

    public void setZipDst(Long zipDst) {
        this.zipDst = zipDst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MProvinceEntity that = (MProvinceEntity) o;

        if (provinceId != that.provinceId) return false;
        if (provinceName != null ? !provinceName.equals(that.provinceName) : that.provinceName != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (zipKiloMega != null ? !zipKiloMega.equals(that.zipKiloMega) : that.zipKiloMega != null) return false;
        if (zipCity != null ? !zipCity.equals(that.zipCity) : that.zipCity != null) return false;
        if (zipDst != null ? !zipDst.equals(that.zipDst) : that.zipDst != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = provinceId;
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (zipKiloMega != null ? zipKiloMega.hashCode() : 0);
        result = 31 * result + (zipCity != null ? zipCity.hashCode() : 0);
        result = 31 * result + (zipDst != null ? zipDst.hashCode() : 0);
        return result;
    }
}

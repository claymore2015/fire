package com.claymore.bamder.cybersecurity.gj.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "chuzhi_gjqm")
@IdClass(ChuzhiGjqmEntityPK.class)
public class ChuzhiGjqmEntity {
    private Date day;
    private String province;
    private String city;
    private String district;
    private Long gjqm1;
    private Long gjqm1D;
    private Long gjqm1D0;
    private Long gjqm1D1;
    private Long gjqm1D2;
    private Long gjqm1D3;
    private Long gjqm2;
    private Long gjqm2D;
    private Long gjqm2D0;
    private Long gjqm2D1;
    private Long gjqm2D2;
    private Long gjqm2D3;
    private Long gjqm3;
    private Long gjqm3D;
    private Long gjqm3D0;
    private Long gjqm3D1;
    private Long gjqm3D2;
    private Long gjqm3D3;
    private Long gjqm4;
    private Long gjqm4D;
    private Long gjqm4D0;
    private Long gjqm4D1;
    private Long gjqm4D2;
    private Long gjqm4D3;
    private Long gjqm5;
    private Long gjqm5D;
    private Long gjqm5D0;
    private Long gjqm5D1;
    private Long gjqm5D2;
    private Long gjqm5D3;

    @Id
    @Column(name = "day")
    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
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
    @Column(name = "GJQM_1")
    public Long getGjqm1() {
        return gjqm1;
    }

    public void setGjqm1(Long gjqm1) {
        this.gjqm1 = gjqm1;
    }

    @Basic
    @Column(name = "GJQM_1_D")
    public Long getGjqm1D() {
        return gjqm1D;
    }

    public void setGjqm1D(Long gjqm1D) {
        this.gjqm1D = gjqm1D;
    }

    @Basic
    @Column(name = "GJQM_1_D_0")
    public Long getGjqm1D0() {
        return gjqm1D0;
    }

    public void setGjqm1D0(Long gjqm1D0) {
        this.gjqm1D0 = gjqm1D0;
    }

    @Basic
    @Column(name = "GJQM_1_D_1")
    public Long getGjqm1D1() {
        return gjqm1D1;
    }

    public void setGjqm1D1(Long gjqm1D1) {
        this.gjqm1D1 = gjqm1D1;
    }

    @Basic
    @Column(name = "GJQM_1_D_2")
    public Long getGjqm1D2() {
        return gjqm1D2;
    }

    public void setGjqm1D2(Long gjqm1D2) {
        this.gjqm1D2 = gjqm1D2;
    }

    @Basic
    @Column(name = "GJQM_1_D_3")
    public Long getGjqm1D3() {
        return gjqm1D3;
    }

    public void setGjqm1D3(Long gjqm1D3) {
        this.gjqm1D3 = gjqm1D3;
    }

    @Basic
    @Column(name = "GJQM_2")
    public Long getGjqm2() {
        return gjqm2;
    }

    public void setGjqm2(Long gjqm2) {
        this.gjqm2 = gjqm2;
    }

    @Basic
    @Column(name = "GJQM_2_D")
    public Long getGjqm2D() {
        return gjqm2D;
    }

    public void setGjqm2D(Long gjqm2D) {
        this.gjqm2D = gjqm2D;
    }

    @Basic
    @Column(name = "GJQM_2_D_0")
    public Long getGjqm2D0() {
        return gjqm2D0;
    }

    public void setGjqm2D0(Long gjqm2D0) {
        this.gjqm2D0 = gjqm2D0;
    }

    @Basic
    @Column(name = "GJQM_2_D_1")
    public Long getGjqm2D1() {
        return gjqm2D1;
    }

    public void setGjqm2D1(Long gjqm2D1) {
        this.gjqm2D1 = gjqm2D1;
    }

    @Basic
    @Column(name = "GJQM_2_D_2")
    public Long getGjqm2D2() {
        return gjqm2D2;
    }

    public void setGjqm2D2(Long gjqm2D2) {
        this.gjqm2D2 = gjqm2D2;
    }

    @Basic
    @Column(name = "GJQM_2_D_3")
    public Long getGjqm2D3() {
        return gjqm2D3;
    }

    public void setGjqm2D3(Long gjqm2D3) {
        this.gjqm2D3 = gjqm2D3;
    }

    @Basic
    @Column(name = "GJQM_3")
    public Long getGjqm3() {
        return gjqm3;
    }

    public void setGjqm3(Long gjqm3) {
        this.gjqm3 = gjqm3;
    }

    @Basic
    @Column(name = "GJQM_3_D")
    public Long getGjqm3D() {
        return gjqm3D;
    }

    public void setGjqm3D(Long gjqm3D) {
        this.gjqm3D = gjqm3D;
    }

    @Basic
    @Column(name = "GJQM_3_D_0")
    public Long getGjqm3D0() {
        return gjqm3D0;
    }

    public void setGjqm3D0(Long gjqm3D0) {
        this.gjqm3D0 = gjqm3D0;
    }

    @Basic
    @Column(name = "GJQM_3_D_1")
    public Long getGjqm3D1() {
        return gjqm3D1;
    }

    public void setGjqm3D1(Long gjqm3D1) {
        this.gjqm3D1 = gjqm3D1;
    }

    @Basic
    @Column(name = "GJQM_3_D_2")
    public Long getGjqm3D2() {
        return gjqm3D2;
    }

    public void setGjqm3D2(Long gjqm3D2) {
        this.gjqm3D2 = gjqm3D2;
    }

    @Basic
    @Column(name = "GJQM_3_D_3")
    public Long getGjqm3D3() {
        return gjqm3D3;
    }

    public void setGjqm3D3(Long gjqm3D3) {
        this.gjqm3D3 = gjqm3D3;
    }

    @Basic
    @Column(name = "GJQM_4")
    public Long getGjqm4() {
        return gjqm4;
    }

    public void setGjqm4(Long gjqm4) {
        this.gjqm4 = gjqm4;
    }

    @Basic
    @Column(name = "GJQM_4_D")
    public Long getGjqm4D() {
        return gjqm4D;
    }

    public void setGjqm4D(Long gjqm4D) {
        this.gjqm4D = gjqm4D;
    }

    @Basic
    @Column(name = "GJQM_4_D_0")
    public Long getGjqm4D0() {
        return gjqm4D0;
    }

    public void setGjqm4D0(Long gjqm4D0) {
        this.gjqm4D0 = gjqm4D0;
    }

    @Basic
    @Column(name = "GJQM_4_D_1")
    public Long getGjqm4D1() {
        return gjqm4D1;
    }

    public void setGjqm4D1(Long gjqm4D1) {
        this.gjqm4D1 = gjqm4D1;
    }

    @Basic
    @Column(name = "GJQM_4_D_2")
    public Long getGjqm4D2() {
        return gjqm4D2;
    }

    public void setGjqm4D2(Long gjqm4D2) {
        this.gjqm4D2 = gjqm4D2;
    }

    @Basic
    @Column(name = "GJQM_4_D_3")
    public Long getGjqm4D3() {
        return gjqm4D3;
    }

    public void setGjqm4D3(Long gjqm4D3) {
        this.gjqm4D3 = gjqm4D3;
    }

    @Basic
    @Column(name = "GJQM_5")
    public Long getGjqm5() {
        return gjqm5;
    }

    public void setGjqm5(Long gjqm5) {
        this.gjqm5 = gjqm5;
    }

    @Basic
    @Column(name = "GJQM_5_D")
    public Long getGjqm5D() {
        return gjqm5D;
    }

    public void setGjqm5D(Long gjqm5D) {
        this.gjqm5D = gjqm5D;
    }

    @Basic
    @Column(name = "GJQM_5_D_0")
    public Long getGjqm5D0() {
        return gjqm5D0;
    }

    public void setGjqm5D0(Long gjqm5D0) {
        this.gjqm5D0 = gjqm5D0;
    }

    @Basic
    @Column(name = "GJQM_5_D_1")
    public Long getGjqm5D1() {
        return gjqm5D1;
    }

    public void setGjqm5D1(Long gjqm5D1) {
        this.gjqm5D1 = gjqm5D1;
    }

    @Basic
    @Column(name = "GJQM_5_D_2")
    public Long getGjqm5D2() {
        return gjqm5D2;
    }

    public void setGjqm5D2(Long gjqm5D2) {
        this.gjqm5D2 = gjqm5D2;
    }

    @Basic
    @Column(name = "GJQM_5_D_3")
    public Long getGjqm5D3() {
        return gjqm5D3;
    }

    public void setGjqm5D3(Long gjqm5D3) {
        this.gjqm5D3 = gjqm5D3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChuzhiGjqmEntity that = (ChuzhiGjqmEntity) o;

        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (gjqm1 != null ? !gjqm1.equals(that.gjqm1) : that.gjqm1 != null) return false;
        if (gjqm1D != null ? !gjqm1D.equals(that.gjqm1D) : that.gjqm1D != null) return false;
        if (gjqm1D0 != null ? !gjqm1D0.equals(that.gjqm1D0) : that.gjqm1D0 != null) return false;
        if (gjqm1D1 != null ? !gjqm1D1.equals(that.gjqm1D1) : that.gjqm1D1 != null) return false;
        if (gjqm1D2 != null ? !gjqm1D2.equals(that.gjqm1D2) : that.gjqm1D2 != null) return false;
        if (gjqm1D3 != null ? !gjqm1D3.equals(that.gjqm1D3) : that.gjqm1D3 != null) return false;
        if (gjqm2 != null ? !gjqm2.equals(that.gjqm2) : that.gjqm2 != null) return false;
        if (gjqm2D != null ? !gjqm2D.equals(that.gjqm2D) : that.gjqm2D != null) return false;
        if (gjqm2D0 != null ? !gjqm2D0.equals(that.gjqm2D0) : that.gjqm2D0 != null) return false;
        if (gjqm2D1 != null ? !gjqm2D1.equals(that.gjqm2D1) : that.gjqm2D1 != null) return false;
        if (gjqm2D2 != null ? !gjqm2D2.equals(that.gjqm2D2) : that.gjqm2D2 != null) return false;
        if (gjqm2D3 != null ? !gjqm2D3.equals(that.gjqm2D3) : that.gjqm2D3 != null) return false;
        if (gjqm3 != null ? !gjqm3.equals(that.gjqm3) : that.gjqm3 != null) return false;
        if (gjqm3D != null ? !gjqm3D.equals(that.gjqm3D) : that.gjqm3D != null) return false;
        if (gjqm3D0 != null ? !gjqm3D0.equals(that.gjqm3D0) : that.gjqm3D0 != null) return false;
        if (gjqm3D1 != null ? !gjqm3D1.equals(that.gjqm3D1) : that.gjqm3D1 != null) return false;
        if (gjqm3D2 != null ? !gjqm3D2.equals(that.gjqm3D2) : that.gjqm3D2 != null) return false;
        if (gjqm3D3 != null ? !gjqm3D3.equals(that.gjqm3D3) : that.gjqm3D3 != null) return false;
        if (gjqm4 != null ? !gjqm4.equals(that.gjqm4) : that.gjqm4 != null) return false;
        if (gjqm4D != null ? !gjqm4D.equals(that.gjqm4D) : that.gjqm4D != null) return false;
        if (gjqm4D0 != null ? !gjqm4D0.equals(that.gjqm4D0) : that.gjqm4D0 != null) return false;
        if (gjqm4D1 != null ? !gjqm4D1.equals(that.gjqm4D1) : that.gjqm4D1 != null) return false;
        if (gjqm4D2 != null ? !gjqm4D2.equals(that.gjqm4D2) : that.gjqm4D2 != null) return false;
        if (gjqm4D3 != null ? !gjqm4D3.equals(that.gjqm4D3) : that.gjqm4D3 != null) return false;
        if (gjqm5 != null ? !gjqm5.equals(that.gjqm5) : that.gjqm5 != null) return false;
        if (gjqm5D != null ? !gjqm5D.equals(that.gjqm5D) : that.gjqm5D != null) return false;
        if (gjqm5D0 != null ? !gjqm5D0.equals(that.gjqm5D0) : that.gjqm5D0 != null) return false;
        if (gjqm5D1 != null ? !gjqm5D1.equals(that.gjqm5D1) : that.gjqm5D1 != null) return false;
        if (gjqm5D2 != null ? !gjqm5D2.equals(that.gjqm5D2) : that.gjqm5D2 != null) return false;
        if (gjqm5D3 != null ? !gjqm5D3.equals(that.gjqm5D3) : that.gjqm5D3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = day != null ? day.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (gjqm1 != null ? gjqm1.hashCode() : 0);
        result = 31 * result + (gjqm1D != null ? gjqm1D.hashCode() : 0);
        result = 31 * result + (gjqm1D0 != null ? gjqm1D0.hashCode() : 0);
        result = 31 * result + (gjqm1D1 != null ? gjqm1D1.hashCode() : 0);
        result = 31 * result + (gjqm1D2 != null ? gjqm1D2.hashCode() : 0);
        result = 31 * result + (gjqm1D3 != null ? gjqm1D3.hashCode() : 0);
        result = 31 * result + (gjqm2 != null ? gjqm2.hashCode() : 0);
        result = 31 * result + (gjqm2D != null ? gjqm2D.hashCode() : 0);
        result = 31 * result + (gjqm2D0 != null ? gjqm2D0.hashCode() : 0);
        result = 31 * result + (gjqm2D1 != null ? gjqm2D1.hashCode() : 0);
        result = 31 * result + (gjqm2D2 != null ? gjqm2D2.hashCode() : 0);
        result = 31 * result + (gjqm2D3 != null ? gjqm2D3.hashCode() : 0);
        result = 31 * result + (gjqm3 != null ? gjqm3.hashCode() : 0);
        result = 31 * result + (gjqm3D != null ? gjqm3D.hashCode() : 0);
        result = 31 * result + (gjqm3D0 != null ? gjqm3D0.hashCode() : 0);
        result = 31 * result + (gjqm3D1 != null ? gjqm3D1.hashCode() : 0);
        result = 31 * result + (gjqm3D2 != null ? gjqm3D2.hashCode() : 0);
        result = 31 * result + (gjqm3D3 != null ? gjqm3D3.hashCode() : 0);
        result = 31 * result + (gjqm4 != null ? gjqm4.hashCode() : 0);
        result = 31 * result + (gjqm4D != null ? gjqm4D.hashCode() : 0);
        result = 31 * result + (gjqm4D0 != null ? gjqm4D0.hashCode() : 0);
        result = 31 * result + (gjqm4D1 != null ? gjqm4D1.hashCode() : 0);
        result = 31 * result + (gjqm4D2 != null ? gjqm4D2.hashCode() : 0);
        result = 31 * result + (gjqm4D3 != null ? gjqm4D3.hashCode() : 0);
        result = 31 * result + (gjqm5 != null ? gjqm5.hashCode() : 0);
        result = 31 * result + (gjqm5D != null ? gjqm5D.hashCode() : 0);
        result = 31 * result + (gjqm5D0 != null ? gjqm5D0.hashCode() : 0);
        result = 31 * result + (gjqm5D1 != null ? gjqm5D1.hashCode() : 0);
        result = 31 * result + (gjqm5D2 != null ? gjqm5D2.hashCode() : 0);
        result = 31 * result + (gjqm5D3 != null ? gjqm5D3.hashCode() : 0);
        return result;
    }
}

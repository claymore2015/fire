package com.claymore.bamder.cybersecurity.gj.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "chuzhi_mbsj")
@IdClass(ChuzhiMbsjEntityPK.class)
public class ChuzhiMbsjEntity {
    private Date day;
    private String province;
    private String city;
    private String district;
    private Long mbsj1;
    private Long mbsj1D;
    private Long mbsj1D0;
    private Long mbsj1D1;
    private Long mbsj1D2;
    private Long mbsj1D3;
    private Long mbsj2;
    private Long mbsj2D;
    private Long mbsj2D0;
    private Long mbsj2D1;
    private Long mbsj2D2;
    private Long mbsj2D3;
    private Long mbsj3;
    private Long mbsj3D;
    private Long mbsj3D0;
    private Long mbsj3D1;
    private Long mbsj3D2;
    private Long mbsj3D3;
    private Long mbsj4;
    private Long mbsj4D;
    private Long mbsj4D0;
    private Long mbsj4D1;
    private Long mbsj4D2;
    private Long mbsj4D3;
    private Long mbsj5;
    private Long mbsj5D;
    private Long mbsj5D0;
    private Long mbsj5D1;
    private Long mbsj5D2;
    private Long mbsj5D3;

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
    @Column(name = "MBSJ_1")
    public Long getMbsj1() {
        return mbsj1;
    }

    public void setMbsj1(Long mbsj1) {
        this.mbsj1 = mbsj1;
    }

    @Basic
    @Column(name = "MBSJ_1_D")
    public Long getMbsj1D() {
        return mbsj1D;
    }

    public void setMbsj1D(Long mbsj1D) {
        this.mbsj1D = mbsj1D;
    }

    @Basic
    @Column(name = "MBSJ_1_D_0")
    public Long getMbsj1D0() {
        return mbsj1D0;
    }

    public void setMbsj1D0(Long mbsj1D0) {
        this.mbsj1D0 = mbsj1D0;
    }

    @Basic
    @Column(name = "MBSJ_1_D_1")
    public Long getMbsj1D1() {
        return mbsj1D1;
    }

    public void setMbsj1D1(Long mbsj1D1) {
        this.mbsj1D1 = mbsj1D1;
    }

    @Basic
    @Column(name = "MBSJ_1_D_2")
    public Long getMbsj1D2() {
        return mbsj1D2;
    }

    public void setMbsj1D2(Long mbsj1D2) {
        this.mbsj1D2 = mbsj1D2;
    }

    @Basic
    @Column(name = "MBSJ_1_D_3")
    public Long getMbsj1D3() {
        return mbsj1D3;
    }

    public void setMbsj1D3(Long mbsj1D3) {
        this.mbsj1D3 = mbsj1D3;
    }

    @Basic
    @Column(name = "MBSJ_2")
    public Long getMbsj2() {
        return mbsj2;
    }

    public void setMbsj2(Long mbsj2) {
        this.mbsj2 = mbsj2;
    }

    @Basic
    @Column(name = "MBSJ_2_D")
    public Long getMbsj2D() {
        return mbsj2D;
    }

    public void setMbsj2D(Long mbsj2D) {
        this.mbsj2D = mbsj2D;
    }

    @Basic
    @Column(name = "MBSJ_2_D_0")
    public Long getMbsj2D0() {
        return mbsj2D0;
    }

    public void setMbsj2D0(Long mbsj2D0) {
        this.mbsj2D0 = mbsj2D0;
    }

    @Basic
    @Column(name = "MBSJ_2_D_1")
    public Long getMbsj2D1() {
        return mbsj2D1;
    }

    public void setMbsj2D1(Long mbsj2D1) {
        this.mbsj2D1 = mbsj2D1;
    }

    @Basic
    @Column(name = "MBSJ_2_D_2")
    public Long getMbsj2D2() {
        return mbsj2D2;
    }

    public void setMbsj2D2(Long mbsj2D2) {
        this.mbsj2D2 = mbsj2D2;
    }

    @Basic
    @Column(name = "MBSJ_2_D_3")
    public Long getMbsj2D3() {
        return mbsj2D3;
    }

    public void setMbsj2D3(Long mbsj2D3) {
        this.mbsj2D3 = mbsj2D3;
    }

    @Basic
    @Column(name = "MBSJ_3")
    public Long getMbsj3() {
        return mbsj3;
    }

    public void setMbsj3(Long mbsj3) {
        this.mbsj3 = mbsj3;
    }

    @Basic
    @Column(name = "MBSJ_3_D")
    public Long getMbsj3D() {
        return mbsj3D;
    }

    public void setMbsj3D(Long mbsj3D) {
        this.mbsj3D = mbsj3D;
    }

    @Basic
    @Column(name = "MBSJ_3_D_0")
    public Long getMbsj3D0() {
        return mbsj3D0;
    }

    public void setMbsj3D0(Long mbsj3D0) {
        this.mbsj3D0 = mbsj3D0;
    }

    @Basic
    @Column(name = "MBSJ_3_D_1")
    public Long getMbsj3D1() {
        return mbsj3D1;
    }

    public void setMbsj3D1(Long mbsj3D1) {
        this.mbsj3D1 = mbsj3D1;
    }

    @Basic
    @Column(name = "MBSJ_3_D_2")
    public Long getMbsj3D2() {
        return mbsj3D2;
    }

    public void setMbsj3D2(Long mbsj3D2) {
        this.mbsj3D2 = mbsj3D2;
    }

    @Basic
    @Column(name = "MBSJ_3_D_3")
    public Long getMbsj3D3() {
        return mbsj3D3;
    }

    public void setMbsj3D3(Long mbsj3D3) {
        this.mbsj3D3 = mbsj3D3;
    }

    @Basic
    @Column(name = "MBSJ_4")
    public Long getMbsj4() {
        return mbsj4;
    }

    public void setMbsj4(Long mbsj4) {
        this.mbsj4 = mbsj4;
    }

    @Basic
    @Column(name = "MBSJ_4_D")
    public Long getMbsj4D() {
        return mbsj4D;
    }

    public void setMbsj4D(Long mbsj4D) {
        this.mbsj4D = mbsj4D;
    }

    @Basic
    @Column(name = "MBSJ_4_D_0")
    public Long getMbsj4D0() {
        return mbsj4D0;
    }

    public void setMbsj4D0(Long mbsj4D0) {
        this.mbsj4D0 = mbsj4D0;
    }

    @Basic
    @Column(name = "MBSJ_4_D_1")
    public Long getMbsj4D1() {
        return mbsj4D1;
    }

    public void setMbsj4D1(Long mbsj4D1) {
        this.mbsj4D1 = mbsj4D1;
    }

    @Basic
    @Column(name = "MBSJ_4_D_2")
    public Long getMbsj4D2() {
        return mbsj4D2;
    }

    public void setMbsj4D2(Long mbsj4D2) {
        this.mbsj4D2 = mbsj4D2;
    }

    @Basic
    @Column(name = "MBSJ_4_D_3")
    public Long getMbsj4D3() {
        return mbsj4D3;
    }

    public void setMbsj4D3(Long mbsj4D3) {
        this.mbsj4D3 = mbsj4D3;
    }

    @Basic
    @Column(name = "MBSJ_5")
    public Long getMbsj5() {
        return mbsj5;
    }

    public void setMbsj5(Long mbsj5) {
        this.mbsj5 = mbsj5;
    }

    @Basic
    @Column(name = "MBSJ_5_D")
    public Long getMbsj5D() {
        return mbsj5D;
    }

    public void setMbsj5D(Long mbsj5D) {
        this.mbsj5D = mbsj5D;
    }

    @Basic
    @Column(name = "MBSJ_5_D_0")
    public Long getMbsj5D0() {
        return mbsj5D0;
    }

    public void setMbsj5D0(Long mbsj5D0) {
        this.mbsj5D0 = mbsj5D0;
    }

    @Basic
    @Column(name = "MBSJ_5_D_1")
    public Long getMbsj5D1() {
        return mbsj5D1;
    }

    public void setMbsj5D1(Long mbsj5D1) {
        this.mbsj5D1 = mbsj5D1;
    }

    @Basic
    @Column(name = "MBSJ_5_D_2")
    public Long getMbsj5D2() {
        return mbsj5D2;
    }

    public void setMbsj5D2(Long mbsj5D2) {
        this.mbsj5D2 = mbsj5D2;
    }

    @Basic
    @Column(name = "MBSJ_5_D_3")
    public Long getMbsj5D3() {
        return mbsj5D3;
    }

    public void setMbsj5D3(Long mbsj5D3) {
        this.mbsj5D3 = mbsj5D3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChuzhiMbsjEntity that = (ChuzhiMbsjEntity) o;

        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (mbsj1 != null ? !mbsj1.equals(that.mbsj1) : that.mbsj1 != null) return false;
        if (mbsj1D != null ? !mbsj1D.equals(that.mbsj1D) : that.mbsj1D != null) return false;
        if (mbsj1D0 != null ? !mbsj1D0.equals(that.mbsj1D0) : that.mbsj1D0 != null) return false;
        if (mbsj1D1 != null ? !mbsj1D1.equals(that.mbsj1D1) : that.mbsj1D1 != null) return false;
        if (mbsj1D2 != null ? !mbsj1D2.equals(that.mbsj1D2) : that.mbsj1D2 != null) return false;
        if (mbsj1D3 != null ? !mbsj1D3.equals(that.mbsj1D3) : that.mbsj1D3 != null) return false;
        if (mbsj2 != null ? !mbsj2.equals(that.mbsj2) : that.mbsj2 != null) return false;
        if (mbsj2D != null ? !mbsj2D.equals(that.mbsj2D) : that.mbsj2D != null) return false;
        if (mbsj2D0 != null ? !mbsj2D0.equals(that.mbsj2D0) : that.mbsj2D0 != null) return false;
        if (mbsj2D1 != null ? !mbsj2D1.equals(that.mbsj2D1) : that.mbsj2D1 != null) return false;
        if (mbsj2D2 != null ? !mbsj2D2.equals(that.mbsj2D2) : that.mbsj2D2 != null) return false;
        if (mbsj2D3 != null ? !mbsj2D3.equals(that.mbsj2D3) : that.mbsj2D3 != null) return false;
        if (mbsj3 != null ? !mbsj3.equals(that.mbsj3) : that.mbsj3 != null) return false;
        if (mbsj3D != null ? !mbsj3D.equals(that.mbsj3D) : that.mbsj3D != null) return false;
        if (mbsj3D0 != null ? !mbsj3D0.equals(that.mbsj3D0) : that.mbsj3D0 != null) return false;
        if (mbsj3D1 != null ? !mbsj3D1.equals(that.mbsj3D1) : that.mbsj3D1 != null) return false;
        if (mbsj3D2 != null ? !mbsj3D2.equals(that.mbsj3D2) : that.mbsj3D2 != null) return false;
        if (mbsj3D3 != null ? !mbsj3D3.equals(that.mbsj3D3) : that.mbsj3D3 != null) return false;
        if (mbsj4 != null ? !mbsj4.equals(that.mbsj4) : that.mbsj4 != null) return false;
        if (mbsj4D != null ? !mbsj4D.equals(that.mbsj4D) : that.mbsj4D != null) return false;
        if (mbsj4D0 != null ? !mbsj4D0.equals(that.mbsj4D0) : that.mbsj4D0 != null) return false;
        if (mbsj4D1 != null ? !mbsj4D1.equals(that.mbsj4D1) : that.mbsj4D1 != null) return false;
        if (mbsj4D2 != null ? !mbsj4D2.equals(that.mbsj4D2) : that.mbsj4D2 != null) return false;
        if (mbsj4D3 != null ? !mbsj4D3.equals(that.mbsj4D3) : that.mbsj4D3 != null) return false;
        if (mbsj5 != null ? !mbsj5.equals(that.mbsj5) : that.mbsj5 != null) return false;
        if (mbsj5D != null ? !mbsj5D.equals(that.mbsj5D) : that.mbsj5D != null) return false;
        if (mbsj5D0 != null ? !mbsj5D0.equals(that.mbsj5D0) : that.mbsj5D0 != null) return false;
        if (mbsj5D1 != null ? !mbsj5D1.equals(that.mbsj5D1) : that.mbsj5D1 != null) return false;
        if (mbsj5D2 != null ? !mbsj5D2.equals(that.mbsj5D2) : that.mbsj5D2 != null) return false;
        if (mbsj5D3 != null ? !mbsj5D3.equals(that.mbsj5D3) : that.mbsj5D3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = day != null ? day.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (mbsj1 != null ? mbsj1.hashCode() : 0);
        result = 31 * result + (mbsj1D != null ? mbsj1D.hashCode() : 0);
        result = 31 * result + (mbsj1D0 != null ? mbsj1D0.hashCode() : 0);
        result = 31 * result + (mbsj1D1 != null ? mbsj1D1.hashCode() : 0);
        result = 31 * result + (mbsj1D2 != null ? mbsj1D2.hashCode() : 0);
        result = 31 * result + (mbsj1D3 != null ? mbsj1D3.hashCode() : 0);
        result = 31 * result + (mbsj2 != null ? mbsj2.hashCode() : 0);
        result = 31 * result + (mbsj2D != null ? mbsj2D.hashCode() : 0);
        result = 31 * result + (mbsj2D0 != null ? mbsj2D0.hashCode() : 0);
        result = 31 * result + (mbsj2D1 != null ? mbsj2D1.hashCode() : 0);
        result = 31 * result + (mbsj2D2 != null ? mbsj2D2.hashCode() : 0);
        result = 31 * result + (mbsj2D3 != null ? mbsj2D3.hashCode() : 0);
        result = 31 * result + (mbsj3 != null ? mbsj3.hashCode() : 0);
        result = 31 * result + (mbsj3D != null ? mbsj3D.hashCode() : 0);
        result = 31 * result + (mbsj3D0 != null ? mbsj3D0.hashCode() : 0);
        result = 31 * result + (mbsj3D1 != null ? mbsj3D1.hashCode() : 0);
        result = 31 * result + (mbsj3D2 != null ? mbsj3D2.hashCode() : 0);
        result = 31 * result + (mbsj3D3 != null ? mbsj3D3.hashCode() : 0);
        result = 31 * result + (mbsj4 != null ? mbsj4.hashCode() : 0);
        result = 31 * result + (mbsj4D != null ? mbsj4D.hashCode() : 0);
        result = 31 * result + (mbsj4D0 != null ? mbsj4D0.hashCode() : 0);
        result = 31 * result + (mbsj4D1 != null ? mbsj4D1.hashCode() : 0);
        result = 31 * result + (mbsj4D2 != null ? mbsj4D2.hashCode() : 0);
        result = 31 * result + (mbsj4D3 != null ? mbsj4D3.hashCode() : 0);
        result = 31 * result + (mbsj5 != null ? mbsj5.hashCode() : 0);
        result = 31 * result + (mbsj5D != null ? mbsj5D.hashCode() : 0);
        result = 31 * result + (mbsj5D0 != null ? mbsj5D0.hashCode() : 0);
        result = 31 * result + (mbsj5D1 != null ? mbsj5D1.hashCode() : 0);
        result = 31 * result + (mbsj5D2 != null ? mbsj5D2.hashCode() : 0);
        result = 31 * result + (mbsj5D3 != null ? mbsj5D3.hashCode() : 0);
        return result;
    }
}

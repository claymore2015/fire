package com.claymore.bamder.cybersecurity.gj.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "chuzhi_wgxw")
@IdClass(ChuzhiWgxwEntityPK.class)
public class ChuzhiWgxwEntity {
    private Date day;
    private String province;
    private String city;
    private String district;
    private Long wgxw1;
    private Long wgxw1D;
    private Long wgxw1D0;
    private Long wgxw1D1;
    private Long wgxw1D2;
    private Long wgxw1D3;
    private Long wgxw2;
    private Long wgxw2D;
    private Long wgxw2D0;
    private Long wgxw2D1;
    private Long wgxw2D2;
    private Long wgxw2D3;
    private Long wgxw3;
    private Long wgxw3D;
    private Long wgxw3D0;
    private Long wgxw3D1;
    private Long wgxw3D2;
    private Long wgxw3D3;
    private Long wgxw4;
    private Long wgxw4D;
    private Long wgxw4D0;
    private Long wgxw4D1;
    private Long wgxw4D2;
    private Long wgxw4D3;
    private Long wgxw5;
    private Long wgxw5D;
    private Long wgxw5D0;
    private Long wgxw5D1;
    private Long wgxw5D2;
    private Long wgxw5D3;

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
    @Column(name = "WGXW_1")
    public Long getWgxw1() {
        return wgxw1;
    }

    public void setWgxw1(Long wgxw1) {
        this.wgxw1 = wgxw1;
    }

    @Basic
    @Column(name = "WGXW_1_D")
    public Long getWgxw1D() {
        return wgxw1D;
    }

    public void setWgxw1D(Long wgxw1D) {
        this.wgxw1D = wgxw1D;
    }

    @Basic
    @Column(name = "WGXW_1_D_0")
    public Long getWgxw1D0() {
        return wgxw1D0;
    }

    public void setWgxw1D0(Long wgxw1D0) {
        this.wgxw1D0 = wgxw1D0;
    }

    @Basic
    @Column(name = "WGXW_1_D_1")
    public Long getWgxw1D1() {
        return wgxw1D1;
    }

    public void setWgxw1D1(Long wgxw1D1) {
        this.wgxw1D1 = wgxw1D1;
    }

    @Basic
    @Column(name = "WGXW_1_D_2")
    public Long getWgxw1D2() {
        return wgxw1D2;
    }

    public void setWgxw1D2(Long wgxw1D2) {
        this.wgxw1D2 = wgxw1D2;
    }

    @Basic
    @Column(name = "WGXW_1_D_3")
    public Long getWgxw1D3() {
        return wgxw1D3;
    }

    public void setWgxw1D3(Long wgxw1D3) {
        this.wgxw1D3 = wgxw1D3;
    }

    @Basic
    @Column(name = "WGXW_2")
    public Long getWgxw2() {
        return wgxw2;
    }

    public void setWgxw2(Long wgxw2) {
        this.wgxw2 = wgxw2;
    }

    @Basic
    @Column(name = "WGXW_2_D")
    public Long getWgxw2D() {
        return wgxw2D;
    }

    public void setWgxw2D(Long wgxw2D) {
        this.wgxw2D = wgxw2D;
    }

    @Basic
    @Column(name = "WGXW_2_D_0")
    public Long getWgxw2D0() {
        return wgxw2D0;
    }

    public void setWgxw2D0(Long wgxw2D0) {
        this.wgxw2D0 = wgxw2D0;
    }

    @Basic
    @Column(name = "WGXW_2_D_1")
    public Long getWgxw2D1() {
        return wgxw2D1;
    }

    public void setWgxw2D1(Long wgxw2D1) {
        this.wgxw2D1 = wgxw2D1;
    }

    @Basic
    @Column(name = "WGXW_2_D_2")
    public Long getWgxw2D2() {
        return wgxw2D2;
    }

    public void setWgxw2D2(Long wgxw2D2) {
        this.wgxw2D2 = wgxw2D2;
    }

    @Basic
    @Column(name = "WGXW_2_D_3")
    public Long getWgxw2D3() {
        return wgxw2D3;
    }

    public void setWgxw2D3(Long wgxw2D3) {
        this.wgxw2D3 = wgxw2D3;
    }

    @Basic
    @Column(name = "WGXW_3")
    public Long getWgxw3() {
        return wgxw3;
    }

    public void setWgxw3(Long wgxw3) {
        this.wgxw3 = wgxw3;
    }

    @Basic
    @Column(name = "WGXW_3_D")
    public Long getWgxw3D() {
        return wgxw3D;
    }

    public void setWgxw3D(Long wgxw3D) {
        this.wgxw3D = wgxw3D;
    }

    @Basic
    @Column(name = "WGXW_3_D_0")
    public Long getWgxw3D0() {
        return wgxw3D0;
    }

    public void setWgxw3D0(Long wgxw3D0) {
        this.wgxw3D0 = wgxw3D0;
    }

    @Basic
    @Column(name = "WGXW_3_D_1")
    public Long getWgxw3D1() {
        return wgxw3D1;
    }

    public void setWgxw3D1(Long wgxw3D1) {
        this.wgxw3D1 = wgxw3D1;
    }

    @Basic
    @Column(name = "WGXW_3_D_2")
    public Long getWgxw3D2() {
        return wgxw3D2;
    }

    public void setWgxw3D2(Long wgxw3D2) {
        this.wgxw3D2 = wgxw3D2;
    }

    @Basic
    @Column(name = "WGXW_3_D_3")
    public Long getWgxw3D3() {
        return wgxw3D3;
    }

    public void setWgxw3D3(Long wgxw3D3) {
        this.wgxw3D3 = wgxw3D3;
    }

    @Basic
    @Column(name = "WGXW_4")
    public Long getWgxw4() {
        return wgxw4;
    }

    public void setWgxw4(Long wgxw4) {
        this.wgxw4 = wgxw4;
    }

    @Basic
    @Column(name = "WGXW_4_D")
    public Long getWgxw4D() {
        return wgxw4D;
    }

    public void setWgxw4D(Long wgxw4D) {
        this.wgxw4D = wgxw4D;
    }

    @Basic
    @Column(name = "WGXW_4_D_0")
    public Long getWgxw4D0() {
        return wgxw4D0;
    }

    public void setWgxw4D0(Long wgxw4D0) {
        this.wgxw4D0 = wgxw4D0;
    }

    @Basic
    @Column(name = "WGXW_4_D_1")
    public Long getWgxw4D1() {
        return wgxw4D1;
    }

    public void setWgxw4D1(Long wgxw4D1) {
        this.wgxw4D1 = wgxw4D1;
    }

    @Basic
    @Column(name = "WGXW_4_D_2")
    public Long getWgxw4D2() {
        return wgxw4D2;
    }

    public void setWgxw4D2(Long wgxw4D2) {
        this.wgxw4D2 = wgxw4D2;
    }

    @Basic
    @Column(name = "WGXW_4_D_3")
    public Long getWgxw4D3() {
        return wgxw4D3;
    }

    public void setWgxw4D3(Long wgxw4D3) {
        this.wgxw4D3 = wgxw4D3;
    }

    @Basic
    @Column(name = "WGXW_5")
    public Long getWgxw5() {
        return wgxw5;
    }

    public void setWgxw5(Long wgxw5) {
        this.wgxw5 = wgxw5;
    }

    @Basic
    @Column(name = "WGXW_5_D")
    public Long getWgxw5D() {
        return wgxw5D;
    }

    public void setWgxw5D(Long wgxw5D) {
        this.wgxw5D = wgxw5D;
    }

    @Basic
    @Column(name = "WGXW_5_D_0")
    public Long getWgxw5D0() {
        return wgxw5D0;
    }

    public void setWgxw5D0(Long wgxw5D0) {
        this.wgxw5D0 = wgxw5D0;
    }

    @Basic
    @Column(name = "WGXW_5_D_1")
    public Long getWgxw5D1() {
        return wgxw5D1;
    }

    public void setWgxw5D1(Long wgxw5D1) {
        this.wgxw5D1 = wgxw5D1;
    }

    @Basic
    @Column(name = "WGXW_5_D_2")
    public Long getWgxw5D2() {
        return wgxw5D2;
    }

    public void setWgxw5D2(Long wgxw5D2) {
        this.wgxw5D2 = wgxw5D2;
    }

    @Basic
    @Column(name = "WGXW_5_D_3")
    public Long getWgxw5D3() {
        return wgxw5D3;
    }

    public void setWgxw5D3(Long wgxw5D3) {
        this.wgxw5D3 = wgxw5D3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChuzhiWgxwEntity that = (ChuzhiWgxwEntity) o;

        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (wgxw1 != null ? !wgxw1.equals(that.wgxw1) : that.wgxw1 != null) return false;
        if (wgxw1D != null ? !wgxw1D.equals(that.wgxw1D) : that.wgxw1D != null) return false;
        if (wgxw1D0 != null ? !wgxw1D0.equals(that.wgxw1D0) : that.wgxw1D0 != null) return false;
        if (wgxw1D1 != null ? !wgxw1D1.equals(that.wgxw1D1) : that.wgxw1D1 != null) return false;
        if (wgxw1D2 != null ? !wgxw1D2.equals(that.wgxw1D2) : that.wgxw1D2 != null) return false;
        if (wgxw1D3 != null ? !wgxw1D3.equals(that.wgxw1D3) : that.wgxw1D3 != null) return false;
        if (wgxw2 != null ? !wgxw2.equals(that.wgxw2) : that.wgxw2 != null) return false;
        if (wgxw2D != null ? !wgxw2D.equals(that.wgxw2D) : that.wgxw2D != null) return false;
        if (wgxw2D0 != null ? !wgxw2D0.equals(that.wgxw2D0) : that.wgxw2D0 != null) return false;
        if (wgxw2D1 != null ? !wgxw2D1.equals(that.wgxw2D1) : that.wgxw2D1 != null) return false;
        if (wgxw2D2 != null ? !wgxw2D2.equals(that.wgxw2D2) : that.wgxw2D2 != null) return false;
        if (wgxw2D3 != null ? !wgxw2D3.equals(that.wgxw2D3) : that.wgxw2D3 != null) return false;
        if (wgxw3 != null ? !wgxw3.equals(that.wgxw3) : that.wgxw3 != null) return false;
        if (wgxw3D != null ? !wgxw3D.equals(that.wgxw3D) : that.wgxw3D != null) return false;
        if (wgxw3D0 != null ? !wgxw3D0.equals(that.wgxw3D0) : that.wgxw3D0 != null) return false;
        if (wgxw3D1 != null ? !wgxw3D1.equals(that.wgxw3D1) : that.wgxw3D1 != null) return false;
        if (wgxw3D2 != null ? !wgxw3D2.equals(that.wgxw3D2) : that.wgxw3D2 != null) return false;
        if (wgxw3D3 != null ? !wgxw3D3.equals(that.wgxw3D3) : that.wgxw3D3 != null) return false;
        if (wgxw4 != null ? !wgxw4.equals(that.wgxw4) : that.wgxw4 != null) return false;
        if (wgxw4D != null ? !wgxw4D.equals(that.wgxw4D) : that.wgxw4D != null) return false;
        if (wgxw4D0 != null ? !wgxw4D0.equals(that.wgxw4D0) : that.wgxw4D0 != null) return false;
        if (wgxw4D1 != null ? !wgxw4D1.equals(that.wgxw4D1) : that.wgxw4D1 != null) return false;
        if (wgxw4D2 != null ? !wgxw4D2.equals(that.wgxw4D2) : that.wgxw4D2 != null) return false;
        if (wgxw4D3 != null ? !wgxw4D3.equals(that.wgxw4D3) : that.wgxw4D3 != null) return false;
        if (wgxw5 != null ? !wgxw5.equals(that.wgxw5) : that.wgxw5 != null) return false;
        if (wgxw5D != null ? !wgxw5D.equals(that.wgxw5D) : that.wgxw5D != null) return false;
        if (wgxw5D0 != null ? !wgxw5D0.equals(that.wgxw5D0) : that.wgxw5D0 != null) return false;
        if (wgxw5D1 != null ? !wgxw5D1.equals(that.wgxw5D1) : that.wgxw5D1 != null) return false;
        if (wgxw5D2 != null ? !wgxw5D2.equals(that.wgxw5D2) : that.wgxw5D2 != null) return false;
        if (wgxw5D3 != null ? !wgxw5D3.equals(that.wgxw5D3) : that.wgxw5D3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = day != null ? day.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (wgxw1 != null ? wgxw1.hashCode() : 0);
        result = 31 * result + (wgxw1D != null ? wgxw1D.hashCode() : 0);
        result = 31 * result + (wgxw1D0 != null ? wgxw1D0.hashCode() : 0);
        result = 31 * result + (wgxw1D1 != null ? wgxw1D1.hashCode() : 0);
        result = 31 * result + (wgxw1D2 != null ? wgxw1D2.hashCode() : 0);
        result = 31 * result + (wgxw1D3 != null ? wgxw1D3.hashCode() : 0);
        result = 31 * result + (wgxw2 != null ? wgxw2.hashCode() : 0);
        result = 31 * result + (wgxw2D != null ? wgxw2D.hashCode() : 0);
        result = 31 * result + (wgxw2D0 != null ? wgxw2D0.hashCode() : 0);
        result = 31 * result + (wgxw2D1 != null ? wgxw2D1.hashCode() : 0);
        result = 31 * result + (wgxw2D2 != null ? wgxw2D2.hashCode() : 0);
        result = 31 * result + (wgxw2D3 != null ? wgxw2D3.hashCode() : 0);
        result = 31 * result + (wgxw3 != null ? wgxw3.hashCode() : 0);
        result = 31 * result + (wgxw3D != null ? wgxw3D.hashCode() : 0);
        result = 31 * result + (wgxw3D0 != null ? wgxw3D0.hashCode() : 0);
        result = 31 * result + (wgxw3D1 != null ? wgxw3D1.hashCode() : 0);
        result = 31 * result + (wgxw3D2 != null ? wgxw3D2.hashCode() : 0);
        result = 31 * result + (wgxw3D3 != null ? wgxw3D3.hashCode() : 0);
        result = 31 * result + (wgxw4 != null ? wgxw4.hashCode() : 0);
        result = 31 * result + (wgxw4D != null ? wgxw4D.hashCode() : 0);
        result = 31 * result + (wgxw4D0 != null ? wgxw4D0.hashCode() : 0);
        result = 31 * result + (wgxw4D1 != null ? wgxw4D1.hashCode() : 0);
        result = 31 * result + (wgxw4D2 != null ? wgxw4D2.hashCode() : 0);
        result = 31 * result + (wgxw4D3 != null ? wgxw4D3.hashCode() : 0);
        result = 31 * result + (wgxw5 != null ? wgxw5.hashCode() : 0);
        result = 31 * result + (wgxw5D != null ? wgxw5D.hashCode() : 0);
        result = 31 * result + (wgxw5D0 != null ? wgxw5D0.hashCode() : 0);
        result = 31 * result + (wgxw5D1 != null ? wgxw5D1.hashCode() : 0);
        result = 31 * result + (wgxw5D2 != null ? wgxw5D2.hashCode() : 0);
        result = 31 * result + (wgxw5D3 != null ? wgxw5D3.hashCode() : 0);
        return result;
    }
}

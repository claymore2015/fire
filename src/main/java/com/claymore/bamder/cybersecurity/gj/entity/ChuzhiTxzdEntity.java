package com.claymore.bamder.cybersecurity.gj.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "chuzhi_txzd")
@IdClass(ChuzhiTxzdEntityPK.class)
public class ChuzhiTxzdEntity {
    private Date day;
    private String province;
    private String city;
    private String district;
    private Long txzd1;
    private Long txzd1D;
    private Long txzd1D0;
    private Long txzd1D1;
    private Long txzd1D2;
    private Long txzd1D3;
    private Long txzd2;
    private Long txzd2D;
    private Long txzd2D0;
    private Long txzd2D1;
    private Long txzd2D2;
    private Long txzd2D3;
    private Long txzd3;
    private Long txzd3D;
    private Long txzd3D0;
    private Long txzd3D1;
    private Long txzd3D2;
    private Long txzd3D3;
    private Long txzd4;
    private Long txzd4D;
    private Long txzd4D0;
    private Long txzd4D1;
    private Long txzd4D2;
    private Long txzd4D3;
    private Long txzd5;
    private Long txzd5D;
    private Long txzd5D0;
    private Long txzd5D1;
    private Long txzd5D2;
    private Long txzd5D3;

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
    @Column(name = "TXZD_1")
    public Long getTxzd1() {
        return txzd1;
    }

    public void setTxzd1(Long txzd1) {
        this.txzd1 = txzd1;
    }

    @Basic
    @Column(name = "TXZD_1_D")
    public Long getTxzd1D() {
        return txzd1D;
    }

    public void setTxzd1D(Long txzd1D) {
        this.txzd1D = txzd1D;
    }

    @Basic
    @Column(name = "TXZD_1_D_0")
    public Long getTxzd1D0() {
        return txzd1D0;
    }

    public void setTxzd1D0(Long txzd1D0) {
        this.txzd1D0 = txzd1D0;
    }

    @Basic
    @Column(name = "TXZD_1_D_1")
    public Long getTxzd1D1() {
        return txzd1D1;
    }

    public void setTxzd1D1(Long txzd1D1) {
        this.txzd1D1 = txzd1D1;
    }

    @Basic
    @Column(name = "TXZD_1_D_2")
    public Long getTxzd1D2() {
        return txzd1D2;
    }

    public void setTxzd1D2(Long txzd1D2) {
        this.txzd1D2 = txzd1D2;
    }

    @Basic
    @Column(name = "TXZD_1_D_3")
    public Long getTxzd1D3() {
        return txzd1D3;
    }

    public void setTxzd1D3(Long txzd1D3) {
        this.txzd1D3 = txzd1D3;
    }

    @Basic
    @Column(name = "TXZD_2")
    public Long getTxzd2() {
        return txzd2;
    }

    public void setTxzd2(Long txzd2) {
        this.txzd2 = txzd2;
    }

    @Basic
    @Column(name = "TXZD_2_D")
    public Long getTxzd2D() {
        return txzd2D;
    }

    public void setTxzd2D(Long txzd2D) {
        this.txzd2D = txzd2D;
    }

    @Basic
    @Column(name = "TXZD_2_D_0")
    public Long getTxzd2D0() {
        return txzd2D0;
    }

    public void setTxzd2D0(Long txzd2D0) {
        this.txzd2D0 = txzd2D0;
    }

    @Basic
    @Column(name = "TXZD_2_D_1")
    public Long getTxzd2D1() {
        return txzd2D1;
    }

    public void setTxzd2D1(Long txzd2D1) {
        this.txzd2D1 = txzd2D1;
    }

    @Basic
    @Column(name = "TXZD_2_D_2")
    public Long getTxzd2D2() {
        return txzd2D2;
    }

    public void setTxzd2D2(Long txzd2D2) {
        this.txzd2D2 = txzd2D2;
    }

    @Basic
    @Column(name = "TXZD_2_D_3")
    public Long getTxzd2D3() {
        return txzd2D3;
    }

    public void setTxzd2D3(Long txzd2D3) {
        this.txzd2D3 = txzd2D3;
    }

    @Basic
    @Column(name = "TXZD_3")
    public Long getTxzd3() {
        return txzd3;
    }

    public void setTxzd3(Long txzd3) {
        this.txzd3 = txzd3;
    }

    @Basic
    @Column(name = "TXZD_3_D")
    public Long getTxzd3D() {
        return txzd3D;
    }

    public void setTxzd3D(Long txzd3D) {
        this.txzd3D = txzd3D;
    }

    @Basic
    @Column(name = "TXZD_3_D_0")
    public Long getTxzd3D0() {
        return txzd3D0;
    }

    public void setTxzd3D0(Long txzd3D0) {
        this.txzd3D0 = txzd3D0;
    }

    @Basic
    @Column(name = "TXZD_3_D_1")
    public Long getTxzd3D1() {
        return txzd3D1;
    }

    public void setTxzd3D1(Long txzd3D1) {
        this.txzd3D1 = txzd3D1;
    }

    @Basic
    @Column(name = "TXZD_3_D_2")
    public Long getTxzd3D2() {
        return txzd3D2;
    }

    public void setTxzd3D2(Long txzd3D2) {
        this.txzd3D2 = txzd3D2;
    }

    @Basic
    @Column(name = "TXZD_3_D_3")
    public Long getTxzd3D3() {
        return txzd3D3;
    }

    public void setTxzd3D3(Long txzd3D3) {
        this.txzd3D3 = txzd3D3;
    }

    @Basic
    @Column(name = "TXZD_4")
    public Long getTxzd4() {
        return txzd4;
    }

    public void setTxzd4(Long txzd4) {
        this.txzd4 = txzd4;
    }

    @Basic
    @Column(name = "TXZD_4_D")
    public Long getTxzd4D() {
        return txzd4D;
    }

    public void setTxzd4D(Long txzd4D) {
        this.txzd4D = txzd4D;
    }

    @Basic
    @Column(name = "TXZD_4_D_0")
    public Long getTxzd4D0() {
        return txzd4D0;
    }

    public void setTxzd4D0(Long txzd4D0) {
        this.txzd4D0 = txzd4D0;
    }

    @Basic
    @Column(name = "TXZD_4_D_1")
    public Long getTxzd4D1() {
        return txzd4D1;
    }

    public void setTxzd4D1(Long txzd4D1) {
        this.txzd4D1 = txzd4D1;
    }

    @Basic
    @Column(name = "TXZD_4_D_2")
    public Long getTxzd4D2() {
        return txzd4D2;
    }

    public void setTxzd4D2(Long txzd4D2) {
        this.txzd4D2 = txzd4D2;
    }

    @Basic
    @Column(name = "TXZD_4_D_3")
    public Long getTxzd4D3() {
        return txzd4D3;
    }

    public void setTxzd4D3(Long txzd4D3) {
        this.txzd4D3 = txzd4D3;
    }

    @Basic
    @Column(name = "TXZD_5")
    public Long getTxzd5() {
        return txzd5;
    }

    public void setTxzd5(Long txzd5) {
        this.txzd5 = txzd5;
    }

    @Basic
    @Column(name = "TXZD_5_D")
    public Long getTxzd5D() {
        return txzd5D;
    }

    public void setTxzd5D(Long txzd5D) {
        this.txzd5D = txzd5D;
    }

    @Basic
    @Column(name = "TXZD_5_D_0")
    public Long getTxzd5D0() {
        return txzd5D0;
    }

    public void setTxzd5D0(Long txzd5D0) {
        this.txzd5D0 = txzd5D0;
    }

    @Basic
    @Column(name = "TXZD_5_D_1")
    public Long getTxzd5D1() {
        return txzd5D1;
    }

    public void setTxzd5D1(Long txzd5D1) {
        this.txzd5D1 = txzd5D1;
    }

    @Basic
    @Column(name = "TXZD_5_D_2")
    public Long getTxzd5D2() {
        return txzd5D2;
    }

    public void setTxzd5D2(Long txzd5D2) {
        this.txzd5D2 = txzd5D2;
    }

    @Basic
    @Column(name = "TXZD_5_D_3")
    public Long getTxzd5D3() {
        return txzd5D3;
    }

    public void setTxzd5D3(Long txzd5D3) {
        this.txzd5D3 = txzd5D3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChuzhiTxzdEntity that = (ChuzhiTxzdEntity) o;

        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (txzd1 != null ? !txzd1.equals(that.txzd1) : that.txzd1 != null) return false;
        if (txzd1D != null ? !txzd1D.equals(that.txzd1D) : that.txzd1D != null) return false;
        if (txzd1D0 != null ? !txzd1D0.equals(that.txzd1D0) : that.txzd1D0 != null) return false;
        if (txzd1D1 != null ? !txzd1D1.equals(that.txzd1D1) : that.txzd1D1 != null) return false;
        if (txzd1D2 != null ? !txzd1D2.equals(that.txzd1D2) : that.txzd1D2 != null) return false;
        if (txzd1D3 != null ? !txzd1D3.equals(that.txzd1D3) : that.txzd1D3 != null) return false;
        if (txzd2 != null ? !txzd2.equals(that.txzd2) : that.txzd2 != null) return false;
        if (txzd2D != null ? !txzd2D.equals(that.txzd2D) : that.txzd2D != null) return false;
        if (txzd2D0 != null ? !txzd2D0.equals(that.txzd2D0) : that.txzd2D0 != null) return false;
        if (txzd2D1 != null ? !txzd2D1.equals(that.txzd2D1) : that.txzd2D1 != null) return false;
        if (txzd2D2 != null ? !txzd2D2.equals(that.txzd2D2) : that.txzd2D2 != null) return false;
        if (txzd2D3 != null ? !txzd2D3.equals(that.txzd2D3) : that.txzd2D3 != null) return false;
        if (txzd3 != null ? !txzd3.equals(that.txzd3) : that.txzd3 != null) return false;
        if (txzd3D != null ? !txzd3D.equals(that.txzd3D) : that.txzd3D != null) return false;
        if (txzd3D0 != null ? !txzd3D0.equals(that.txzd3D0) : that.txzd3D0 != null) return false;
        if (txzd3D1 != null ? !txzd3D1.equals(that.txzd3D1) : that.txzd3D1 != null) return false;
        if (txzd3D2 != null ? !txzd3D2.equals(that.txzd3D2) : that.txzd3D2 != null) return false;
        if (txzd3D3 != null ? !txzd3D3.equals(that.txzd3D3) : that.txzd3D3 != null) return false;
        if (txzd4 != null ? !txzd4.equals(that.txzd4) : that.txzd4 != null) return false;
        if (txzd4D != null ? !txzd4D.equals(that.txzd4D) : that.txzd4D != null) return false;
        if (txzd4D0 != null ? !txzd4D0.equals(that.txzd4D0) : that.txzd4D0 != null) return false;
        if (txzd4D1 != null ? !txzd4D1.equals(that.txzd4D1) : that.txzd4D1 != null) return false;
        if (txzd4D2 != null ? !txzd4D2.equals(that.txzd4D2) : that.txzd4D2 != null) return false;
        if (txzd4D3 != null ? !txzd4D3.equals(that.txzd4D3) : that.txzd4D3 != null) return false;
        if (txzd5 != null ? !txzd5.equals(that.txzd5) : that.txzd5 != null) return false;
        if (txzd5D != null ? !txzd5D.equals(that.txzd5D) : that.txzd5D != null) return false;
        if (txzd5D0 != null ? !txzd5D0.equals(that.txzd5D0) : that.txzd5D0 != null) return false;
        if (txzd5D1 != null ? !txzd5D1.equals(that.txzd5D1) : that.txzd5D1 != null) return false;
        if (txzd5D2 != null ? !txzd5D2.equals(that.txzd5D2) : that.txzd5D2 != null) return false;
        if (txzd5D3 != null ? !txzd5D3.equals(that.txzd5D3) : that.txzd5D3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = day != null ? day.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (txzd1 != null ? txzd1.hashCode() : 0);
        result = 31 * result + (txzd1D != null ? txzd1D.hashCode() : 0);
        result = 31 * result + (txzd1D0 != null ? txzd1D0.hashCode() : 0);
        result = 31 * result + (txzd1D1 != null ? txzd1D1.hashCode() : 0);
        result = 31 * result + (txzd1D2 != null ? txzd1D2.hashCode() : 0);
        result = 31 * result + (txzd1D3 != null ? txzd1D3.hashCode() : 0);
        result = 31 * result + (txzd2 != null ? txzd2.hashCode() : 0);
        result = 31 * result + (txzd2D != null ? txzd2D.hashCode() : 0);
        result = 31 * result + (txzd2D0 != null ? txzd2D0.hashCode() : 0);
        result = 31 * result + (txzd2D1 != null ? txzd2D1.hashCode() : 0);
        result = 31 * result + (txzd2D2 != null ? txzd2D2.hashCode() : 0);
        result = 31 * result + (txzd2D3 != null ? txzd2D3.hashCode() : 0);
        result = 31 * result + (txzd3 != null ? txzd3.hashCode() : 0);
        result = 31 * result + (txzd3D != null ? txzd3D.hashCode() : 0);
        result = 31 * result + (txzd3D0 != null ? txzd3D0.hashCode() : 0);
        result = 31 * result + (txzd3D1 != null ? txzd3D1.hashCode() : 0);
        result = 31 * result + (txzd3D2 != null ? txzd3D2.hashCode() : 0);
        result = 31 * result + (txzd3D3 != null ? txzd3D3.hashCode() : 0);
        result = 31 * result + (txzd4 != null ? txzd4.hashCode() : 0);
        result = 31 * result + (txzd4D != null ? txzd4D.hashCode() : 0);
        result = 31 * result + (txzd4D0 != null ? txzd4D0.hashCode() : 0);
        result = 31 * result + (txzd4D1 != null ? txzd4D1.hashCode() : 0);
        result = 31 * result + (txzd4D2 != null ? txzd4D2.hashCode() : 0);
        result = 31 * result + (txzd4D3 != null ? txzd4D3.hashCode() : 0);
        result = 31 * result + (txzd5 != null ? txzd5.hashCode() : 0);
        result = 31 * result + (txzd5D != null ? txzd5D.hashCode() : 0);
        result = 31 * result + (txzd5D0 != null ? txzd5D0.hashCode() : 0);
        result = 31 * result + (txzd5D1 != null ? txzd5D1.hashCode() : 0);
        result = 31 * result + (txzd5D2 != null ? txzd5D2.hashCode() : 0);
        result = 31 * result + (txzd5D3 != null ? txzd5D3.hashCode() : 0);
        return result;
    }
}

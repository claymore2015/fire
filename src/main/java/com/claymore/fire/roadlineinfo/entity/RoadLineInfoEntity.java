package com.claymore.fire.roadlineinfo.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/12/3 10:34 AM
 * @since 1.0.0
 */
@Entity
@Table(name = "road_line_info")
public class RoadLineInfoEntity {
    private int id;
    private String sjmc;
    private String lxbh;
    private String xzqmc;
    private String lxmc;
    private String ldqzQdmc;
    private String ldqzZdmc;
    private String ldqzzhQdzh;
    private String ldqzzhZdzh;
    private Double lc;
    private String ldxxJsdjDm;
    private String ldxxJsdjDj;
    private Double ldxxCdsl;
    private String ldxxMclxDm;
    private String ldxxMclxLx;
    private Double ldxxLjkd;
    private Double ldxxLmkd;
    private Double ldxxSjss;
    private String xjgjXjnd;
    private String xjgjGjnd;
    private String dmDm;
    private String dmHz;
    private Double hdsl;
    private String gydwmc;
    private String tbxxTbdw;
    private String tbxxTbdwdm;
    private String tbxxTbnd;
    private String bz;
    private String sjbz;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sjmc", nullable = true, length = 45)
    public String getSjmc() {
        return sjmc;
    }

    public void setSjmc(String sjmc) {
        this.sjmc = sjmc;
    }

    @Basic
    @Column(name = "lxbh", nullable = true, length = 45)
    public String getLxbh() {
        return lxbh;
    }

    public void setLxbh(String lxbh) {
        this.lxbh = lxbh;
    }

    @Basic
    @Column(name = "xzqmc", nullable = true, length = 45)
    public String getXzqmc() {
        return xzqmc;
    }

    public void setXzqmc(String xzqmc) {
        this.xzqmc = xzqmc;
    }

    @Basic
    @Column(name = "lxmc", nullable = true, length = 45)
    public String getLxmc() {
        return lxmc;
    }

    public void setLxmc(String lxmc) {
        this.lxmc = lxmc;
    }

    @Basic
    @Column(name = "ldqz_qdmc", nullable = true, length = 45)
    public String getLdqzQdmc() {
        return ldqzQdmc;
    }

    public void setLdqzQdmc(String ldqzQdmc) {
        this.ldqzQdmc = ldqzQdmc;
    }

    @Basic
    @Column(name = "ldqz_zdmc", nullable = true, length = 45)
    public String getLdqzZdmc() {
        return ldqzZdmc;
    }

    public void setLdqzZdmc(String ldqzZdmc) {
        this.ldqzZdmc = ldqzZdmc;
    }

    @Basic
    @Column(name = "ldqzzh_qdzh", nullable = true, length = 45)
    public String getLdqzzhQdzh() {
        return ldqzzhQdzh;
    }

    public void setLdqzzhQdzh(String ldqzzhQdzh) {
        this.ldqzzhQdzh = ldqzzhQdzh;
    }

    @Basic
    @Column(name = "ldqzzh_zdzh", nullable = true, length = 45)
    public String getLdqzzhZdzh() {
        return ldqzzhZdzh;
    }

    public void setLdqzzhZdzh(String ldqzzhZdzh) {
        this.ldqzzhZdzh = ldqzzhZdzh;
    }

    @Basic
    @Column(name = "lc", nullable = true, precision = 0)
    public Double getLc() {
        return lc;
    }

    public void setLc(Double lc) {
        this.lc = lc;
    }

    @Basic
    @Column(name = "ldxx_jsdj_dm", nullable = true, length = 45)
    public String getLdxxJsdjDm() {
        return ldxxJsdjDm;
    }

    public void setLdxxJsdjDm(String ldxxJsdjDm) {
        this.ldxxJsdjDm = ldxxJsdjDm;
    }

    @Basic
    @Column(name = "ldxx_jsdj_dj", nullable = true, length = 45)
    public String getLdxxJsdjDj() {
        return ldxxJsdjDj;
    }

    public void setLdxxJsdjDj(String ldxxJsdjDj) {
        this.ldxxJsdjDj = ldxxJsdjDj;
    }

    @Basic
    @Column(name = "ldxx_cdsl", nullable = true, precision = 0)
    public Double getLdxxCdsl() {
        return ldxxCdsl;
    }

    public void setLdxxCdsl(Double ldxxCdsl) {
        this.ldxxCdsl = ldxxCdsl;
    }

    @Basic
    @Column(name = "ldxx_mclx_dm", nullable = true, length = 45)
    public String getLdxxMclxDm() {
        return ldxxMclxDm;
    }

    public void setLdxxMclxDm(String ldxxMclxDm) {
        this.ldxxMclxDm = ldxxMclxDm;
    }

    @Basic
    @Column(name = "ldxx_mclx_lx", nullable = true, length = 45)
    public String getLdxxMclxLx() {
        return ldxxMclxLx;
    }

    public void setLdxxMclxLx(String ldxxMclxLx) {
        this.ldxxMclxLx = ldxxMclxLx;
    }

    @Basic
    @Column(name = "ldxx_ljkd", nullable = true, precision = 0)
    public Double getLdxxLjkd() {
        return ldxxLjkd;
    }

    public void setLdxxLjkd(Double ldxxLjkd) {
        this.ldxxLjkd = ldxxLjkd;
    }

    @Basic
    @Column(name = "ldxx_lmkd", nullable = true, precision = 0)
    public Double getLdxxLmkd() {
        return ldxxLmkd;
    }

    public void setLdxxLmkd(Double ldxxLmkd) {
        this.ldxxLmkd = ldxxLmkd;
    }

    @Basic
    @Column(name = "ldxx_sjss", nullable = true, precision = 0)
    public Double getLdxxSjss() {
        return ldxxSjss;
    }

    public void setLdxxSjss(Double ldxxSjss) {
        this.ldxxSjss = ldxxSjss;
    }

    @Basic
    @Column(name = "xjgj_xjnd", nullable = true, length = 45)
    public String getXjgjXjnd() {
        return xjgjXjnd;
    }

    public void setXjgjXjnd(String xjgjXjnd) {
        this.xjgjXjnd = xjgjXjnd;
    }

    @Basic
    @Column(name = "xjgj_gjnd", nullable = true, length = 45)
    public String getXjgjGjnd() {
        return xjgjGjnd;
    }

    public void setXjgjGjnd(String xjgjGjnd) {
        this.xjgjGjnd = xjgjGjnd;
    }

    @Basic
    @Column(name = "dm_dm", nullable = true, length = 45)
    public String getDmDm() {
        return dmDm;
    }

    public void setDmDm(String dmDm) {
        this.dmDm = dmDm;
    }

    @Basic
    @Column(name = "dm_hz", nullable = true, length = 45)
    public String getDmHz() {
        return dmHz;
    }

    public void setDmHz(String dmHz) {
        this.dmHz = dmHz;
    }

    @Basic
    @Column(name = "hdsl", nullable = true, precision = 0)
    public Double getHdsl() {
        return hdsl;
    }

    public void setHdsl(Double hdsl) {
        this.hdsl = hdsl;
    }

    @Basic
    @Column(name = "gydwmc", nullable = true, length = 45)
    public String getGydwmc() {
        return gydwmc;
    }

    public void setGydwmc(String gydwmc) {
        this.gydwmc = gydwmc;
    }

    @Basic
    @Column(name = "tbxx_tbdw", nullable = true, length = 45)
    public String getTbxxTbdw() {
        return tbxxTbdw;
    }

    public void setTbxxTbdw(String tbxxTbdw) {
        this.tbxxTbdw = tbxxTbdw;
    }

    @Basic
    @Column(name = "tbxx_tbdwdm", nullable = true, length = 45)
    public String getTbxxTbdwdm() {
        return tbxxTbdwdm;
    }

    public void setTbxxTbdwdm(String tbxxTbdwdm) {
        this.tbxxTbdwdm = tbxxTbdwdm;
    }

    @Basic
    @Column(name = "tbxx_tbnd", nullable = true, length = 45)
    public String getTbxxTbnd() {
        return tbxxTbnd;
    }

    public void setTbxxTbnd(String tbxxTbnd) {
        this.tbxxTbnd = tbxxTbnd;
    }

    @Basic
    @Column(name = "bz", nullable = true, length = 45)
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "sjbz", nullable = true, length = 45)
    public String getSjbz() {
        return sjbz;
    }

    public void setSjbz(String sjbz) {
        this.sjbz = sjbz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoadLineInfoEntity that = (RoadLineInfoEntity) o;

        if (id != that.id) return false;
        if (sjmc != null ? !sjmc.equals(that.sjmc) : that.sjmc != null) return false;
        if (lxbh != null ? !lxbh.equals(that.lxbh) : that.lxbh != null) return false;
        if (xzqmc != null ? !xzqmc.equals(that.xzqmc) : that.xzqmc != null) return false;
        if (lxmc != null ? !lxmc.equals(that.lxmc) : that.lxmc != null) return false;
        if (ldqzQdmc != null ? !ldqzQdmc.equals(that.ldqzQdmc) : that.ldqzQdmc != null) return false;
        if (ldqzZdmc != null ? !ldqzZdmc.equals(that.ldqzZdmc) : that.ldqzZdmc != null) return false;
        if (ldqzzhQdzh != null ? !ldqzzhQdzh.equals(that.ldqzzhQdzh) : that.ldqzzhQdzh != null) return false;
        if (ldqzzhZdzh != null ? !ldqzzhZdzh.equals(that.ldqzzhZdzh) : that.ldqzzhZdzh != null) return false;
        if (lc != null ? !lc.equals(that.lc) : that.lc != null) return false;
        if (ldxxJsdjDm != null ? !ldxxJsdjDm.equals(that.ldxxJsdjDm) : that.ldxxJsdjDm != null) return false;
        if (ldxxJsdjDj != null ? !ldxxJsdjDj.equals(that.ldxxJsdjDj) : that.ldxxJsdjDj != null) return false;
        if (ldxxCdsl != null ? !ldxxCdsl.equals(that.ldxxCdsl) : that.ldxxCdsl != null) return false;
        if (ldxxMclxDm != null ? !ldxxMclxDm.equals(that.ldxxMclxDm) : that.ldxxMclxDm != null) return false;
        if (ldxxMclxLx != null ? !ldxxMclxLx.equals(that.ldxxMclxLx) : that.ldxxMclxLx != null) return false;
        if (ldxxLjkd != null ? !ldxxLjkd.equals(that.ldxxLjkd) : that.ldxxLjkd != null) return false;
        if (ldxxLmkd != null ? !ldxxLmkd.equals(that.ldxxLmkd) : that.ldxxLmkd != null) return false;
        if (ldxxSjss != null ? !ldxxSjss.equals(that.ldxxSjss) : that.ldxxSjss != null) return false;
        if (xjgjXjnd != null ? !xjgjXjnd.equals(that.xjgjXjnd) : that.xjgjXjnd != null) return false;
        if (xjgjGjnd != null ? !xjgjGjnd.equals(that.xjgjGjnd) : that.xjgjGjnd != null) return false;
        if (dmDm != null ? !dmDm.equals(that.dmDm) : that.dmDm != null) return false;
        if (dmHz != null ? !dmHz.equals(that.dmHz) : that.dmHz != null) return false;
        if (hdsl != null ? !hdsl.equals(that.hdsl) : that.hdsl != null) return false;
        if (gydwmc != null ? !gydwmc.equals(that.gydwmc) : that.gydwmc != null) return false;
        if (tbxxTbdw != null ? !tbxxTbdw.equals(that.tbxxTbdw) : that.tbxxTbdw != null) return false;
        if (tbxxTbdwdm != null ? !tbxxTbdwdm.equals(that.tbxxTbdwdm) : that.tbxxTbdwdm != null) return false;
        if (tbxxTbnd != null ? !tbxxTbnd.equals(that.tbxxTbnd) : that.tbxxTbnd != null) return false;
        if (bz != null ? !bz.equals(that.bz) : that.bz != null) return false;
        if (sjbz != null ? !sjbz.equals(that.sjbz) : that.sjbz != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sjmc != null ? sjmc.hashCode() : 0);
        result = 31 * result + (lxbh != null ? lxbh.hashCode() : 0);
        result = 31 * result + (xzqmc != null ? xzqmc.hashCode() : 0);
        result = 31 * result + (lxmc != null ? lxmc.hashCode() : 0);
        result = 31 * result + (ldqzQdmc != null ? ldqzQdmc.hashCode() : 0);
        result = 31 * result + (ldqzZdmc != null ? ldqzZdmc.hashCode() : 0);
        result = 31 * result + (ldqzzhQdzh != null ? ldqzzhQdzh.hashCode() : 0);
        result = 31 * result + (ldqzzhZdzh != null ? ldqzzhZdzh.hashCode() : 0);
        result = 31 * result + (lc != null ? lc.hashCode() : 0);
        result = 31 * result + (ldxxJsdjDm != null ? ldxxJsdjDm.hashCode() : 0);
        result = 31 * result + (ldxxJsdjDj != null ? ldxxJsdjDj.hashCode() : 0);
        result = 31 * result + (ldxxCdsl != null ? ldxxCdsl.hashCode() : 0);
        result = 31 * result + (ldxxMclxDm != null ? ldxxMclxDm.hashCode() : 0);
        result = 31 * result + (ldxxMclxLx != null ? ldxxMclxLx.hashCode() : 0);
        result = 31 * result + (ldxxLjkd != null ? ldxxLjkd.hashCode() : 0);
        result = 31 * result + (ldxxLmkd != null ? ldxxLmkd.hashCode() : 0);
        result = 31 * result + (ldxxSjss != null ? ldxxSjss.hashCode() : 0);
        result = 31 * result + (xjgjXjnd != null ? xjgjXjnd.hashCode() : 0);
        result = 31 * result + (xjgjGjnd != null ? xjgjGjnd.hashCode() : 0);
        result = 31 * result + (dmDm != null ? dmDm.hashCode() : 0);
        result = 31 * result + (dmHz != null ? dmHz.hashCode() : 0);
        result = 31 * result + (hdsl != null ? hdsl.hashCode() : 0);
        result = 31 * result + (gydwmc != null ? gydwmc.hashCode() : 0);
        result = 31 * result + (tbxxTbdw != null ? tbxxTbdw.hashCode() : 0);
        result = 31 * result + (tbxxTbdwdm != null ? tbxxTbdwdm.hashCode() : 0);
        result = 31 * result + (tbxxTbnd != null ? tbxxTbnd.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        result = 31 * result + (sjbz != null ? sjbz.hashCode() : 0);
        return result;
    }
}

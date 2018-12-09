package com.claymore.fire.toll.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/12/3 8:22 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "toll")
public class TollEntity {
    private int id;
    private String sjmc;
    private String sfzMc;
    private String sfzJc;
    private String sfzDm;
    private String szlxLxbh;
    private String szlxLxmc;
    private String szlxLxjsdj;
    private Double szlxZxlc;
    private String sfzsfxz;
    private String sfzlx;
    private String sfzwzlx;
    private String sffx;
    private Double rkcds;
    private Double rketccds;
    private Double ckcds;
    private Double cketccds;
    private Double wzxxJd;
    private Double wzxxWd;
    private String wzxxXzqmc;
    private String tbxxTbdwmc;
    private String tbxxTbdwdm;
    private String tbxxTbnd;
    private String bz;
    private String nbbz;

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
    @Column(name = "sfz_mc", nullable = true, length = 45)
    public String getSfzMc() {
        return sfzMc;
    }

    public void setSfzMc(String sfzMc) {
        this.sfzMc = sfzMc;
    }

    @Basic
    @Column(name = "sfz_jc", nullable = true, length = 45)
    public String getSfzJc() {
        return sfzJc;
    }

    public void setSfzJc(String sfzJc) {
        this.sfzJc = sfzJc;
    }

    @Basic
    @Column(name = "sfz_dm", nullable = true, length = 45)
    public String getSfzDm() {
        return sfzDm;
    }

    public void setSfzDm(String sfzDm) {
        this.sfzDm = sfzDm;
    }

    @Basic
    @Column(name = "szlx_lxbh", nullable = true, length = 45)
    public String getSzlxLxbh() {
        return szlxLxbh;
    }

    public void setSzlxLxbh(String szlxLxbh) {
        this.szlxLxbh = szlxLxbh;
    }

    @Basic
    @Column(name = "szlx_lxmc", nullable = true, length = 45)
    public String getSzlxLxmc() {
        return szlxLxmc;
    }

    public void setSzlxLxmc(String szlxLxmc) {
        this.szlxLxmc = szlxLxmc;
    }

    @Basic
    @Column(name = "szlx_lxjsdj", nullable = true, length = 45)
    public String getSzlxLxjsdj() {
        return szlxLxjsdj;
    }

    public void setSzlxLxjsdj(String szlxLxjsdj) {
        this.szlxLxjsdj = szlxLxjsdj;
    }

    @Basic
    @Column(name = "szlx_zxlc", nullable = true, precision = 0)
    public Double getSzlxZxlc() {
        return szlxZxlc;
    }

    public void setSzlxZxlc(Double szlxZxlc) {
        this.szlxZxlc = szlxZxlc;
    }

    @Basic
    @Column(name = "sfzsfxz", nullable = true, length = 45)
    public String getSfzsfxz() {
        return sfzsfxz;
    }

    public void setSfzsfxz(String sfzsfxz) {
        this.sfzsfxz = sfzsfxz;
    }

    @Basic
    @Column(name = "sfzlx", nullable = true, length = 45)
    public String getSfzlx() {
        return sfzlx;
    }

    public void setSfzlx(String sfzlx) {
        this.sfzlx = sfzlx;
    }

    @Basic
    @Column(name = "sfzwzlx", nullable = true, length = 45)
    public String getSfzwzlx() {
        return sfzwzlx;
    }

    public void setSfzwzlx(String sfzwzlx) {
        this.sfzwzlx = sfzwzlx;
    }

    @Basic
    @Column(name = "sffx", nullable = true, length = 45)
    public String getSffx() {
        return sffx;
    }

    public void setSffx(String sffx) {
        this.sffx = sffx;
    }

    @Basic
    @Column(name = "rkcds", nullable = true, precision = 0)
    public Double getRkcds() {
        return rkcds;
    }

    public void setRkcds(Double rkcds) {
        this.rkcds = rkcds;
    }

    @Basic
    @Column(name = "rketccds", nullable = true, precision = 0)
    public Double getRketccds() {
        return rketccds;
    }

    public void setRketccds(Double rketccds) {
        this.rketccds = rketccds;
    }

    @Basic
    @Column(name = "ckcds", nullable = true, precision = 0)
    public Double getCkcds() {
        return ckcds;
    }

    public void setCkcds(Double ckcds) {
        this.ckcds = ckcds;
    }

    @Basic
    @Column(name = "cketccds", nullable = true, precision = 0)
    public Double getCketccds() {
        return cketccds;
    }

    public void setCketccds(Double cketccds) {
        this.cketccds = cketccds;
    }

    @Basic
    @Column(name = "wzxx_jd", nullable = true, precision = 0)
    public Double getWzxxJd() {
        return wzxxJd;
    }

    public void setWzxxJd(Double wzxxJd) {
        this.wzxxJd = wzxxJd;
    }

    @Basic
    @Column(name = "wzxx_wd", nullable = true, precision = 0)
    public Double getWzxxWd() {
        return wzxxWd;
    }

    public void setWzxxWd(Double wzxxWd) {
        this.wzxxWd = wzxxWd;
    }

    @Basic
    @Column(name = "wzxx_xzqmc", nullable = true, length = 45)
    public String getWzxxXzqmc() {
        return wzxxXzqmc;
    }

    public void setWzxxXzqmc(String wzxxXzqmc) {
        this.wzxxXzqmc = wzxxXzqmc;
    }

    @Basic
    @Column(name = "tbxx_tbdwmc", nullable = true, length = 45)
    public String getTbxxTbdwmc() {
        return tbxxTbdwmc;
    }

    public void setTbxxTbdwmc(String tbxxTbdwmc) {
        this.tbxxTbdwmc = tbxxTbdwmc;
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
    @Column(name = "nbbz", nullable = true, length = 45)
    public String getNbbz() {
        return nbbz;
    }

    public void setNbbz(String nbbz) {
        this.nbbz = nbbz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TollEntity that = (TollEntity) o;

        if (id != that.id) return false;
        if (sjmc != null ? !sjmc.equals(that.sjmc) : that.sjmc != null) return false;
        if (sfzMc != null ? !sfzMc.equals(that.sfzMc) : that.sfzMc != null) return false;
        if (sfzJc != null ? !sfzJc.equals(that.sfzJc) : that.sfzJc != null) return false;
        if (sfzDm != null ? !sfzDm.equals(that.sfzDm) : that.sfzDm != null) return false;
        if (szlxLxbh != null ? !szlxLxbh.equals(that.szlxLxbh) : that.szlxLxbh != null) return false;
        if (szlxLxmc != null ? !szlxLxmc.equals(that.szlxLxmc) : that.szlxLxmc != null) return false;
        if (szlxLxjsdj != null ? !szlxLxjsdj.equals(that.szlxLxjsdj) : that.szlxLxjsdj != null) return false;
        if (szlxZxlc != null ? !szlxZxlc.equals(that.szlxZxlc) : that.szlxZxlc != null) return false;
        if (sfzsfxz != null ? !sfzsfxz.equals(that.sfzsfxz) : that.sfzsfxz != null) return false;
        if (sfzlx != null ? !sfzlx.equals(that.sfzlx) : that.sfzlx != null) return false;
        if (sfzwzlx != null ? !sfzwzlx.equals(that.sfzwzlx) : that.sfzwzlx != null) return false;
        if (sffx != null ? !sffx.equals(that.sffx) : that.sffx != null) return false;
        if (rkcds != null ? !rkcds.equals(that.rkcds) : that.rkcds != null) return false;
        if (rketccds != null ? !rketccds.equals(that.rketccds) : that.rketccds != null) return false;
        if (ckcds != null ? !ckcds.equals(that.ckcds) : that.ckcds != null) return false;
        if (cketccds != null ? !cketccds.equals(that.cketccds) : that.cketccds != null) return false;
        if (wzxxJd != null ? !wzxxJd.equals(that.wzxxJd) : that.wzxxJd != null) return false;
        if (wzxxWd != null ? !wzxxWd.equals(that.wzxxWd) : that.wzxxWd != null) return false;
        if (wzxxXzqmc != null ? !wzxxXzqmc.equals(that.wzxxXzqmc) : that.wzxxXzqmc != null) return false;
        if (tbxxTbdwmc != null ? !tbxxTbdwmc.equals(that.tbxxTbdwmc) : that.tbxxTbdwmc != null) return false;
        if (tbxxTbdwdm != null ? !tbxxTbdwdm.equals(that.tbxxTbdwdm) : that.tbxxTbdwdm != null) return false;
        if (tbxxTbnd != null ? !tbxxTbnd.equals(that.tbxxTbnd) : that.tbxxTbnd != null) return false;
        if (bz != null ? !bz.equals(that.bz) : that.bz != null) return false;
        if (nbbz != null ? !nbbz.equals(that.nbbz) : that.nbbz != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sjmc != null ? sjmc.hashCode() : 0);
        result = 31 * result + (sfzMc != null ? sfzMc.hashCode() : 0);
        result = 31 * result + (sfzJc != null ? sfzJc.hashCode() : 0);
        result = 31 * result + (sfzDm != null ? sfzDm.hashCode() : 0);
        result = 31 * result + (szlxLxbh != null ? szlxLxbh.hashCode() : 0);
        result = 31 * result + (szlxLxmc != null ? szlxLxmc.hashCode() : 0);
        result = 31 * result + (szlxLxjsdj != null ? szlxLxjsdj.hashCode() : 0);
        result = 31 * result + (szlxZxlc != null ? szlxZxlc.hashCode() : 0);
        result = 31 * result + (sfzsfxz != null ? sfzsfxz.hashCode() : 0);
        result = 31 * result + (sfzlx != null ? sfzlx.hashCode() : 0);
        result = 31 * result + (sfzwzlx != null ? sfzwzlx.hashCode() : 0);
        result = 31 * result + (sffx != null ? sffx.hashCode() : 0);
        result = 31 * result + (rkcds != null ? rkcds.hashCode() : 0);
        result = 31 * result + (rketccds != null ? rketccds.hashCode() : 0);
        result = 31 * result + (ckcds != null ? ckcds.hashCode() : 0);
        result = 31 * result + (cketccds != null ? cketccds.hashCode() : 0);
        result = 31 * result + (wzxxJd != null ? wzxxJd.hashCode() : 0);
        result = 31 * result + (wzxxWd != null ? wzxxWd.hashCode() : 0);
        result = 31 * result + (wzxxXzqmc != null ? wzxxXzqmc.hashCode() : 0);
        result = 31 * result + (tbxxTbdwmc != null ? tbxxTbdwmc.hashCode() : 0);
        result = 31 * result + (tbxxTbdwdm != null ? tbxxTbdwdm.hashCode() : 0);
        result = 31 * result + (tbxxTbnd != null ? tbxxTbnd.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        result = 31 * result + (nbbz != null ? nbbz.hashCode() : 0);
        return result;
    }
}

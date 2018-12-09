package com.claymore.fire.servicezone.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/12/3 8:22 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "service_zone")
public class ServiceZoneEntity {
    private int id;
    private String sjmc;
    private String fwqMc;
    private String fwqDm;
    private String szlxLxbh;
    private String szlxLxmc;
    private String szlxZxzh;
    private String fwwz;
    private String gljydw;
    private String fwnr;
    private Double fwqmj;
    private String serviceZonecol;
    private Double bznlTcwsl;
    private Double bznlYcysgyrs;
    private String bznlWxnl;
    private Double cygzrlQy;
    private Double cygzrlCy;
    private Double jyjs;
    private String dlwzXzqmc;
    private String dlwzXzqdm;
    private Double dlwzJd;
    private Double dlwzWd;
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
    @Column(name = "fwq_mc", nullable = true, length = 45)
    public String getFwqMc() {
        return fwqMc;
    }

    public void setFwqMc(String fwqMc) {
        this.fwqMc = fwqMc;
    }

    @Basic
    @Column(name = "fwq_dm", nullable = true, length = 45)
    public String getFwqDm() {
        return fwqDm;
    }

    public void setFwqDm(String fwqDm) {
        this.fwqDm = fwqDm;
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
    @Column(name = "szlx_zxzh", nullable = true, length = 45)
    public String getSzlxZxzh() {
        return szlxZxzh;
    }

    public void setSzlxZxzh(String szlxZxzh) {
        this.szlxZxzh = szlxZxzh;
    }

    @Basic
    @Column(name = "fwwz", nullable = true, length = 45)
    public String getFwwz() {
        return fwwz;
    }

    public void setFwwz(String fwwz) {
        this.fwwz = fwwz;
    }

    @Basic
    @Column(name = "gljydw", nullable = true, length = 45)
    public String getGljydw() {
        return gljydw;
    }

    public void setGljydw(String gljydw) {
        this.gljydw = gljydw;
    }

    @Basic
    @Column(name = "fwnr", nullable = true, length = 45)
    public String getFwnr() {
        return fwnr;
    }

    public void setFwnr(String fwnr) {
        this.fwnr = fwnr;
    }

    @Basic
    @Column(name = "fwqmj", nullable = true, precision = 0)
    public Double getFwqmj() {
        return fwqmj;
    }

    public void setFwqmj(Double fwqmj) {
        this.fwqmj = fwqmj;
    }

    @Basic
    @Column(name = "service_zonecol", nullable = true, length = 45)
    public String getServiceZonecol() {
        return serviceZonecol;
    }

    public void setServiceZonecol(String serviceZonecol) {
        this.serviceZonecol = serviceZonecol;
    }

    @Basic
    @Column(name = "bznl_tcwsl", nullable = true, precision = 0)
    public Double getBznlTcwsl() {
        return bznlTcwsl;
    }

    public void setBznlTcwsl(Double bznlTcwsl) {
        this.bznlTcwsl = bznlTcwsl;
    }

    @Basic
    @Column(name = "bznl_ycysgyrs", nullable = true, precision = 0)
    public Double getBznlYcysgyrs() {
        return bznlYcysgyrs;
    }

    public void setBznlYcysgyrs(Double bznlYcysgyrs) {
        this.bznlYcysgyrs = bznlYcysgyrs;
    }

    @Basic
    @Column(name = "bznl_wxnl", nullable = true, length = 45)
    public String getBznlWxnl() {
        return bznlWxnl;
    }

    public void setBznlWxnl(String bznlWxnl) {
        this.bznlWxnl = bznlWxnl;
    }

    @Basic
    @Column(name = "cygzrl_qy", nullable = true, precision = 0)
    public Double getCygzrlQy() {
        return cygzrlQy;
    }

    public void setCygzrlQy(Double cygzrlQy) {
        this.cygzrlQy = cygzrlQy;
    }

    @Basic
    @Column(name = "cygzrl_cy", nullable = true, precision = 0)
    public Double getCygzrlCy() {
        return cygzrlCy;
    }

    public void setCygzrlCy(Double cygzrlCy) {
        this.cygzrlCy = cygzrlCy;
    }

    @Basic
    @Column(name = "jyjs", nullable = true, precision = 0)
    public Double getJyjs() {
        return jyjs;
    }

    public void setJyjs(Double jyjs) {
        this.jyjs = jyjs;
    }

    @Basic
    @Column(name = "dlwz_xzqmc", nullable = true, length = 45)
    public String getDlwzXzqmc() {
        return dlwzXzqmc;
    }

    public void setDlwzXzqmc(String dlwzXzqmc) {
        this.dlwzXzqmc = dlwzXzqmc;
    }

    @Basic
    @Column(name = "dlwz_xzqdm", nullable = true, length = 45)
    public String getDlwzXzqdm() {
        return dlwzXzqdm;
    }

    public void setDlwzXzqdm(String dlwzXzqdm) {
        this.dlwzXzqdm = dlwzXzqdm;
    }

    @Basic
    @Column(name = "dlwz_jd", nullable = true, precision = 0)
    public Double getDlwzJd() {
        return dlwzJd;
    }

    public void setDlwzJd(Double dlwzJd) {
        this.dlwzJd = dlwzJd;
    }

    @Basic
    @Column(name = "dlwz_wd", nullable = true, precision = 0)
    public Double getDlwzWd() {
        return dlwzWd;
    }

    public void setDlwzWd(Double dlwzWd) {
        this.dlwzWd = dlwzWd;
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

        ServiceZoneEntity that = (ServiceZoneEntity) o;

        if (id != that.id) return false;
        if (sjmc != null ? !sjmc.equals(that.sjmc) : that.sjmc != null) return false;
        if (fwqMc != null ? !fwqMc.equals(that.fwqMc) : that.fwqMc != null) return false;
        if (fwqDm != null ? !fwqDm.equals(that.fwqDm) : that.fwqDm != null) return false;
        if (szlxLxbh != null ? !szlxLxbh.equals(that.szlxLxbh) : that.szlxLxbh != null) return false;
        if (szlxLxmc != null ? !szlxLxmc.equals(that.szlxLxmc) : that.szlxLxmc != null) return false;
        if (szlxZxzh != null ? !szlxZxzh.equals(that.szlxZxzh) : that.szlxZxzh != null) return false;
        if (fwwz != null ? !fwwz.equals(that.fwwz) : that.fwwz != null) return false;
        if (gljydw != null ? !gljydw.equals(that.gljydw) : that.gljydw != null) return false;
        if (fwnr != null ? !fwnr.equals(that.fwnr) : that.fwnr != null) return false;
        if (fwqmj != null ? !fwqmj.equals(that.fwqmj) : that.fwqmj != null) return false;
        if (serviceZonecol != null ? !serviceZonecol.equals(that.serviceZonecol) : that.serviceZonecol != null)
            return false;
        if (bznlTcwsl != null ? !bznlTcwsl.equals(that.bznlTcwsl) : that.bznlTcwsl != null) return false;
        if (bznlYcysgyrs != null ? !bznlYcysgyrs.equals(that.bznlYcysgyrs) : that.bznlYcysgyrs != null) return false;
        if (bznlWxnl != null ? !bznlWxnl.equals(that.bznlWxnl) : that.bznlWxnl != null) return false;
        if (cygzrlQy != null ? !cygzrlQy.equals(that.cygzrlQy) : that.cygzrlQy != null) return false;
        if (cygzrlCy != null ? !cygzrlCy.equals(that.cygzrlCy) : that.cygzrlCy != null) return false;
        if (jyjs != null ? !jyjs.equals(that.jyjs) : that.jyjs != null) return false;
        if (dlwzXzqmc != null ? !dlwzXzqmc.equals(that.dlwzXzqmc) : that.dlwzXzqmc != null) return false;
        if (dlwzXzqdm != null ? !dlwzXzqdm.equals(that.dlwzXzqdm) : that.dlwzXzqdm != null) return false;
        if (dlwzJd != null ? !dlwzJd.equals(that.dlwzJd) : that.dlwzJd != null) return false;
        if (dlwzWd != null ? !dlwzWd.equals(that.dlwzWd) : that.dlwzWd != null) return false;
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
        result = 31 * result + (fwqMc != null ? fwqMc.hashCode() : 0);
        result = 31 * result + (fwqDm != null ? fwqDm.hashCode() : 0);
        result = 31 * result + (szlxLxbh != null ? szlxLxbh.hashCode() : 0);
        result = 31 * result + (szlxLxmc != null ? szlxLxmc.hashCode() : 0);
        result = 31 * result + (szlxZxzh != null ? szlxZxzh.hashCode() : 0);
        result = 31 * result + (fwwz != null ? fwwz.hashCode() : 0);
        result = 31 * result + (gljydw != null ? gljydw.hashCode() : 0);
        result = 31 * result + (fwnr != null ? fwnr.hashCode() : 0);
        result = 31 * result + (fwqmj != null ? fwqmj.hashCode() : 0);
        result = 31 * result + (serviceZonecol != null ? serviceZonecol.hashCode() : 0);
        result = 31 * result + (bznlTcwsl != null ? bznlTcwsl.hashCode() : 0);
        result = 31 * result + (bznlYcysgyrs != null ? bznlYcysgyrs.hashCode() : 0);
        result = 31 * result + (bznlWxnl != null ? bznlWxnl.hashCode() : 0);
        result = 31 * result + (cygzrlQy != null ? cygzrlQy.hashCode() : 0);
        result = 31 * result + (cygzrlCy != null ? cygzrlCy.hashCode() : 0);
        result = 31 * result + (jyjs != null ? jyjs.hashCode() : 0);
        result = 31 * result + (dlwzXzqmc != null ? dlwzXzqmc.hashCode() : 0);
        result = 31 * result + (dlwzXzqdm != null ? dlwzXzqdm.hashCode() : 0);
        result = 31 * result + (dlwzJd != null ? dlwzJd.hashCode() : 0);
        result = 31 * result + (dlwzWd != null ? dlwzWd.hashCode() : 0);
        result = 31 * result + (tbxxTbdwmc != null ? tbxxTbdwmc.hashCode() : 0);
        result = 31 * result + (tbxxTbdwdm != null ? tbxxTbdwdm.hashCode() : 0);
        result = 31 * result + (tbxxTbnd != null ? tbxxTbnd.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        result = 31 * result + (nbbz != null ? nbbz.hashCode() : 0);
        return result;
    }
}

package com.claymore.fire.gas.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/12/3 8:22 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "gas")
public class GasEntity {
    private int id;
    private String jgdm;
    private String qymc;
    private String jyzlb;
    private String lsgx;
    private String xxdz;
    private Double jd;
    private Double wd;
    private String lxdh;
    private Double ygzrlZrl;
    private Double ygzrlQy;
    private Double ygzrlCy;
    private Double njylZrl;
    private Double njylQy;
    private Double njylCy;
    private Double jyjZl;
    private Double jyjQy;
    private Double jyjCy;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "jgdm", nullable = true, length = 45)
    public String getJgdm() {
        return jgdm;
    }

    public void setJgdm(String jgdm) {
        this.jgdm = jgdm;
    }

    @Basic
    @Column(name = "qymc", nullable = true, length = 45)
    public String getQymc() {
        return qymc;
    }

    public void setQymc(String qymc) {
        this.qymc = qymc;
    }

    @Basic
    @Column(name = "jyzlb", nullable = true, length = 45)
    public String getJyzlb() {
        return jyzlb;
    }

    public void setJyzlb(String jyzlb) {
        this.jyzlb = jyzlb;
    }

    @Basic
    @Column(name = "lsgx", nullable = true, length = 45)
    public String getLsgx() {
        return lsgx;
    }

    public void setLsgx(String lsgx) {
        this.lsgx = lsgx;
    }

    @Basic
    @Column(name = "xxdz", nullable = true, length = 45)
    public String getXxdz() {
        return xxdz;
    }

    public void setXxdz(String xxdz) {
        this.xxdz = xxdz;
    }

    @Basic
    @Column(name = "jd", nullable = true, precision = 0)
    public Double getJd() {
        return jd;
    }

    public void setJd(Double jd) {
        this.jd = jd;
    }

    @Basic
    @Column(name = "wd", nullable = true, precision = 0)
    public Double getWd() {
        return wd;
    }

    public void setWd(Double wd) {
        this.wd = wd;
    }

    @Basic
    @Column(name = "lxdh", nullable = true, length = 45)
    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    @Basic
    @Column(name = "ygzrl_zrl", nullable = true, precision = 0)
    public Double getYgzrlZrl() {
        return ygzrlZrl;
    }

    public void setYgzrlZrl(Double ygzrlZrl) {
        this.ygzrlZrl = ygzrlZrl;
    }

    @Basic
    @Column(name = "ygzrl_qy", nullable = true, precision = 0)
    public Double getYgzrlQy() {
        return ygzrlQy;
    }

    public void setYgzrlQy(Double ygzrlQy) {
        this.ygzrlQy = ygzrlQy;
    }

    @Basic
    @Column(name = "ygzrl_cy", nullable = true, precision = 0)
    public Double getYgzrlCy() {
        return ygzrlCy;
    }

    public void setYgzrlCy(Double ygzrlCy) {
        this.ygzrlCy = ygzrlCy;
    }

    @Basic
    @Column(name = "njyl_zrl", nullable = true, precision = 0)
    public Double getNjylZrl() {
        return njylZrl;
    }

    public void setNjylZrl(Double njylZrl) {
        this.njylZrl = njylZrl;
    }

    @Basic
    @Column(name = "njyl_qy", nullable = true, precision = 0)
    public Double getNjylQy() {
        return njylQy;
    }

    public void setNjylQy(Double njylQy) {
        this.njylQy = njylQy;
    }

    @Basic
    @Column(name = "njyl_cy", nullable = true, precision = 0)
    public Double getNjylCy() {
        return njylCy;
    }

    public void setNjylCy(Double njylCy) {
        this.njylCy = njylCy;
    }

    @Basic
    @Column(name = "jyj_zl", nullable = true, precision = 0)
    public Double getJyjZl() {
        return jyjZl;
    }

    public void setJyjZl(Double jyjZl) {
        this.jyjZl = jyjZl;
    }

    @Basic
    @Column(name = "jyj_qy", nullable = true, precision = 0)
    public Double getJyjQy() {
        return jyjQy;
    }

    public void setJyjQy(Double jyjQy) {
        this.jyjQy = jyjQy;
    }

    @Basic
    @Column(name = "jyj_cy", nullable = true, precision = 0)
    public Double getJyjCy() {
        return jyjCy;
    }

    public void setJyjCy(Double jyjCy) {
        this.jyjCy = jyjCy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GasEntity gasEntity = (GasEntity) o;

        if (id != gasEntity.id) return false;
        if (jgdm != null ? !jgdm.equals(gasEntity.jgdm) : gasEntity.jgdm != null) return false;
        if (qymc != null ? !qymc.equals(gasEntity.qymc) : gasEntity.qymc != null) return false;
        if (jyzlb != null ? !jyzlb.equals(gasEntity.jyzlb) : gasEntity.jyzlb != null) return false;
        if (lsgx != null ? !lsgx.equals(gasEntity.lsgx) : gasEntity.lsgx != null) return false;
        if (xxdz != null ? !xxdz.equals(gasEntity.xxdz) : gasEntity.xxdz != null) return false;
        if (jd != null ? !jd.equals(gasEntity.jd) : gasEntity.jd != null) return false;
        if (wd != null ? !wd.equals(gasEntity.wd) : gasEntity.wd != null) return false;
        if (lxdh != null ? !lxdh.equals(gasEntity.lxdh) : gasEntity.lxdh != null) return false;
        if (ygzrlZrl != null ? !ygzrlZrl.equals(gasEntity.ygzrlZrl) : gasEntity.ygzrlZrl != null) return false;
        if (ygzrlQy != null ? !ygzrlQy.equals(gasEntity.ygzrlQy) : gasEntity.ygzrlQy != null) return false;
        if (ygzrlCy != null ? !ygzrlCy.equals(gasEntity.ygzrlCy) : gasEntity.ygzrlCy != null) return false;
        if (njylZrl != null ? !njylZrl.equals(gasEntity.njylZrl) : gasEntity.njylZrl != null) return false;
        if (njylQy != null ? !njylQy.equals(gasEntity.njylQy) : gasEntity.njylQy != null) return false;
        if (njylCy != null ? !njylCy.equals(gasEntity.njylCy) : gasEntity.njylCy != null) return false;
        if (jyjZl != null ? !jyjZl.equals(gasEntity.jyjZl) : gasEntity.jyjZl != null) return false;
        if (jyjQy != null ? !jyjQy.equals(gasEntity.jyjQy) : gasEntity.jyjQy != null) return false;
        if (jyjCy != null ? !jyjCy.equals(gasEntity.jyjCy) : gasEntity.jyjCy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (jgdm != null ? jgdm.hashCode() : 0);
        result = 31 * result + (qymc != null ? qymc.hashCode() : 0);
        result = 31 * result + (jyzlb != null ? jyzlb.hashCode() : 0);
        result = 31 * result + (lsgx != null ? lsgx.hashCode() : 0);
        result = 31 * result + (xxdz != null ? xxdz.hashCode() : 0);
        result = 31 * result + (jd != null ? jd.hashCode() : 0);
        result = 31 * result + (wd != null ? wd.hashCode() : 0);
        result = 31 * result + (lxdh != null ? lxdh.hashCode() : 0);
        result = 31 * result + (ygzrlZrl != null ? ygzrlZrl.hashCode() : 0);
        result = 31 * result + (ygzrlQy != null ? ygzrlQy.hashCode() : 0);
        result = 31 * result + (ygzrlCy != null ? ygzrlCy.hashCode() : 0);
        result = 31 * result + (njylZrl != null ? njylZrl.hashCode() : 0);
        result = 31 * result + (njylQy != null ? njylQy.hashCode() : 0);
        result = 31 * result + (njylCy != null ? njylCy.hashCode() : 0);
        result = 31 * result + (jyjZl != null ? jyjZl.hashCode() : 0);
        result = 31 * result + (jyjQy != null ? jyjQy.hashCode() : 0);
        result = 31 * result + (jyjCy != null ? jyjCy.hashCode() : 0);
        return result;
    }
}

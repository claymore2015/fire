package com.claymore.fire.tunnel.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/12/3 8:22 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "tunnel")
public class TunnelEntity {
    private int id;
    private String sjmc;
    private String sdmc;
    private String sddm;
    private String lxbh;
    private String lxmc;
    private String sdzxzh;
    private Double sdcd;
    private Double sdjk;
    private Double sdjg;
    private String sdcdflDm;
    private String sdcdflFl;
    private String sfxsd;
    private String jsqkXjnd;
    private String jsqkJctcsj;
    private String gydwmc;
    private String jszkpdPddj;
    private String jszkpdPdrq;
    private String wzxxXzqmc;
    private Double wzxxJd;
    private Double wzxxWd;
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
    @Column(name = "sdmc", nullable = true, length = 45)
    public String getSdmc() {
        return sdmc;
    }

    public void setSdmc(String sdmc) {
        this.sdmc = sdmc;
    }

    @Basic
    @Column(name = "sddm", nullable = true, length = 45)
    public String getSddm() {
        return sddm;
    }

    public void setSddm(String sddm) {
        this.sddm = sddm;
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
    @Column(name = "lxmc", nullable = true, length = 45)
    public String getLxmc() {
        return lxmc;
    }

    public void setLxmc(String lxmc) {
        this.lxmc = lxmc;
    }

    @Basic
    @Column(name = "sdzxzh", nullable = true, length = 45)
    public String getSdzxzh() {
        return sdzxzh;
    }

    public void setSdzxzh(String sdzxzh) {
        this.sdzxzh = sdzxzh;
    }

    @Basic
    @Column(name = "sdcd", nullable = true, precision = 0)
    public Double getSdcd() {
        return sdcd;
    }

    public void setSdcd(Double sdcd) {
        this.sdcd = sdcd;
    }

    @Basic
    @Column(name = "sdjk", nullable = true, precision = 0)
    public Double getSdjk() {
        return sdjk;
    }

    public void setSdjk(Double sdjk) {
        this.sdjk = sdjk;
    }

    @Basic
    @Column(name = "sdjg", nullable = true, precision = 0)
    public Double getSdjg() {
        return sdjg;
    }

    public void setSdjg(Double sdjg) {
        this.sdjg = sdjg;
    }

    @Basic
    @Column(name = "sdcdfl_dm", nullable = true, length = 45)
    public String getSdcdflDm() {
        return sdcdflDm;
    }

    public void setSdcdflDm(String sdcdflDm) {
        this.sdcdflDm = sdcdflDm;
    }

    @Basic
    @Column(name = "sdcdfl_fl", nullable = true, length = 45)
    public String getSdcdflFl() {
        return sdcdflFl;
    }

    public void setSdcdflFl(String sdcdflFl) {
        this.sdcdflFl = sdcdflFl;
    }

    @Basic
    @Column(name = "sfxsd", nullable = true, length = 45)
    public String getSfxsd() {
        return sfxsd;
    }

    public void setSfxsd(String sfxsd) {
        this.sfxsd = sfxsd;
    }

    @Basic
    @Column(name = "jsqk_xjnd", nullable = true, length = 45)
    public String getJsqkXjnd() {
        return jsqkXjnd;
    }

    public void setJsqkXjnd(String jsqkXjnd) {
        this.jsqkXjnd = jsqkXjnd;
    }

    @Basic
    @Column(name = "jsqk_jctcsj", nullable = true, length = 45)
    public String getJsqkJctcsj() {
        return jsqkJctcsj;
    }

    public void setJsqkJctcsj(String jsqkJctcsj) {
        this.jsqkJctcsj = jsqkJctcsj;
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
    @Column(name = "jszkpd_pddj", nullable = true, length = 45)
    public String getJszkpdPddj() {
        return jszkpdPddj;
    }

    public void setJszkpdPddj(String jszkpdPddj) {
        this.jszkpdPddj = jszkpdPddj;
    }

    @Basic
    @Column(name = "jszkpd_pdrq", nullable = true, length = 45)
    public String getJszkpdPdrq() {
        return jszkpdPdrq;
    }

    public void setJszkpdPdrq(String jszkpdPdrq) {
        this.jszkpdPdrq = jszkpdPdrq;
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

        TunnelEntity that = (TunnelEntity) o;

        if (id != that.id) return false;
        if (sjmc != null ? !sjmc.equals(that.sjmc) : that.sjmc != null) return false;
        if (sdmc != null ? !sdmc.equals(that.sdmc) : that.sdmc != null) return false;
        if (sddm != null ? !sddm.equals(that.sddm) : that.sddm != null) return false;
        if (lxbh != null ? !lxbh.equals(that.lxbh) : that.lxbh != null) return false;
        if (lxmc != null ? !lxmc.equals(that.lxmc) : that.lxmc != null) return false;
        if (sdzxzh != null ? !sdzxzh.equals(that.sdzxzh) : that.sdzxzh != null) return false;
        if (sdcd != null ? !sdcd.equals(that.sdcd) : that.sdcd != null) return false;
        if (sdjk != null ? !sdjk.equals(that.sdjk) : that.sdjk != null) return false;
        if (sdjg != null ? !sdjg.equals(that.sdjg) : that.sdjg != null) return false;
        if (sdcdflDm != null ? !sdcdflDm.equals(that.sdcdflDm) : that.sdcdflDm != null) return false;
        if (sdcdflFl != null ? !sdcdflFl.equals(that.sdcdflFl) : that.sdcdflFl != null) return false;
        if (sfxsd != null ? !sfxsd.equals(that.sfxsd) : that.sfxsd != null) return false;
        if (jsqkXjnd != null ? !jsqkXjnd.equals(that.jsqkXjnd) : that.jsqkXjnd != null) return false;
        if (jsqkJctcsj != null ? !jsqkJctcsj.equals(that.jsqkJctcsj) : that.jsqkJctcsj != null) return false;
        if (gydwmc != null ? !gydwmc.equals(that.gydwmc) : that.gydwmc != null) return false;
        if (jszkpdPddj != null ? !jszkpdPddj.equals(that.jszkpdPddj) : that.jszkpdPddj != null) return false;
        if (jszkpdPdrq != null ? !jszkpdPdrq.equals(that.jszkpdPdrq) : that.jszkpdPdrq != null) return false;
        if (wzxxXzqmc != null ? !wzxxXzqmc.equals(that.wzxxXzqmc) : that.wzxxXzqmc != null) return false;
        if (wzxxJd != null ? !wzxxJd.equals(that.wzxxJd) : that.wzxxJd != null) return false;
        if (wzxxWd != null ? !wzxxWd.equals(that.wzxxWd) : that.wzxxWd != null) return false;
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
        result = 31 * result + (sdmc != null ? sdmc.hashCode() : 0);
        result = 31 * result + (sddm != null ? sddm.hashCode() : 0);
        result = 31 * result + (lxbh != null ? lxbh.hashCode() : 0);
        result = 31 * result + (lxmc != null ? lxmc.hashCode() : 0);
        result = 31 * result + (sdzxzh != null ? sdzxzh.hashCode() : 0);
        result = 31 * result + (sdcd != null ? sdcd.hashCode() : 0);
        result = 31 * result + (sdjk != null ? sdjk.hashCode() : 0);
        result = 31 * result + (sdjg != null ? sdjg.hashCode() : 0);
        result = 31 * result + (sdcdflDm != null ? sdcdflDm.hashCode() : 0);
        result = 31 * result + (sdcdflFl != null ? sdcdflFl.hashCode() : 0);
        result = 31 * result + (sfxsd != null ? sfxsd.hashCode() : 0);
        result = 31 * result + (jsqkXjnd != null ? jsqkXjnd.hashCode() : 0);
        result = 31 * result + (jsqkJctcsj != null ? jsqkJctcsj.hashCode() : 0);
        result = 31 * result + (gydwmc != null ? gydwmc.hashCode() : 0);
        result = 31 * result + (jszkpdPddj != null ? jszkpdPddj.hashCode() : 0);
        result = 31 * result + (jszkpdPdrq != null ? jszkpdPdrq.hashCode() : 0);
        result = 31 * result + (wzxxXzqmc != null ? wzxxXzqmc.hashCode() : 0);
        result = 31 * result + (wzxxJd != null ? wzxxJd.hashCode() : 0);
        result = 31 * result + (wzxxWd != null ? wzxxWd.hashCode() : 0);
        result = 31 * result + (tbxxTbdwmc != null ? tbxxTbdwmc.hashCode() : 0);
        result = 31 * result + (tbxxTbdwdm != null ? tbxxTbdwdm.hashCode() : 0);
        result = 31 * result + (tbxxTbnd != null ? tbxxTbnd.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        result = 31 * result + (nbbz != null ? nbbz.hashCode() : 0);
        return result;
    }
}

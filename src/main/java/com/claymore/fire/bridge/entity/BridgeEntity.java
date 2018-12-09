package com.claymore.fire.bridge.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/12/3 8:22 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "bridge")
public class BridgeEntity {
    private int id;
    private String sjmc;
    private String qlmc;
    private String qldm;
    private String qlzxzh;
    private String sslxLxbh;
    private String sslxLxmc;
    private String sslxJsdj;
    private Double qcQlqc;
    private Double qcKjzc;
    private Double qcDkzdkj;
    private String qcKjzh;
    private Double qkQmjk;
    private String qkQlqk;
    private String qlflKjflDm;
    private String qlflKjflLx;
    private String qlflSynxDm;
    private String qlflSynxLx;
    private String zqsbjgxsJglxDm;
    private String zqsbjgxsJglxLx;
    private String zqsbjgxsClDm;
    private String zqsbjgxsClMc;
    private String qdlxDm;
    private String qdlxLx;
    private String sjhzdjDm;
    private String sjhzdjDj;
    private String kydwDm;
    private String kydwLx;
    private String kydwMc;
    private String gydwmc;
    private String jszkpdPddjDm;
    private String jszkpdPddjDj;
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
    @Column(name = "qlmc", nullable = true, length = 45)
    public String getQlmc() {
        return qlmc;
    }

    public void setQlmc(String qlmc) {
        this.qlmc = qlmc;
    }

    @Basic
    @Column(name = "qldm", nullable = true, length = 45)
    public String getQldm() {
        return qldm;
    }

    public void setQldm(String qldm) {
        this.qldm = qldm;
    }

    @Basic
    @Column(name = "qlzxzh", nullable = true, length = 45)
    public String getQlzxzh() {
        return qlzxzh;
    }

    public void setQlzxzh(String qlzxzh) {
        this.qlzxzh = qlzxzh;
    }

    @Basic
    @Column(name = "sslx_lxbh", nullable = true, length = 45)
    public String getSslxLxbh() {
        return sslxLxbh;
    }

    public void setSslxLxbh(String sslxLxbh) {
        this.sslxLxbh = sslxLxbh;
    }

    @Basic
    @Column(name = "sslx_lxmc", nullable = true, length = 45)
    public String getSslxLxmc() {
        return sslxLxmc;
    }

    public void setSslxLxmc(String sslxLxmc) {
        this.sslxLxmc = sslxLxmc;
    }

    @Basic
    @Column(name = "sslx_jsdj", nullable = true, length = 45)
    public String getSslxJsdj() {
        return sslxJsdj;
    }

    public void setSslxJsdj(String sslxJsdj) {
        this.sslxJsdj = sslxJsdj;
    }

    @Basic
    @Column(name = "qc_qlqc", nullable = true, precision = 0)
    public Double getQcQlqc() {
        return qcQlqc;
    }

    public void setQcQlqc(Double qcQlqc) {
        this.qcQlqc = qcQlqc;
    }

    @Basic
    @Column(name = "qc_kjzc", nullable = true, precision = 0)
    public Double getQcKjzc() {
        return qcKjzc;
    }

    public void setQcKjzc(Double qcKjzc) {
        this.qcKjzc = qcKjzc;
    }

    @Basic
    @Column(name = "qc_dkzdkj", nullable = true, precision = 0)
    public Double getQcDkzdkj() {
        return qcDkzdkj;
    }

    public void setQcDkzdkj(Double qcDkzdkj) {
        this.qcDkzdkj = qcDkzdkj;
    }

    @Basic
    @Column(name = "qc_kjzh", nullable = true, length = 45)
    public String getQcKjzh() {
        return qcKjzh;
    }

    public void setQcKjzh(String qcKjzh) {
        this.qcKjzh = qcKjzh;
    }

    @Basic
    @Column(name = "qk_qmjk", nullable = true, precision = 0)
    public Double getQkQmjk() {
        return qkQmjk;
    }

    public void setQkQmjk(Double qkQmjk) {
        this.qkQmjk = qkQmjk;
    }

    @Basic
    @Column(name = "qk_qlqk", nullable = true, length = 45)
    public String getQkQlqk() {
        return qkQlqk;
    }

    public void setQkQlqk(String qkQlqk) {
        this.qkQlqk = qkQlqk;
    }

    @Basic
    @Column(name = "qlfl_kjfl_dm", nullable = true, length = 45)
    public String getQlflKjflDm() {
        return qlflKjflDm;
    }

    public void setQlflKjflDm(String qlflKjflDm) {
        this.qlflKjflDm = qlflKjflDm;
    }

    @Basic
    @Column(name = "qlfl_kjfl_lx", nullable = true, length = 45)
    public String getQlflKjflLx() {
        return qlflKjflLx;
    }

    public void setQlflKjflLx(String qlflKjflLx) {
        this.qlflKjflLx = qlflKjflLx;
    }

    @Basic
    @Column(name = "qlfl_synx_dm", nullable = true, length = 45)
    public String getQlflSynxDm() {
        return qlflSynxDm;
    }

    public void setQlflSynxDm(String qlflSynxDm) {
        this.qlflSynxDm = qlflSynxDm;
    }

    @Basic
    @Column(name = "qlfl_synx_lx", nullable = true, length = 45)
    public String getQlflSynxLx() {
        return qlflSynxLx;
    }

    public void setQlflSynxLx(String qlflSynxLx) {
        this.qlflSynxLx = qlflSynxLx;
    }

    @Basic
    @Column(name = "zqsbjgxs_jglx_dm", nullable = true, length = 45)
    public String getZqsbjgxsJglxDm() {
        return zqsbjgxsJglxDm;
    }

    public void setZqsbjgxsJglxDm(String zqsbjgxsJglxDm) {
        this.zqsbjgxsJglxDm = zqsbjgxsJglxDm;
    }

    @Basic
    @Column(name = "zqsbjgxs_jglx_lx", nullable = true, length = 45)
    public String getZqsbjgxsJglxLx() {
        return zqsbjgxsJglxLx;
    }

    public void setZqsbjgxsJglxLx(String zqsbjgxsJglxLx) {
        this.zqsbjgxsJglxLx = zqsbjgxsJglxLx;
    }

    @Basic
    @Column(name = "zqsbjgxs_cl_dm", nullable = true, length = 45)
    public String getZqsbjgxsClDm() {
        return zqsbjgxsClDm;
    }

    public void setZqsbjgxsClDm(String zqsbjgxsClDm) {
        this.zqsbjgxsClDm = zqsbjgxsClDm;
    }

    @Basic
    @Column(name = "zqsbjgxs_cl_mc", nullable = true, length = 45)
    public String getZqsbjgxsClMc() {
        return zqsbjgxsClMc;
    }

    public void setZqsbjgxsClMc(String zqsbjgxsClMc) {
        this.zqsbjgxsClMc = zqsbjgxsClMc;
    }

    @Basic
    @Column(name = "qdlx_dm", nullable = true, length = 45)
    public String getQdlxDm() {
        return qdlxDm;
    }

    public void setQdlxDm(String qdlxDm) {
        this.qdlxDm = qdlxDm;
    }

    @Basic
    @Column(name = "qdlx_lx", nullable = true, length = 45)
    public String getQdlxLx() {
        return qdlxLx;
    }

    public void setQdlxLx(String qdlxLx) {
        this.qdlxLx = qdlxLx;
    }

    @Basic
    @Column(name = "sjhzdj_dm", nullable = true, length = 45)
    public String getSjhzdjDm() {
        return sjhzdjDm;
    }

    public void setSjhzdjDm(String sjhzdjDm) {
        this.sjhzdjDm = sjhzdjDm;
    }

    @Basic
    @Column(name = "sjhzdj_dj", nullable = true, length = 45)
    public String getSjhzdjDj() {
        return sjhzdjDj;
    }

    public void setSjhzdjDj(String sjhzdjDj) {
        this.sjhzdjDj = sjhzdjDj;
    }

    @Basic
    @Column(name = "kydw_dm", nullable = true, length = 45)
    public String getKydwDm() {
        return kydwDm;
    }

    public void setKydwDm(String kydwDm) {
        this.kydwDm = kydwDm;
    }

    @Basic
    @Column(name = "kydw_lx", nullable = true, length = 45)
    public String getKydwLx() {
        return kydwLx;
    }

    public void setKydwLx(String kydwLx) {
        this.kydwLx = kydwLx;
    }

    @Basic
    @Column(name = "kydw_mc", nullable = true, length = 45)
    public String getKydwMc() {
        return kydwMc;
    }

    public void setKydwMc(String kydwMc) {
        this.kydwMc = kydwMc;
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
    @Column(name = "jszkpd_pddj_dm", nullable = true, length = 45)
    public String getJszkpdPddjDm() {
        return jszkpdPddjDm;
    }

    public void setJszkpdPddjDm(String jszkpdPddjDm) {
        this.jszkpdPddjDm = jszkpdPddjDm;
    }

    @Basic
    @Column(name = "jszkpd_pddj_dj", nullable = true, length = 45)
    public String getJszkpdPddjDj() {
        return jszkpdPddjDj;
    }

    public void setJszkpdPddjDj(String jszkpdPddjDj) {
        this.jszkpdPddjDj = jszkpdPddjDj;
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

        BridgeEntity that = (BridgeEntity) o;

        if (id != that.id) return false;
        if (sjmc != null ? !sjmc.equals(that.sjmc) : that.sjmc != null) return false;
        if (qlmc != null ? !qlmc.equals(that.qlmc) : that.qlmc != null) return false;
        if (qldm != null ? !qldm.equals(that.qldm) : that.qldm != null) return false;
        if (qlzxzh != null ? !qlzxzh.equals(that.qlzxzh) : that.qlzxzh != null) return false;
        if (sslxLxbh != null ? !sslxLxbh.equals(that.sslxLxbh) : that.sslxLxbh != null) return false;
        if (sslxLxmc != null ? !sslxLxmc.equals(that.sslxLxmc) : that.sslxLxmc != null) return false;
        if (sslxJsdj != null ? !sslxJsdj.equals(that.sslxJsdj) : that.sslxJsdj != null) return false;
        if (qcQlqc != null ? !qcQlqc.equals(that.qcQlqc) : that.qcQlqc != null) return false;
        if (qcKjzc != null ? !qcKjzc.equals(that.qcKjzc) : that.qcKjzc != null) return false;
        if (qcDkzdkj != null ? !qcDkzdkj.equals(that.qcDkzdkj) : that.qcDkzdkj != null) return false;
        if (qcKjzh != null ? !qcKjzh.equals(that.qcKjzh) : that.qcKjzh != null) return false;
        if (qkQmjk != null ? !qkQmjk.equals(that.qkQmjk) : that.qkQmjk != null) return false;
        if (qkQlqk != null ? !qkQlqk.equals(that.qkQlqk) : that.qkQlqk != null) return false;
        if (qlflKjflDm != null ? !qlflKjflDm.equals(that.qlflKjflDm) : that.qlflKjflDm != null) return false;
        if (qlflKjflLx != null ? !qlflKjflLx.equals(that.qlflKjflLx) : that.qlflKjflLx != null) return false;
        if (qlflSynxDm != null ? !qlflSynxDm.equals(that.qlflSynxDm) : that.qlflSynxDm != null) return false;
        if (qlflSynxLx != null ? !qlflSynxLx.equals(that.qlflSynxLx) : that.qlflSynxLx != null) return false;
        if (zqsbjgxsJglxDm != null ? !zqsbjgxsJglxDm.equals(that.zqsbjgxsJglxDm) : that.zqsbjgxsJglxDm != null)
            return false;
        if (zqsbjgxsJglxLx != null ? !zqsbjgxsJglxLx.equals(that.zqsbjgxsJglxLx) : that.zqsbjgxsJglxLx != null)
            return false;
        if (zqsbjgxsClDm != null ? !zqsbjgxsClDm.equals(that.zqsbjgxsClDm) : that.zqsbjgxsClDm != null) return false;
        if (zqsbjgxsClMc != null ? !zqsbjgxsClMc.equals(that.zqsbjgxsClMc) : that.zqsbjgxsClMc != null) return false;
        if (qdlxDm != null ? !qdlxDm.equals(that.qdlxDm) : that.qdlxDm != null) return false;
        if (qdlxLx != null ? !qdlxLx.equals(that.qdlxLx) : that.qdlxLx != null) return false;
        if (sjhzdjDm != null ? !sjhzdjDm.equals(that.sjhzdjDm) : that.sjhzdjDm != null) return false;
        if (sjhzdjDj != null ? !sjhzdjDj.equals(that.sjhzdjDj) : that.sjhzdjDj != null) return false;
        if (kydwDm != null ? !kydwDm.equals(that.kydwDm) : that.kydwDm != null) return false;
        if (kydwLx != null ? !kydwLx.equals(that.kydwLx) : that.kydwLx != null) return false;
        if (kydwMc != null ? !kydwMc.equals(that.kydwMc) : that.kydwMc != null) return false;
        if (gydwmc != null ? !gydwmc.equals(that.gydwmc) : that.gydwmc != null) return false;
        if (jszkpdPddjDm != null ? !jszkpdPddjDm.equals(that.jszkpdPddjDm) : that.jszkpdPddjDm != null) return false;
        if (jszkpdPddjDj != null ? !jszkpdPddjDj.equals(that.jszkpdPddjDj) : that.jszkpdPddjDj != null) return false;
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
        result = 31 * result + (qlmc != null ? qlmc.hashCode() : 0);
        result = 31 * result + (qldm != null ? qldm.hashCode() : 0);
        result = 31 * result + (qlzxzh != null ? qlzxzh.hashCode() : 0);
        result = 31 * result + (sslxLxbh != null ? sslxLxbh.hashCode() : 0);
        result = 31 * result + (sslxLxmc != null ? sslxLxmc.hashCode() : 0);
        result = 31 * result + (sslxJsdj != null ? sslxJsdj.hashCode() : 0);
        result = 31 * result + (qcQlqc != null ? qcQlqc.hashCode() : 0);
        result = 31 * result + (qcKjzc != null ? qcKjzc.hashCode() : 0);
        result = 31 * result + (qcDkzdkj != null ? qcDkzdkj.hashCode() : 0);
        result = 31 * result + (qcKjzh != null ? qcKjzh.hashCode() : 0);
        result = 31 * result + (qkQmjk != null ? qkQmjk.hashCode() : 0);
        result = 31 * result + (qkQlqk != null ? qkQlqk.hashCode() : 0);
        result = 31 * result + (qlflKjflDm != null ? qlflKjflDm.hashCode() : 0);
        result = 31 * result + (qlflKjflLx != null ? qlflKjflLx.hashCode() : 0);
        result = 31 * result + (qlflSynxDm != null ? qlflSynxDm.hashCode() : 0);
        result = 31 * result + (qlflSynxLx != null ? qlflSynxLx.hashCode() : 0);
        result = 31 * result + (zqsbjgxsJglxDm != null ? zqsbjgxsJglxDm.hashCode() : 0);
        result = 31 * result + (zqsbjgxsJglxLx != null ? zqsbjgxsJglxLx.hashCode() : 0);
        result = 31 * result + (zqsbjgxsClDm != null ? zqsbjgxsClDm.hashCode() : 0);
        result = 31 * result + (zqsbjgxsClMc != null ? zqsbjgxsClMc.hashCode() : 0);
        result = 31 * result + (qdlxDm != null ? qdlxDm.hashCode() : 0);
        result = 31 * result + (qdlxLx != null ? qdlxLx.hashCode() : 0);
        result = 31 * result + (sjhzdjDm != null ? sjhzdjDm.hashCode() : 0);
        result = 31 * result + (sjhzdjDj != null ? sjhzdjDj.hashCode() : 0);
        result = 31 * result + (kydwDm != null ? kydwDm.hashCode() : 0);
        result = 31 * result + (kydwLx != null ? kydwLx.hashCode() : 0);
        result = 31 * result + (kydwMc != null ? kydwMc.hashCode() : 0);
        result = 31 * result + (gydwmc != null ? gydwmc.hashCode() : 0);
        result = 31 * result + (jszkpdPddjDm != null ? jszkpdPddjDm.hashCode() : 0);
        result = 31 * result + (jszkpdPddjDj != null ? jszkpdPddjDj.hashCode() : 0);
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

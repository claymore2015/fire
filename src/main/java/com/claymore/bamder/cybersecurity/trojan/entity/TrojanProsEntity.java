package com.claymore.bamder.cybersecurity.trojan.entity;

import javax.persistence.*;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "trojan_pros")
public class TrojanProsEntity {
    private Long trojanid;
    private String name;
    private Byte isSim;
    private Byte damage;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trojanid")
    public Long getTrojanid() {
        return trojanid;
    }

    public void setTrojanid(Long trojanid) {
        this.trojanid = trojanid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "is_sim")
    public Byte getIsSim() {
        return isSim;
    }

    public void setIsSim(Byte isSim) {
        this.isSim = isSim;
    }

    @Basic
    @Column(name = "damage")
    public Byte getDamage() {
        return damage;
    }

    public void setDamage(Byte damage) {
        this.damage = damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrojanProsEntity that = (TrojanProsEntity) o;

        if (trojanid != null ? !trojanid.equals(that.trojanid) : that.trojanid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (isSim != null ? !isSim.equals(that.isSim) : that.isSim != null) return false;
        if (damage != null ? !damage.equals(that.damage) : that.damage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trojanid != null ? trojanid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isSim != null ? isSim.hashCode() : 0);
        result = 31 * result + (damage != null ? damage.hashCode() : 0);
        return result;
    }
}

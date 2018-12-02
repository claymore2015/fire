package com.claymore.bamder.cybersecurity.wgxm.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "alarm_wgxw")
@IdClass(AlarmWgxwEntityPK.class)
public class AlarmWgxwEntity {
    private Date day;
    private String province;
    private String city;
    private String district;
    private String unit;
    private int sourObj;
    private int alarmLevel;
    private Long totalCount;
    private Long trans;
    private Long file;
    private Long efile;
    private Long keyword;
    private Long encrypt;
    private Long zip;
    private Long pic;
    private Long bfile;
    private Long store;
    private Long outline;

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

    @Id
    @Column(name = "Unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Id
    @Column(name = "sour_obj")
    public int getSourObj() {
        return sourObj;
    }

    public void setSourObj(int sourObj) {
        this.sourObj = sourObj;
    }

    @Id
    @Column(name = "alarm_level")
    public int getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(int alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    @Basic
    @Column(name = "total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Basic
    @Column(name = "trans")
    public Long getTrans() {
        return trans;
    }

    public void setTrans(Long trans) {
        this.trans = trans;
    }

    @Basic
    @Column(name = "file")
    public Long getFile() {
        return file;
    }

    public void setFile(Long file) {
        this.file = file;
    }

    @Basic
    @Column(name = "efile")
    public Long getEfile() {
        return efile;
    }

    public void setEfile(Long efile) {
        this.efile = efile;
    }

    @Basic
    @Column(name = "keyword")
    public Long getKeyword() {
        return keyword;
    }

    public void setKeyword(Long keyword) {
        this.keyword = keyword;
    }

    @Basic
    @Column(name = "encrypt")
    public Long getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Long encrypt) {
        this.encrypt = encrypt;
    }

    @Basic
    @Column(name = "zip")
    public Long getZip() {
        return zip;
    }

    public void setZip(Long zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "pic")
    public Long getPic() {
        return pic;
    }

    public void setPic(Long pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "bfile")
    public Long getBfile() {
        return bfile;
    }

    public void setBfile(Long bfile) {
        this.bfile = bfile;
    }

    @Basic
    @Column(name = "store")
    public Long getStore() {
        return store;
    }

    public void setStore(Long store) {
        this.store = store;
    }

    @Basic
    @Column(name = "outline")
    public Long getOutline() {
        return outline;
    }

    public void setOutline(Long outline) {
        this.outline = outline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlarmWgxwEntity that = (AlarmWgxwEntity) o;

        if (sourObj != that.sourObj) return false;
        if (alarmLevel != that.alarmLevel) return false;
        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (totalCount != null ? !totalCount.equals(that.totalCount) : that.totalCount != null) return false;
        if (trans != null ? !trans.equals(that.trans) : that.trans != null) return false;
        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (efile != null ? !efile.equals(that.efile) : that.efile != null) return false;
        if (keyword != null ? !keyword.equals(that.keyword) : that.keyword != null) return false;
        if (encrypt != null ? !encrypt.equals(that.encrypt) : that.encrypt != null) return false;
        if (zip != null ? !zip.equals(that.zip) : that.zip != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        if (bfile != null ? !bfile.equals(that.bfile) : that.bfile != null) return false;
        if (store != null ? !store.equals(that.store) : that.store != null) return false;
        if (outline != null ? !outline.equals(that.outline) : that.outline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = day != null ? day.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + sourObj;
        result = 31 * result + alarmLevel;
        result = 31 * result + (totalCount != null ? totalCount.hashCode() : 0);
        result = 31 * result + (trans != null ? trans.hashCode() : 0);
        result = 31 * result + (file != null ? file.hashCode() : 0);
        result = 31 * result + (efile != null ? efile.hashCode() : 0);
        result = 31 * result + (keyword != null ? keyword.hashCode() : 0);
        result = 31 * result + (encrypt != null ? encrypt.hashCode() : 0);
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (bfile != null ? bfile.hashCode() : 0);
        result = 31 * result + (store != null ? store.hashCode() : 0);
        result = 31 * result + (outline != null ? outline.hashCode() : 0);
        return result;
    }
}

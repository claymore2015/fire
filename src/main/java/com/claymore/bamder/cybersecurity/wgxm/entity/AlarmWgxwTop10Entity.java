package com.claymore.bamder.cybersecurity.wgxm.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "alarm_wgxw_top10")
@IdClass(AlarmWgxwTop10EntityPK.class)
public class AlarmWgxwTop10Entity {
    private Date day;
    private String province;
    private String city;
    private String district;
    private String unit;
    private String sourObjSub;
    private int alarmLevel;
    private Long count;

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
    @Column(name = "sour_obj_sub")
    public String getSourObjSub() {
        return sourObjSub;
    }

    public void setSourObjSub(String sourObjSub) {
        this.sourObjSub = sourObjSub;
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
    @Column(name = "count")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlarmWgxwTop10Entity that = (AlarmWgxwTop10Entity) o;

        if (alarmLevel != that.alarmLevel) return false;
        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (sourObjSub != null ? !sourObjSub.equals(that.sourObjSub) : that.sourObjSub != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = day != null ? day.hashCode() : 0;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (sourObjSub != null ? sourObjSub.hashCode() : 0);
        result = 31 * result + alarmLevel;
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }
}

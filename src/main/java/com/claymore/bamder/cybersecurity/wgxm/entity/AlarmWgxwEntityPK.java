package com.claymore.bamder.cybersecurity.wgxm.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
public class AlarmWgxwEntityPK implements Serializable {
    private Date day;
    private String district;
    private String unit;
    private int sourObj;
    private int alarmLevel;

    @Column(name = "day")
    @Id
    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    @Column(name = "District")
    @Id
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Column(name = "Unit")
    @Id
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Column(name = "sour_obj")
    @Id
    public int getSourObj() {
        return sourObj;
    }

    public void setSourObj(int sourObj) {
        this.sourObj = sourObj;
    }

    @Column(name = "alarm_level")
    @Id
    public int getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(int alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlarmWgxwEntityPK that = (AlarmWgxwEntityPK) o;

        if (sourObj != that.sourObj) return false;
        if (alarmLevel != that.alarmLevel) return false;
        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = day != null ? day.hashCode() : 0;
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + sourObj;
        result = 31 * result + alarmLevel;
        return result;
    }
}

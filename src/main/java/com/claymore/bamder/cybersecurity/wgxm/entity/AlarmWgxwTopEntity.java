package com.claymore.bamder.cybersecurity.wgxm.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "alarm_wgxw_top")
@IdClass(AlarmWgxwTopEntityPK.class)
public class AlarmWgxwTopEntity {
    private Date day;
    private String area;
    private String unit;
    private String sourObjSub;
    private int alarmLevel;
    private Long totalCount;

    @Id
    @Column(name = "day")
    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    @Id
    @Column(name = "Area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
    @Column(name = "total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlarmWgxwTopEntity that = (AlarmWgxwTopEntity) o;

        if (alarmLevel != that.alarmLevel) return false;
        if (day != null ? !day.equals(that.day) : that.day != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (sourObjSub != null ? !sourObjSub.equals(that.sourObjSub) : that.sourObjSub != null) return false;
        if (totalCount != null ? !totalCount.equals(that.totalCount) : that.totalCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = day != null ? day.hashCode() : 0;
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (sourObjSub != null ? sourObjSub.hashCode() : 0);
        result = 31 * result + alarmLevel;
        result = 31 * result + (totalCount != null ? totalCount.hashCode() : 0);
        return result;
    }
}

package com.claymore.bamder.cybersecurity.event.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
@Entity
@Table(name = "events_info")
public class EventsInfoEntity {
    private long eventId;
    private String eventName;
    private Timestamp eventTime;
    private String province;
    private String city;
    private String district;
    private Integer chuzhiStatus;
    private Integer eventLevel;
    private Integer eventType;
    private Long wgxw0;
    private Long wgxw1;
    private Long gjqm0;
    private Long gjqm1;
    private Long mbsj0;
    private Long mbsj1;
    private Long txzd0;
    private Long txzd1;
    private String content;

    @Id
    @Column(name = "event_id")
    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "event_name")
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Basic
    @Column(name = "event_time")
    public Timestamp getEventTime() {
        return eventTime;
    }

    public void setEventTime(Timestamp eventTime) {
        this.eventTime = eventTime;
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

    @Basic
    @Column(name = "District")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "chuzhi_status")
    public Integer getChuzhiStatus() {
        return chuzhiStatus;
    }

    public void setChuzhiStatus(Integer chuzhiStatus) {
        this.chuzhiStatus = chuzhiStatus;
    }

    @Basic
    @Column(name = "event_level")
    public Integer getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(Integer eventLevel) {
        this.eventLevel = eventLevel;
    }

    @Basic
    @Column(name = "event_type")
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    @Basic
    @Column(name = "WGXW_0")
    public Long getWgxw0() {
        return wgxw0;
    }

    public void setWgxw0(Long wgxw0) {
        this.wgxw0 = wgxw0;
    }

    @Basic
    @Column(name = "WGXW_1")
    public Long getWgxw1() {
        return wgxw1;
    }

    public void setWgxw1(Long wgxw1) {
        this.wgxw1 = wgxw1;
    }

    @Basic
    @Column(name = "GJQM_0")
    public Long getGjqm0() {
        return gjqm0;
    }

    public void setGjqm0(Long gjqm0) {
        this.gjqm0 = gjqm0;
    }

    @Basic
    @Column(name = "GJQM_1")
    public Long getGjqm1() {
        return gjqm1;
    }

    public void setGjqm1(Long gjqm1) {
        this.gjqm1 = gjqm1;
    }

    @Basic
    @Column(name = "MBSJ_0")
    public Long getMbsj0() {
        return mbsj0;
    }

    public void setMbsj0(Long mbsj0) {
        this.mbsj0 = mbsj0;
    }

    @Basic
    @Column(name = "MBSJ_1")
    public Long getMbsj1() {
        return mbsj1;
    }

    public void setMbsj1(Long mbsj1) {
        this.mbsj1 = mbsj1;
    }

    @Basic
    @Column(name = "TXZD_0")
    public Long getTxzd0() {
        return txzd0;
    }

    public void setTxzd0(Long txzd0) {
        this.txzd0 = txzd0;
    }

    @Basic
    @Column(name = "TXZD_1")
    public Long getTxzd1() {
        return txzd1;
    }

    public void setTxzd1(Long txzd1) {
        this.txzd1 = txzd1;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventsInfoEntity that = (EventsInfoEntity) o;

        if (eventId != that.eventId) return false;
        if (eventName != null ? !eventName.equals(that.eventName) : that.eventName != null) return false;
        if (eventTime != null ? !eventTime.equals(that.eventTime) : that.eventTime != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (chuzhiStatus != null ? !chuzhiStatus.equals(that.chuzhiStatus) : that.chuzhiStatus != null) return false;
        if (eventLevel != null ? !eventLevel.equals(that.eventLevel) : that.eventLevel != null) return false;
        if (eventType != null ? !eventType.equals(that.eventType) : that.eventType != null) return false;
        if (wgxw0 != null ? !wgxw0.equals(that.wgxw0) : that.wgxw0 != null) return false;
        if (wgxw1 != null ? !wgxw1.equals(that.wgxw1) : that.wgxw1 != null) return false;
        if (gjqm0 != null ? !gjqm0.equals(that.gjqm0) : that.gjqm0 != null) return false;
        if (gjqm1 != null ? !gjqm1.equals(that.gjqm1) : that.gjqm1 != null) return false;
        if (mbsj0 != null ? !mbsj0.equals(that.mbsj0) : that.mbsj0 != null) return false;
        if (mbsj1 != null ? !mbsj1.equals(that.mbsj1) : that.mbsj1 != null) return false;
        if (txzd0 != null ? !txzd0.equals(that.txzd0) : that.txzd0 != null) return false;
        if (txzd1 != null ? !txzd1.equals(that.txzd1) : that.txzd1 != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (eventId ^ (eventId >>> 32));
        result = 31 * result + (eventName != null ? eventName.hashCode() : 0);
        result = 31 * result + (eventTime != null ? eventTime.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (chuzhiStatus != null ? chuzhiStatus.hashCode() : 0);
        result = 31 * result + (eventLevel != null ? eventLevel.hashCode() : 0);
        result = 31 * result + (eventType != null ? eventType.hashCode() : 0);
        result = 31 * result + (wgxw0 != null ? wgxw0.hashCode() : 0);
        result = 31 * result + (wgxw1 != null ? wgxw1.hashCode() : 0);
        result = 31 * result + (gjqm0 != null ? gjqm0.hashCode() : 0);
        result = 31 * result + (gjqm1 != null ? gjqm1.hashCode() : 0);
        result = 31 * result + (mbsj0 != null ? mbsj0.hashCode() : 0);
        result = 31 * result + (mbsj1 != null ? mbsj1.hashCode() : 0);
        result = 31 * result + (txzd0 != null ? txzd0.hashCode() : 0);
        result = 31 * result + (txzd1 != null ? txzd1.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}

package com.claymore.bamder.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:15 PM
 * @since 1.0.0
 */
public class IpAddressGlobalEntityPK implements Serializable {
    private long startIp;
    private long endIp;

    @Column(name = "start_ip")
    @Id
    public long getStartIp() {
        return startIp;
    }

    public void setStartIp(long startIp) {
        this.startIp = startIp;
    }

    @Column(name = "end_ip")
    @Id
    public long getEndIp() {
        return endIp;
    }

    public void setEndIp(long endIp) {
        this.endIp = endIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IpAddressGlobalEntityPK that = (IpAddressGlobalEntityPK) o;

        if (startIp != that.startIp) return false;
        if (endIp != that.endIp) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (startIp ^ (startIp >>> 32));
        result = 31 * result + (int) (endIp ^ (endIp >>> 32));
        return result;
    }
}

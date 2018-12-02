package com.claymore.bamder.cybersecurity.event.enums;

public enum EventType {

    WGXM(1, "违规泄密"),
    GJXM(2, "攻击泄密"),
    ;
    private int value;
    private String desc;

    EventType(int value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public static EventType getByValue(int value) {
        for (EventType status : EventType.values()) {
            if (status.value == value) {
                return status;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

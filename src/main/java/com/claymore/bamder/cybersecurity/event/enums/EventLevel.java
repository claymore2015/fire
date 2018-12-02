package com.claymore.bamder.cybersecurity.event.enums;

public enum EventLevel {

    MIMI(1, "秘密"),
    JIMI(2, "机密"),
    JUEMI(3, "绝密")
    ;
    private int value;
    private String desc;

    EventLevel(int value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public static EventLevel getByValue(int value) {
        for (EventLevel status : EventLevel.values()) {
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

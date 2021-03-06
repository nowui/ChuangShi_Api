package com.nowui.chuangshi.type;

public enum UserType {

    SYSTEM("SYSTEM", "系统管理员"),
    ADMIN("ADMIN", "管理员"),
    MEMBER("MEMBER", "会员"),
    DEALER("DEALER", "经销商"),
    SUPPLIER("SUPPLIER", "供应商"),
    STUDENT("STUDENT", "学生"),
    TEACHER("TEACHER", "老师");

    private String key;
    private String value;

    private UserType(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}

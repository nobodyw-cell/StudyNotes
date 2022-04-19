package com.example.mybatis.pojo;

public enum SexEnum {
    BOY,
    GIRL;

    public static SexEnum getSexById(int id) {
        for (SexEnum sexEnum : SexEnum.values()) {
            if (sexEnum.ordinal() == id) {
                return sexEnum;
            }
        }
        return null;
    }
}

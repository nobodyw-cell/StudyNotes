package com.example.mybatis.pojo;

import org.apache.ibatis.type.Alias;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/3/26 下午8:23
 */
@Alias("user")
public class User {
    private int id;
    private String name;
    private SexEnum sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}

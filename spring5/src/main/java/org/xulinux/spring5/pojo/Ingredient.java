package org.xulinux.spring5.pojo;

import lombok.RequiredArgsConstructor;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/3/12 下午4:11
 */
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public static enum Type {
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}

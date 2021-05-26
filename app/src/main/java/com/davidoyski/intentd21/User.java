package com.davidoyski.intentd21;

import java.io.Serializable;

public class User implements Serializable {
    //fields
    private String name;
    private int age;

    //constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

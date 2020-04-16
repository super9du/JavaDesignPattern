package com.example.designpatterns.model;

/**
 * Demo OldMan
 *
 * @author Wolf-Liu
 * @date 2020/1/5 15:56
 */
public abstract class AbstractHuman implements Human {
    protected String name;
    protected String gender;
    protected int age;

    @Override
    public String getName() {
        return name;
    }

    public abstract String getGender();

    public abstract int getAge();
}

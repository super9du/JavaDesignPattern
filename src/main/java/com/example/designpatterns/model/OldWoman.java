package com.example.designpatterns.model;

/**
 * Demo OldWoman
 *
 * @author Wolf-Liu
 * @date 2020/1/5 16:03
 */
public class OldWoman extends AbstractHuman {
    public OldWoman() {
        this.name = "老女人";
        this.gender = "女";
        this.age = 55;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}

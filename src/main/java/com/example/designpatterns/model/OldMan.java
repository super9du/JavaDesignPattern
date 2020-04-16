package com.example.designpatterns.model;

/**
 * Demo OldMan
 *
 * @author Wolf-Liu
 * @date 2020/1/5 15:59
 */
public class OldMan extends AbstractHuman {

    public OldMan(){
        this.name = "老男人";
        this.age = 60;
        this.gender = "男";
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

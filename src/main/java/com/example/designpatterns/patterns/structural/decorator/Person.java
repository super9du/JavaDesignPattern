package com.example.designpatterns.patterns.structural.decorator;

/**
 * Demo Person
 *
 * @author Wolf-Liu
 * @date 2019/12/3 23:17
 */
public class Person implements IPerson{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getCharisma() {
        return 80;
    }
}

package com.example.designpatterns.patterns.behavioral.visitor;

/**
 * Demo Manager
 *
 * @author Wolf-Liu
 * @date 2020/4/19 22:40
 */
public class Manager extends Employee {

    public Manager(String name, String job) {
        super(name, job);
    }

    @Override
    public String getPosition() {
        return "经理";
    }


}

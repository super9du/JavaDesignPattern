package com.example.designpatterns.patterns.structural.composite;

/**
 * Demo Employee
 *
 * @author Wolf-Liu
 * @date 2019/12/10 0:38
 */
public class Employee extends AbstractComponent {

    public Employee(String type, String position) {
        this.type = type;
        this.position = position;
    }

    @Override
    public void addComponent(Component component) {
        System.out.println("没有权限");
    }

    @Override
    public void removeComponent(Component component) {
        System.out.println("没有权限");
    }
}

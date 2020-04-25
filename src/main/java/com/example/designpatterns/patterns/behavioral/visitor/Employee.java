package com.example.designpatterns.patterns.behavioral.visitor;

/**
 * Demo AbstractEmployee
 *
 * @author Wolf-Liu
 * @date 2020/4/19 22:23
 */
public abstract class Employee {
    protected String name;
    protected String job;

    public Employee(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    abstract public String getPosition();
}

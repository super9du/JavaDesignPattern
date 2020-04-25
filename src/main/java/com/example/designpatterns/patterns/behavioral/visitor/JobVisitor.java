package com.example.designpatterns.patterns.behavioral.visitor;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Demo JobVisitor
 *
 * @author Wolf-Liu
 * @date 2020/4/19 22:33
 */
public class JobVisitor implements IVisitor {
    private Set<String> jobs = new HashSet<>();

    @Override
    public void visit(Employee employee) {
        jobs.add(employee.getJob());
    }

    public void countJob() {
        System.out.println("共有" + jobs.size() + "种工作");
        System.out.print("分别是：");
        System.out.println(jobs.toString());
    }
}

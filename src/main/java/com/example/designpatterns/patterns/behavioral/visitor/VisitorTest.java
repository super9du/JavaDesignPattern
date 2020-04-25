package com.example.designpatterns.patterns.behavioral.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Demo VisitorTest
 *
 * @author Wolf-Liu
 * @date 2020/4/19 22:46
 */
public class VisitorTest {
    public static void main(String[] args) {
        JobVisitor visitor = new JobVisitor();
        for (Employee employee : employees()) {
            employee.accept(visitor);
        }
        visitor.countJob();
    }

    static List<Employee> employees() {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(commonEmployee0());
        employees.add(commonEmployee1());
        employees.add(manager());
        return employees;
    }

    static CommonEmployee commonEmployee0() {
        return new CommonEmployee("zhangsan", "java dev");
    }

    static CommonEmployee commonEmployee1() {
        return new CommonEmployee("lisi", "js dev");
    }

    static Manager manager() {
        return new Manager("wangwu", "Manage");
    }


}

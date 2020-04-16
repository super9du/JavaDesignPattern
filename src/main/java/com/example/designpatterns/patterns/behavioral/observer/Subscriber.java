package com.example.designpatterns.patterns.behavioral.observer;

/**
 * 订阅者
 *
 * @author Wolf-Liu
 * @date 2020/3/29 16:48
 */
public class Subscriber {
    private String name;

    public Subscriber(Subject subject, String name) {
        this.name = name;
        subject.addSubscriber(this);
    }

    public void update(Subject subject, Object obj) {
        System.out.print(name + "有新的订阅：");
        System.out.println(obj);
    }
}

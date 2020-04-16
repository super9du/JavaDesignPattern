package com.example.designpatterns.patterns.behavioral.observer;

import java.util.Observable;

/**
 * 观察者模式测试类
 *
 * @author Wolf-Liu
 * @date 2020/3/29 17:03
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new Subscriber(subject, "666");
        new Subscriber(subject, "柳双六");
        new Subscriber(subject, "柳汗青");
        subject.inform("Test Observer");
        Observable observable = new Observable();
    }
}

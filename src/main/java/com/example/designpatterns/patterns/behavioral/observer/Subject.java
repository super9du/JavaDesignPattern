package com.example.designpatterns.patterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * 主题
 *
 * @author Wolf-Liu
 * @date 2020/3/29 16:48
 */
public class Subject {
    private Set<Subscriber> subscribers = new HashSet<>();

    public boolean addSubscriber(Subscriber subscriber) {
        return subscribers.add(subscriber);
    }

    public boolean removeSubscriber(Subscriber subscriber) {
        return subscribers.remove(subscriber);
    }

    public void inform(Object obj) {
        subscribers.forEach(subscriber -> subscriber.update(this, obj));
    }
}

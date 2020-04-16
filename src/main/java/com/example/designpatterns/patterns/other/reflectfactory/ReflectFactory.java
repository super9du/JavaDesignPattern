package com.example.designpatterns.patterns.other.reflectfactory;

import com.example.designpatterns.model.Human;

/**
 * Demo ReflectFactory
 *
 * @author Wolf-Liu
 * @date 2020/4/6 11:43
 */
public class ReflectFactory {
    Human human;

    public Human create(Class<? extends Human> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

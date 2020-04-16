package com.example.designpatterns.patterns.creational.abstractfactory;

import com.example.designpatterns.model.Human;

/**
 * Demo AbstractFactory
 *
 * @author Wolf-Liu
 * @date 2020/4/6 11:52
 */
public interface HumanFactory {
    public Human create();
}

package com.example.designpatterns.patterns.creational.abstractfactory;

import com.example.designpatterns.model.Human;
import com.example.designpatterns.model.OldMan;

/**
 * Demo OldManFactory
 *
 * @author Wolf-Liu
 * @date 2020/4/6 11:55
 */
public class OldManFactory implements HumanFactory {
    @Override
    public Human create() {
        return new OldMan();
    }
}

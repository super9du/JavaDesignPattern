package com.example.designpatterns.patterns.structural.composite;

/**
 * Demo Manager
 *
 * @author Wolf-Liu
 * @date 2019/12/10 0:53
 */
public class Manager extends AbstractComponent{

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        components.remove(component);
    }
}

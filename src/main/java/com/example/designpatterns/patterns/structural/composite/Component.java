package com.example.designpatterns.patterns.structural.composite;

/**
 * Demo Component
 *
 * @author Wolf-Liu
 * @date 2019/12/10 0:49
 */
public interface Component {
    void addComponent(Component component);

    void removeComponent(Component component);

    void work();

    void check();
}

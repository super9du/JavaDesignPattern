package com.example.designpatterns.patterns.structural.composite;

import java.util.List;

/**
 * Demo AbstractComponent
 *
 * @author Wolf-Liu
 * @date 2019/12/10 0:50
 */
public abstract class AbstractComponent implements Component {
    String type;
    String position;
    List<Component> components;

    @Override
    public abstract void addComponent(Component component);

    @Override
    public abstract void removeComponent(Component component);

    @Override
    public void work() {
        System.out.println("做" + type + "工作");
    }

    @Override
    public void check(){
        work();
        for (Component component : components) {
            component.check();
        }
    }
}

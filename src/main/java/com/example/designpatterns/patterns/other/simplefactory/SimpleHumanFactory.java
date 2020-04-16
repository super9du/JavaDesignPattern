package com.example.designpatterns.patterns.other.simplefactory;

import com.example.designpatterns.model.Human;
import com.example.designpatterns.model.OldMan;
import com.example.designpatterns.model.OldWoman;

/**
 * 简单工厂模式，又称静态工厂模式
 *
 * @author Wolf-Liu
 * @date 2020/1/5 15:07
 */
public class SimpleHumanFactory {

    public static Human create(String name) {
        if ("老男人".equals(name)) {
            return new OldMan();
        } else if ("老女人".equals(name)) {
            return new OldWoman();
        }
        throw new IllegalArgumentException("没有这个类型的人类");
    }

    public static Human createBySwitch(String name) {
        switch (name) {
            case "老男人":
                return new OldMan();
            case "老女人":
                return new OldWoman();
            default:
                throw new IllegalArgumentException("没有这个类型的人类");
        }
    }
}

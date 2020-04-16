package com.example.designpatterns.patterns.creational.abstractfactory;

import com.example.designpatterns.model.Human;
import org.junit.jupiter.api.Test;

/**
 * Demo AbstractFactoryTest
 *
 * @author Wolf-Liu
 * @date 2020/4/6 11:58
 */
public class AbstractFactoryTest {
    @Test
    void test(){
        HumanFactory oldManFactory = new OldManFactory();
        HumanFactory oldWomanFactory = new OldWomanFactory();
        Human oldMan = oldManFactory.create();
        Human oldWoman = oldWomanFactory.create();
        System.out.println(oldMan.getName());
        System.out.println(oldWoman.getName());
    }
}

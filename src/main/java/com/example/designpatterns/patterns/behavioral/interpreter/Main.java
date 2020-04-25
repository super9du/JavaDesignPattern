package com.example.designpatterns.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Demo Main
 *
 * @author Wolf-Liu
 * @date 2020/4/25 22:46
 */
public class Main {
    public static void main(String[] args) {
        Integer res = new Calculator("a-b").run(getMap());
        System.out.println("a+b=" + res);
    }


    public static Map<Object, Integer> getMap() {
        HashMap<Object, Integer> map = new HashMap<>(4);
        map.put('a', 11);
        map.put('b', 12);
        return map;
    }
}

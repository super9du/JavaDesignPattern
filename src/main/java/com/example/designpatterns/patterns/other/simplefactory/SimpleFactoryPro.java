package com.example.designpatterns.patterns.other.simplefactory;

import com.example.designpatterns.model.Human;
import com.example.designpatterns.model.OldMan;
import com.example.designpatterns.model.OldWoman;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Demo SimpleFactoryPro
 *
 * @author Wolf-Liu
 * @date 2020/1/5 16:42
 */
public class SimpleFactoryPro {
    private static Map<String, Human> instances = new LinkedHashMap<String, Human>() {{
        put("老男人", new OldMan());
        put("老女人", new OldWoman());
    }};

    public static Human get(String name) {
        return instances.get(name);
    }

    public static void registry(String name, Human human) {
        instances.put(name, human);
    }
}

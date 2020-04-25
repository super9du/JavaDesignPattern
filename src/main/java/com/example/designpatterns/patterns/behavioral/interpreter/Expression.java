package com.example.designpatterns.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Demo Expression
 *
 * @author Wolf-Liu
 * @date 2020/4/25 15:05
 */
public interface Expression {
    Integer interpret(Map<Object, Integer> var);
}

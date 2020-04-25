package com.example.designpatterns.patterns.behavioral.interpreter;

import java.util.Map;
import java.util.Set;

/**
 * 变量 TerminalExpression
 *
 * @author Wolf-Liu
 * @date 2020/4/25 15:09
 */
public class VarExpression implements Expression {
    private Object key;

    public VarExpression(Object key) {
        this.key = key;
    }

    @Override
    public Integer interpret(Map<Object, Integer> var) {
        return var.get(key);
    }
}

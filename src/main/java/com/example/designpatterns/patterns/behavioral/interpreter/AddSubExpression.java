package com.example.designpatterns.patterns.behavioral.interpreter;

import com.example.designpatterns.patterns.behavioral.interpreter.Expression;
import com.example.designpatterns.patterns.behavioral.interpreter.SymbolExpression;

import java.util.Map;

/**
 * Demo AddSubExpression
 *
 * @author Wolf-Liu
 * @date 2020/4/25 15:22
 */
public class AddSubExpression extends SymbolExpression {
    private char type;

    public AddSubExpression(char type, Expression left, Expression right) {
        super(left, right);
        this.type = type;
    }

    @Override
    public Integer interpret(Map<Object, Integer> var) {
        return '+' == type ? addInterpret(var) : subInterpret(var);
    }

    private Integer subInterpret(Map<Object, Integer> var) {
        return left.interpret(var) - right.interpret(var);
    }

    private Integer addInterpret(Map<Object, Integer> var) {
        Integer l = left.interpret(var);
        Integer r = right.interpret(var);
        return l + r;
    }
}

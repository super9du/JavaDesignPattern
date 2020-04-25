package com.example.designpatterns.patterns.behavioral.interpreter;

import java.util.Map;

/**
 * Demo SymbolExpression
 *
 * @author Wolf-Liu
 * @date 2020/4/25 15:17
 */
public abstract class SymbolExpression implements Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

}

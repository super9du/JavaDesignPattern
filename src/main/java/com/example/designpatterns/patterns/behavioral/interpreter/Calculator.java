package com.example.designpatterns.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Demo InterpreterTest
 *
 * @author Wolf-Liu
 * @date 2020/4/25 15:32
 */
public class Calculator {
    private Expression expression;

    public Calculator(String expr) {
        expression = getExpression(expr);
    }

    public Expression getExpression(String expr) {
        Stack<Expression> stack = new Stack<>();
        char[] chars = expr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '-':
                case '+':
                    Expression left = stack.pop();
                    AddSubExpression addSubExpression = new AddSubExpression(chars[i], left, new VarExpression(chars[++i]));
                    stack.push(addSubExpression);
                    break;
                case '/':
                case '*':
                    break;
                default:
                    VarExpression varExpression = new VarExpression(chars[i]);
                    stack.push(varExpression);
                    break;
            }
        }
        return stack.pop();
    }

    public Integer run(Map<Object, Integer> var) {
        return expression.interpret(var);
    }

}

package com.example.designpatterns.patterns.behavioral.strategy;

/**
 * Demo Activity
 *
 * @author Wolf-Liu
 * @date 2019/12/12 22:40
 */
public interface Activity {
    String discount();

    float countDiscountValue(float value);
}

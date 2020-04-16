package com.example.designpatterns.patterns.behavioral.strategy;

/**
 * Demo ManjianActivity
 *
 * @author Wolf-Liu
 * @date 2019/12/12 22:42
 */
public class ManjianActivity implements Activity {

    @Override
    public String discount() {
        return "满10减4";
    }

    @Override
    public float countDiscountValue(float value) {
        return value >= 10 ? value - 4 : value;
    }
}

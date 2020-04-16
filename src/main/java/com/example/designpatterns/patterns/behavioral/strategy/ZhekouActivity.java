package com.example.designpatterns.patterns.behavioral.strategy;

/**
 * Demo ZhekouActivity
 *
 * @author Wolf-Liu
 * @date 2019/12/12 22:43
 */
public class ZhekouActivity implements Activity {

    @Override
    public String discount() {
        return "满30打5折";
    }

    @Override
    public float countDiscountValue(float value) {
        return value >= 30 ? value * 0.5f : value;
    }
}

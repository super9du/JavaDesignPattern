package com.example.designpatterns.patterns.structural.adaptor;

/**
 * Demo PhomeAdaptor
 *
 * @author Wolf-Liu
 * @date 2019/12/10 0:24
 */
public class PhoneAdaptor {
    public int converter(int voltage) {
        if (voltage == 220) {
            return voltage - 200;
        } else if (voltage == 20) {
            return voltage;
        } else {
            throw new IllegalArgumentException("不合法的电压值");
        }
    }
}

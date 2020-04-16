package com.example.designpatterns.patterns.structural.adaptor;

/**
 * Demo Phone
 *
 * @author Wolf-Liu
 * @date 2019/12/10 0:18
 */
public class Phone {
    public void charge(int voltage) {
        if (voltage > 20) {
            System.out.println("电压过高，无法充电");
        } else {
            System.out.println("正常充电");
        }
    }
}

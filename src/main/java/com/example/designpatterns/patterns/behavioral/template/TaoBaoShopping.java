package com.example.designpatterns.patterns.behavioral.template;

/**
 * Demo TaoBaoShopping
 *
 * @author Wolf-Liu
 * @date 2019/12/9 23:48
 */
public class TaoBaoShopping extends AbstractShopping {
    @Override
    public void buy() {
        System.out.println("买衣服");
    }

    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}

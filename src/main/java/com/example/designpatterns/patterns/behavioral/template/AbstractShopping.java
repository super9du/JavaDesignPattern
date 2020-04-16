package com.example.designpatterns.patterns.behavioral.template;

/**
 * Demo AbstractShopping
 *
 * @author Wolf-Liu
 * @date 2019/12/9 23:45
 */
public abstract class AbstractShopping implements Shopping {
    @Override
    public void doShopping() {
        login();
        buy();
        pay();
    }

    @Override
    public final void login(){
        System.out.println("登录网站");
    }

    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}

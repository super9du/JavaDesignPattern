package com.example.designpatterns.model;

/**
 * Demo IHttp
 *
 * @author Wolf-Liu
 * @date 2019/12/8 10:40
 */
public class Http implements IHttp {

    @Override
    public String sendMsg(String msg) {
        System.out.println("方法执行：：" + msg);
        return msg;
    }

    @Override
    public String receiveMsg(String msg) {
        System.out.println("方法执行：：" + msg);
        return msg;
    }
}

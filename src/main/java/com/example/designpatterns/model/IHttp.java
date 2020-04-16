package com.example.designpatterns.model;

/**
 * Demo IHttp
 *
 * @author Wolf-Liu
 * @date 2019/12/8 10:45
 */
public interface IHttp {
    String sendMsg(String msg);

    String receiveMsg(String msg);
}

package com.example.designpatterns.patterns.structural.proxy;

import com.example.designpatterns.model.Http;
import com.example.designpatterns.model.IHttp;

/**
 * Demo HttpProxy
 *
 * @author Wolf-Liu
 * @date 2019/12/8 11:08
 */
public class HttpProxy implements IHttp {
    private Http http;

    public HttpProxy(Http http){
        this.http = http;
    }

    @Override
    public String sendMsg(String msg) {
        System.out.println("发送的数据是："+msg);
        return http.sendMsg(msg);
    }

    @Override
    public String receiveMsg(String msg) {
        System.out.println("接收的数据是："+msg);
        return http.receiveMsg(msg);
    }
}

package com.example.designpatterns.patterns.structural.proxy;

import com.example.designpatterns.model.Http;
import com.example.designpatterns.model.IHttp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Demo HttpDynamicProxy
 *
 * @author Wolf-Liu
 * @date 2019/12/8 10:47
 */
public class HttpDynamicProxy implements InvocationHandler {
    private Http http;

    public IHttp getInstance(Http http) {
        this.http = http;
        return (IHttp) Proxy.newProxyInstance(http.getClass().getClassLoader(), http.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        if ("sendMsg".equals(method.getName())) {
            System.out.println("========发送数据========");
            res = method.invoke(http, args);
            System.out.println("发送的数据是: " + res);
        } else if ("receiveMsg".equals(method.getName())) {
            System.out.println("========接受数据========");
            res = method.invoke(http, args);
            System.out.println("接收的数据是：" + res);
        }
        return res;
    }
}

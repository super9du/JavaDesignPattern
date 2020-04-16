package com.example.designpatterns.patterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类可以不用实现被代理对象的接口方法
 */
public class DynamicProxyPro<T> {

    private T target;

    public DynamicProxyPro(T target) {
        this.target = target;
    }

    public T getProxyInstance() {
        T t = (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("加入方法执行前的业务逻辑。。。。");
                    Object invoke = method.invoke(target, args);//执行被代理对象方法
                    System.out.println("加入方法执行后的业务逻辑。。。。");
                    return invoke;
                });
        return t;
    }
}

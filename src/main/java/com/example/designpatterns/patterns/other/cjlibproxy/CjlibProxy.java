package com.example.designpatterns.patterns.other.cjlibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Demo CjlibProxy
 *
 * @author Wolf-Liu
 * @date 2020/4/3 0:19
 */
public class CjlibProxy<T> {
    private Class<T> target;

    public CjlibProxy(Class<T> target) {
        this.target = target;
    }

    public T getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("方法前执行");
                Object invoke = methodProxy.invokeSuper(o, args);
                System.out.println("方法后执行");
                return invoke;
            }
        });
        return (T) enhancer.create();
    }
}

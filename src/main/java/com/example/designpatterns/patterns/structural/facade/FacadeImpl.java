package com.example.designpatterns.patterns.structural.facade;

/**
 * Demo FacadeImpl
 *
 * @author Wolf-Liu
 * @date 2019/12/4 0:27
 */
public class FacadeImpl implements Facade{
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();

    @Override
    public void methodA() {
        a.methodA();
        b.methodA();
    }

    @Override
    public void methodB() {
        a.methodB();
        b.methodC();
    }
}

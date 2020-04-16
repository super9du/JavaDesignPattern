package com.example.designpatterns.patterns.other.callback;

/**
 * Demo Caller
 *
 * @author Wolf-Liu
 * @date 2020/3/29 16:22
 */
public class Caller implements CallBackDiy {

    public void business(String name) {
        new IOUtil().saveFile(this, name);
    }

    @Override
    public void onResult(boolean bl) {
        System.out.println(bl ? "保存成功" : "保存失败");
    }
}

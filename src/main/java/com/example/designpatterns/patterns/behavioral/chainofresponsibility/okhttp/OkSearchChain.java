package com.example.designpatterns.patterns.behavioral.chainofresponsibility.okhttp;

/**
 * Demo OkSearchChain
 *
 * @author Wolf-Liu
 * @date 2020/4/6 10:21
 */
public interface OkSearchChain {
    String search(String searchText, OkSearchChain chain);
}

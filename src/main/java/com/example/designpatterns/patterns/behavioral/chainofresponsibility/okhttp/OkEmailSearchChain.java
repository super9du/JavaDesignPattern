package com.example.designpatterns.patterns.behavioral.chainofresponsibility.okhttp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demo OkEmailSearchChain
 *
 * @author Wolf-Liu
 * @date 2020/4/6 10:22
 */
public class OkEmailSearchChain implements OkSearchChain {
    private Pattern email = Pattern.compile("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}");

    @Override
    public String search(String searchText, OkSearchChain chain) {
        Matcher matcher = email.matcher(searchText);
        String found;
        if (matcher.find()) {
            found = matcher.group();
            System.out.println("匹配到 EMAIL: " + found);
        } else {
            found = chain.search(searchText, chain);
        }
        return found;
    }
}

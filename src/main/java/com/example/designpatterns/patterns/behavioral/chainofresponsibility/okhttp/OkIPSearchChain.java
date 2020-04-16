package com.example.designpatterns.patterns.behavioral.chainofresponsibility.okhttp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Demo OkEmailSearchChain
 *
 * @author Wolf-Liu
 * @date 2020/4/6 10:22
 */
public class OkIPSearchChain implements OkSearchChain {
    private Pattern ip = Pattern.compile("((2(5[0-5]|[0-4]\\d))|(1\\d{1,2})|([1-9]?\\d))(\\.((2(5[0-5]|[0-4]\\d))|(1\\d{1,2})|([1-9]?\\d))){3}");
    private Pattern domain = Pattern.compile("([a-zA-Z0-9]([a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,6}");

    @Override
    public String search(String searchText, OkSearchChain chain) {
        Matcher matcher = ip.matcher(searchText);
        String found;
        if (matcher.find()) {
            found = matcher.group();
            System.out.println("匹配到 IP: " + found);
        } else {
            found = chain.search(searchText, chain);
        }
        return found;
    }
}
